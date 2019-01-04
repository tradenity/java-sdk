package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class TaxSettings {

    
    public static final String TAX_CLASS_BASED_ON_SHIPPING_ADDRESS = "shippingAddress";
    public static final String TAX_CLASS_BASED_ON_BILLING_ADDRESS = "billingAddress";
    private Boolean priceIncludeTax = false;
    private String taxClassBasedOn;

    public TaxSettings(){
    }
    
    public Boolean getPriceIncludeTax() {
        return priceIncludeTax;
    }

    public void setPriceIncludeTax(Boolean priceIncludeTax) {
        this.priceIncludeTax = priceIncludeTax;
    }
    
    public TaxSettings priceIncludeTax(Boolean priceIncludeTax) {
        this.setPriceIncludeTax(priceIncludeTax);
        return this;
    }
    public String getTaxClassBasedOn() {
        return taxClassBasedOn;
    }

    public void setTaxClassBasedOn(String taxClassBasedOn) {
        this.taxClassBasedOn = taxClassBasedOn;
    }
    
    public TaxSettings taxClassBasedOn(String taxClassBasedOn) {
        this.setTaxClassBasedOn(taxClassBasedOn);
        return this;
    }

}