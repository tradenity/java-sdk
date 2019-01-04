package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.*;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.StateResource;
import retrofit2.Call;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StateService extends AbstractService{

    StateResource stateResource;

    public StateService(TradenityClient client) {
        super(client);
    }

    protected StateResource getStateResource(){
        if(stateResource == null) {
            stateResource = resourceFactory.create(StateResource.class);
        }
        return stateResource;
    }

    public Page<State> findAll(PageRequest pageRequest){
        Call<ResourcePage<State>> call =  getStateResource().index(pageRequest.asMap());
        return createPage(call);
    }

    public Page<State> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }

        Call<ResourcePage<State>> call =  getStateResource().index(fields);
        return createPage(call);
    }

    public State findBy(String attribute, String value){
        return findOne(Collections.<String, Object>singletonMap(attribute, value));
    }

    public State findBy(String attribute, BaseModel model){
        return findBy(attribute, model.getId());
    }

    public Page<State> findAll(){
        return findAll(new PageRequest());
    }

    public Page<State> findAllBy(String attribute, String value){
        return search(attribute, value);
    }

    public Page<State> findAllBy(String attribute, BaseModel model){
        return findAllBy(attribute, model.getId());
    }

    public Page<State> findAllBy(String attribute, String value, PageRequest pageRequest){
        return search(Collections.<String, Object>singletonMap(attribute, value), pageRequest);
    }

    public Page<State> findAllBy(String attribute, BaseModel model, PageRequest pageRequest){
        return findAllBy(attribute, model.getId(), pageRequest);
    }

    public Page<State> search(String attribute, Object value){
        return search(Collections.singletonMap(attribute, value), new PageRequest());
    }

    public Page<State> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public State findOne(Map<String, Object> fields){
        List<State> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public State findById(String id){
        Call<State> call =  getStateResource().findOne(id);
        return createInstance(call);
    }

    public State create(State state){
        Call<State> call =  getStateResource().save(state);
        return createInstance(call);
    }

    public State update(State state){
        Call<State> call =  getStateResource().update(state.getId(), state);
        return createInstance(call);
    }

    public State replace(State state){
        Call<State> call =  getStateResource().replace(state.getId(), state);
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getStateResource().delete(id);
        run(call);
    }

    public void delete(State state){
        delete(state.getId());
    }
}