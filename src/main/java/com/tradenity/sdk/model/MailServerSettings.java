package com.tradenity.sdk.model;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Date;


public class MailServerSettings {

    
    private String senderEmail;
    private String host;
    private Integer port;
    private String username;
    private String password;

    public MailServerSettings(){
    }
    
    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }
    
    public MailServerSettings senderEmail(String senderEmail) {
        this.setSenderEmail(senderEmail);
        return this;
    }
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
    
    public MailServerSettings host(String host) {
        this.setHost(host);
        return this;
    }
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
    
    public MailServerSettings port(Integer port) {
        this.setPort(port);
        return this;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public MailServerSettings username(String username) {
        this.setUsername(username);
        return this;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public MailServerSettings password(String password) {
        this.setPassword(password);
        return this;
    }

}