package com.farmfresh.model;

public class Order {
    
    private String id;
    private String consumerId;
    private String productId;
    private int quantityOrdered;
    private String status;

    public Order(String id, String consumerId, String productId, int quantityOrdered, String status) { //CONSTRUCTOR FOR INITIALIZING THE ORDER CLASS
        this.id = id;
        this.consumerId = consumerId;
        this.productId = productId;
        this.quantityOrdered = quantityOrdered;
        this.status = status;
    }

    // Getters and Setters

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setConsumerId(String consumerId){
        this.consumerId = consumerId;
    }

    public String getConsumerId(){
        return this.consumerId;
    }

    public void setProductId(String productId){
        this.productId = productId;
    }

    public String getProductId(){
        return this.productId;
    }

    public void setQuantityOrdered(int quantityOrdered){
        this.quantityOrdered = quantityOrdered;
    }

    public int getQuantityOrdered(){
        return this.quantityOrdered;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }
}
