package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: 装箱拆箱测试
 * @author: Eddie.tran
 * @create: 2019-05-14 23:05:41
 * @version: V1.0
 **/
public class BoxingTest {
    public static void main(String[] args) {
        Integer a = 1;
        System.out.println(a == 1 ? "相等" : "不相等");

        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1 == s2);

        String s3 = s1.intern();
        String s4 = s1.intern();
        String s9 = s2.intern();
        System.out.println("===========");
        System.out.println(s3 == s9);
        System.out.println(s1 == s9);
        System.out.println(s2 == s9);
        System.out.println("===========");
        System.out.println(s3 == s4);

        String s5 = "bbb";
        String s6 = "bbb";
        System.out.println(s5 == s6);

//        float ff=1.1;
        float ff = 1.1f;
        short s = 1;
//        s=s+1;
        s += 1;
        s++;

        s = (short) (s + 1);

    }

}
