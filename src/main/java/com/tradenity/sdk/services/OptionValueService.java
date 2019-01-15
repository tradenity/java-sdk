package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.OptionValueResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OptionValueService extends AbstractService{

    OptionValueResource optionValueResource;

    public OptionValueService(TradenityClient client) {
        super(client);
    }

    protected OptionValueResource getOptionValueResource(){
        if(optionValueResource == null) {
            optionValueResource = resourceFactory.create(OptionValueResource.class);
        }
        return optionValueResource;
    }

    public Page<OptionValue> findAll(PageRequest pageRequest){
        Call<ResourcePage<OptionValue>> call =  getOptionValueResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<OptionValue> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<OptionValue>> call =  getOptionValueResource().index(params);
        return createPage(call);
    }

    public OptionValue findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public OptionValue findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<OptionValue> findAll(){
        return findAll(new PageRequest());
    }

    public Page<OptionValue> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<OptionValue> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<OptionValue> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<OptionValue> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<OptionValue> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<OptionValue> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public OptionValue findOne(Map<String, Object> fields){
        List<OptionValue> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public OptionValue findById(String id){
        Call<OptionValue> call =  getOptionValueResource().findOne(id);
        return createInstance(call);
    }

    public OptionValue create(OptionValue optionValue){
        Call<OptionValue> call =  getOptionValueResource().save(optionValue);
        return createInstance(call);
    }

    public OptionValue update(OptionValue optionValue){
        Call<OptionValue> call =  getOptionValueResource().update(optionValue.getId(), optionValue);
        return createInstance(call);
    }

    public OptionValue replace(OptionValue optionValue){
        Call<OptionValue> call =  getOptionValueResource().replace(optionValue.getId(), optionValue);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getOptionValueResource().delete(id);
        run(call);
    }

    public void delete(OptionValue optionValue){
        delete(optionValue.getId());
    }
}