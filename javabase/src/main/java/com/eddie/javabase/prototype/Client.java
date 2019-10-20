package com.eddie.javabase.prototype;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-05-17 19:31:28
 * @version: V1.0
 **/
public class Client {


    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("abcd");
        Prototype clone = prototype.myClone();
        System.out.println(clone);
    }


}
