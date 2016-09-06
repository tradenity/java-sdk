package com.tradenity.sdk.exceptions;

import com.tradenity.sdk.exceptions.messages.ErrorMessage;

/**
 * Created by joseph
 * on 4/12/16.
 */
public class AuthorizationException extends RequestErrorException{
    public AuthorizationException() {
    }

    public AuthorizationException(String message) {
        super(message);
    }

    public AuthorizationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthorizationException(Throwable cause) {
        super(cause);
    }

    public AuthorizationException(ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public AuthorizationException(ErrorMessage errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }

    public AuthorizationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
