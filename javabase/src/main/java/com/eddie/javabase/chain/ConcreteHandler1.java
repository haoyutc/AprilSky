package com.eddie.javabase.chain;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-05-17 19:53:45
 * @version: V1.0
 **/
public class ConcreteHandler1 extends Handler {

    public ConcreteHandler1(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE1) {
            System.out.println(request.getName() + " is handle by ConcreteHandler1");
            return;
        }
        if (successor != null) successor.handleRequest(request);
    }
}
