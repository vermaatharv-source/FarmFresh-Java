package com.farmfresh.model;

public class Farmer extends User {
    
    private String productId;

    public Farmer(int id, String name, String email, String password, String productId) {
        super(id, name, email, password);
        this.productId = productId;
    }
}
