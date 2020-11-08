package com.keyboardbuilder.enterprise.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public @Data
class PCB {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int layout;
    private String type;
    private String brand;
    private Boolean hotSwappable;
}