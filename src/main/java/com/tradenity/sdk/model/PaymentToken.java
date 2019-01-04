package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class PaymentToken extends PaymentSource{

    
    private String token;

    public PaymentToken(){
    }
    
    public PaymentToken id(String id) {
        this.setId(id);
        return this;
    }
    public PaymentToken reusable(Boolean reusable) {
        this.setReusable(reusable);
        return this;
    }
    public PaymentToken status(String status) {
        this.setStatus(status);
        return this;
    }
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    public PaymentToken token(String token) {
        this.setToken(token);
        return this;
    }
    public PaymentToken customer(Customer customer) {
        this.setCustomer(customer);
        return this;
    }

}