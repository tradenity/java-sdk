package com.tradenity.sdk.exceptions;

import com.tradenity.sdk.exceptions.messages.ApiError;
import com.tradenity.sdk.exceptions.messages.ErrorMessage;

/**
 * Created by joseph
 * on 4/12/16.
 */
public class CustomerCreationException extends RequestErrorException{

    public CustomerCreationException(ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public CustomerCreationException(ErrorMessage errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }

    public String getErrorFieldName() {
        if(this.errorMessage.getErrorCode() == ApiError.EXISTING_EMAIL_ERROR_CODE){
            return "email";
        } else if(this.errorMessage.getErrorCode() == ApiError.EXISTING_USERNAME_ERROR_CODE){
            return "username";
        }else {
            return null;
        }
    }
}
