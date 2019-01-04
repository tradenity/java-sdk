package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class InventorySettings {

    
    private Boolean updateOnNewOrder = true;
    private Boolean updateOnRefund = false;

    public InventorySettings(){
    }
    
    public Boolean getUpdateOnNewOrder() {
        return updateOnNewOrder;
    }

    public void setUpdateOnNewOrder(Boolean updateOnNewOrder) {
        this.updateOnNewOrder = updateOnNewOrder;
    }
    
    public InventorySettings updateOnNewOrder(Boolean updateOnNewOrder) {
        this.setUpdateOnNewOrder(updateOnNewOrder);
        return this;
    }
    public Boolean getUpdateOnRefund() {
        return updateOnRefund;
    }

    public void setUpdateOnRefund(Boolean updateOnRefund) {
        this.updateOnRefund = updateOnRefund;
    }
    
    public InventorySettings updateOnRefund(Boolean updateOnRefund) {
        this.setUpdateOnRefund(updateOnRefund);
        return this;
    }

}