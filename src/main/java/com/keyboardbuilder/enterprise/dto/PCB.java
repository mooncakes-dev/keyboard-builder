package com.keyboardbuilder.enterprise.dto;

import lombok.Data;

public @Data
class PCB {
    private int layout;
    private String type;
    private String brand;
    private Boolean hotSwapable;
}