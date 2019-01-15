package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.OptionResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OptionService extends AbstractService{

    OptionResource optionResource;

    public OptionService(TradenityClient client) {
        super(client);
    }

    protected OptionResource getOptionResource(){
        if(optionResource == null) {
            optionResource = resourceFactory.create(OptionResource.class);
        }
        return optionResource;
    }

    public Page<Option> findAll(PageRequest pageRequest){
        Call<ResourcePage<Option>> call =  getOptionResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Option> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<Option>> call =  getOptionResource().index(params);
        return createPage(call);
    }

    public Option findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public Option findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<Option> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Option> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<Option> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<Option> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<Option> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<Option> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<Option> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Option findOne(Map<String, Object> fields){
        List<Option> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public Option findById(String id){
        Call<Option> call =  getOptionResource().findOne(id);
        return createInstance(call);
    }

    public Option create(Option option){
        Call<Option> call =  getOptionResource().save(option);
        return createInstance(call);
    }

    public Option update(Option option){
        Call<Option> call =  getOptionResource().update(option.getId(), option);
        return createInstance(call);
    }

    public Option replace(Option option){
        Call<Option> call =  getOptionResource().replace(option.getId(), option);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getOptionResource().delete(id);
        run(call);
    }

    public void delete(Option option){
        delete(option.getId());
    }
}