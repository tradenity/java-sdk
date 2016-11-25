package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.Customer;
import com.tradenity.sdk.model.Page;
import com.tradenity.sdk.model.PageRequest;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.CustomerResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 3:06 PM
 */
public class CustomerService extends AbstractService{

    CustomerResource customerResource;

    public CustomerService(TradenityClient client) {
        super(client, "customers");
    }

    protected CustomerResource getCustomerResource(){
        if(customerResource == null) {
            customerResource = resourceFactory.create(CustomerResource.class);
        }
        return customerResource;
    }

    public Page<Customer> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Customer> findAll(PageRequest pageRequest){
        Call<ResourcePage<Customer>> call =  getCustomerResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Customer> search(Customer customer){
        return search(customer, new PageRequest());
    }

    public Page<Customer> search(Customer customer, PageRequest pageRequest){
        return search(notNullMap(toMap(customer)), pageRequest);
    }

    public Page<Customer> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Page<Customer> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }
        Call<ResourcePage<Customer>> call =  getCustomerResource().index(fields);
        return createPage(call);
    }

    public Customer findOne(Map<String, Object> fields){
        List<Customer> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public Customer findByEmail(String email){
        return findOne(Collections.<String, Object>singletonMap("email", email));
    }

    public Customer findByUsername(String username) {
        return findOne(Collections.<String, Object>singletonMap("username", username));
    }

    public Customer findById(String id){
        Call<Customer> call = getCustomerResource().findOne(id);
        return createInstance(call);
    }

    public Customer create(Customer customer){
        Call<Customer> call = getCustomerResource().save(toMap(customer));
        return createInstance(call);
    }

    public Customer update(Customer customer){
        Call<Customer> call = getCustomerResource().update(customer.getId(), toMap(customer));
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call = getCustomerResource().delete(id);
        run(call);
    }

    public void delete(Customer customer){
        delete(customer.getId());
    }

    private Map<String, Object> toMap(Customer customer) {
        Map<String, Object> m = new HashMap<>();
        m.put("firstName", customer.getFirstName());
        m.put("lastName", customer.getLastName());
        m.put("email", customer.getEmail());
        m.put("username", customer.getUsername());
        m.put("password", customer.getPassword());
        m.put("status", customer.getStatus());
        return m;
    }

}
