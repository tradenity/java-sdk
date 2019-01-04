package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class CreditCardPayment extends Payment{

    
    public static final String PAYMENT_MODE_AUTHORIZE = "authorize";
    public static final String PAYMENT_MODE_CAPTURE = "capture";
    private String paymentMode;
    private String gatewayOperationId;
    private Gateway gateway;

    public CreditCardPayment(){
    }
    
    public CreditCardPayment id(String id) {
        this.setId(id);
        return this;
    }
    public CreditCardPayment amount(Integer amount) {
        this.setAmount(amount);
        return this;
    }
    public CreditCardPayment status(String status) {
        this.setStatus(status);
        return this;
    }
    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
    
    public CreditCardPayment paymentMode(String paymentMode) {
        this.setPaymentMode(paymentMode);
        return this;
    }
    public String getGatewayOperationId() {
        return gatewayOperationId;
    }

    public void setGatewayOperationId(String gatewayOperationId) {
        this.gatewayOperationId = gatewayOperationId;
    }
    
    public CreditCardPayment gatewayOperationId(String gatewayOperationId) {
        this.setGatewayOperationId(gatewayOperationId);
        return this;
    }
    public CreditCardPayment order(Order order) {
        this.setOrder(order);
        return this;
    }
    public CreditCardPayment paymentSource(PaymentSource paymentSource) {
        this.setPaymentSource(paymentSource);
        return this;
    }
    public CreditCardPayment currency(Currency currency) {
        this.setCurrency(currency);
        return this;
    }
    public Gateway getGateway() {
        return gateway;
    }

    public void setGateway(Gateway gateway) {
        this.gateway = gateway;
    }
    
    public CreditCardPayment gateway(Gateway gateway) {
        this.setGateway(gateway);
        return this;
    }

}