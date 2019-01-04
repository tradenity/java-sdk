package com.tradenity.sdk.resources;

import com.google.gson.annotations.SerializedName;
import com.tradenity.sdk.model.Page;
import com.tradenity.sdk.model.PageInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ResourcePage<T> {
    //@SerializedName(value = "content", alternate = {"stores", "currencies", "states", "countries", "addresses", "brands", "categories", "photos", "options", "optionValues", "optionSets", "products", "variants", "collections", "itemsSelectors", "promotions", "discountPromotions", "freeShippingPromotions", "coupons", "discountCoupons", "freeShippingCoupons", "freeItemCoupons", "customerGroups", "customers", "wishLists", "gateways", "testGateways", "stripeGateways", "braintreeGateways", "shippingMethods", "freeShippings", "fixedRateShippings", "tableRateShippings", "tableRateRules", "orders", "lineItems", "orderLineItems", "returnLineItems", "paymentSources", "paymentCards", "paymentTokens", "payments", "creditCardPayments", "cashOnDeliveryPayments", "storeCreditPayments", "transactions", "paymentTransactions", "refundTransactions", "storeCreditTransactions", "storeCredits", "webHooks", "storeProfiles", "storeSettings", "plans", "subscriptions", "refundOperations", "cancelOperations", "returnOperations", "geoZones", "countriesGeoZones", "statesGeoZones", "zipCodesGeoZones", "taxClasses", "taxRates", "users", "roles", "apiCredentialsSets", "accounts", "userTokens", "profiles", "storageFiles" })
    List<T> items;
    @SerializedName("__meta")
    PagedResourcesMetaInfo metaInfo;

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public PagedResourcesMetaInfo getMetaInfo() {
        return metaInfo;
    }

    public void setMetaInfo(PagedResourcesMetaInfo metaInfo) {
        this.metaInfo = metaInfo;
    }

    public Page<T> toPage() {
        PageInfo pi = new PageInfo(metaInfo.getSize(), metaInfo.getTotalElements(), metaInfo.getTotalPages(), metaInfo.getNumber());
        return new Page<>(pi, this.items);
    }
}