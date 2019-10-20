package com.eddie.javabase.test;

import java.util.ArrayList;

/**
 * @program: AprilSky
 * @description: 类型擦出
 * @author: Eddie.tran
 * @create: 2019-05-17 10:49:35
 * @version: V1.0
 **/
public class ErasedType {
    public static void main(String[] args) {
        Class clazz = new ArrayList<String>().getClass();
        Class qclazz = new ArrayList<Integer>().getClass();
        System.out.println(clazz == qclazz);//true
    }

}
