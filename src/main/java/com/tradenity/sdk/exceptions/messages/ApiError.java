package com.tradenity.sdk.exceptions.messages;

/**
 * Created by joseph
 * on 4/12/16.
 */
public class ApiError {
    public static final int UNAUTHORIZED_ERROR_CODE = 1001;
    public static final int ACCESS_DENIED_ERROR_CODE = 1002;

    public static final int METHOD_NOT_SUPPORTED_ERROR_CODE = 1102;

    public static final int NOT_FOUND_ERROR_CODE = 1201;
    public static final int DATA_VALIDATION_ERROR_CODE = 1203;

    public static final int INVALID_PAYMENT_ERROR_CODE = 1401;
    public static final int REFUND_ERROR_ERROR_CODE = 1402;
    public static final int GATEWAY_ERROR_ERROR_CODE = 1403;

    public static final int EXISTING_EMAIL_ERROR_CODE = 1601;
    public static final int EXISTING_USERNAME_ERROR_CODE = 1602;

    public static final int CART_INVALID_ITEM_ERROR_CODE = 1701;

    public static final int INVENTORY_INVALID_PRODUCT_ERROR_CODE = 1801;
    public static final int INVENTORY_NOT_AVAILABLE_PRODUCT_ERROR_CODE = 1802;

    public static final String UNAUTHORIZED = "Unauthorized";
    public static final String ACCESS_DENIED = "Access denied";

    public static final String NOT_FOUND = "Not found";
    public static final String DATA_VALIDATION_ERROR = "Data validation error";

    public static final String INVALID_PAYMENT = "Invalid payment";
    public static final String REFUND_ERROR = "Refund error";
    public static final String GATEWAY_ERROR = "Gateway error";

    public static final String EXISTING_EMAIL = "Email already registered.";
    public static final String EXISTING_USERNAME = "Already registered username.";


}
