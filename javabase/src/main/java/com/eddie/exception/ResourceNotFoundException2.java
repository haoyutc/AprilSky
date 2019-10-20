package com.eddie.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @program: AprilSky
 * @description: 自定义异常类
 * @author: Eddie.tran
 * @create: 2019-10-19 16:06:06
 * @version: V1.0
 **/
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException2 extends RuntimeException {

    private String message;
    public ResourceNotFoundException2(){
    }
    public ResourceNotFoundException2(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
