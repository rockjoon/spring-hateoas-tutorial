package com.example.bootRest.payroll;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("employee not found :: " + id);
    }
}
