package com.tradenity.sdk.model;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 1:15 PM
 */
public class Currency extends BaseModel{

    public static final String STATUS_ENABLED = "enabled";
    public static final String STATUS_DISABLED = "disabled";

    String code;
    String title;
    String status;
    float exchangeRate;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public float getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(float exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

}
