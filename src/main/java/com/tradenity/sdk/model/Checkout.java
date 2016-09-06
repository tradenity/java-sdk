package com.tradenity.sdk.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by joseph
 * on 8/10/16.
 */
public class Checkout implements Serializable{
    Float subtotal = 0.0F;
    Float total = 0.0F;
    Float taxes = 0.0F;
    List<LineItem> items = new ArrayList<>();
    List<ShippingOption> shippingOptions = new ArrayList<>();
    Currency currency;
    Gateway gateway;

    public Checkout() {
    }

    /*public Checkout(List<LineItem> items, Map<ShippingMethod, Float> shippingCosts, Currency currency, Gateway gateway) {
        this.items = items;
        this.shippingCosts = shippingCosts;
        this.currency = currency;
        this.gateway = gateway;
    }*/

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Float getTaxes() {
        return taxes;
    }

    public void setTaxes(Float taxes) {
        this.taxes = taxes;
    }

    public List<LineItem> getItems() {
        return items;
    }

    public void setItems(List<LineItem> items) {
        this.items = items;
    }

    public List<ShippingOption> getShippingOptions() {
        return shippingOptions;
    }

    public void setShippingOptions(List<ShippingOption> shippingOptions) {
        this.shippingOptions = shippingOptions;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Gateway getGateway() {
        return gateway;
    }

    public void setGateway(Gateway gateway) {
        this.gateway = gateway;
    }
}
