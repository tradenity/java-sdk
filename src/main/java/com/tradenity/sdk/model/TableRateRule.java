package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class TableRateRule extends BaseModel{

    
    private Integer minimum;
    private Integer maximum;
    private Integer cost;
    private String unit;
    private TableRateShipping tableRateShipping;

    public TableRateRule(){
    }
    
    public TableRateRule id(String id) {
        this.setId(id);
        return this;
    }
    public Integer getMinimum() {
        return minimum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }
    
    public TableRateRule minimum(Integer minimum) {
        this.setMinimum(minimum);
        return this;
    }
    public Integer getMaximum() {
        return maximum;
    }

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }
    
    public TableRateRule maximum(Integer maximum) {
        this.setMaximum(maximum);
        return this;
    }
    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
    
    public TableRateRule cost(Integer cost) {
        this.setCost(cost);
        return this;
    }
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    public TableRateRule unit(String unit) {
        this.setUnit(unit);
        return this;
    }
    public TableRateShipping getTableRateShipping() {
        return tableRateShipping;
    }

    public void setTableRateShipping(TableRateShipping tableRateShipping) {
        this.tableRateShipping = tableRateShipping;
    }
    
    public TableRateRule tableRateShipping(TableRateShipping tableRateShipping) {
        this.setTableRateShipping(tableRateShipping);
        return this;
    }

}