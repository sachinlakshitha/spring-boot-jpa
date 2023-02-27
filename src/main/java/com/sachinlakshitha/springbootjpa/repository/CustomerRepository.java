package com.sachinlakshitha.springbootjpa.repository;

import com.sachinlakshitha.springbootjpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
