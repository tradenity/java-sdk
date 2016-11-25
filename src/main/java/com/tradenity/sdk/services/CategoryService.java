package com.tradenity.sdk.services;


import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.model.Category;
import com.tradenity.sdk.model.Page;
import com.tradenity.sdk.model.PageRequest;
import com.tradenity.sdk.resources.ResourcePage;
import com.tradenity.sdk.resources.CategoryResource;
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
public class CategoryService extends AbstractService{

    CategoryResource categoryResource;

    public CategoryService(TradenityClient client) {
        super(client, "categories");
    }
    private CategoryResource getCategoryResource(){
        if(categoryResource == null) {
            categoryResource = resourceFactory.create(CategoryResource.class);
        }
        return categoryResource;
    }

    public Page<Category> findAll(){
        return findAll(new PageRequest());
    }

    public Page<Category> findAll(PageRequest pageRequest){
        Call<ResourcePage<Category>> call =  getCategoryResource().index(pageRequest.asMap());
        return createPage(call);
    }
    public Page<Category> search(Category category){
        return search(category, new PageRequest());
    }

    public Page<Category> search(Category category, PageRequest pageRequest){
        return search(searchMap(category), pageRequest);
    }

    public Page<Category> search(Map<String, Object> fields){
        return search(fields, new PageRequest());
    }

    public Page<Category> search(Map<String, Object> fields, PageRequest pageRequest){
        Map<String, Object> params = new HashMap<>(fields);
        if(pageRequest != null) {
            params.putAll(pageRequest.asMap());
        }
        Call<ResourcePage<Category>> call =  getCategoryResource().index(fields);
        return createPage(call);
    }

    public Category findOne(Map<String, Object> fields){
        List<Category> content = search(fields).getContent();
        if(content != null && content.size() > 0) {
            return content.get(0);
        }else{
            return null;
        }
    }

    public Category findByName(String name){
        return findOne(Collections.<String, Object>singletonMap("name", name));
    }

    public Category findById(String id){
        Call<Category> call =  getCategoryResource().findOne(id);
        return createInstance(call);
    }

    public Category create(Category category){
        Call<Category> call =  getCategoryResource().save(toMap(category));
        return createInstance(call);
    }

    public Category update(Category category){
        Call<Category> call =  getCategoryResource().update(category.getId(), toMap(category));
        return createInstance(call);
    }

    public void delete(String id){
        Call<Void> call =  getCategoryResource().delete(id);
        run(call);
    }

    public void delete(Category category){
        delete(category.getId());
    }

    public Map<String, Object> toMap(Category category) {
        Map<String, Object> m = new HashMap<>();
        m.put("name", category.getName());
        m.put("title", category.getTitle());
        m.put("status", category.getStatus());
        m.put("description", category.getDescription());
        m.put("depth", category.getDepth());
        m.put("position", category.getPosition());
        return m;
    }

    private Map<String, Object> searchMap(Category category) {
        Map<String, Object> map = notNullMap(toMap(category));
        if(category.getParentCategory() != null && category.getParentCategory().getId() != null){
            map.put("parentCategory", category.getParentCategory().getId());
        }
        return map;
    }

}
