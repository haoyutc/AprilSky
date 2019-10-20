package com.eddie.javabase.reactor;

/**
 * @program: AprilSky
 * @description: event处理器的抽象类
 * @author: Eddie.tran
 * @create: 2019-06-01 15:39:24
 * @version: V1.0
 **/
public abstract class EventHandler {
    private InputSource source;

    public abstract void handle(Event event);

    public InputSource getSource() {
        return source;
    }

    public void setSource(InputSource source) {
        this.source = source;
    }
}
