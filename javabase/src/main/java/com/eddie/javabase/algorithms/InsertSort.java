package com.eddie.javabase.algorithms;

import java.util.Arrays;

/**
 * @program: AprilSky
 * @description: 插入排序
 * @author: Eddie.tran
 * @create: 2019-05-29 15:13:18
 * @version: V1.0
 **/
public class InsertSort {
    /**
     * @Description: 插入排序
     * @Param:
     * @return:
     * @Author: Eddie.tran
     * @Date: 2019-05-29 :16:04
     */
    public void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j;
            if (arr[i] < arr[i - 1]) {
                int tmp = arr[i];
                for (j = i - 1; j >= 0 && tmp < arr[j]; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 2, 8, 6, 5};
        new InsertSort().insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
