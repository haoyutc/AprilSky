package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: deep clone example
 * @author: Eddie.tran
 * @create: 2019-05-16 15:29:26
 * @version: V1.0
 **/
public class DeepCloneExm implements Cloneable {
    private int[] arr;

    public DeepCloneExm() {
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    public int get(int indx) {
        return arr[indx];
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    @Override
    protected DeepCloneExm clone() throws CloneNotSupportedException {
        DeepCloneExm result = (DeepCloneExm) super.clone();
        result.arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result.arr[i] = arr[i];
        }
        return result;
    }
}
