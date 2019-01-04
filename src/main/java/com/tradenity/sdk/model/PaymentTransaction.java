package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class PaymentTransaction extends Transaction{

    
    private Payment payment;
    private Order order;

    public PaymentTransaction(){
    }
    
    public PaymentTransaction id(String id) {
        this.setId(id);
        return this;
    }
    public PaymentTransaction status(String status) {
        this.setStatus(status);
        return this;
    }
    public PaymentTransaction type(String type) {
        this.setType(type);
        return this;
    }
    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
    public PaymentTransaction payment(Payment payment) {
        this.setPayment(payment);
        return this;
    }
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    public PaymentTransaction order(Order order) {
        this.setOrder(order);
        return this;
    }

}