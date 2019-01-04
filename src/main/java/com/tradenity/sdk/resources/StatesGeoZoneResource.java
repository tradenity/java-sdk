package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface StatesGeoZoneResource {

    @GET("statesGeoZones")
    Call<ResourcePage<StatesGeoZone>> index(@QueryMap Map<String, Object> fields);

    @GET("statesGeoZones/{id}")
    Call<StatesGeoZone> findOne(@Path("id") String id);

    @POST("statesGeoZones")
    Call<StatesGeoZone> save(@Body StatesGeoZone statesGeoZone);

    @PATCH("statesGeoZones/{id}")
    Call<StatesGeoZone> update(@Path("id") String id, @Body StatesGeoZone statesGeoZone);

    @PUT("statesGeoZones/{id}")
    Call<StatesGeoZone> replace(@Path("id") String id, @Body StatesGeoZone statesGeoZone);

    @DELETE("statesGeoZones/{id}")
    Call<Void> delete(@Path("id") String id);
}