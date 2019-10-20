package com.eddie.javabase.reactor;

/**
 * @program: AprilSky
 * @description: 输入源对象
 * @author: Eddie.tran
 * @create: 2019-06-01 15:33:12
 * @version: V1.0
 **/
public class InputSource {
    private Object data;
    private long id;

    public InputSource(Object data, long id) {
        this.data = data;
        this.id = id;
    }

    @Override
    public String toString() {
        return "InputSource{" +
                "data=" + data +
                ", id=" + id +
                '}';
    }
}
