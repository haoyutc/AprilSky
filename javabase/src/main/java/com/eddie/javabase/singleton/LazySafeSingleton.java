package com.eddie.javabase.singleton;

/**
 * @program: AprilSky
 * @description: 懒汉式-线程安全
 * @author: Eddie.tran
 * @create: 2019-05-17 15:31:26
 * @version: V1.0
 **/
public class LazySafeSingleton {
    private static LazySafeSingleton instance;

    private LazySafeSingleton() {
    }

    //会出现长时间阻塞，性能不佳
    public static synchronized LazySafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazySafeSingleton();
        }
        return instance;
    }

}
