package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class ReturnSettings {

    
    public static final String RETURN_ACTION_REFUND = "refund";
    public static final String RETURN_ACTION_STORE_CREDIT = "storeCredit";
    private Boolean allowReturn = true;
    private String returnAction = "refund";
    private Integer returnCost = 0;
    private Boolean returnRefundShipping = true;

    public ReturnSettings(){
    }
    
    public Boolean getAllowReturn() {
        return allowReturn;
    }

    public void setAllowReturn(Boolean allowReturn) {
        this.allowReturn = allowReturn;
    }
    
    public ReturnSettings allowReturn(Boolean allowReturn) {
        this.setAllowReturn(allowReturn);
        return this;
    }
    public String getReturnAction() {
        return returnAction;
    }

    public void setReturnAction(String returnAction) {
        this.returnAction = returnAction;
    }
    
    public ReturnSettings returnAction(String returnAction) {
        this.setReturnAction(returnAction);
        return this;
    }
    public Integer getReturnCost() {
        return returnCost;
    }

    public void setReturnCost(Integer returnCost) {
        this.returnCost = returnCost;
    }
    
    public ReturnSettings returnCost(Integer returnCost) {
        this.setReturnCost(returnCost);
        return this;
    }
    public Boolean getReturnRefundShipping() {
        return returnRefundShipping;
    }

    public void setReturnRefundShipping(Boolean returnRefundShipping) {
        this.returnRefundShipping = returnRefundShipping;
    }
    
    public ReturnSettings returnRefundShipping(Boolean returnRefundShipping) {
        this.setReturnRefundShipping(returnRefundShipping);
        return this;
    }

}