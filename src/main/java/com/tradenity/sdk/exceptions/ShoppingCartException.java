package com.tradenity.sdk.exceptions;

import com.tradenity.sdk.exceptions.messages.ErrorMessage;

/**
 * Created by joseph
 * on 4/12/16.
 */
public class ShoppingCartException extends RequestErrorException{
    public ShoppingCartException() {
    }

    public ShoppingCartException(String message) {
        super(message);
    }

    public ShoppingCartException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShoppingCartException(Throwable cause) {
        super(cause);
    }

    public ShoppingCartException(ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public ShoppingCartException(ErrorMessage errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }

    public ShoppingCartException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
