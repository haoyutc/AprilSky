package com.eddie.javabase.algorithms;

/**
 * @program: AprilSky
 * @description: 字符串查找之kmp算法
 * @author: Eddie.tran
 * @create: 2019-06-02 14:32:59
 * @version: V1.0
 **/
public class KMP {
    public int kmp(String source, String target) {
        char[] mainS = source.toCharArray();
        char[] subS = target.toCharArray();
        int i = 0;
        int j = 0;
        int next[] = getNext(target);
        while (i < mainS.length && j < subS.length) {
            // 当j为-1时，要移动的是i，当然j也要归0
            if (j == -1 || mainS[i] == subS[j]) {
                i++;
                j++;
            } else {
                j = next[j];//j回到指定位置
            }
        }
        if (j == subS.length) {
            return i - j;
        } else {
            return -1;
        }
    }

    int[] getNext(String target) {
        char[] str = target.toCharArray();

        int[] next = new int[str.length];
        next[0] = -1;
        int i = 0;
        int j = -1;
        while (i < str.length - 1) {
            if (j == -1 || str[i] == str[j]) {
                if (str[++i] == str[++j]) {
                    next[i] = next[j];
                } else {
                    next[i] = j;
                }
            } else {
                j = next[j];
            }
        }
        return next;
    }

    public static void main(String[] args) {
        String s1 = "swqeadadadaddadkklj";
        String s2 = "adadadaddad";
        System.out.println(new KMP().kmp(s1, s2));
    }
}
