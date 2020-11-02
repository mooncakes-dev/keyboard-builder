package com.keyboardbuilder.enterprise.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
class Build {
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

