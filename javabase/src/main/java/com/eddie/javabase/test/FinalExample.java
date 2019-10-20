package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: final 事例
 * @author: Eddie.tran
 * @create: 2019-05-10 15:44:23
 * @version: V1.0
 **/
public class FinalExample {
    int i;//普通变量
    final int j;//final变量
    static FinalExample obj;

    public FinalExample() {
        i = 1;//写普通yu
        j = 2;//写final域
    }

    public static void writer() {
        obj = new FinalExample();
    }

    public static void reader() {
        FinalExample objct = obj;
        int a = objct.i;
        int b = objct.j;
    }
}
