package com.keena.restapis;

import com.keena.restapis.orderRepository.Order;
import com.keena.restapis.orderRepository.OrderRepository;
import com.keena.restapis.orderRepository.Status;
import com.keena.restapis.payrollRepository.Employee;
import com.keena.restapis.payrollRepository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger logger = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {
        return args -> {
            employeeRepository.save(new Employee("Bilbo","Baggins","burglar"));
            employeeRepository.save(new Employee("Frodo","Baggins","thief"));

            employeeRepository.findAll().forEach(employee -> logger.info("Preloaded " + employee));

            orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
            orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

            orderRepository.findAll().forEach(order -> logger.info("Preloaded " + order));
        };
    }
}
