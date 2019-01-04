package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class GeneralSettings {

    
    private String local = "English";
    private String timeZone = "UTC";
    private CustomerGroup addNewCustomersTo;

    public GeneralSettings(){
    }
    
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    public GeneralSettings local(String local) {
        this.setLocal(local);
        return this;
    }
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
    
    public GeneralSettings timeZone(String timeZone) {
        this.setTimeZone(timeZone);
        return this;
    }
    public CustomerGroup getAddNewCustomersTo() {
        return addNewCustomersTo;
    }

    public void setAddNewCustomersTo(CustomerGroup addNewCustomersTo) {
        this.addNewCustomersTo = addNewCustomersTo;
    }
    
    public GeneralSettings addNewCustomersTo(CustomerGroup addNewCustomersTo) {
        this.setAddNewCustomersTo(addNewCustomersTo);
        return this;
    }

}