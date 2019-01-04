package com.tradenity.sdk.resources.transport.utils;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.tradenity.sdk.model.BaseModel;

import java.io.IOException;

public class ModelPostProcessorTypeAdapterFactory implements TypeAdapterFactory {
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        final TypeAdapter<T> delegate = gson.getDelegateAdapter(this, type);
        return new TypeAdapter<T>() {
            @Override
            public void write(JsonWriter out, T value) throws IOException {
                if(value instanceof BaseModel){
                    BaseModel model = (BaseModel) value;
                    model.getId();
                }
                delegate.write(out, value);
            }
            @Override
            public T read(JsonReader in) throws IOException {
                T value = delegate.read(in);
                if(value instanceof BaseModel){
                    BaseModel model = (BaseModel) value;
                    model.getId();
                }
                return value;
            }
        };
    }
}