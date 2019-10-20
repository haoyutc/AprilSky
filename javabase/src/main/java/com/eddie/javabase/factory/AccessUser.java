package com.eddie.javabase.factory;

/**
 * @program: AprilSky
 * @description: access user
 * @author: Eddie.tran
 * @create: 2019-05-17 11:28:32
 * @version: V1.0
 **/
public class AccessUser implements IUser {

    @Override
    public void insert() {
        System.out.println("insert into access");
    }

    @Override
    public void getById() {
        System.out.println("get access by id");
    }
}
