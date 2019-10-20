package com.eddie.javabase.prototype;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-05-17 19:29:43
 * @version: V1.0
 **/
public class ConcretePrototype extends Prototype {

    private String field;

    public ConcretePrototype(String field) {
        this.field = field;
    }

    @Override
    Prototype myClone() {
        return new ConcretePrototype(field);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "field='" + field + '\'' +
                '}';
    }
}
