package com.tradenity.sdk.exceptions;

import com.tradenity.sdk.exceptions.messages.ErrorMessage;

/**
 * Created by joseph
 * on 4/12/16.
 */
public class GatewayErrorException extends RequestErrorException{
    public GatewayErrorException() {
    }

    public GatewayErrorException(String message) {
        super(message);
    }

    public GatewayErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public GatewayErrorException(Throwable cause) {
        super(cause);
    }

    public GatewayErrorException(ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public GatewayErrorException(ErrorMessage errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }

    public GatewayErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
