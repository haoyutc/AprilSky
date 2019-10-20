package com.eddie.javabase.test;

import java.util.*;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-05-21 17:13:57
 * @version: V1.0
 **/
public class StringTest {
    public static void main(String[] args) {
        /*String s1 = "123";
        String s12 = "123";
        String s2 = new String("123");
        String s21 = new String("123");
        String s222 = s2.intern();
        String s212 = s2.intern();
        String s3 = s1.intern();
        String s4 = s2.intern();

        System.out.println(s1 == s2);
        System.out.println(s21 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println(s2 == s4);
        System.out.println(s3 == s4);
        System.out.println(s1 == s12);
        System.out.println(s222 == s212);
        StringTest test = new
                StringTest();
        System.out.println("1--100的递归求和："+test.sum(100));*/

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.forEach(System.out::println);
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            map.put(i, "qq");

        }
        long start = System.nanoTime();
        Iterator<Map.Entry<Integer, String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Integer, String> entry = entryIterator.next();
            System.out.print("key:" + entry.getKey() + "--value:" + entry.getValue());
        }
        System.out.println();
        System.out.println("cost time:" + (System.nanoTime() - start));
        long start2 = System.nanoTime();
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.print("key:" + key + "--value:" + map.get(key));
        }
        System.out.println();
        System.out.println("cost time:" + (System.nanoTime() - start2));

    }

    private int sum = 0, num = 1;

    public int sum(int maxNUm) {

        if (num <= maxNUm) {
            sum += num;
            num++;
            sum(maxNUm);
        }
        return sum;
    }

}
