package com.eddie.javabase.factory.simplefactory;

/**
 * @program: AprilSky
 * @description: 客户端调用
 * @author: Eddie.tran
 * @create: 2019-05-17 17:14:06
 * @version: V1.0
 **/
public class Client {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Product product = factory.createProduct(1);
        //TODO
    }

}
