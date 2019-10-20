package com.eddie.javabase.singleton;

/**
 * @program: AprilSky
 * @description: 双重校验锁-线程安全  使用单例的目的是延迟加载实例化资源，从而节约资源
 * @author: Eddie.tran
 * @create: 2019-05-17 15:31:26
 * @version: V1.0
 **/
public class DoubleCheckSafeSingleton {
    private volatile static DoubleCheckSafeSingleton instance;

    private DoubleCheckSafeSingleton() {
    }

    public static DoubleCheckSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSafeSingleton.class) {
                if (instance == null) {

                    instance = new DoubleCheckSafeSingleton();
                }
            }
        }
        return instance;
    }

}
