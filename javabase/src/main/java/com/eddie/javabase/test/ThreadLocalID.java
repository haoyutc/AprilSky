package com.eddie.javabase.test;

/**
 * @program: AprilSky
 * @description: threadlocal test
 * @author: Eddie.tran
 * @create: 2019-05-30 14:31:51
 * @version: V1.0
 **/
public class ThreadLocalID {
    private String requestId;

    private static final ThreadLocal<String> localId = new ThreadLocal<String>() {
        @Override
        protected String initialValue() {
            return "";
        }
    };
    private static final ThreadLocal<Object> THREAD_LOCAL = ThreadLocal.withInitial(() -> getLocalId());

    public static ThreadLocal<String> getLocalId() {
        return localId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
