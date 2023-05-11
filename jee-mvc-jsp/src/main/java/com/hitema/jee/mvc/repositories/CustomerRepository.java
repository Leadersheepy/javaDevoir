package com.hitema.jee.mvc.repositories;

import com.hitema.jee.mvc.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
