package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class CashOnDeliveryPayment extends Payment{

    

    public CashOnDeliveryPayment(){
    }
    
    public CashOnDeliveryPayment id(String id) {
        this.setId(id);
        return this;
    }
    public CashOnDeliveryPayment amount(Integer amount) {
        this.setAmount(amount);
        return this;
    }
    public CashOnDeliveryPayment status(String status) {
        this.setStatus(status);
        return this;
    }
    public CashOnDeliveryPayment order(Order order) {
        this.setOrder(order);
        return this;
    }
    public CashOnDeliveryPayment paymentSource(PaymentSource paymentSource) {
        this.setPaymentSource(paymentSource);
        return this;
    }
    public CashOnDeliveryPayment currency(Currency currency) {
        this.setCurrency(currency);
        return this;
    }

}