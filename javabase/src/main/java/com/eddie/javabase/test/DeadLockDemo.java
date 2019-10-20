package com.eddie.javabase.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: AprilSky
 * @description: 死锁演示
 * @author: Eddie.tran
 * @create: 2019-05-09 15:12:34
 * @version: V1.0
 **/
public class DeadLockDemo {
    private static String A = "A";
    private static String B = "B";

    public static void main(String[] args) {
        Map map = Collections.synchronizedMap(new HashMap<>());//Collections.synchronizedMap()保证HashMap线程安全🔐
        new DeadLockDemo().deadLock();
    }

    private void deadLock() {
        Thread t1 = new Thread(() -> {
            synchronized (A) {
                try {
                    Thread.currentThread().sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (B) {
                    System.out.println("1");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (B) {
                synchronized (A) {
                    System.out.println("2");
                }
            }
        });

        t1.start();
        t2.start();
    }

}
