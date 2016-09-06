package com.tradenity.sdk.model;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 1:15 PM
 */
public class ShippingMethod extends BaseModel{
    public static final String STATUS_ENABLED = "enabled";
    public static final String STATUS_DISABLED = "disabled";

    public static final String COST_TYPE_FIXED = "fixed";
    public static final String COST_TYPE_PER_WEIGHT = "per_weight";
    public static final String COST_TYPE_FIXED_AND_PER_WEIGHT = "fixed_and_per_weight";

    public static final String WEIGHT_UNIT_OUNCE = "ounce";
    public static final String WEIGHT_UNIT_POUND = "pound";
    public static final String WEIGHT_UNIT_GRAM = "gram";
    public static final String WEIGHT_UNIT_KILOGRAM = "kilogram";


    String name;
    String title;
    String status;
    String description;
    String costType;
    Float fixedRate;
    Float costPerUnitWeight = 0.0F;
    String weightUnit;

    public ShippingMethod() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public Float getFixedRate() {
        return fixedRate;
    }

    public void setFixedRate(Float fixedRate) {
        this.fixedRate = fixedRate;
    }

    public Float getCostPerUnitWeight() {
        return costPerUnitWeight;
    }

    public void setCostPerUnitWeight(Float costPerUnitWeight) {
        this.costPerUnitWeight = costPerUnitWeight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

}
