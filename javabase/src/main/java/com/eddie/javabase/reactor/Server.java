package com.eddie.javabase.reactor;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-06-01 16:22:22
 * @version: V1.0
 **/
public class Server {
    Selector selector = new Selector();
    Dispatcher eventLooper = new Dispatcher(selector);
    Acceptor acceptor;

    Server(int port) {
        acceptor = new Acceptor(port, selector);
    }

    public void start() {
        eventLooper.registEventHandler(EventType.ACCEPT, new AcceptEventHandler(selector));
        new Thread(acceptor, "Acceptor-" + acceptor.getPort()).start();
        eventLooper.handleEvents();
    }

}
