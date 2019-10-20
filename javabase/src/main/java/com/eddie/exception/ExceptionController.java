package com.eddie.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-10-19 16:19:14
 * @version: V1.0
 **/
@RestController
@RequestMapping("/api")
public class ExceptionController {
    @GetMapping("/illegalArgumentException")
    public void throwException(){
        throw new IllegalArgumentException();
    }

    @GetMapping("/resourceNotFoundException")
    public void throwException2(){
        throw new ResourceNotFoundException();
    }

    /*@GetMapping("/resourceNotFoundException2")
    public void throwException3(){
        throw new ResourceNotFoundException2("Sorry,the resource not found!");
        }*/

        @GetMapping("/resourceNotFoundException2")
        public void throwException3(){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sorry,the resource not found!", new ResourceNotFoundException());
        }
}
