package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class Currency extends BaseModel{

    
    public static final String STATUS_ENABLED = "enabled";
    public static final String STATUS_DISABLED = "disabled";
    private String name;
    private String code;
    private String symbol;
    private Integer decimalPointPlacement = 2;
    private Integer smallestUnit = 100;
    private String status;
    private Float exchangeRate = 0F;

    public Currency(){
    }
    
    public Currency id(String id) {
        this.setId(id);
        return this;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Currency name(String name) {
        this.setName(name);
        return this;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public Currency code(String code) {
        this.setCode(code);
        return this;
    }
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
    public Currency symbol(String symbol) {
        this.setSymbol(symbol);
        return this;
    }
    public Integer getDecimalPointPlacement() {
        return decimalPointPlacement;
    }

    public void setDecimalPointPlacement(Integer decimalPointPlacement) {
        this.decimalPointPlacement = decimalPointPlacement;
    }
    
    public Currency decimalPointPlacement(Integer decimalPointPlacement) {
        this.setDecimalPointPlacement(decimalPointPlacement);
        return this;
    }
    public Integer getSmallestUnit() {
        return smallestUnit;
    }

    public void setSmallestUnit(Integer smallestUnit) {
        this.smallestUnit = smallestUnit;
    }
    
    public Currency smallestUnit(Integer smallestUnit) {
        this.setSmallestUnit(smallestUnit);
        return this;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Currency status(String status) {
        this.setStatus(status);
        return this;
    }
    public Float getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Float exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
    
    public Currency exchangeRate(Float exchangeRate) {
        this.setExchangeRate(exchangeRate);
        return this;
    }

}