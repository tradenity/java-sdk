package com.tradenity.sdk.exceptions;

import com.tradenity.sdk.exceptions.messages.ErrorMessage;

/**
 * Created by joseph
 * on 4/12/16.
 */
public class RefundException extends RequestErrorException{
    public RefundException() {
    }

    public RefundException(String message) {
        super(message);
    }

    public RefundException(String message, Throwable cause) {
        super(message, cause);
    }

    public RefundException(Throwable cause) {
        super(cause);
    }

    public RefundException(ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public RefundException(ErrorMessage errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }

    public RefundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
