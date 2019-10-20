package com.eddie.javabase.algorithms;

import com.eddie.javabase.test.DateUtil;

import java.text.SimpleDateFormat;
import java.util.*;

public class Test {


    public static void main(String[] args) {
        DateUtil dateUtil = new DateUtil();
        String ss = dateUtil.formatDate(new Date());
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println(ss);
                }
            }
        };
//        thread.start();

//        SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String date = sfd.format(new Date());
//        new Thread(()->{
//            for (int i = 0; i < 10000; i++) {
//                System.out.println(date);
//            }
//        }).start();
//
//        new Thread(()->{
//            for (int i = 0; i < 10000; i++) {
//                System.out.println(date);
//            }
//        }).start();

        System.out.println(Math.ceil(6.1 / 4));
    }

}
