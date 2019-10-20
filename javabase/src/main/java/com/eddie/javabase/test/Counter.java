package com.eddie.javabase.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: AprilSky
 * @description: 线程安全计数器和非安全计数器
 * @author: Eddie.tran
 * @create: 2019-05-09 20:02:50
 * @version: V1.0
 **/
public class Counter {
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private int i = 0;
    private static final int NCPU = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
/*
        final Counter cas = new Counter();
        List<Thread> threads = new ArrayList<>(600);
        long start = System.currentTimeMillis();
        for (int j = 0; j < 100; j++) {
            Thread t = new Thread(() -> {
                for (int i = 0; i < 10000; i++) {
                    cas.count();
                    cas.safeCount();
                }
            });
            threads.add(t);
        }
        for (Thread tr : threads) {
            tr.start();
        }

        //等待所有线程执行性完成
        for (Thread tt : threads) {
            try {
                tt.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(cas.i);
        System.out.println(cas.atomicInteger.get());
        System.out.println(System.currentTimeMillis() - start);*/
        System.out.println(NCPU);

        int a = 8;
        System.out.println(a << 2);
        System.out.println(a >>> 2);
        System.out.println(1 << 6);
        System.out.println(1 << 10);
        System.out.println(2 << 0);
        System.out.println(2 << 1);
        System.out.println(2 << 2);
        System.out.println(10 << 2);

    }

    //使用CAS实现线程安全计数器
    private void safeCount() {
        for (; ; ) {
            int i = atomicInteger.get();
            boolean succ = atomicInteger.compareAndSet(i, ++i);
            if (succ) {
                break;
            }
        }
    }

    //非线程安全计数器
    private void count() {
        i++;
    }

}
