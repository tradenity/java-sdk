package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.TableRateRuleResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableRateRuleService extends AbstractService{

    TableRateRuleResource tableRateRuleResource;

    public TableRateRuleService(TradenityClient client) {
        super(client);
    }

    protected TableRateRuleResource getTableRateRuleResource(){
        if(tableRateRuleResource == null) {
            tableRateRuleResource = resourceFactory.create(TableRateRuleResource.class);
        }
        return tableRateRuleResource;
    }

    public Page<TableRateRule> findAll(PageRequest pageRequest){
        Call<ResourcePage<TableRateRule>> call =  getTableRateRuleResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<TableRateRule> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<TableRateRule>> call =  getTableRateRuleResource().index(fields);
        return createPage(call);
    }

    public TableRateRule findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public TableRateRule findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<TableRateRule> findAll(){
        return findAll(new PageRequest());
    }

    public Page<TableRateRule> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<TableRateRule> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<TableRateRule> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<TableRateRule> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<TableRateRule> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<TableRateRule> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public TableRateRule findOne(Map<String, Object> fields){
        List<TableRateRule> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public TableRateRule findById(String id){
        Call<TableRateRule> call =  getTableRateRuleResource().findOne(id);
        return createInstance(call);
    }

    public TableRateRule create(TableRateRule tableRateRule){
        Call<TableRateRule> call =  getTableRateRuleResource().save(tableRateRule);
        return createInstance(call);
    }

    public TableRateRule update(TableRateRule tableRateRule){
        Call<TableRateRule> call =  getTableRateRuleResource().update(tableRateRule.getId(), tableRateRule);
        return createInstance(call);
    }

    public TableRateRule replace(TableRateRule tableRateRule){
        Call<TableRateRule> call =  getTableRateRuleResource().replace(tableRateRule.getId(), tableRateRule);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getTableRateRuleResource().delete(id);
        run(call);
    }

    public void delete(TableRateRule tableRateRule){
        delete(tableRateRule.getId());
    }
}