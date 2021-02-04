package com.example.bootRest.payroll;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_ORDER")
@NoArgsConstructor
@Data
public class Order {

    private @Id @GeneratedValue Long id;

    private String description;
    private Status status;

    public Order(String description, Status status) {
        this.description = description;
        this.status = status;
    }
}

