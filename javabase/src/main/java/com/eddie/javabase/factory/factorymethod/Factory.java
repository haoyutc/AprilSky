package com.eddie.javabase.factory.factorymethod;

import com.eddie.javabase.factory.simplefactory.Product;

/**
 * @program: AprilSky
 * @description: 抽象工厂类
 * @author: Eddie.tran
 * @create: 2019-05-17 17:17:52
 * @version: V1.0
 **/
public abstract class Factory {

    abstract public Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        //TODO with the product
    }
}
