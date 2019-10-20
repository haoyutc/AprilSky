package com.eddie.javabase.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @program: AprilSky
 * @description: 反射
 * @author: Eddie.tran
 * @create: 2019-05-16 17:47:38
 * @version: V1.0
 **/
public class ReflectionTest {
    public static void main(String[] args) {
//        Class.forName();
        Class<?> clss = String.class;
        Class<?> classInt = Integer.TYPE;

        StringBuilder stringBuilder = new StringBuilder("123");
        Class<?> klacc = stringBuilder.getClass();


        Class<?> clazz = String.class;
        try {
            Object str = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        Constructor constructor = null;
        try {
            constructor = clazz.getConstructor(String.class);
            try {
                Object o = constructor.newInstance("123");
                System.out.println(o);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
