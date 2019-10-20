package com.eddie.javabase.lrucache;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program: AprilSky
 * @description: lru cache2
 * @author: Eddie.tran
 * @create: 2019-05-17 12:16:48
 * @version: V1.0
 **/
public class LRUCache2<K, V> {
    private Map<K, V> cacheMap;

    public LRUCache2(final int size) {
        this.cacheMap = new LinkedHashMap<K, V>(size, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > size;
            }
        };
    }

    /*public LRUCache2(int size) {
        this.cacheMap = Collections.synchronizedMap(new LinkedHashMap<K, V>(size, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > size;
            }
        });
    }*/

    public synchronized void put(K k, V v) {
        cacheMap.put(k, v);
    }

    public synchronized V get(K k) {
        return cacheMap.get(k);
    }

    /*public synchronized V atomicGetAndSet(K k,V v) {
        V result = get(k);
        put(k, v);
        return result;
    }*/

    public static void main(String[] args) {
        LRUCache2<Integer, Integer> cache2 = new LRUCache2<>(2);
        cache2.put(11, 11);
        cache2.put(22, 22);
        cache2.put(22, 22);
        cache2.put(33, 33);
        cache2.put(11, 11);
        System.out.println(cache2);
    }
}
