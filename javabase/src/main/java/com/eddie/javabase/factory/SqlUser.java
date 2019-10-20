package com.eddie.javabase.factory;

/**
 * @program: AprilSky
 * @description: sql user
 * @author: Eddie.tran
 * @create: 2019-05-17 11:24:51
 * @version: V1.0
 **/
public class SqlUser implements IUser {

    @Override
    public void insert() {
        System.out.println("insert user into sql user");
    }

    @Override
    public void getById() {
        System.out.println("get user by user id");
    }
}
