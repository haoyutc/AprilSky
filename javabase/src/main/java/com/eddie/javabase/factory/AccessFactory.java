package com.eddie.javabase.factory;

/**
 * @program: AprilSky
 * @description: access factory
 * @author: Eddie.tran
 * @create: 2019-05-17 11:34:04
 * @version: V1.0
 **/
public class AccessFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDeparment();
    }
}
