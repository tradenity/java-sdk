package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class CancelOperation extends RefundOperation{

    

    public CancelOperation(){
    }
    
    public CancelOperation id(String id) {
        this.setId(id);
        return this;
    }
    public CancelOperation order(Order order) {
        this.setOrder(order);
        return this;
    }
    public CancelOperation payment(Payment payment) {
        this.setPayment(payment);
        return this;
    }
    public CancelOperation transaction(Transaction transaction) {
        this.setTransaction(transaction);
        return this;
    }

}