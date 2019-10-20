package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: 基于volatile的解决方案
 * @author: Eddie.tran
 * @create: 2019-05-10 16:33:21
 * @version: V1.0
 **/
public class SafeDoubleCheckedLocking {
    private volatile static Instrument instance;

    public static Instrument getInstance() {
        if (instance == null) {
            synchronized (SafeDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new Instrument();
                }
            }
        }
        return instance;
    }

}
