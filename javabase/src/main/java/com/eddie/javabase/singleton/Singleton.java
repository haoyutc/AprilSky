package com.eddie.javabase.singleton;

/**
 * @program: AprilSky
 * @description: 懒汉式-线程不安全  使用单例的目的是延迟加载实例化资源，从而节约资源
 * @author: Eddie.tran
 * @create: 2019-05-17 15:31:26
 * @version: V1.0
 **/
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();//多线程会发生实例化多次
        }
        return instance;
    }

}
