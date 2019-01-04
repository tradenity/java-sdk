package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class PaymentSettings {

    
    private Currency currency;
    private Gateway gateway;

    public PaymentSettings(){
    }
    
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    
    public PaymentSettings currency(Currency currency) {
        this.setCurrency(currency);
        return this;
    }
    public Gateway getGateway() {
        return gateway;
    }

    public void setGateway(Gateway gateway) {
        this.gateway = gateway;
    }
    
    public PaymentSettings gateway(Gateway gateway) {
        this.setGateway(gateway);
        return this;
    }

}