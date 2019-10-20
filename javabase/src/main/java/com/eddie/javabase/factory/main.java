package com.eddie.javabase.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: AprilSky
 * @description: 客户端
 * @author: Eddie.tran
 * @create: 2019-05-17 11:35:09
 * @version: V1.0
 **/
public class main {
    public static void main(String[] args) {
        IFactory factory = new AccessFactory();
        IUser user = factory.createUser();
        IDepartment department = factory.createDepartment();
        user.insert();
        user.getById();
        department.insert();
        department.getById();

        /*List<Object> objects;
        List<String> strings = null;
        objects=strings;*/

        List<String> list = new ArrayList<>();
    }

}
