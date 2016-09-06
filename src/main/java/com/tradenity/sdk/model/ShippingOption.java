package com.tradenity.sdk.model;

import java.io.Serializable;

/**
 * Created by joseph
 * on 8/12/16.
 */
public class ShippingOption implements Serializable {
    ShippingMethod shippingMethod;
    Float cost;
    Float orderTotal;

    public ShippingOption() {
    }

    public ShippingOption(ShippingMethod shippingMethod, Float cost, Float orderTotal) {
        this.shippingMethod = shippingMethod;
        this.cost = cost;
        this.orderTotal = orderTotal;
    }

    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Float getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Float orderTotal) {
        this.orderTotal = orderTotal;
    }
}
