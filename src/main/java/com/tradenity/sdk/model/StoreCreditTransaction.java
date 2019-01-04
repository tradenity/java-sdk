package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class StoreCreditTransaction extends Transaction{

    
    private StoreCredit storeCredit;

    public StoreCreditTransaction(){
    }
    
    public StoreCreditTransaction id(String id) {
        this.setId(id);
        return this;
    }
    public StoreCreditTransaction status(String status) {
        this.setStatus(status);
        return this;
    }
    public StoreCreditTransaction type(String type) {
        this.setType(type);
        return this;
    }
    public StoreCredit getStoreCredit() {
        return storeCredit;
    }

    public void setStoreCredit(StoreCredit storeCredit) {
        this.storeCredit = storeCredit;
    }
    
    public StoreCreditTransaction storeCredit(StoreCredit storeCredit) {
        this.setStoreCredit(storeCredit);
        return this;
    }

}