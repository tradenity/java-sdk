package com.tradenity.sdk.exceptions;


public class CustomerCreationException extends ApplicationException{
    public static final int EMAIL_ALREADY_REGISTERED = 1601;
    public static final int ALREADY_REGISTERED_USERNAME = 1602;

    static {
        addError(EMAIL_ALREADY_REGISTERED,
                "Email already registered.",
                "Customer with this email already registered.",
                "Customer with this email already registered.");
        addError(ALREADY_REGISTERED_USERNAME,
                "Already registered username.",
                "Already registered username.",
                "Already registered username, please choose different one.");
    }

    public CustomerCreationException(int errorCode) {
        super(errorCode);
    }
}