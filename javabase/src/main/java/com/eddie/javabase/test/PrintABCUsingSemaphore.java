package com.eddie.javabase.test;

import java.util.concurrent.Semaphore;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-06-05 18:22:33
 * @version: V1.0
 **/
public class PrintABCUsingSemaphore {
    private int times;
    private Semaphore semaphoreA = new Semaphore(1);
    private Semaphore semaphoreB = new Semaphore(0);
    private Semaphore semaphoreC = new Semaphore(0);

    public PrintABCUsingSemaphore(int times) {
        this.times = times;
    }

    public static void main(String[] args) {
        PrintABCUsingSemaphore printABCUsingSemaphore = new PrintABCUsingSemaphore(10);
        new Thread(printABCUsingSemaphore::printA).start();
        new Thread(printABCUsingSemaphore::printB).start();
        new Thread(printABCUsingSemaphore::printC).start();
    }

    public void printA() {
        try {
            print("A", semaphoreA, semaphoreB);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void printB() {
        try {
            print("B", semaphoreB, semaphoreC);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void printC() {
        try {
            print("C", semaphoreC, semaphoreA);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void print(String str, Semaphore current, Semaphore next) throws InterruptedException {
        for (int i = 0; i < times; i++) {
            current.acquire();
            System.out.print(str);
            next.release();
        }
    }
}
