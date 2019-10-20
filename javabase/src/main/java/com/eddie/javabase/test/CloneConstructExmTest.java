package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: CloneConstructExm test
 * @author: Eddie.tran
 * @create: 2019-05-16 15:51:27
 * @version: V1.0
 **/
public class CloneConstructExmTest {
    public static void main(String[] args) {
        CloneConstructExm constructExm = new CloneConstructExm();
        CloneConstructExm exm = new CloneConstructExm(constructExm);
        constructExm.set(2, 33);
        System.out.println(exm.get(2));
        System.out.println(constructExm.get(2));

        final int a = 1;
//        a=8;//final使基本类型数值不变
        final CloneConstructExmTest exm1 = new CloneConstructExmTest();
    }

}
