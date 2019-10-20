package com.eddie.javabase.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-08-25 15:39:22
 * @version: V1.0
 **/
public class ForkJoinTask extends RecursiveTask<Long> {

    private static final long MAX=1000000000L;
    private static final long THRESHOLD=1000L;
    private  long start;
    private  long end;

    public ForkJoinTask(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public static void main(String[] args) {

        testForkJoin();
        System.out.println("-----------------");
//        test();
    }

    private static void test(){
        System.out.println("test");
        long start = System.currentTimeMillis();
        long sum=0L;
        for (long i = 0L; i <=MAX; i++) {
            sum+=i;
        }
        System.out.println(sum);
        System.out.println(System.currentTimeMillis()-start+"ms");
    }

    private static void testForkJoin(){
        System.out.println("testForkJoin");
        long start = System.currentTimeMillis();

        ForkJoinPool pool = new ForkJoinPool();
        Long sum = pool.invoke(new ForkJoinTask(1, MAX));
        System.out.println(sum);
        System.out.println(System.currentTimeMillis()-start+"ms");
    }
    @Override
    protected Long compute() {
        long sum=0;
        if (end - start <= THRESHOLD) {
            for (long i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        } else {
            long mid = (start+end)/2;
            ForkJoinTask task1 = new ForkJoinTask(start, mid);
            task1.fork();

            ForkJoinTask task2 = new ForkJoinTask(mid + 1, end);
            task2.fork();

            return task1.join() + task2.join();
        }
    }
}
