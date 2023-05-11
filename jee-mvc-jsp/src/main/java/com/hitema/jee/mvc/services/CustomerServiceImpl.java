package com.hitema.jee.mvc.services;

import com.hitema.jee.mvc.entities.Country;
import com.hitema.jee.mvc.entities.Customer;
import com.hitema.jee.mvc.repositories.CountryRepository;
import com.hitema.jee.mvc.repositories.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    private static final Logger log = LoggerFactory.getLogger(CustomerServiceImpl.class);

    private CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Customer> readAll() {
        return repository.findAll();
    }

    @Override
    public Customer create(Customer customer) {
        if ( customer.getLastUpdate() == null )
            customer.setLastUpdate(LocalDateTime.now());
        return repository.save(customer);
    }
}

