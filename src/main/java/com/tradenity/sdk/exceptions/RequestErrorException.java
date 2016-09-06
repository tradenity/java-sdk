package com.tradenity.sdk.exceptions;

import com.tradenity.sdk.exceptions.messages.ErrorMessage;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 3:24 PM
 */
public class RequestErrorException extends RuntimeException{
    protected ErrorMessage errorMessage;
    public RequestErrorException() {
    }

    public RequestErrorException(String message) {
        super(message);
    }

    public RequestErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public RequestErrorException(ErrorMessage errorMessage) {
        super(errorMessage.getMessage());
        this.errorMessage = errorMessage;
    }

    public RequestErrorException(ErrorMessage errorMessage, Throwable cause) {
        super(errorMessage.getMessage(), cause);
        this.errorMessage = errorMessage;
    }

    public RequestErrorException(Throwable cause) {
        super(cause);
    }

    public RequestErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ErrorMessage getErrorMessage() {
        return errorMessage;
    }
}
