package com.tradenity.sdk.resources;

import com.google.gson.annotations.SerializedName;
import com.tradenity.sdk.model.Page;
import com.tradenity.sdk.model.PageInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ResourcePage<T> {

    List<T> items;

    @SerializedName("__meta")
    PagedResourcesMetaInfo metaInfo;

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public PagedResourcesMetaInfo getMetaInfo() {
        return metaInfo;
    }

    public void setMetaInfo(PagedResourcesMetaInfo metaInfo) {
        this.metaInfo = metaInfo;
    }

    public Page<T> toPage() {
        PageInfo pi = new PageInfo(metaInfo.getSize(), metaInfo.getTotalElements(), metaInfo.getTotalPages(), metaInfo.getNumber());
        return new Page<>(pi, this.items);
    }
}