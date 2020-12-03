package com.keyboardbuilder.enterprise.dto;

import lombok.Data;

public @Data
class KeyboardBuild {
    private Integer id;
    private String buildName;
    private String caseType;
    private int layout;
    private String keyCaps;
    private String pcb;
    private Boolean isHotSwappable;
    private String plate;
    private String keySwitches;

    public String toString() {
        return buildName;
    }
}

