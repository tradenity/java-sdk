package com.tradenity.sdk.exceptions;


public class InventoryErrorException extends ApplicationException{
    public static final int INVALID_PRODUCT = 1621;
    public static final int NOT_ENOUGH_STOCK = 1622;

    static {
        addError(INVALID_PRODUCT,
                "Invalid Product.",
                "No product exist with this ID.",
                "No product exist with this ID.");
        addError(NOT_ENOUGH_STOCK,
                "Not Enough stock.",
                "Product not available in stock with the specified amount.",
                "Product not available in stock with the specified amount.");
    }

    public InventoryErrorException(int errorCode) {
        super(errorCode);
    }
}