package com.eddie.javabase.reactor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-06-01 16:15:11
 * @version: V1.0
 **/
public class Acceptor implements Runnable {

    private int port;
    private Selector selector;
    private BlockingQueue<InputSource> inputSources = new LinkedBlockingDeque<>();

    public Acceptor(int port, Selector selector) {
        this.port = port;
        this.selector = selector;
    }

    public void addNewConnection(InputSource source) {
        inputSources.offer(source);
    }

    public int getPort() {
        return port;
    }

    @Override
    public void run() {
        while (true) {
            InputSource inputSource = null;
            try {
                inputSource = inputSources.element();
            } catch (Exception e) {
                //ignore it
            }
            if (inputSource != null) {
                Event acceptEvent = new Event();
                acceptEvent.setSource(inputSource);
                acceptEvent.setType(EventType.ACCEPT);
                selector.addEvent(acceptEvent);
            }
        }
    }
}
