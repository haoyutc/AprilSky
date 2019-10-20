package com.eddie.javabase.test;

import com.eddie.javabase.jacksonfilter.User;
import org.springframework.util.Assert;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.Map;

/**
 * @program: AprilSky
 * @description: get method
 * @author: Eddie.tran
 * @create: 2019-05-16 19:16:23
 * @version: V1.0
 **/
public class Test {

    private static final int QAZ = 99;
    private static final User USER = new User();

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException, ClassNotFoundException {
        /*Class<?> clazz=Calculate.class;
        Object object = clazz.newInstance();
        Method[] methods = clazz.getMethods();
        Method[] declareMethods = clazz.getDeclaredMethods();
        Method method = clazz.getMethod("add", int.class, int.class);
        System.out.println("getMethods获取的所有方法：");
        for (Method m : methods) {
            System.out.println(m);
        }
        System.out.println("getDeclaredMethods获取的所有方法：");
        for (Method m : declareMethods) {
            System.out.println(m);
        }

        Object result = method.invoke(object,1,1);
        System.out.println(result);*/

        /*Class<?> clazz = Class.forName("java.lang.String");
        Object arr = Array.newInstance(clazz, 200);
        Array.set(arr,1,"aa");
        Array.set(arr,1,"bb");
        Array.set(arr,1,"cc");
        Array.set(arr,1,"dd");
        System.out.println(Array.get(arr,1));

        Map map = new Hashtable();*/
//        QAZ=00;
        USER.setAge(QAZ);
        USER.setUsername("lis");
        System.out.println(USER);

        String str = null;
//        assert str!=null;
        assert str!=null:"you are wrong";
        Assert.notNull(str,"str must not be null");
    }

    class Calculate {
        private final int fuck = 9;

        public int add(int a, int b) {
            return a + b;
        }

        public int sub(int x, int y) {
            if (x >= y) return x - y;
            return -(x - y);
        }
    }

}
