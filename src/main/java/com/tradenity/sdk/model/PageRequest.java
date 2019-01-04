package com.tradenity.sdk.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class PageRequest implements Serializable{
    int pageNumber;
    int pageSize;
    int offset;

    public PageRequest() {
    }

    public PageRequest(int pageNumber, int pageSize) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    public PageRequest(int pageNumber, int pageSize, int offset) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.offset = offset;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public Map<String, Object> asMap(){
        Map<String, Object> m = new HashMap<>();
        m.put("page", pageNumber);
        m.put("size", pageSize);
        m.put("offset", offset);
        return m;
    }

    /*Pageable next(){}

    Pageable previousOrFirst(){}

    Pageable first(){}

    boolean hasPrevious(){}*/
}