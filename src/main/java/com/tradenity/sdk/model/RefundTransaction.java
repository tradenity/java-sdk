package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class RefundTransaction extends Transaction{

    
    private RefundOperation refundOperation;

    public RefundTransaction(){
    }
    
    public RefundTransaction id(String id) {
        this.setId(id);
        return this;
    }
    public RefundTransaction status(String status) {
        this.setStatus(status);
        return this;
    }
    public RefundTransaction type(String type) {
        this.setType(type);
        return this;
    }
    public RefundOperation getRefundOperation() {
        return refundOperation;
    }

    public void setRefundOperation(RefundOperation refundOperation) {
        this.refundOperation = refundOperation;
    }
    
    public RefundTransaction refundOperation(RefundOperation refundOperation) {
        this.setRefundOperation(refundOperation);
        return this;
    }

}