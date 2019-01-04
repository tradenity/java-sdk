package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class StoreCredit extends BaseModel{

    
    private Integer amount = 0;
    private Customer customer;
    private Currency currency;
    private Set<Transaction> transactions = new LinkedHashSet<>();

    public StoreCredit(){
    }
    
    public StoreCredit id(String id) {
        this.setId(id);
        return this;
    }
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    
    public StoreCredit amount(Integer amount) {
        this.setAmount(amount);
        return this;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public StoreCredit customer(Customer customer) {
        this.setCustomer(customer);
        return this;
    }
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    
    public StoreCredit currency(Currency currency) {
        this.setCurrency(currency);
        return this;
    }
    public Set<Transaction> getTransactions() {
        if(transactions == null){
            this.transactions = new LinkedHashSet<>();
        }
        return transactions;
    }

    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }
    
    public StoreCredit transactions(Set<Transaction> transactions) {
        this.setTransactions(transactions);
        return this;
    }

}