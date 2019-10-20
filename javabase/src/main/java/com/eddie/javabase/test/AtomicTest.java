package com.eddie.javabase.test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-05-30 16:55:00
 * @version: V1.0
 **/
public class AtomicTest {
    private static AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) {
        System.out.println(atomicInteger.getAndIncrement());
        System.out.println(atomicInteger.get());
    }

}
