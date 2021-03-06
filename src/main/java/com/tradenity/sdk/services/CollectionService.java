package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.CollectionResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionService extends AbstractService{

    CollectionResource collectionResource;

    public CollectionService(TradenityClient client) {
        super(client);
    }

    protected CollectionResource getCollectionResource(){
        if(collectionResource == null) {
            collectionResource = resourceFactory.create(CollectionResource.class);
        }
        return collectionResource;
    }

    public Page<Collection> findAll(PageRequest pageRequest){
        Call<ResourcePage<Collection>> call =  getCollectionResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<Collection> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<Collection>> call =  getCollectionResource().index(params);
        return createPage(call);
    }

    public Collection findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public Collection findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<Collection> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Collection> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<Collection> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<Collection> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<Collection> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<Collection> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<Collection> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Collection findOne(Map<String, Object> fields){
        List<Collection> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public Collection findById(String id){
        Call<Collection> call =  getCollectionResource().findOne(id);
        return createInstance(call);
    }

    public Collection create(Collection collection){
        Call<Collection> call =  getCollectionResource().save(collection);
        return createInstance(call);
    }

    public Collection update(Collection collection){
        Call<Collection> call =  getCollectionResource().update(collection.getId(), collection);
        return createInstance(call);
    }

    public Collection replace(Collection collection){
        Call<Collection> call =  getCollectionResource().replace(collection.getId(), collection);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getCollectionResource().delete(id);
        run(call);
    }

    public void delete(Collection collection){
        delete(collection.getId());
    }
}