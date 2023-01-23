package com.example.testdocker.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@jakarta.persistence.Entity
@Table
public class Entity {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String lastname;
}
