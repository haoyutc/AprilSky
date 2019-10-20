package com.eddie.javabase.bloom;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: AprilSky
 * @description: 布隆过滤器 自定义错误率-误判率
 * @author: Eddie.tran
 * @create: 2019-05-19 10:52:43
 * @version: V1.0
 **/
public class BloomFilterTest2 {
    private static int size = 1000000;
    private static BloomFilter<Integer> bloomFilter = BloomFilter.create(Funnels.integerFunnel(), size, 0.01);

    public static void main(String[] args) {
        for (int i = 0; i < size; i++) {
            bloomFilter.put(i);
        }

        List<Integer> list = new ArrayList<>(10000);
        for (int i = size + 10000; i < size + 20000; i++) {
            if (bloomFilter.mightContain(i)) {
                list.add(i);
            }
        }

        System.out.println("误判的数量：" + list.size());
    }

}
