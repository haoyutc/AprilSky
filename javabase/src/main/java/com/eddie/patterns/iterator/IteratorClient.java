package com.example.demo.patterns.iterator;

import java.util.Iterator;

public class IteratorClient {
    public static void main(String[] args) {
        checkAttendance();
    }

    public static void checkAttendance() {
        StuIterable stuIterable = new StuIterable();
        System.out.println("——————————开始点名————————————");
        for (Student student : stuIterable) {
            System.out.println(student);
        }

    }
}
