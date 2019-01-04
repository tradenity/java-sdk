package com.tradenity.sdk.exceptions;

import com.tradenity.sdk.exceptions.messages.ErrorMessage;

public class SessionExpiredException extends RequestErrorException{
    public SessionExpiredException() {
    }

    public SessionExpiredException(String message) {
        super(message);
    }

    public SessionExpiredException(String message, Throwable cause) {
        super(message, cause);
    }

    public SessionExpiredException(Throwable cause) {
        super(cause);
    }

    public SessionExpiredException(ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public SessionExpiredException(ErrorMessage errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }

    public SessionExpiredException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}