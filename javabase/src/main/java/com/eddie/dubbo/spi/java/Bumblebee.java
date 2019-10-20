package com.eddie.dubbo.spi.java;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-10-03 16:10:35
 * @version: V1.0
 **/
public class Bumblebee implements Robot {

    @Override
    public void sayHello() {
        System.out.println("Hello,I'm Bumblebbee!");
    }
}
