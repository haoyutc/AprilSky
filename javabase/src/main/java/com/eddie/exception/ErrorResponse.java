package com.eddie.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @program: AprilSky
 * @description: 异常信息类
 * @author: Eddie.tran
 * @create: 2019-10-19 15:58:54
 * @version: V1.0
 **/
@Getter
@Setter
public class ErrorResponse {
    private String message;
    private String errorTypeName;

    public ErrorResponse(Exception e) {
        this(e.getMessage(), e.getClass().getName());
    }

    public ErrorResponse(String message, String errorTypeName) {
        this.message = message;
        this.errorTypeName = errorTypeName;
    }

}
