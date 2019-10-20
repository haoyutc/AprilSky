package com.eddie.javabase.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: AprilSky
 * @description: java 堆溢出
 * @author: Eddie.tran
 * @create: 2019-05-13 17:12:12
 * @version: V1.0
 **/
public class HeapOOM {
    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }

}
