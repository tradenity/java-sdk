package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class OptionValue extends BaseModel{

    
    private String value;
    private String code;
    private Option option;

    public OptionValue(){
    }
    
    public OptionValue id(String id) {
        this.setId(id);
        return this;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public OptionValue value(String value) {
        this.setValue(value);
        return this;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public OptionValue code(String code) {
        this.setCode(code);
        return this;
    }
    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }
    
    public OptionValue option(Option option) {
        this.setOption(option);
        return this;
    }

}