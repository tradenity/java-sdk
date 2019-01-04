package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class Dimensions {

    
    public static final String UNIT_CM = "cm";
    public static final String UNIT_INCH = "inch";
    public static final String UNIT_FOOT = "foot";
    private Float width;
    private Float height;
    private Float depth;
    private String unit;

    public Dimensions(){
    }
    
    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }
    
    public Dimensions width(Float width) {
        this.setWidth(width);
        return this;
    }
    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }
    
    public Dimensions height(Float height) {
        this.setHeight(height);
        return this;
    }
    public Float getDepth() {
        return depth;
    }

    public void setDepth(Float depth) {
        this.depth = depth;
    }
    
    public Dimensions depth(Float depth) {
        this.setDepth(depth);
        return this;
    }
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    public Dimensions unit(String unit) {
        this.setUnit(unit);
        return this;
    }

}