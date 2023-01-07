package com.sachinlakshitha.springbootjpa.service;

import com.sachinlakshitha.springbootjpa.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    Boolean save(CustomerDto customerDto);
    List<CustomerDto> findAll();
    CustomerDto findById(String id);
    Boolean update(CustomerDto customerDto);
    void delete(String id);
}
