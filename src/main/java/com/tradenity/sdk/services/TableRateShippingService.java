package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.TableRateShippingResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableRateShippingService extends AbstractService{

    TableRateShippingResource tableRateShippingResource;

    public TableRateShippingService(TradenityClient client) {
        super(client);
    }

    protected TableRateShippingResource getTableRateShippingResource(){
        if(tableRateShippingResource == null) {
            tableRateShippingResource = resourceFactory.create(TableRateShippingResource.class);
        }
        return tableRateShippingResource;
    }

    public Page<TableRateShipping> findAll(PageRequest pageRequest){
        Call<ResourcePage<TableRateShipping>> call =  getTableRateShippingResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<TableRateShipping> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<TableRateShipping>> call =  getTableRateShippingResource().index(fields);
        return createPage(call);
    }

    public TableRateShipping findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public TableRateShipping findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<TableRateShipping> findAll(){
        return findAll(new PageRequest());
    }

    public Page<TableRateShipping> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<TableRateShipping> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<TableRateShipping> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<TableRateShipping> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<TableRateShipping> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<TableRateShipping> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public TableRateShipping findOne(Map<String, Object> fields){
        List<TableRateShipping> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public TableRateShipping findById(String id){
        Call<TableRateShipping> call =  getTableRateShippingResource().findOne(id);
        return createInstance(call);
    }

    public TableRateShipping create(TableRateShipping tableRateShipping){
        Call<TableRateShipping> call =  getTableRateShippingResource().save(tableRateShipping);
        return createInstance(call);
    }

    public TableRateShipping update(TableRateShipping tableRateShipping){
        Call<TableRateShipping> call =  getTableRateShippingResource().update(tableRateShipping.getId(), tableRateShipping);
        return createInstance(call);
    }

    public TableRateShipping replace(TableRateShipping tableRateShipping){
        Call<TableRateShipping> call =  getTableRateShippingResource().replace(tableRateShipping.getId(), tableRateShipping);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getTableRateShippingResource().delete(id);
        run(call);
    }

    public void delete(TableRateShipping tableRateShipping){
        delete(tableRateShipping.getId());
    }
}