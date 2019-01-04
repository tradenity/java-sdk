package com.tradenity.sdk.resources;

import com.tradenity.sdk.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;
import java.util.List;
import java.util.Set;

public interface ZipCodesGeoZoneResource {

    @GET("zipCodesGeoZones")
    Call<ResourcePage<ZipCodesGeoZone>> index(@QueryMap Map<String, Object> fields);

    @GET("zipCodesGeoZones/{id}")
    Call<ZipCodesGeoZone> findOne(@Path("id") String id);

    @POST("zipCodesGeoZones")
    Call<ZipCodesGeoZone> save(@Body ZipCodesGeoZone zipCodesGeoZone);

    @PATCH("zipCodesGeoZones/{id}")
    Call<ZipCodesGeoZone> update(@Path("id") String id, @Body ZipCodesGeoZone zipCodesGeoZone);

    @PUT("zipCodesGeoZones/{id}")
    Call<ZipCodesGeoZone> replace(@Path("id") String id, @Body ZipCodesGeoZone zipCodesGeoZone);

    @DELETE("zipCodesGeoZones/{id}")
    Call<Void> delete(@Path("id") String id);
}