package com.eddie.javabase.reactor;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: AprilSky
 * @description: reactor模式中Dispatcher类，负责event的分发和eventHandler的维护
 * @author: Eddie.tran
 * @create: 2019-06-01 16:06:16
 * @version: V1.0
 **/
public class Dispatcher {
    //通过ConcurrentHashMap来维护不同的事件处理器
    Map<EventType, EventHandler> eventHandlerMap = new ConcurrentHashMap<>();
    //本例只维护一个selector负责事件选择，netty为了保证性能实现了多个selector来保证循环处理性能，不同事件加入不同的selector的事件缓冲队列
    Selector selector;

    public Dispatcher(Selector selector) {
        this.selector = selector;
    }

    //在dispatcher中注册handler
    public void registEventHandler(EventType eventType, EventHandler eventHandler) {
        eventHandlerMap.put(eventType, eventHandler);
    }

    public void removeEventHandler(EventType eventType) {
        eventHandlerMap.remove(eventType);
    }

    public void handleEvents() {
        dispatcher();
    }

    private void dispatcher() {
        while (true) {
            List<Event> events = selector.select();
            for (Event event : events) {
                EventHandler eventHandler = eventHandlerMap.get(event.getType());
                eventHandler.handle(event);
            }
        }
    }
}
