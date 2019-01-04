package com.tradenity.sdk.model;

import com.tradenity.sdk.resources.PagedResourcesMetaInfo;
import com.tradenity.sdk.resources.ResourcePage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Page<T> implements Iterable<T>{
    int size;
    int totalElements;
    int totalPages;
    int number;
    List<T> content = new ArrayList<>();

    public Page(PageInfo info, List<T>content) {
        this.size = info.getSize();
        this.totalElements = info.getTotalElements();
        this.totalPages = info.getTotalPages();
        this.number = info.getNumber();
        if(content != null){
            this.content = content;
        }
    }

    public static<T> Page<T> create(ResourcePage<T> p) {
        PagedResourcesMetaInfo metaInfo = p.getMetaInfo();
        PageInfo pi = new PageInfo(metaInfo.getSize(), metaInfo.getTotalElements(), metaInfo.getTotalPages(), metaInfo.getNumber());
        return new Page<>(pi, p.getItems());
    }

    public boolean isFirst(){
        return number == 0;
    }

    public boolean isLast(){
        return number == totalPages -1;
    }

    public boolean hasPrevious(){
        return number > 0;
    }
    public boolean hasNext(){
        return number < totalPages;
    }

    public PageRequest previous(){
        return new PageRequest(number -1, this.size);
    }

    public PageRequest next(){
        return new PageRequest(number + 1, this.size);
    }

    public Iterator<T> iterator() {
        return content.iterator();
    }

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

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public boolean isEmpty(){
        return this.content == null || this.content.size() <= 0;
    }
}