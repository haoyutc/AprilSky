package com.eddie.javabase.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @program: AprilSky
 * @description: 数组去重
 * @author: Eddie.tran
 * @create: 2019-05-29 14:05:53
 * @version: V1.0
 **/
public class ArrayDeduplication {
    public int[] arrayDeduplication(int[] arr) {
        int t = 0;//用来记录去除重复之后的数组长度和给临时数组作为下标索引
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boolean isTrue = true;//声明一个标记，并每次重置
            for (int j = i + 1; j < arr.length; j++) {
                //如果有重复元素，改变标记状态并结束当次内层循环
                if (arr[i] == arr[j]) {
                    isTrue = false;
                    break;
                }
            }
            //判断标记是否被改变，如果没被改变就是没有重复元素
            if (isTrue) {
                temp[t] = arr[i];
                //到这里证明当前元素没有重复，那么记录自增
                t++;
            }
        }
        //声明需要返回的数组，这个才是去重后的数组
        int[] nArr = new int[t];
        //用array copy方法将刚才去重的数组拷贝到新数组并返回
        System.arraycopy(temp, 0, nArr, 0, t);
        System.out.println(Arrays.toString(nArr));
        return arr;
    }

    public int[] arrayDeduplication2(int[] arr) {

        System.out.println("数组去重:第二种");
        Set set = new HashSet();
        for (int v : arr) {
            set.add(v);
        }
        System.out.println(Arrays.toString(set.toArray()));
        return arr;
    }

}
