package com.example.bootRest.payroll;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id) {
        super("Order Not Found :: " + id);
    }
}
