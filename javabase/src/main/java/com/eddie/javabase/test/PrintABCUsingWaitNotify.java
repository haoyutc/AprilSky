package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-06-05 18:00:46
 * @version: V1.0
 **/
public class PrintABCUsingWaitNotify {
    private int times;
    private int state;
    private Object objA = new Object();
    private Object objB = new Object();
    private Object objC = new Object();

    public PrintABCUsingWaitNotify(int times) {
        this.times = times;
    }

    public static void main(String[] args) {
        PrintABCUsingWaitNotify printABCUsingWaitNotify = new PrintABCUsingWaitNotify(10);
        new Thread(printABCUsingWaitNotify::printA).start();
        new Thread(printABCUsingWaitNotify::printB).start();
        new Thread(printABCUsingWaitNotify::printC).start();
    }

    public void printA() {
        try {
            print("A", 0, objA, objB);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void printB() {
        try {
            print("B", 1, objB, objC);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void printC() {
        try {
            print("C", 2, objC, objA);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void print(String str, int targetSate, Object current, Object next) throws InterruptedException {
        for (int i = 0; i < times; ) {
            synchronized (current) {
                while (state % 3 != targetSate) {
                    current.wait();
                }
                state++;
                i++;
                System.out.print(str);
                synchronized (next) {
                    next.notify();
                }
            }
        }
    }
}
