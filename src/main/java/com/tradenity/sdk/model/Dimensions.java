package com.tradenity.sdk.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by joseph
 * on 7/15/16.
 */
public class Dimensions implements Serializable{
    public static final String UNIT_CENTIMETER = "centimeter";
    public static final String UNIT_METER = "meter";
    public static final String UNIT_INCH = "inch";
    public static final String UNIT_FEET = "feet";


    String unit;
    Float width;
    Float height;
    Float depth;

    public Dimensions() {
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getDepth() {
        return depth;
    }

    public void setDepth(Float depth) {
        this.depth = depth;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> m = new HashMap<>();
        m.put("unit", this.getUnit());
        m.put("width", this.getWidth());
        m.put("height", this.getHeight());
        m.put("depth", this.getDepth());
        return m;
    }
}
