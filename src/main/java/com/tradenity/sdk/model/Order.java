package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class Order extends BaseModel{

    
    public static final String STATUS_NEW = "new";
    public static final String STATUS_IN_PROGRESS = "inProgress";
    public static final String STATUS_PENDING = "pending";
    public static final String STATUS_SHIPPING = "shipping";
    public static final String STATUS_COMPLETED = "completed";
    public static final String STATUS_REFUNDED = "refunded";
    private String status;
    private Integer subtotal = 0;
    private Integer total = 0;
    private Integer shippingCost = 0;
    private Integer itemsTaxAmount = 0;
    private Integer totalItemsDiscount;
    private Date purchaseDay;
    private Date purchasedAt;
    private Date completedAt;
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Currency currency;
    private ShippingMethod shippingMethod;
    private Set<Promotion> promotions = new LinkedHashSet<>();
    private Set<Coupon> coupons = new LinkedHashSet<>();
    private Set<OrderLineItem> items = new LinkedHashSet<>();
    private Set<Payment> payments = new LinkedHashSet<>();
    private Set<PaymentTransaction> transactions = new LinkedHashSet<>();

    public Order(){
    }
    
    public Order id(String id) {
        this.setId(id);
        return this;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Order status(String status) {
        this.setStatus(status);
        return this;
    }
    public Integer getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }
    
    public Order subtotal(Integer subtotal) {
        this.setSubtotal(subtotal);
        return this;
    }
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    
    public Order total(Integer total) {
        this.setTotal(total);
        return this;
    }
    public Integer getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(Integer shippingCost) {
        this.shippingCost = shippingCost;
    }
    
    public Order shippingCost(Integer shippingCost) {
        this.setShippingCost(shippingCost);
        return this;
    }
    public Integer getItemsTaxAmount() {
        return itemsTaxAmount;
    }

    public void setItemsTaxAmount(Integer itemsTaxAmount) {
        this.itemsTaxAmount = itemsTaxAmount;
    }
    
    public Order itemsTaxAmount(Integer itemsTaxAmount) {
        this.setItemsTaxAmount(itemsTaxAmount);
        return this;
    }
    public Integer getTotalItemsDiscount() {
        return totalItemsDiscount;
    }

    public void setTotalItemsDiscount(Integer totalItemsDiscount) {
        this.totalItemsDiscount = totalItemsDiscount;
    }
    
    public Order totalItemsDiscount(Integer totalItemsDiscount) {
        this.setTotalItemsDiscount(totalItemsDiscount);
        return this;
    }
    public Date getPurchaseDay() {
        return purchaseDay;
    }

    public void setPurchaseDay(Date purchaseDay) {
        this.purchaseDay = purchaseDay;
    }
    
    public Order purchaseDay(Date purchaseDay) {
        this.setPurchaseDay(purchaseDay);
        return this;
    }
    public Date getPurchasedAt() {
        return purchasedAt;
    }

    public void setPurchasedAt(Date purchasedAt) {
        this.purchasedAt = purchasedAt;
    }
    
    public Order purchasedAt(Date purchasedAt) {
        this.setPurchasedAt(purchasedAt);
        return this;
    }
    public Date getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Date completedAt) {
        this.completedAt = completedAt;
    }
    
    public Order completedAt(Date completedAt) {
        this.setCompletedAt(completedAt);
        return this;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public Order customer(Customer customer) {
        this.setCustomer(customer);
        return this;
    }
    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    
    public Order shippingAddress(Address shippingAddress) {
        this.setShippingAddress(shippingAddress);
        return this;
    }
    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
    
    public Order billingAddress(Address billingAddress) {
        this.setBillingAddress(billingAddress);
        return this;
    }
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    
    public Order currency(Currency currency) {
        this.setCurrency(currency);
        return this;
    }
    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }
    
    public Order shippingMethod(ShippingMethod shippingMethod) {
        this.setShippingMethod(shippingMethod);
        return this;
    }
    public Set<Promotion> getPromotions() {
        if(promotions == null){
            this.promotions = new LinkedHashSet<>();
        }
        return promotions;
    }

    public void setPromotions(Set<Promotion> promotions) {
        this.promotions = promotions;
    }
    
    public Order promotions(Set<Promotion> promotions) {
        this.setPromotions(promotions);
        return this;
    }
    public Set<Coupon> getCoupons() {
        if(coupons == null){
            this.coupons = new LinkedHashSet<>();
        }
        return coupons;
    }

    public void setCoupons(Set<Coupon> coupons) {
        this.coupons = coupons;
    }
    
    public Order coupons(Set<Coupon> coupons) {
        this.setCoupons(coupons);
        return this;
    }
    public Set<OrderLineItem> getItems() {
        if(items == null){
            this.items = new LinkedHashSet<>();
        }
        return items;
    }

    public void setItems(Set<OrderLineItem> items) {
        this.items = items;
    }
    
    public Order items(Set<OrderLineItem> items) {
        this.setItems(items);
        return this;
    }
    public Set<Payment> getPayments() {
        if(payments == null){
            this.payments = new LinkedHashSet<>();
        }
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }
    
    public Order payments(Set<Payment> payments) {
        this.setPayments(payments);
        return this;
    }
    public Set<PaymentTransaction> getTransactions() {
        if(transactions == null){
            this.transactions = new LinkedHashSet<>();
        }
        return transactions;
    }

    public void setTransactions(Set<PaymentTransaction> transactions) {
        this.transactions = transactions;
    }
    
    public Order transactions(Set<PaymentTransaction> transactions) {
        this.setTransactions(transactions);
        return this;
    }

}