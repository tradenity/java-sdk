package com.tradenity.sdk.exceptions;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 3:24 PM
 */
public class ServerErrorException extends RuntimeException{
    public ServerErrorException() {
    }

    public ServerErrorException(String message) {
        super(message);
    }

    public ServerErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServerErrorException(Throwable cause) {
        super(cause);
    }

    public ServerErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
