package com.farmfresh.model;
import java.util.List;

public class Consumer extends User {
    
    private List<String> orderIds;
    
    public Consumer(String id, String name, String email, String password, List<String> orderIds){
        super(id, name, email, password);
    }

    public void setOrderIds(List<String> orderIds){
        this.orderIds = orderIds;
    }

    public List<String> getOrderIds(){
        return this.orderIds;
    }

    public void addOrderId(String orderId){
        this.orderIds.add(orderId);
    }

    public void removeOrderId(String orderId){
        this.orderIds.remove(orderId);
    }
}
