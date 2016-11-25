package com.tradenity.sdk.test.integration;

import com.tradenity.sdk.model.Brand;
import com.tradenity.sdk.model.Page;
import com.tradenity.sdk.services.BrandService;
import com.tradenity.sdk.test.factories.Factories;
import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by joseph
 * on 1/11/16.
 */
public class BrandServiceIntegrationTest extends BaseServiceIntegrationTest{

    static Factories factories;
    protected BrandService brandService;

    @Before
    public void setup() {
        factories = new Factories();
        brandService = new BrandService(getSession());
    }

    @Test
    public void listBrandTest(){
        Page<Brand> brands = brandService.findAll();
        assertThat(brands, notNullValue());
        assertThat(brands.getTotalElements(), is(10));
    }

    @Test
    public void createBrandTest(){
        Brand brand = factories.build(Brand.class, "valid");
        Brand b = brandService.create(brand);
        assertThat(b, notNullValue());
        assertThat(b.getId(), notNullValue());
    }

    @Test
    public void showBrandTest(){
        Brand b = brandService.findById("brand_001");
        assertThat(b, notNullValue());
        assertThat(b.getId(), is("brand_001"));
    }

    @Test
    public void updateBrandTest(){
        Brand brand = factories.build(Brand.class, "valid");
        brand.setId("brand_001");
        Brand b = brandService.update(brand);
        assertThat(b, notNullValue());
        assertThat(b.getId(), is("brand_001"));
    }

    @Test
    public void deleteBrandTest(){
        brandService.delete("brand_001");
        //assertThat(deleted, is(true));

        //boolean deleted2 = brandService.delete("brand_0011");
    }
}
