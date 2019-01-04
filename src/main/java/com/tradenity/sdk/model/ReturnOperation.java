package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class ReturnOperation extends RefundOperation{

    
    private Set<ReturnLineItem> items = new LinkedHashSet<>();

    public ReturnOperation(){
    }
    
    public ReturnOperation id(String id) {
        this.setId(id);
        return this;
    }
    public ReturnOperation order(Order order) {
        this.setOrder(order);
        return this;
    }
    public ReturnOperation payment(Payment payment) {
        this.setPayment(payment);
        return this;
    }
    public ReturnOperation transaction(Transaction transaction) {
        this.setTransaction(transaction);
        return this;
    }
    public Set<ReturnLineItem> getItems() {
        if(items == null){
            this.items = new LinkedHashSet<>();
        }
        return items;
    }

    public void setItems(Set<ReturnLineItem> items) {
        this.items = items;
    }
    
    public ReturnOperation items(Set<ReturnLineItem> items) {
        this.setItems(items);
        return this;
    }

}