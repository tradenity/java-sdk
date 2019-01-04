package com.tradenity.sdk.exceptions;


public class PaymentException extends ApplicationException{
    public static final int PAYMENT_AMOUNT_MISMATCH = 1651;
    public static final int CARD_NOT_CHARGED = 1652;
    public static final int PAYMENT_ERROR = 1653;

    static {
        addError(PAYMENT_AMOUNT_MISMATCH,
                "Payment amount mismatch",
                "Paid amount does not match order",
                "Paid amount does not match order");
        addError(CARD_NOT_CHARGED,
                "Card not charged!",
                "Card not charged!",
                "Card not charged!");
        addError(PAYMENT_ERROR,
                "Payment error",
                "Payment error",
                "Payment error");
    }

    public PaymentException(int errorCode) {
        super(errorCode);
    }
}