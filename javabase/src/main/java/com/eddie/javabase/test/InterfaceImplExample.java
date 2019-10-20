package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: interface implement example
 * @author: Eddie.tran
 * @create: 2019-05-16 11:33:19
 * @version: V1.0
 **/
public class InterfaceImplExample implements InterfaceExample {


    @Override
    public void func1() {
        System.out.println("func1   ");
    }

    public static void main(String[] args) {
//        InterfaceExample interfaceExample=new InterfaceExample();
        InterfaceExample interfaceExample = new InterfaceImplExample();
    }
}
