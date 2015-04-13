package com.jing.xie.core.services.exceptions;

/**
 * Created by JXie on 4/12/2015.
 */
public class BlogNotFoundException extends RuntimeException {
    public BlogNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public BlogNotFoundException(String message) {
        super(message);
    }

    public BlogNotFoundException() {
    }
}
