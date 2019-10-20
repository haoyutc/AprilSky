package com.eddie.javabase.chain;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-05-17 19:51:12
 * @version: V1.0
 **/
public class Request {
    private String name;
    private RequestType type;

    public Request(RequestType type1, String request1) {
        this.name = request1;
        this.type = type1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RequestType getType() {
        return type;
    }

    public void setType(RequestType type) {
        this.type = type;
    }
}
