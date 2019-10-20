package com.eddie.javabase.test;


/**
 * @program: AprilSky
 * @description: 基于类初始化解决方案
 * @author: Eddie.tran
 * @create: 2019-05-10 16:25:36
 * @version: V1.0
 **/
public class InstanceFactory {
    private static class InstanceHolder {
        public static InstanceFactory instance = new InstanceFactory();
    }

    public static InstanceFactory getInstance() {
        return InstanceHolder.instance;
    }
}
