package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.OptionSetResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OptionSetService extends AbstractService{

    OptionSetResource optionSetResource;

    public OptionSetService(TradenityClient client) {
        super(client);
    }

    protected OptionSetResource getOptionSetResource(){
        if(optionSetResource == null) {
            optionSetResource = resourceFactory.create(OptionSetResource.class);
        }
        return optionSetResource;
    }

    public Page<OptionSet> findAll(PageRequest pageRequest){
        Call<ResourcePage<OptionSet>> call =  getOptionSetResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<OptionSet> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<OptionSet>> call =  getOptionSetResource().index(params);
        return createPage(call);
    }

    public OptionSet findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public OptionSet findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<OptionSet> findAll(){
        return findAll(new PageRequest());
    }

    public Page<OptionSet> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<OptionSet> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<OptionSet> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<OptionSet> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<OptionSet> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<OptionSet> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public OptionSet findOne(Map<String, Object> fields){
        List<OptionSet> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public OptionSet findById(String id){
        Call<OptionSet> call =  getOptionSetResource().findOne(id);
        return createInstance(call);
    }

    public OptionSet create(OptionSet optionSet){
        Call<OptionSet> call =  getOptionSetResource().save(optionSet);
        return createInstance(call);
    }

    public OptionSet update(OptionSet optionSet){
        Call<OptionSet> call =  getOptionSetResource().update(optionSet.getId(), optionSet);
        return createInstance(call);
    }

    public OptionSet replace(OptionSet optionSet){
        Call<OptionSet> call =  getOptionSetResource().replace(optionSet.getId(), optionSet);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getOptionSetResource().delete(id);
        run(call);
    }

    public void delete(OptionSet optionSet){
        delete(optionSet.getId());
    }
}