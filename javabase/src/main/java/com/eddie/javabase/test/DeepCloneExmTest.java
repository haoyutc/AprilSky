package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: deep clone example test
 * @author: Eddie.tran
 * @create: 2019-05-16 15:29:53
 * @version: V1.0
 **/
public class DeepCloneExmTest {
    public static void main(String[] args) {

        DeepCloneExm d1 = new DeepCloneExm();
        DeepCloneExm d2 = null;
        try {
            d2 = d1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        d1.set(1, 11);
        System.out.println(d2.get(1));
    }

}
