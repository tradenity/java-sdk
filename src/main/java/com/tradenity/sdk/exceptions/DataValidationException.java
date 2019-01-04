package com.tradenity.sdk.exceptions;

import com.tradenity.sdk.exceptions.messages.ErrorMessage;

public class DataValidationException extends RequestErrorException{
    public DataValidationException() {
    }

    public DataValidationException(String message) {
        super(message);
    }

    public DataValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataValidationException(Throwable cause) {
        super(cause);
    }

    public DataValidationException(ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public DataValidationException(ErrorMessage errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }

    public DataValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}