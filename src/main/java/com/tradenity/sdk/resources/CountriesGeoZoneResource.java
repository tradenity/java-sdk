package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface CountriesGeoZoneResource {

    @GET("countriesGeoZones")
    Call<ResourcePage<CountriesGeoZone>> index(@QueryMap Map<String, Object> fields);

    @GET("countriesGeoZones/{id}")
    Call<CountriesGeoZone> findOne(@Path("id") String id);

    @POST("countriesGeoZones")
    Call<CountriesGeoZone> save(@Body CountriesGeoZone countriesGeoZone);

    @PATCH("countriesGeoZones/{id}")
    Call<CountriesGeoZone> update(@Path("id") String id, @Body CountriesGeoZone countriesGeoZone);

    @PUT("countriesGeoZones/{id}")
    Call<CountriesGeoZone> replace(@Path("id") String id, @Body CountriesGeoZone countriesGeoZone);

    @DELETE("countriesGeoZones/{id}")
    Call<Void> delete(@Path("id") String id);
}