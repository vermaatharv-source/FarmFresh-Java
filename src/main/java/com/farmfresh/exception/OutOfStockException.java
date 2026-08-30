package com.farmfresh.exception;

public class OutOfStockException extends RuntimeException {

    public OutOfStockException(String message) {
        super(message);
    }

    public OutOfStockException(String productId, int available, int requested) {
        super("Insufficient stock for product ID '" + productId + "'. Requested: " + requested + ", Available: " + available);
    }
}