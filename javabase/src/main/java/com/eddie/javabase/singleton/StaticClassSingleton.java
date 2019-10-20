package com.eddie.javabase.singleton;

/**
 * @program: AprilSky
 * @description: 静态内部类实现
 * @author: Eddie.tran
 * @create: 2019-05-17 15:54:19
 * @version: V1.0
 **/
public class StaticClassSingleton {
    private StaticClassSingleton() {
    }

    private static class SingletonHolder {

        private static final StaticClassSingleton instance = new StaticClassSingleton();
    }

    public static StaticClassSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
