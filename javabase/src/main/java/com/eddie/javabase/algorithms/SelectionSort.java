package com.eddie.javabase.algorithms;

import java.util.Arrays;

/**
 * @program: AprilSky
 * @description: 选择排序
 * @author: Eddie.tran
 * @create: 2019-05-29 14:47:16
 * @version: V1.0
 **/
public class SelectionSort {
    /**
     * @Description: 选择排序
     * @Param:
     * @return:
     * @Author: Eddie.tran
     * @Date: 2019-05-29 :16:04
     */
    public int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            if (index == i) {
                continue;
            } else {
                int tmp = arr[index];
                arr[index] = arr[i];
                arr[i] = tmp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 52, 1, 5, 6, 1, 8};
        new SelectionSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
