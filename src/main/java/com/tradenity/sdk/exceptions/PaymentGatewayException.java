package com.tradenity.sdk.exceptions;


public class PaymentGatewayException extends ApplicationException{
    public static final int PAYMENT_GATEWAY_AUTHENTICATION_ERROR = 1641;
    public static final int PAYMENT_GATEWAY_REQUEST_ERROR = 1642;
    public static final int PAYMENT_GATEWAY_CONNECTION_ERROR = 1643;
    public static final int PAYMENT_GATEWAY_CARD_ERROR = 1644;
    public static final int PAYMENT_GATEWAY_API_ERROR = 1645;

    static {
        addError(PAYMENT_GATEWAY_AUTHENTICATION_ERROR,
                "Payment gateway authentication error",
                "Payment gateway authentication error",
                "Payment gateway authentication error");
        addError(PAYMENT_GATEWAY_REQUEST_ERROR,
                "Payment gateway request error.",
                "Payment gateway request error: Invalid request",
                "Payment gateway request error: Invalid request");
        addError(PAYMENT_GATEWAY_CONNECTION_ERROR,
                "Payment gateway Connection error.",
                "Payment gateway API Connection error.",
                "Payment gateway API Connection error.");
        addError(PAYMENT_GATEWAY_CARD_ERROR,
                "Payment gateway card error.",
                "Payment gateway card error.",
                "Payment gateway card error.");
        addError(PAYMENT_GATEWAY_API_ERROR,
                "Payment gateway API error.",
                "Payment gateway API error.",
                "Payment gateway API error.");
    }

    public PaymentGatewayException(int errorCode) {
        super(errorCode);
    }
}