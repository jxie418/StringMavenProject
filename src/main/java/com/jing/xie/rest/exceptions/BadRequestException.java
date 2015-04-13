package com.jing.xie.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by JXie on 4/12/2015.
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequestException extends  RuntimeException {
    public BadRequestException(){

    }
    public BadRequestException(Throwable cause) {
        super(cause);
    }
}
