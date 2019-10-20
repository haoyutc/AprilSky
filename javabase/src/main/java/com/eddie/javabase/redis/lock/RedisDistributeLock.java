package com.eddie.javabase.redis.lock;

import org.apache.commons.lang.StringUtils;
import redis.clients.jedis.Jedis;

import java.util.Collections;
import java.util.Objects;

/**
 * @program: AprilSky
 * @description: redis分布式锁使用正确姿势和错误姿势
 * @author: Eddie.tran
 * @create: 2019-09-24 22:05:52
 * @version: V1.0
 **/
public class RedisDistributeLock {

    private static final String LOCK_SUCCESS = "OK";
    private static final String SET_IF_NOT_EXIST = "NX";
    private static final String SET_WITH_EXPIRE_TIME = "PX";

    private static final Long RELEASE_SUCCESS = 1L;


    /**
     * @Description: 正确的redis锁使用姿势，通过redis#set多参数方法，即一条命令完成加锁，保证操作的原子性
     * 1. 当前没有锁（key不存在），那么就进行加锁操作，并对锁设置个有效期，同时value表示加锁的客户端。
     * 2. 已有锁存在，不做任何操作
     * @Param:
     * @return:
     * @Author: Eddie.tran
     * @Date: 2019-09-24 :22:15
     */
    public static boolean tryGetDistributeLock(Jedis jedis, String lockKey, String requestId, int expireTime) {
        /**
         * @Description: tryGetDistributeLock
         *              首先，set()加入了NX参数，可以保证如果已有key存在，则函数不会调用成功，也就是只有一个客户端能持有锁，满足互斥性。
         *              其次，由于我们对锁设置了过期时间，即使锁的持有者后续发生崩溃而没有解锁，锁也会因为到了过期时间而自动解锁（即key被删除），不会发生死锁。
         *              最后，因为我们将value赋值为requestId，代表加锁的客户端请求标识，那么在客户端在解锁的时候就可以进行校验是否是同一个客户端
         * @Param: [
         * , lockKey    key来当锁，唯一
         * , requestId  确定请求的唯一值，UUID.randomUUID().toString()方法生成，在删除锁时，解铃还须系铃人，通过此值来删除对应请求的锁
         * , SET_IF_NOT_EXIST       NX，意思是SET IF NOT EXIST，即当key不存在时，我们进行set操作；若key已经存在，则不做任何操作
         * , SET_WITH_EXPIRE_TIME   PX，意思是我们要给这个key加一个过期的设置，具体时间由下一个参数决定
         * , expireTime]    key的过期时间
         * @return: boolean
         * @Author: Eddie.tran
         * @Date: 2019-09-24 :22:16
         */
        String result = jedis.set(lockKey, requestId, SET_IF_NOT_EXIST, SET_WITH_EXPIRE_TIME, expireTime);
        if (Objects.equals(result, LOCK_SUCCESS)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /**
     * @Description: 由于这是两条Redis命令，不具有原子性，如果程序在执行完setnx()之后突然崩溃，导致锁没有设置过期时间，那么将会发生死锁
     * 有人这样实现的原因可能是，当时，低版本的jedis并不支持多参数的set()方法
     * @Param:
     * @return:
     * @Author: Eddie.tran
     * @Date: 2019-09-24 :22:31
     */
    public static void wrongGetLock1(Jedis jedis, String lockKey, String requestId, int expireTime) {
        Long result = jedis.setnx(lockKey, requestId);
        if (1 == result) {
            //此时若程序崩溃，将无法设置过期时间，形成死锁
            jedis.expire(lockKey, expireTime);
        }
    }

    /**
     * @Description: 存在的问题：
     * 1. 由于是客户端自己生成过期时间，所以需要强制要求分布式下每个客户端的时间必须同步。
     * 2. 当锁过期的时候，如果多个客户端同时执行jedis.getSet()方法，那么虽然最终只有一个客户端可以加锁，
     * 但是这个客户端的锁的过期时间可能被其他客户端覆盖。
     * 3. 锁不具备拥有者标识，即任何客户端都可以解锁
     * @Param: [jedis, lockKey, expireTime]
     * @Author: Eddie.tran
     * @Date: 2019-09-24 :22:56
     */
    public static boolean wrongGetLock2(Jedis jedis, String lockKey, int expireTime) {
        /**
         *              这一种错误实现就比较难以发现问题，而且实现也比较复杂。
         *              实现思路：使用jedis.setnx()命令实现加锁，其中key是锁，value是锁的过期时间。
         *              执行过程：
         *              1. 通过setnx()方法尝试加锁，如果当前锁不存在，返回加锁成功。
         *              2. 如果锁已经存在则获取锁的过期时间，和当前时间比较，如果锁已经过期，则设置新的过期时间，返回加锁成功
         */
        long expires = System.currentTimeMillis() + expireTime;
        String expiresStr = String.valueOf(expires);

        //如果当前锁不存在，则返回加锁成功
        if (jedis.setnx(lockKey, expiresStr) == 1) {
            return Boolean.TRUE;
        }

        //如果锁存在，则获取锁的过期时间
        String currentValue = jedis.get(lockKey);
        if (StringUtils.isNotEmpty(currentValue) && Long.parseLong(currentValue) < System.currentTimeMillis()) {
            //锁已过期，获取上一个锁的过期时间，并设置现在的锁的过期时间
            String oldValue = jedis.getSet(lockKey, expiresStr);
            if (StringUtils.isNotEmpty(oldValue) && Objects.equals(oldValue, currentValue)) {
                //多线程并发情况下，只有一个线程设置值和当前值相同，加锁成功
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }


    /**
     * @Description: 释放分布式锁的正确姿势
     * 1、简单的lua脚本
     * 2、将Lua代码传到jedis.eval()方法里，并使参数KEYS[1]赋值为lockKey，ARGV[1]赋值为requestId。eval()方法是将Lua代码交给Redis服务端执行
     * <p>
     * 首先获取锁对应的value值，检查是否与requestId相等，如果相等则删除锁（解锁）
     * 那么为什么要使用Lua语言来实现呢？因为要确保上述操作是原子性的。
     * 那么为什么执行eval()方法可以确保原子性，源于Redis的特性
     * 下面是官网对eval命令的部分解释：
     * 简单来说，就是在eval命令执行Lua代码的时候，Lua代码将被当成一个命令去执行，并且直到eval命令执行完成，Redis才会执行其他命令。
     * @Param:
     * @return:
     * @Author: Eddie.tran
     * @Date: 2019-09-24 :23:08
     */
    public static boolean releaseDistributeLock(Jedis jedis, String lockKey, String requestId) {
        String script = "if redis.call('get',KEY[1])==ARGV[1] then return redis.call('del',KEY[1]) else return 0 end";
        Object result = jedis.eval(script, Collections.singletonList(lockKey), Collections.singletonList(requestId));
        if (Objects.equals(result, RELEASE_SUCCESS)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /**
     * @Description: 错误姿势明显：直接使用jedis.del()方法删除锁，
     * 不先判断锁的拥有者而直接解锁的方式，会导致任何客户端都可以随时进行解锁，即使这把锁不是它的
     * @Param:
     * @return:
     * @Author: Eddie.tran
     * @Date: 2019-09-24 :23:21
     */
    public static void wrongReleaseLock1(Jedis jedis, String lockKey) {
        jedis.del(lockKey);
    }

    /**
     * @Description: 两条命令执行，不能保证操作的原子性
     * @Param:
     * @return:
     * @Author: Eddie.tran
     * @Date: 2019-09-24 :23:19
     */
    public static void wrongReleaseLock2(Jedis jedis, String lockKey, String requestId) {
        //判断加锁和解锁是不是同一个客户端
        if (Objects.equals(requestId, jedis.get(lockKey))) {
            //若在此时，这把锁突然不是这个客户端的，则会误解锁
            jedis.del(lockKey);
        }
    }
}
