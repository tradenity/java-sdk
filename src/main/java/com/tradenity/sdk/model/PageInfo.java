package com.tradenity.sdk.model;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 2:53 PM
 */
public class PageInfo {
    int size;
    int totalElements;
    int totalPages;
    int number;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
