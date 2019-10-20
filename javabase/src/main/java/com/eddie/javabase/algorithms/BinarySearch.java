package com.eddie.javabase.algorithms;

import java.util.Arrays;

/**
 * @program: AprilSky
 * @description: 二分查找
 * @author: Eddie.tran
 * @create: 2019-05-29 16:04:17
 * @version: V1.0
 **/
public class BinarySearch {
    public int binarySearch(int[] arr, int key, int low, int high) {
        while (low <= high) {
            int mid = (high + low) >>> 1;
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > mid) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 4, 7, 1, 8, 9, 5, 3, 2};
        new BubbleSort().bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        int result = new BinarySearch().binarySearch(arr, 4, 0, 5);
        System.out.println(result);
    }
}
