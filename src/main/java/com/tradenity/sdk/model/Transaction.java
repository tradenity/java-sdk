package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class Transaction extends BaseModel{

    
    public static final String STATUS_COMPLETED = "completed";
    public static final String STATUS_PENDING = "pending";
    public static final String STATUS_FAILED = "failed";
    public static final String TYPE_PAYMENT = "payment";
    public static final String TYPE_REFUND = "refund";
    private String status;
    private String type;

    public Transaction(){
    }
    
    public Transaction id(String id) {
        this.setId(id);
        return this;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Transaction status(String status) {
        this.setStatus(status);
        return this;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public Transaction type(String type) {
        this.setType(type);
        return this;
    }

}