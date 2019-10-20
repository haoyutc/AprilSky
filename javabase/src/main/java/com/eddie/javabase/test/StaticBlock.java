package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: 静态语句块只执行一次
 * @author: Eddie.tran
 * @create: 2019-05-16 16:22:11
 * @version: V1.0
 **/
public class StaticBlock {
    static {
        System.out.println("only running one time !");
    }

    public static void main(String[] args) {
        StaticBlock s1 = new StaticBlock();
        StaticBlock s2 = new StaticBlock();
    }

}
