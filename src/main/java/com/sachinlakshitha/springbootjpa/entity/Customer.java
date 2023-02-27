package com.sachinlakshitha.springbootjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Customer {
    @Id
    private String id;
    private String name;
    private String email;
    private Date createdTime;
}
