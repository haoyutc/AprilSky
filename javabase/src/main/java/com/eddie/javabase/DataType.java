package com.eddie.javabase;

/**
 * @program: AprilSky
 * @description: 基础数据类型
 * @author: Eddie.tran
 * @create: 2019-05-06 22:25:00
 * @version: V1.0
 **/
public class DataType {
    public static void main(String[] args) {
        Integer a = 2;//装箱
        int b = a;//拆箱

        Integer x = new Integer(123);
        Integer y = new Integer(123);
        System.out.println(x == y);

        Integer i = Integer.valueOf(123);
        Integer j = Integer.valueOf(123);
        System.out.println(i == j);
    }

}
