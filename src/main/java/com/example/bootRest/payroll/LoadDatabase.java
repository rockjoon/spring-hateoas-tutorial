package com.example.bootRest.payroll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {
        return args -> {
            employeeRepository.save(new Employee("Bilbo", "baggins", "burlar"));
            employeeRepository.save(new Employee("Frodo", "Bag", "Theif"));

            employeeRepository.findAll().stream()
                    .forEach(e -> log.info("preload : " + e));

            orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
            orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

            orderRepository.findAll().stream()
                    .forEach(o -> log.info("preloaded : " + o));
        };
    }
}
