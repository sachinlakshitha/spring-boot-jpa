package com.sachinlakshitha.springbootjpa.service.impl;

import com.sachinlakshitha.springbootjpa.dto.CustomerDto;
import com.sachinlakshitha.springbootjpa.model.Customer;
import com.sachinlakshitha.springbootjpa.repository.CustomerRepository;
import com.sachinlakshitha.springbootjpa.service.CustomerService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository  customerRepository;
    private ModelMapper modelMapper;

    @Override
    public Boolean save(CustomerDto customerDto) {
        return customerRepository.save(convertToEntity(customerDto)) != null;
    }

    @Override
    public List<CustomerDto> findAll() {
        return customerRepository.findAll().stream().map(this::convertToDto).toList();
    }

    @Override
    public CustomerDto findById(String id) {
        return customerRepository.findById(id).map(this::convertToDto).orElse(null);
    }

    @Override
    public Boolean update(CustomerDto customerDto) {
        return customerRepository.save(convertToEntity(customerDto)) != null;
    }

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }

    public CustomerDto convertToDto(Customer customer) {
        return modelMapper.map(customer, CustomerDto.class);
    }

    public Customer convertToEntity(CustomerDto customerDto) {
        return modelMapper.map(customerDto, Customer.class);
    }
}
