package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class Weight {

    
    public static final String UNIT_OUNCE = "ounce";
    public static final String UNIT_POUND = "pound";
    public static final String UNIT_GM = "gm";
    public static final String UNIT_KG = "kg";
    private Float amount;
    private String unit;

    public Weight(){
    }
    
    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
    
    public Weight amount(Float amount) {
        this.setAmount(amount);
        return this;
    }
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    public Weight unit(String unit) {
        this.setUnit(unit);
        return this;
    }

}