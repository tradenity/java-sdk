package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class FreeShippingPromotion extends Promotion{

    

    public FreeShippingPromotion(){
    }
    
    public FreeShippingPromotion id(String id) {
        this.setId(id);
        return this;
    }
    public FreeShippingPromotion name(String name) {
        this.setName(name);
        return this;
    }
    public FreeShippingPromotion description(String description) {
        this.setDescription(description);
        return this;
    }
    public FreeShippingPromotion status(String status) {
        this.setStatus(status);
        return this;
    }
    public FreeShippingPromotion beginsAt(Date beginsAt) {
        this.setBeginsAt(beginsAt);
        return this;
    }
    public FreeShippingPromotion endsAt(Date endsAt) {
        this.setEndsAt(endsAt);
        return this;
    }
    public FreeShippingPromotion include(ItemsSelector include) {
        this.setInclude(include);
        return this;
    }

}