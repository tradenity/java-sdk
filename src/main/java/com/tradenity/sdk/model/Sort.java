package com.tradenity.sdk.model;

import java.io.Serializable;

public class Sort implements Serializable {

    public enum SortOrder{
        ASC, DESC
    }

    String property;
    SortOrder order = SortOrder.ASC;

    public Sort() {
    }

    public Sort(String property) {
        this.property = property;
    }

    public Sort(String property, SortOrder order) {
        this.property = property;
        this.order = order;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public Sort property(String property) {
        this.property = property;
        return this;
    }

    public SortOrder getOrder() {
        return order;
    }

    public void setOrder(SortOrder order) {
        this.order = order;
    }

    public Sort order(SortOrder order) {
        this.order = order;
        return this;
    }

    public static Sort sort(String property) {
        return new Sort(property);
    }

    public static Sort sort(String property, SortOrder order) {
        return new Sort(property, order);
    }
}