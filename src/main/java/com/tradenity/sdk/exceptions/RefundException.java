package com.tradenity.sdk.exceptions;


public class RefundException extends ApplicationException{
    public static final int ORDER_ALREADY_REFUNDED = 1661;
    public static final int ORDER_WAS_NOT_CHARGED = 1662;

    static {
        addError(ORDER_ALREADY_REFUNDED,
                "Order already refunded!",
                "Order already refunded!",
                "Order already refunded!");
        addError(ORDER_WAS_NOT_CHARGED,
                "Order was not charged",
                "Order was not charged!",
                "Order was not charged!");
    }

    public RefundException(int errorCode) {
        super(errorCode);
    }
}