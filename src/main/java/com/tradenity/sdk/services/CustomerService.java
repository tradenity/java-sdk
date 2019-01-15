package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.CustomerResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService extends AbstractService{

    CustomerResource customerResource;

    public CustomerService(TradenityClient client) {
        super(client);
    }

    protected CustomerResource getCustomerResource(){
        if(customerResource == null) {
            customerResource = resourceFactory.create(CustomerResource.class);
        }
        return customerResource;
    }

    public Page<Customer> findAll(PageRequest pageRequest){
        Call<ResourcePage<Customer>> call =  getCustomerResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Customer> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<Customer>> call =  getCustomerResource().index(params);
        return createPage(call);
    }

    public Customer findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public Customer findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<Customer> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Customer> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<Customer> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<Customer> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<Customer> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<Customer> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<Customer> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Customer findOne(Map<String, Object> fields){
        List<Customer> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public Customer findById(String id){
        Call<Customer> call =  getCustomerResource().findOne(id);
        return createInstance(call);
    }

    public Customer create(Customer customer){
        Call<Customer> call =  getCustomerResource().save(customer);
        return createInstance(call);
    }

    public Customer update(Customer customer){
        Call<Customer> call =  getCustomerResource().update(customer.getId(), customer);
        return createInstance(call);
    }

    public Customer replace(Customer customer){
        Call<Customer> call =  getCustomerResource().replace(customer.getId(), customer);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getCustomerResource().delete(id);
        run(call);
    }

    public void delete(Customer customer){
        delete(customer.getId());
    }
}