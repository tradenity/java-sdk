package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class PaymentCard extends PaymentSource{

    
    public static final String BRAND_VISA = "visa";
    public static final String BRAND_MASTERCARD = "mastercard";
    public static final String BRAND_AMERICAN_EXPRESS = "americanExpress";
    public static final String BRAND_DISCOVER = "discover";
    private String cardHolderName;
    private String brand;
    private String expirationMonth;
    private String expirationYear;
    private String CCV;
    private String cardNumber;
    private String cardLastFourDigits;
    private Address address;

    public PaymentCard(){
    }
    
    public PaymentCard id(String id) {
        this.setId(id);
        return this;
    }
    public PaymentCard reusable(Boolean reusable) {
        this.setReusable(reusable);
        return this;
    }
    public PaymentCard status(String status) {
        this.setStatus(status);
        return this;
    }
    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }
    
    public PaymentCard cardHolderName(String cardHolderName) {
        this.setCardHolderName(cardHolderName);
        return this;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public PaymentCard brand(String brand) {
        this.setBrand(brand);
        return this;
    }
    public String getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(String expirationMonth) {
        this.expirationMonth = expirationMonth;
    }
    
    public PaymentCard expirationMonth(String expirationMonth) {
        this.setExpirationMonth(expirationMonth);
        return this;
    }
    public String getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(String expirationYear) {
        this.expirationYear = expirationYear;
    }
    
    public PaymentCard expirationYear(String expirationYear) {
        this.setExpirationYear(expirationYear);
        return this;
    }
    public String getCCV() {
        return CCV;
    }

    public void setCCV(String CCV) {
        this.CCV = CCV;
    }
    
    public PaymentCard CCV(String CCV) {
        this.setCCV(CCV);
        return this;
    }
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    public PaymentCard cardNumber(String cardNumber) {
        this.setCardNumber(cardNumber);
        return this;
    }
    public String getCardLastFourDigits() {
        return cardLastFourDigits;
    }

    public void setCardLastFourDigits(String cardLastFourDigits) {
        this.cardLastFourDigits = cardLastFourDigits;
    }
    
    public PaymentCard cardLastFourDigits(String cardLastFourDigits) {
        this.setCardLastFourDigits(cardLastFourDigits);
        return this;
    }
    public PaymentCard customer(Customer customer) {
        this.setCustomer(customer);
        return this;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public PaymentCard address(Address address) {
        this.setAddress(address);
        return this;
    }

}