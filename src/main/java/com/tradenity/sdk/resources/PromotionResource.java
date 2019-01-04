package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface PromotionResource {

    @GET("promotions")
    Call<ResourcePage<Promotion>> index(@QueryMap Map<String, Object> fields);
}