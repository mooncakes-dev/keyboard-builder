package com.keyboardbuilder.enterprise.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public @Data
class Build {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String caseType;
    private int layout;
    private String keyCaps;
    private String pcb;
    private String plate;
    private String keySwitches;
}

