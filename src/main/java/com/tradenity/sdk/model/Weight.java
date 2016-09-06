package com.tradenity.sdk.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by joseph
 * on 7/15/16.
 */
public class Weight implements Serializable{
    public static final String UNIT_GRAM = "gram";
    public static final String UNIT_KILOGRAM = "kilogram";
    public static final String UNIT_OUNCE = "ounce";
    public static final String UNIT_POUND = "pound";

    String unit;
    Float amount;

    public Weight() {
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> m = new HashMap<>();
        m.put("unit", this.getUnit());
        m.put("amount", this.getAmount());
        return m;
    }
}
