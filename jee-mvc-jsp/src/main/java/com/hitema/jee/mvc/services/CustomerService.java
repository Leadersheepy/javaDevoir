package com.hitema.jee.mvc.services;

import com.hitema.jee.mvc.entities.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> readAll() ;

    Customer create(Customer customer);
}

