package com.eddie.javabase.reactor;


/**
 * @program: AprilSky
 * @description: accept事件处理器
 * @author: Eddie.tran
 * @create: 2019-06-01 15:41:35
 * @version: V1.0
 **/
public class AcceptEventHandler extends EventHandler {
    private Selector selector;

    public AcceptEventHandler(Selector selector) {
        this.selector = selector;
    }

    @Override
    public void handle(Event event) {
        //处理accept的event事件
        if (event.getType() == EventType.ACCEPT) {
            //TODO 处理accept状态的事件

            //将事件状态改为下一个read状态，并放入selector缓冲队列中
            Event readEvent = new Event();
            readEvent.setSource(event.getSource());
            readEvent.setType(EventType.READ);
            selector.addEvent(readEvent);
        }
    }
}
