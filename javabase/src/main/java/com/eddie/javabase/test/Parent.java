package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: 父类
 * @author: Eddie.tran
 * @create: 2019-05-16 16:29:36
 * @version: V1.0
 **/
public class Parent {
    private static int a = 1;
    private int b = 3;

    static {
        System.out.println("2");
    }

    {
        System.out.println(4);
    }

    public Parent() {
        System.out.println("5");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
    }
}
