package com.sachinlakshitha.springbootjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Customer {
    @Id
    private String id;
    private String name;
    private String email;
    private Date createdTime;
}
