package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: 浅拷贝
 * @author: Eddie.tran
 * @create: 2019-05-16 15:11:36
 * @version: V1.0
 **/
public class ShallowCloneExm implements Cloneable {
    private int arr[];

    public ShallowCloneExm() {
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    public int get(int index) {
        return arr[index];
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    @Override
    protected ShallowCloneExm clone() throws CloneNotSupportedException {
        return (ShallowCloneExm) super.clone();
    }
}
