package com.keyboardbuilder.enterprise.dto;

import lombok.Data;

public @Data
class KeyboardBuild {
    private String caseType;
    private int layout;
    private String keyCaps;
    private String pcb;
    private String plate;
    private String keySwitches;
}

