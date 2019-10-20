package com.eddie.javabase.chain;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-05-17 20:00:09
 * @version: V1.0
 **/
public class Client {
    public static void main(String[] args) {
        Handler handler = new ConcreteHandler1(null);
        Handler handler1 = new ConcreteHandler2(handler);

        Request request = new Request(RequestType.TYPE1, "Request1");
        handler1.handleRequest(request);

        Request request1 = new Request(RequestType.TYPE2, "Request2");
        handler1.handleRequest(request1);

    }

}
