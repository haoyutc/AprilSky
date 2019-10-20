package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: shallow clone exmple test
 * @author: Eddie.tran
 * @create: 2019-05-16 15:24:13
 * @version: V1.0
 **/
public class ShallowCloneExmTest {
    public static void main(String[] args) {
        ShallowCloneExm cloneExm = new ShallowCloneExm();
        ShallowCloneExm exm = null;
        try {
            exm = cloneExm.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        cloneExm.set(1, 222);
        System.out.println(exm.get(1));
    }

}
