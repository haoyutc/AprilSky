package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: clone example
 * @author: Eddie.tran
 * @create: 2019-05-16 15:02:53
 * @version: V1.0
 **/
public class CloneExample implements Cloneable {
    private int x;
    private int y;


    @Override
    protected CloneExample clone() throws CloneNotSupportedException {
        return (CloneExample) super.clone();
    }
}
