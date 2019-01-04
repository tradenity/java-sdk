package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class MeasurementSettings {

    
    public static final String WEIGHT_UNIT_POUND = "pound";
    public static final String WEIGHT_UNIT_KILOGRAM = "kilogram";
    public static final String DIMENSIONS_UNIT_INCH = "inch";
    public static final String DIMENSIONS_UNIT_CM = "cm";
    public static final String DIMENSIONS_UNIT_FOOT = "foot";
    public static final String DIMENSIONS_UNIT_METER = "meter";
    private String weightUnit = "kilogram";
    private String dimensionsUnit = "cm";

    public MeasurementSettings(){
    }
    
    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }
    
    public MeasurementSettings weightUnit(String weightUnit) {
        this.setWeightUnit(weightUnit);
        return this;
    }
    public String getDimensionsUnit() {
        return dimensionsUnit;
    }

    public void setDimensionsUnit(String dimensionsUnit) {
        this.dimensionsUnit = dimensionsUnit;
    }
    
    public MeasurementSettings dimensionsUnit(String dimensionsUnit) {
        this.setDimensionsUnit(dimensionsUnit);
        return this;
    }

}