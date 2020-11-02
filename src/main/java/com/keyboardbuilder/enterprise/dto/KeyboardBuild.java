package com.keyboardbuilder.enterprise.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

public @Data
class KeyboardBuild {
    @SerializedName("id")
    private Integer id;
    @SerializedName("caseType")
    private String caseType;
    @SerializedName("layout")
    private int layout;
    @SerializedName("keyCaps")
    private String keyCaps;
    @SerializedName("pcb")
    private String pcb;
    @SerializedName("plate")
    private String plate;
    @SerializedName("keySwitches")
    private String keySwitches;
}

