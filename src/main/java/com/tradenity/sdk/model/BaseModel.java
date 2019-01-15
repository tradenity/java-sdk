package com.tradenity.sdk.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tradenity.sdk.resources.ResourceMetaInfo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class BaseModel {

    protected String id ;

    @Expose(serialize = false)
    protected Date createdAt;

    @Expose(serialize = false)
    protected Date updatedAt;

    @SerializedName("__meta")
    protected ResourceMetaInfo metaInfo;

    public String getId() {
        if (this.id == null) {
            if(getMetaInfo() != null && getMetaInfo().getHref() != null){
                String[] parts = getMetaInfo().getHref().split("/");
                if(parts.length > 0) {
                    this.id = parts[parts.length - 1];
                }
            }
        }
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ResourceMetaInfo getMetaInfo() {
        return metaInfo;
    }

    public void setMetaInfo(ResourceMetaInfo metaInfo) {
        this.metaInfo = metaInfo;
    }

    @Override
    public int hashCode() {
        String id = getId();
        if(id != null) {
            return id.hashCode();
        }else{
            return super.hashCode();
        }
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseModel)) {
            return false;
        }
        String id = getId();
        if(id != null) {
            return getId().equals(((BaseModel) obj).getId());
        }else{
            return super.equals(obj);
        }
    }

}