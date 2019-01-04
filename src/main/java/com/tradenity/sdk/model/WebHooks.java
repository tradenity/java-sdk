package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class WebHooks extends BaseModel{

    
    private String orderCreated;
    private String orderChanged;
    private String orderRefunded;

    public WebHooks(){
    }
    
    public WebHooks id(String id) {
        this.setId(id);
        return this;
    }
    public String getOrderCreated() {
        return orderCreated;
    }

    public void setOrderCreated(String orderCreated) {
        this.orderCreated = orderCreated;
    }
    
    public WebHooks orderCreated(String orderCreated) {
        this.setOrderCreated(orderCreated);
        return this;
    }
    public String getOrderChanged() {
        return orderChanged;
    }

    public void setOrderChanged(String orderChanged) {
        this.orderChanged = orderChanged;
    }
    
    public WebHooks orderChanged(String orderChanged) {
        this.setOrderChanged(orderChanged);
        return this;
    }
    public String getOrderRefunded() {
        return orderRefunded;
    }

    public void setOrderRefunded(String orderRefunded) {
        this.orderRefunded = orderRefunded;
    }
    
    public WebHooks orderRefunded(String orderRefunded) {
        this.setOrderRefunded(orderRefunded);
        return this;
    }

}