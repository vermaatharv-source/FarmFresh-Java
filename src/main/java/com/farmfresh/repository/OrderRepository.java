package com.farmfresh.repository;

import com.farmfresh.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrderRepository extends MongoRepository<Order, String> {

    
    List<Order> findByConsumerId(String consumerId);

   
    List<Order> findByProductId(String productId);

    
    List<Order> findByStatus(String status);
}