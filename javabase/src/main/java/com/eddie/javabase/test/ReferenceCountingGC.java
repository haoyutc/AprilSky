package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: 引用计数算法的缺陷
 * @author: Eddie.tran
 * @create: 2019-05-14 11:58:32
 * @version: V1.0
 **/
public class ReferenceCountingGC {
    public Object instance = null;
    private static final int _1MB = 1024 * 1024;

    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        System.gc();
    }

}
