package com.eddie.javabase.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-06-05 17:49:38
 * @version: V1.0
 **/
public class PrintABCUsingLock {
    private int times;
    private int state;

    private Lock lock = new ReentrantLock();

    public PrintABCUsingLock(int times) {
        this.times = times;
    }

    public static void main(String[] args) {
        PrintABCUsingLock printABCUsingLock = new PrintABCUsingLock(10);
        new Thread(printABCUsingLock::printA).start();
        new Thread(printABCUsingLock::printB).start();
        new Thread(printABCUsingLock::printC).start();
    }

    public void printA() {
        print("A", 0);
    }

    public void printB() {
        print("B", 1);
    }

    public void printC() {
        print("C", 2);
    }

    private void print(String str, int targetState) {
        for (int i = 0; i < times; ) {
            lock.lock();
            if (state % 3 == targetState) {
                state++;
                i++;
                System.out.print(str);
            }
            lock.unlock();
        }
    }
}
