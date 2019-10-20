package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: abstract class extends
 * @author: Eddie.tran
 * @create: 2019-05-16 11:21:35
 * @version: V1.0
 **/
public class AbstractExtendsClassExample extends AbstractClassExample {


    @Override
    public void fun1() {
        System.out.println("func1   ");
    }

    public static void main(String[] args) {
//        AbstractClassExample example = new AbstractClassExample();
        AbstractClassExample example = new AbstractExtendsClassExample();
    }
}
