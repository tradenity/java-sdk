package com.tradenity.sdk.exceptions;

import com.tradenity.sdk.exceptions.messages.ErrorMessage;

/**
 * Created by joseph
 * on 4/12/16.
 */
public class InventoryErrorException extends RequestErrorException{
    public InventoryErrorException() {
    }

    public InventoryErrorException(String message) {
        super(message);
    }

    public InventoryErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public InventoryErrorException(Throwable cause) {
        super(cause);
    }

    public InventoryErrorException(ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public InventoryErrorException(ErrorMessage errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }

    public InventoryErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
