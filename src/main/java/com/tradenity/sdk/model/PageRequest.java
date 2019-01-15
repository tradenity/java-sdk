package com.tradenity.sdk.model;

import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;


public class PageRequest implements Serializable{
    int pageNumber;
    int pageSize;
    int offset;
    Set<Sort> sortSet = new LinkedHashSet<>();

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

    public PageRequest(int pageNumber, int pageSize, Sort... sorts) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.sortSet.addAll(asList(sorts));
    }

    public PageRequest(int pageNumber, int pageSize, int offset, Sort... sorts) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.offset = offset;
        this.sortSet.addAll(asList(sorts));
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

    public Set<Sort> getSortSet() {
        return sortSet;
    }

    public void setSortSet(Set<Sort> sortSet) {
        this.sortSet = sortSet;
    }

    public PageRequest addSort(Sort sort) {
        sortSet.add(sort);
        return this;
    }

    public PageRequest sortBy(String property) {
        sortSet.add(new Sort(property));
        return this;
    }

    public PageRequest sortBy(String property, Sort.SortOrder order) {
        sortSet.add(new Sort(property, order));
        return this;
    }

    public Map<String, Object> asMap(){
        Map<String, Object> m = new HashMap<>();
        m.put("page", pageNumber);
        m.put("size", pageSize);
        m.put("offset", offset);
        for(Sort s: sortSet){
            m.put("sort", s.getProperty());
            m.put(s.getProperty() + ".dir", s.getOrder().name().toLowerCase());
        }
        return m;
    }

    /*Pageable next(){}

    Pageable previousOrFirst(){}

    Pageable first(){}

    boolean hasPrevious(){}*/
}