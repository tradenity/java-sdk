package com.tradenity.sdk.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 1:15 PM
 */
public class Order extends BaseModel{

    public static final String STATUS_NEW = "new";
    public static final String STATUS_PENDING = "pending";
    public static final String STATUS_COMPLETED = "completed";


    String status;
    Float total;
    Float subtotal;
    Float shippingCost;
    Float orderTaxAmount;
    Float itemsTaxAmount;
    Date purchasedAt;
    Date completedAt;
    Customer customer;
    Currency currency;
    ShippingMethod shippingMethod;
    Address shippingAddress;
    Address billingAddress;
    Gateway gateway;
    List<LineItem> items = new ArrayList<>();
    List<Transaction> transactions;

    public Order() {
    }

    public Order(Customer customer) {
        this.customer = customer;
        this.billingAddress = customer.billingAddress;
        this.shippingAddress = customer.shippingAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Float getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(Float shippingCost) {
        this.shippingCost = shippingCost;
    }

    public Float getOrderTaxAmount() {
        return orderTaxAmount;
    }

    public void setOrderTaxAmount(Float orderTaxAmount) {
        this.orderTaxAmount = orderTaxAmount;
    }

    public Float getItemsTaxAmount() {
        return itemsTaxAmount;
    }

    public void setItemsTaxAmount(Float itemsTaxAmount) {
        this.itemsTaxAmount = itemsTaxAmount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Float getTotal() {
        return total;
    }

    public Date getPurchasedAt() {
        return purchasedAt;
    }

    public void setPurchasedAt(Date purchasedAt) {
        this.purchasedAt = purchasedAt;
    }

    public Date getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Date completedAt) {
        this.completedAt = completedAt;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Gateway getGateway() {
        return gateway;
    }

    public void setGateway(Gateway gateway) {
        this.gateway = gateway;
    }

    public List<LineItem> getItems() {
        return items;
    }

    public void setItems(List<LineItem> items) {
        this.items = items;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
