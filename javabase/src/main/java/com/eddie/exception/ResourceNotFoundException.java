package com.eddie.exception;

/**
 * @program: AprilSky
 * @description: 自定义异常类
 * @author: Eddie.tran
 * @create: 2019-10-19 16:06:06
 * @version: V1.0
 **/
public class ResourceNotFoundException extends RuntimeException {
    private String message;

    public ResourceNotFoundException(){
        super();
    }
    public ResourceNotFoundException(String mesaage){
        super(mesaage);
        this.message = mesaage;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
