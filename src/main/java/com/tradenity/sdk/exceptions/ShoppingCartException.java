package com.tradenity.sdk.exceptions;


public class ShoppingCartException extends ApplicationException{
    public static final int INVALID_ITEM_ID = 1631;

    static {
        addError(INVALID_ITEM_ID,
                "Invalid Item ID.",
                "Shopping cart do not contain item with this ID.",
                "Shopping cart do not contain item with this ID.");
    }

    public ShoppingCartException(int errorCode) {
        super(errorCode);
    }
}