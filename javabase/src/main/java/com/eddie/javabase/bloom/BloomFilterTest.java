package com.eddie.javabase.bloom;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

/**
 * @program: AprilSky
 * @description: 布隆过滤器
 * @author: Eddie.tran
 * @create: 2019-05-19 10:52:43
 * @version: V1.0
 **/
public class BloomFilterTest {
    private static int size = 1000000;
    private static BloomFilter<Integer> bloomFilter = BloomFilter.create(Funnels.integerFunnel(), size);

    public static void main(String[] args) {
        for (int i = 0; i < size; i++) {
            bloomFilter.put(i);
        }

        long start = System.nanoTime();
        //判断是否33333存在这一百万个数中
        if (bloomFilter.mightContain(33333)) {
            System.out.println("命中了🎯");
        }
        System.out.println("命中目标所耗时间：" + (System.nanoTime() - start) + "ns");
    }

}
