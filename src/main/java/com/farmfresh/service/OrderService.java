package com.farmfresh.service;

import com.farmfresh.exception.OutOfStockException;
import com.farmfresh.exception.ProductNotFoundException;
import com.farmfresh.model.Consumer;
import com.farmfresh.model.Order;
import com.farmfresh.model.Product;
import com.farmfresh.repository.ConsumerRepository;
import com.farmfresh.repository.OrderRepository;
import com.farmfresh.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;


@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final ConsumerRepository consumerRepository;
    private final ProductRepository productRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository,
                        ConsumerRepository consumerRepository,
                        ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.consumerRepository = consumerRepository;
        this.productRepository = productRepository;
    }

    @Transactional
    public Order placeOrder(String consumerId, String productId, int quantityOrdered) {
       
        if (quantityOrdered <= 0) {
            throw new IllegalArgumentException("Quantity ordered must be greater than 0.");
        }

        
        Consumer consumer = consumerRepository.findById(consumerId)
                .orElseThrow(() -> new IllegalArgumentException("Consumer not found with ID: " + consumerId));

        
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with ID: " + productId));

        
        if (product.getQuantity() < quantityOrdered) {
            throw new OutOfStockException(productId, product.getQuantity(), quantityOrdered);
        }

        
        product.setQuantity(product.getQuantity() - quantityOrdered);
        product.setOrderCount(product.getOrderCount() + quantityOrdered);
        productRepository.save(product);

       
        Order order = new Order();
        order.setConsumerId(consumerId);
        order.setProductId(productId);
        order.setQuantityOrdered(quantityOrdered);
        order.setTimestamp(Instant.now().toString());
        order.setStatus("PLACED");

        Order savedOrder = orderRepository.save(order);

        
        if (consumer.getOrderIds() == null) {
            consumer.setOrderIds(new java.util.ArrayList<>());
        }
        consumer.getOrderIds().add(savedOrder.getId());
        consumerRepository.save(consumer);

        return savedOrder;
    }

    
    public List<Order> getOrdersByConsumerId(String consumerId) {
        return orderRepository.findByConsumerId(consumerId);
    }

    public Order getOrderById(String orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow(() -> new IllegalArgumentException("Order not found with ID: " + orderId));
    }

    public Order updateOrderStatus(String orderId, String newStatus) {
        Order order = getOrderById(orderId);
        order.setStatus(newStatus);
        return orderRepository.save(order);
    }
}