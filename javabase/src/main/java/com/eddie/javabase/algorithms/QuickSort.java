package com.eddie.javabase.algorithms;

import java.util.Arrays;

/**
 * @program: AprilSky
 * @description: 快速排序
 * @author: Eddie.tran
 * @create: 2019-05-29 16:50:58
 * @version: V1.0
 **/
public class QuickSort {
    void quickSort(int[] arr, int start, int end) {
        if (start > end) return;
        int i = start;
        int j = end;
        //基准数
        int baseVal = arr[start];
        while (i < j) {
            //从右向左找比基准数小的数
            while (i < j && arr[j] >= baseVal) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }
            //从左往右找比基准数大的数
            while (i < j && arr[i] < baseVal) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }
        //把基准数放到i的位置
        arr[i] = baseVal;
        //递归
        quickSort(arr, start, i - 1);
        quickSort(arr, i + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 7, 2, 8, 3, 9, 0};
        new QuickSort().quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

}
