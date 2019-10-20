package com.eddie.javabase.algorithms;

import java.util.Stack;

/**
 * @program: AprilSky
 * @description: 两个栈实现队列
 * @author: Eddie.tran
 * @create: 2019-05-28 11:19:40
 * @version: V1.0
 **/
public class Solution {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    public void push(int node) {
        in.push(node);
    }

    public int pop() throws Exception {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        if (out.isEmpty())
            throw new Exception("queue is empty!");
        return out.pop();
    }
}
