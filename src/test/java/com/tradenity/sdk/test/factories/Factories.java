package com.tradenity.sdk.test.factories;

import com.tradenity.sdk.model.Brand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.tradenity.sdk.test.factories.Generators.*;

/**
 * Created by joseph
 * on 1/11/16.
 */
public class Factories implements Factory{

    public Factories() {
        registry.put(Brand.class, new BrandBuilder());
    }

    Map<Class, Builder> registry = new HashMap<>();

    public <M> List<M> build(int count, Class<M>cls, String... labels){
        List<M> list = new ArrayList<>();
        for(int i = 0; i < count; i++){
            list.add(build(cls, random(labels)));
        }
        return list;
    }
    public <M> M build(Class<M>cls, String label){
        if(registry.containsKey(cls)){
            return ((M)registry.get(cls).build(label));
        }
        return null;
    }

    public static class BrandBuilder implements Builder<Brand>{
        @Override
        public Brand build(String label) {
            Brand brand = new Brand();
            brand.setName(word());
            brand.setTitle(statement());
            brand.setStatus("active");
            brand.setDescription("");
            return brand;
        }
    }
}
