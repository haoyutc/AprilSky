package com.eddie.javabase.chain;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-05-17 19:58:04
 * @version: V1.0
 **/
public class ConcreteHandler2 extends Handler {

    public ConcreteHandler2(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE2) {
            System.out.println(request.getName() + " is handle by ConcreteHandler2");
            return;
        }
        if (successor != null) successor.handleRequest(request);
    }
}
