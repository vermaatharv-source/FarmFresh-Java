package com.farmfresh.model;

public class Farmer extends User {
    
    private String ProductId;

    public Farmer(int id, String name, String email, String password, String ProductId) {
        super(id, name, email, password);
        this.ProductId = ProductId;
    }
}
