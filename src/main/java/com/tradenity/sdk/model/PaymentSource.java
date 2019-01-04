package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class PaymentSource extends BaseModel{

    
    public static final String STATUS_NEW = "new";
    public static final String STATUS_USED = "used";
    public static final String STATUS_EXPIRED = "expired";
    private Boolean reusable = false;
    private String status;
    private Customer customer;

    public PaymentSource(){
    }
    
    public PaymentSource id(String id) {
        this.setId(id);
        return this;
    }
    public Boolean getReusable() {
        return reusable;
    }

    public void setReusable(Boolean reusable) {
        this.reusable = reusable;
    }
    
    public PaymentSource reusable(Boolean reusable) {
        this.setReusable(reusable);
        return this;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public PaymentSource status(String status) {
        this.setStatus(status);
        return this;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public PaymentSource customer(Customer customer) {
        this.setCustomer(customer);
        return this;
    }

}