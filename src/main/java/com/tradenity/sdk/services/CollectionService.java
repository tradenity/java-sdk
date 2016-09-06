package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.Collection;
import com.tradenity.sdk.model.Page;
import com.tradenity.sdk.model.PageRequest;
import com.tradenity.sdk.model.ResourcePage;
import com.tradenity.sdk.resources.CollectionResource;
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
public class CollectionService extends AbstractService{

    CollectionResource collectionResource;

    public CollectionService(TradenityClient client) {
        super(client, "collections");
    }

    protected CollectionResource getCollectionResource(){
        if(collectionResource == null) {
            collectionResource = resourceFactory.create(CollectionResource.class);
        }
        return collectionResource;
    }

    public Page<Collection> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Collection> findAll(PageRequest pageRequest){
        Call<ResourcePage<Collection>> call =  getCollectionResource().index(pageRequest.asMap());
        return createPage(call);
    }
    public Page<Collection> search(Collection collection){
        return search(collection, new PageRequest());
    }

    public Page<Collection> search(Collection collection, PageRequest pageRequest){
        return search(notNullMap(toMap(collection)), pageRequest);
    }

    public Page<Collection> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Page<Collection> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }
        Call<ResourcePage<Collection>> call =  getCollectionResource().index(fields);
        return createPage(call);
    }

    public Collection findByName(String name){
        return findOne(Collections.<String, Object>singletonMap("name", name));
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
        Call<Collection> call =  getCollectionResource().save(toMap(collection));
        return createInstance(call);
    }

    public Collection update(Collection collection){
        Call<Collection> call =  getCollectionResource().update(collection.getId(), toMap(collection));
        return createInstance(call);
    }

    public boolean delete(String id){
        Call<Void> call =  getCollectionResource().delete(id);
        return isSuccessful(call);
    }

    public boolean delete(Collection collection){
        return delete(collection.getId());
    }

    private Map<String, Object> toMap(Collection collection) {
        Map<String, Object> m = new HashMap<>();
        m.put("name", collection.getName());
        m.put("title", collection.getTitle());
        m.put("status", collection.getStatus());
        m.put("description", collection.getDescription());
        return m;
    }

}
