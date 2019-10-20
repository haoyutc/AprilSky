package com.eddie.javabase.lrucache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program: AprilSky
 * @description: lru cache
 * @author: Eddie.tran
 * @create: 2019-05-17 12:02:10
 * @version: V1.0
 * LinkedHashMap可以用来实现固定大小的LRU缓存，当LRU缓存已经满了的时候，它会把最老的键值对移出缓存。
 * LinkedHashMap提供了一个称为removeEldestEntry()的方法，该方法会被put()和putAll()调用来删除最老的键值对。
 **/
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private int size;

    private LRUCache(int size) {
        super((int) Math.ceil(size / 0.75), 0.75f, true);
        this.size = size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > size;
    }

    public static <K, V> LRUCache<K, V> newInstance(int size) {
        return new LRUCache<>(size);
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = LRUCache.newInstance(2);
        cache.put(1, "AA");
        cache.put(2, "BB");
        cache.put(1, "AA");
        cache.put(2, "BB");
        cache.put(2, "BB");
        cache.put(3, "CC");

        System.out.println(cache);
    }
}
