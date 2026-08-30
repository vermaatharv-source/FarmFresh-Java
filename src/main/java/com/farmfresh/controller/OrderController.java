package com.farmfresh.controller;

import com.farmfresh.model.Order;
import com.farmfresh.service.OrderService;
import com.farmfresh.exception.OutOfStockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<?> placeOrder(@RequestBody Order order) {
        try {
            Order createdOrder = orderService.placeOrder(
                order.getConsumerId(),
                order.getProductId(),
                order.getQuantityOrdered()
            );
            return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
        } catch (OutOfStockException e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to place order: " + e.getMessage());
        }
    }

    @GetMapping("/{consumerId}")
    public ResponseEntity<List<Order>> getOrdersByConsumer(@PathVariable String consumerId) {
        try {
            List<Order> orders = orderService.getOrdersByConsumerId(consumerId);
            return ResponseEntity.ok(orders);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }
}