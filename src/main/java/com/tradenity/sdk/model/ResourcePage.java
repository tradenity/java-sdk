package com.tradenity.sdk.model;

import java.util.List;
import java.util.Map;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 2:08 PM
 */
public class ResourcePage<T> {
    Map _links;
    Map<String, List<T>> _embedded;
    PageInfo page;

    public Map get_links() {
        return _links;
    }

    public void set_links(Map _links) {
        this._links = _links;
    }

    public Map<String, List<T>> get_embedded() {
        return _embedded;
    }

    public void set_embedded(Map _embedded) {
        this._embedded = _embedded;
    }

    public PageInfo getPage() {
        return page;
    }

    public void setPage(PageInfo page) {
        this.page = page;
    }

    public PageInfo getPageInfo() {
        return getPage();
    }

    public void setPageInfo(PageInfo page) {
        setPage(page);
    }


}
