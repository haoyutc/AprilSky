package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: sub fianl class
 * @author: Eddie.tran
 * @create: 2019-05-16 16:12:14
 * @version: V1.0
 **/
public class SubFinalClass {
    int a = 2;//事例变量
    static int b = 9;//静态变量

    public static void main(String[] args) {
//        int x = SubFinalClass.a;
        int y = SubFinalClass.b;
        System.out.println(y);

        SubFinalClass subFinalClass = new SubFinalClass();
        int x = subFinalClass.a;
        System.out.println(x);
    }

}
