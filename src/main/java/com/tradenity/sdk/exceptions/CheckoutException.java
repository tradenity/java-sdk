package com.tradenity.sdk.exceptions;


public class CheckoutException extends ApplicationException{
    public static final int SHIPPING_METHOD_REQUIRED = 1611;
    public static final int SHIPPING_ADDRESS_REQUIRED = 1612;
    public static final int SHIPPING_METHOD_NOT_SUPPORTED = 1613;

    static {
        addError(SHIPPING_METHOD_REQUIRED,
                "Shipping Method Required.",
                "Shipping Method Required.",
                "Shipping Method Required.");
        addError(SHIPPING_ADDRESS_REQUIRED,
                "Shipping Address Required.",
                "Shipping Address Required.",
                "Shipping Address Required.");
        addError(SHIPPING_METHOD_NOT_SUPPORTED,
                "Shipping Method Not Supported.",
                "Shipping Method Not Supported.",
                "Shipping Method Not Supported.");
    }

    public CheckoutException(int errorCode) {
        super(errorCode);
    }
}