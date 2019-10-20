package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: clone test
 * @author: Eddie.tran
 * @create: 2019-05-16 15:05:35
 * @version: V1.0
 **/
public class CloneTest {
    public static void main(String[] args) {
        CloneExample example = new CloneExample();
        try {
            CloneExample example1 = example.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
