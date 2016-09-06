package com.tradenity.sdk.exceptions;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 3:24 PM
 */
public class ClientErrorException extends RuntimeException{
    public ClientErrorException() {
    }

    public ClientErrorException(String message) {
        super(message);
    }

    public ClientErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClientErrorException(Throwable cause) {
        super(cause);
    }

    public ClientErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
