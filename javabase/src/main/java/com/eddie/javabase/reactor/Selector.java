package com.eddie.javabase.reactor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @program: AprilSky
 * @description: reactor模式中的Demultiplexer类，提供select（）方法用于从缓冲队列中查找出符合条件的event列表
 * @author: Eddie.tran
 * @create: 2019-06-01 15:50:19
 * @version: V1.0
 **/
public class Selector {
    //定义一个链表阻塞队列实现缓冲队列，用于保证线程安全
    private BlockingQueue<Event> eventBlockingQueue = new LinkedBlockingDeque<>();
    //定义一个obj用于synchronize方法块上锁
    private Object lock = new Object();

    List<Event> select() {
        return select(0);
    }

    List<Event> select(long timeout) {
        if (timeout > 0) {
            if (eventBlockingQueue.isEmpty()) {
                synchronized (lock) {
                    if (eventBlockingQueue.isEmpty()) {
                        try {
                            lock.wait(timeout);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        //TODO
        List<Event> events = new ArrayList<>();
        eventBlockingQueue.drainTo(events);
        return events;
    }

    public void addEvent(Event event) {
        //将event事件加入队列
        boolean success = eventBlockingQueue.offer(event);
        if (success) {
            synchronized (lock) {
                //如果有新增事件就对lock加锁
                lock.notify();
            }
        }
    }
}
