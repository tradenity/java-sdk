package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class Payment extends BaseModel{

    
    public static final String STATUS_PENDING = "pending";
    public static final String STATUS_AWAITING_RETRY = "awaitingRetry";
    public static final String STATUS_SUCCESSFUL = "successful";
    public static final String STATUS_FAILED = "failed";
    private Integer amount;
    private String status;
    private Order order;
    private PaymentSource paymentSource;
    private Currency currency;

    public Payment(){
    }
    
    public Payment id(String id) {
        this.setId(id);
        return this;
    }
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    
    public Payment amount(Integer amount) {
        this.setAmount(amount);
        return this;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Payment status(String status) {
        this.setStatus(status);
        return this;
    }
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    public Payment order(Order order) {
        this.setOrder(order);
        return this;
    }
    public PaymentSource getPaymentSource() {
        return paymentSource;
    }

    public void setPaymentSource(PaymentSource paymentSource) {
        this.paymentSource = paymentSource;
    }
    
    public Payment paymentSource(PaymentSource paymentSource) {
        this.setPaymentSource(paymentSource);
        return this;
    }
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    
    public Payment currency(Currency currency) {
        this.setCurrency(currency);
        return this;
    }

}