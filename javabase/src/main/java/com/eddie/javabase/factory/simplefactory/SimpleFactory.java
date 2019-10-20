package com.eddie.javabase.factory.simplefactory;

/**
 * @program: AprilSky
 * @description: 简单工厂实现
 * @author: Eddie.tran
 * @create: 2019-05-17 17:08:36
 * @version: V1.0
 **/
public class SimpleFactory {
    public Product createProduct(int type) {

        if (type == 1) {
            return new ConcreteProduct1();
        } else if (type == 2) {
            return new ConcreteProduct();
        }
        return new ConcreteProduct();
    }

    public Product createProduct2(int type) {
        switch (type) {
            case 1:
                return new ConcreteProduct1();
            case 2:
                return new ConcreteProduct2();
            default:
                return new ConcreteProduct();
        }
    }

}
