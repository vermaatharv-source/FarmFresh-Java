package com.farmfresh.model;
import java.util.ArrayList;
import java.util.List;

public class Farmer extends User {
    
    private List<String> productIds;

    public Farmer(String id, String name, String email, String password, String productId) {
        super(id, name, email, password);
        this.productIds = new ArrayList<>();
    }
    
    public void setProductid(List <String> productIds){
        this.productIds = productIds; 
    }

    public List<String> getProductid(){
        return this.productIds;
    }
    
    public void addProductId(String Productid){
        this.productIds.add(Productid);
    }

    public void removeProductId(String Productid){
        this.productIds.remove(Productid);
    }
}
