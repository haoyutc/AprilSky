package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: clone construct example
 * @author: Eddie.tran
 * @create: 2019-05-16 15:44:30
 * @version: V1.0
 **/
public class CloneConstructExm {
    private int[] arr;

    public CloneConstructExm() {
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

    public CloneConstructExm(CloneConstructExm exm) {
        arr = new int[exm.arr.length];
        for (int i = 0; i < exm.arr.length; i++) {
            arr[i] = exm.arr[i];
        }
    }

}
