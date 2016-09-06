package com.tradenity.sdk.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 5:37 PM
 */
public class BaseModel {
    protected String id ;
    protected Date createdAt;
    protected Date updatedAt;

    protected Map<String, Link> _links = new HashMap<>();

    public String getId() {
        if (id == null) {
            Link l = _links.get("self");
            if(l != null){
                String[] parts = l.getHref().split("/");
                if(parts.length > 0) {
                    return parts[parts.length - 1];
                }
            }
        }
        return id;
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

    public Map<String, Link> get_links() {
        return _links;
    }

}
