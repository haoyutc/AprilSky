package com.eddie.javabase.test;

import java.util.HashSet;

/**
 * @program: AprilSky
 * @description: equals example
 * @author: Eddie.tran
 * @create: 2019-05-16 14:18:03
 * @version: V1.0
 **/
public class EqualExample {
    private int x;
    private int y;
    private int z;

    public EqualExample(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        EqualExample that = (EqualExample) obj;
        if (x != that.x) return false;
        if (y != that.y) return false;
        return z == that.z;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        result = 31 * result + z;

        return result;
    }

    public static void main(String[] args) {
        EqualExample example = new EqualExample(1, 1, 1);
        EqualExample example2 = new EqualExample(1, 1, 1);
        System.out.println(example.equals(example2));

        HashSet<EqualExample> set = new HashSet<>();
        set.add(example);
        set.add(example2);
        System.out.println(set.size());

        String s1 = "abc";
        String s2 = "abc";
        HashSet<String> ss = new HashSet<>();
        ss.add(s1);
        ss.add(s2);
        System.out.println(ss.size());
    }
}
