package com.tradenity.sdk.model;

/**
 * User: Joseph Fouad
 * Date: 10/23/2015
 * Time: 1:15 PM
 */
public class Transaction extends BaseModel{
    String type;
    String status;
    String gatewayOperationId;
    Order order;
    Gateway gateway;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGatewayOperationId() {
        return gatewayOperationId;
    }

    public void setGatewayOperationId(String gatewayOperationId) {
        this.gatewayOperationId = gatewayOperationId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Gateway getGateway() {
        return gateway;
    }

    public void setGateway(Gateway gateway) {
        this.gateway = gateway;
    }
}
