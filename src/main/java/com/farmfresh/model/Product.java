package com.farmfresh.model;

public class Product {
    
    private String id;
    private String name;
    private String farmerId;
    private double price;
    private int quantity;
    private int orderCount;

    public Product(String id, String name, String farmerId, double price, int quantity, int orderCount) {
        this.id = id;
        this.name = name;
        this.farmerId = farmerId;
        this.price = price;
        this.quantity = quantity;
        this.orderCount = orderCount;
    }

    // Getters and Setters

    public void setId(String id){ //FUNCTION FOR SETTING THE ID OF THE PRODUCT
        this.id = id;
    }

    public String getId(){ //FUNCTION FOR PRINTING THE ID OF THE PRODUCT
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setFarmerId(String farmerId){
        this.farmerId = farmerId;
    }

    public String getFarmerId(){
        return this.farmerId;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setOrderCount(int orderCount){
        this.orderCount = orderCount;
    }

    public int getOrderCount(){
        return this.orderCount;
    }
}
