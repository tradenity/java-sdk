package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.CustomerGroupResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerGroupService extends AbstractService{

    CustomerGroupResource customerGroupResource;

    public CustomerGroupService(TradenityClient client) {
        super(client);
    }

    protected CustomerGroupResource getCustomerGroupResource(){
        if(customerGroupResource == null) {
            customerGroupResource = resourceFactory.create(CustomerGroupResource.class);
        }
        return customerGroupResource;
    }

    public Page<CustomerGroup> findAll(PageRequest pageRequest){
        Call<ResourcePage<CustomerGroup>> call =  getCustomerGroupResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<CustomerGroup> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<CustomerGroup>> call =  getCustomerGroupResource().index(params);
        return createPage(call);
    }

    public CustomerGroup findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public CustomerGroup findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<CustomerGroup> findAll(){
        return findAll(new PageRequest());
    }

    public Page<CustomerGroup> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<CustomerGroup> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<CustomerGroup> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<CustomerGroup> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<CustomerGroup> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<CustomerGroup> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public CustomerGroup findOne(Map<String, Object> fields){
        List<CustomerGroup> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public CustomerGroup findById(String id){
        Call<CustomerGroup> call =  getCustomerGroupResource().findOne(id);
        return createInstance(call);
    }

    public CustomerGroup create(CustomerGroup customerGroup){
        Call<CustomerGroup> call =  getCustomerGroupResource().save(customerGroup);
        return createInstance(call);
    }

    public CustomerGroup update(CustomerGroup customerGroup){
        Call<CustomerGroup> call =  getCustomerGroupResource().update(customerGroup.getId(), customerGroup);
        return createInstance(call);
    }

    public CustomerGroup replace(CustomerGroup customerGroup){
        Call<CustomerGroup> call =  getCustomerGroupResource().replace(customerGroup.getId(), customerGroup);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getCustomerGroupResource().delete(id);
        run(call);
    }

    public void delete(CustomerGroup customerGroup){
        delete(customerGroup.getId());
    }
}