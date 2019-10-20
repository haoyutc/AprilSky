package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: interface example
 * @author: Eddie.tran
 * @create: 2019-05-16 11:27:29
 * @version: V1.0
 **/
public interface InterfaceExample {
    void func1();

    default void func2() {
        System.out.println("func2");
    }

    int x = 123;
    //    int y;
    public int z = 0;

    int aa = 22;

}
