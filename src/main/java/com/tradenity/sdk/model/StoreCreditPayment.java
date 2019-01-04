package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class StoreCreditPayment extends Payment{

    
    private StoreCredit storeCredit;

    public StoreCreditPayment(){
    }
    
    public StoreCreditPayment id(String id) {
        this.setId(id);
        return this;
    }
    public StoreCreditPayment amount(Integer amount) {
        this.setAmount(amount);
        return this;
    }
    public StoreCreditPayment status(String status) {
        this.setStatus(status);
        return this;
    }
    public StoreCreditPayment order(Order order) {
        this.setOrder(order);
        return this;
    }
    public StoreCreditPayment paymentSource(PaymentSource paymentSource) {
        this.setPaymentSource(paymentSource);
        return this;
    }
    public StoreCreditPayment currency(Currency currency) {
        this.setCurrency(currency);
        return this;
    }
    public StoreCredit getStoreCredit() {
        return storeCredit;
    }

    public void setStoreCredit(StoreCredit storeCredit) {
        this.storeCredit = storeCredit;
    }
    
    public StoreCreditPayment storeCredit(StoreCredit storeCredit) {
        this.setStoreCredit(storeCredit);
        return this;
    }

}