package com.tradenity.sdk.exceptions;

import com.tradenity.sdk.exceptions.messages.ErrorMessage;

/**
 * Created by joseph
 * on 4/12/16.
 */
public class PaymentException extends RequestErrorException{
    public PaymentException() {
    }

    public PaymentException(String message) {
        super(message);
    }

    public PaymentException(String message, Throwable cause) {
        super(message, cause);
    }

    public PaymentException(Throwable cause) {
        super(cause);
    }

    public PaymentException(ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public PaymentException(ErrorMessage errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }

    public PaymentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
