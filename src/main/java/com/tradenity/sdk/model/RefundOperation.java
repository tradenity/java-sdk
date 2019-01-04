package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class RefundOperation extends BaseModel{

    
    private Order order;
    private Payment payment;
    private Transaction transaction;

    public RefundOperation(){
    }
    
    public RefundOperation id(String id) {
        this.setId(id);
        return this;
    }
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    public RefundOperation order(Order order) {
        this.setOrder(order);
        return this;
    }
    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
    public RefundOperation payment(Payment payment) {
        this.setPayment(payment);
        return this;
    }
    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
    
    public RefundOperation transaction(Transaction transaction) {
        this.setTransaction(transaction);
        return this;
    }

}