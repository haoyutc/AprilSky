package com.eddie.javabase.algorithms;

import java.util.Arrays;

/**
 * @program: AprilSky
 * @description: 冒泡排序
 * @author: Eddie.tran
 * @create: 2019-05-29 11:29:47
 * @version: V1.0
 **/
public class BubbleSort {
    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 6, 7, 12, 3, 7, 4};
        new BubbleSort().bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {//第一种遍历
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        for (int i : arr) {//第二种遍历
            System.out.print(i + "-");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));//第三种遍历

        System.out.println("数组复制");
        int[] tmp = new int[2];
        System.arraycopy(arr, 3, tmp, 0, tmp.length);//第一种复制
        System.out.println(Arrays.toString(tmp));
        System.out.println("第二种复制");
        for (int i = 3; i < tmp.length; i++) {
            tmp[i] = arr[i];
        }
        System.out.println(Arrays.toString(tmp));

        ArrayDeduplication deduplication = new ArrayDeduplication();
        System.out.println(deduplication.arrayDeduplication(arr));
        System.out.println(deduplication.arrayDeduplication2(arr));

    }

}
