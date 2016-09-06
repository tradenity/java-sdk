package com.tradenity.sdk.exceptions;

import com.tradenity.sdk.exceptions.messages.ErrorMessage;

/**
 * Created by joseph
 * on 4/12/16.
 */
public class AuthenticationException extends RequestErrorException{

    public AuthenticationException() {
    }

    public AuthenticationException(String message) {
        super(message);
    }

    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthenticationException(ErrorMessage errMessage) {
        super(errMessage.getMessage());
    }

    public AuthenticationException(ErrorMessage errMessage, Throwable cause) {
        super(errMessage.getMessage(), cause);
    }

    public AuthenticationException(Throwable cause) {
        super(cause);
    }

    public AuthenticationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
