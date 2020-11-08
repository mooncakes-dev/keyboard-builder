package com.keyboardbuilder.enterprise.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public @Data
class Plate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String material;
    private int layout;
}