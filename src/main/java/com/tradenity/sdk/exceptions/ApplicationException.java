package com.tradenity.sdk.exceptions;

import java.util.HashMap;
import java.util.Map;


public class ApplicationException extends RuntimeException{


    protected static Map<Integer, String> errorTitles = new HashMap<Integer, String>();

    protected static Map<Integer, String> errorMessages = new HashMap<Integer, String>();

    protected static Map<Integer, String> errorDetailedMessages = new HashMap<Integer, String>();

    protected int errorCode;

    public ApplicationException(int errorCode) {
        super(errorMessages.get(errorCode));
        this.errorCode = errorCode;
    }

    public ApplicationException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    static protected void addError(int errorCode, String title, String message, String details){
        errorTitles.put(errorCode, title);
        errorMessages.put(errorCode, message);
        errorDetailedMessages.put(errorCode, details);
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorTitle() {
        return errorTitles.get(getErrorCode());
    }

    public String getDetailedErrorMessage() {
        return errorDetailedMessages.get(getErrorCode());
    }
}