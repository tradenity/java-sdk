package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.TaxResource;
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
public class TaxService extends AbstractService{

    TaxResource taxResource;

    public TaxService(TradenityClient client) {
        super(client, "taxes");
    }

    protected TaxResource getTaxResource(){
        if(taxResource == null) {
            taxResource = resourceFactory.create(TaxResource.class);
        }
        return taxResource;
    }

    public Page<Tax> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Tax> findAll(PageRequest pageRequest){
        Call<ResourcePage<Tax>> call =  getTaxResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Tax> search(Tax tax){
        return search(tax, new PageRequest());
    }

    public Page<Tax> search(Tax tax, PageRequest pageRequest){
        return search(toMap(tax), pageRequest);
    }

    public Page<Tax> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Page<Tax> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }
        Call<ResourcePage<Tax>> call =  getTaxResource().index(fields);
        return createPage(call);
    }

    public Tax findOne(Map<String, Object> fields){
        List<Tax> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public Tax findByName(String name) {
        return findOne(Collections.<String, Object>singletonMap("name", name));
    }

    public Tax findById(String id){
        Call<Tax> call =  getTaxResource().findById(id);
        return createInstance(call);
    }

    public Tax create(Tax tax){
        Call<Tax> call =  getTaxResource().save(toMap(tax));
        return createInstance(call);
    }

    public Tax update(Tax tax){
        Call<Tax> call =  getTaxResource().update(tax.getId(), notNullMap(toMap(tax)));
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getTaxResource().delete(id);
        run(call);
    }

    public void delete(Tax tax){
        delete(tax.getId());
    }

    private Map<String, Object> toMap(Tax tax) {
        Map<String, Object> m = new HashMap<>();
        m.put("name", tax.getName());
        m.put("title", tax.getTitle());
        m.put("status", tax.getStatus());
        m.put("description", tax.getDescription());
        m.put("rate", tax.getRate());
        return m;
    }

}
