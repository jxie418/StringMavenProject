package com.jing.xie.core.services.exceptions;

/**
 * Created by JXie on 4/12/2015.
 */
public class AccountDoesNotExistException extends RuntimeException {
    public AccountDoesNotExistException(Throwable cause) {
        super(cause);
    }
    public AccountDoesNotExistException(String message, Throwable cause) {
        super(message, cause);
    }
    public AccountDoesNotExistException(String message) {
        super(message);
    }
    public  AccountDoesNotExistException() {

    }
}
