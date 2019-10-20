package com.eddie.javabase.algorithms;

/**
 * @program: AprilSky
 * @description: 数组中重复的数字
 * @author: Eddie.tran
 * @create: 2019-04-29 14:53:29
 * @version: V1.0
 **/
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5};
        int[] dup = {8};
        Main main = new Main();
        boolean result = main.duplicate(nums, nums.length, dup);
        System.out.println(result);
    }

    public boolean duplicate(int[] nums, int length, int[] duplication) {
        if (nums == null || length <= 0)
            return false;
        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums, i, nums[i]);
            }
        }
        return false;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    /**
     * @Description: Find
     * @Param: [target, matrix]
     * @return: boolean
     * @Author: Eddie.tran
     * @Date: 2019-04-29 :18:04
     */
    public boolean Find(int target, int[][] matrix) {
        if (matrix == null | matrix.length == 0 | matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int r = 0, c = cols - 1;//从右上角开始
        while (r <= cols - 1 && c >= 0) {
            if (target == matrix[r][c]) {
                return true;
            } else if (target > matrix[r][c]) {
                r++;
            } else {
                c--;
            }

        }
        return false;
    }
}
