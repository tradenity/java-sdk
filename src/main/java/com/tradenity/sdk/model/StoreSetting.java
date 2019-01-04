package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class StoreSetting extends BaseModel{

    
    private GeneralSettings generalSettings;
    private MeasurementSettings measurementSettings;
    private CartSettings cartSettings;
    private PaymentSettings paymentSettings;
    private InventorySettings inventorySettings;
    private TaxSettings taxSettings;
    private ReturnSettings returnSettings;
    private MailServerSettings mailServerSettings;

    public StoreSetting(){
    }
    
    public StoreSetting id(String id) {
        this.setId(id);
        return this;
    }
    public GeneralSettings getGeneralSettings() {
        return generalSettings;
    }

    public void setGeneralSettings(GeneralSettings generalSettings) {
        this.generalSettings = generalSettings;
    }
    
    public StoreSetting generalSettings(GeneralSettings generalSettings) {
        this.setGeneralSettings(generalSettings);
        return this;
    }
    public MeasurementSettings getMeasurementSettings() {
        return measurementSettings;
    }

    public void setMeasurementSettings(MeasurementSettings measurementSettings) {
        this.measurementSettings = measurementSettings;
    }
    
    public StoreSetting measurementSettings(MeasurementSettings measurementSettings) {
        this.setMeasurementSettings(measurementSettings);
        return this;
    }
    public CartSettings getCartSettings() {
        return cartSettings;
    }

    public void setCartSettings(CartSettings cartSettings) {
        this.cartSettings = cartSettings;
    }
    
    public StoreSetting cartSettings(CartSettings cartSettings) {
        this.setCartSettings(cartSettings);
        return this;
    }
    public PaymentSettings getPaymentSettings() {
        return paymentSettings;
    }

    public void setPaymentSettings(PaymentSettings paymentSettings) {
        this.paymentSettings = paymentSettings;
    }
    
    public StoreSetting paymentSettings(PaymentSettings paymentSettings) {
        this.setPaymentSettings(paymentSettings);
        return this;
    }
    public InventorySettings getInventorySettings() {
        return inventorySettings;
    }

    public void setInventorySettings(InventorySettings inventorySettings) {
        this.inventorySettings = inventorySettings;
    }
    
    public StoreSetting inventorySettings(InventorySettings inventorySettings) {
        this.setInventorySettings(inventorySettings);
        return this;
    }
    public TaxSettings getTaxSettings() {
        return taxSettings;
    }

    public void setTaxSettings(TaxSettings taxSettings) {
        this.taxSettings = taxSettings;
    }
    
    public StoreSetting taxSettings(TaxSettings taxSettings) {
        this.setTaxSettings(taxSettings);
        return this;
    }
    public ReturnSettings getReturnSettings() {
        return returnSettings;
    }

    public void setReturnSettings(ReturnSettings returnSettings) {
        this.returnSettings = returnSettings;
    }
    
    public StoreSetting returnSettings(ReturnSettings returnSettings) {
        this.setReturnSettings(returnSettings);
        return this;
    }
    public MailServerSettings getMailServerSettings() {
        return mailServerSettings;
    }

    public void setMailServerSettings(MailServerSettings mailServerSettings) {
        this.mailServerSettings = mailServerSettings;
    }
    
    public StoreSetting mailServerSettings(MailServerSettings mailServerSettings) {
        this.setMailServerSettings(mailServerSettings);
        return this;
    }

}