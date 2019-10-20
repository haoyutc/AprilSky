package com.eddie.javabase.test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-06-05 18:11:51
 * @version: V1.0
 **/
public class PrintABCUsingLockCondition {
    private int times;
    private int state;
    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();
    private Condition conditionC = lock.newCondition();

    public PrintABCUsingLockCondition(int times) {
        this.times = times;
    }

    public static void main(String[] args) {
        PrintABCUsingLockCondition printABCUsingLockCondition = new PrintABCUsingLockCondition(10);
        new Thread(printABCUsingLockCondition::printA).start();
        new Thread(printABCUsingLockCondition::printB).start();
        new Thread(printABCUsingLockCondition::printC).start();
    }

    private void printA() {
        print("A", 0, conditionA, conditionB);
    }

    private void printB() {
        print("B", 1, conditionB, conditionC);
    }

    private void printC() {
        print("C", 2, conditionC, conditionA);
    }

    private void print(String str, int targetState, Condition current, Condition next) {
        for (int i = 0; i < times; ) {
            lock.lock();
            try {
                while (state % 3 != targetState) {
                    current.await();
                }
                state++;
                i++;
                System.out.print(str);
                next.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
