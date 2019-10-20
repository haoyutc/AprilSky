package com.eddie.javabase.factory.factorymethod;

import com.eddie.javabase.factory.simplefactory.ConcreteProduct;
import com.eddie.javabase.factory.simplefactory.Product;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-05-17 17:21:21
 * @version: V1.0
 **/
public class ConcreteFactory extends Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
