package com.eddie.javabase.singleton;

/**
 * @program: AprilSky
 * @description: 饿汉式-线程安全
 * @author: Eddie.tran
 * @create: 2019-05-17 15:31:26
 * @version: V1.0
 **/
public class HungrySafeSingleton {
    //直接实例化的方式也丢失了延迟实例化带来的节约资源的好处
    private static HungrySafeSingleton instance = new HungrySafeSingleton();

    private HungrySafeSingleton() {
    }

    public static HungrySafeSingleton getInstance() {
        if (instance == null) {
            instance = new HungrySafeSingleton();
        }
        return instance;
    }

}
