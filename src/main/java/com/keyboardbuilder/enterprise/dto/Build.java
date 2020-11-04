package com.keyboardbuilder.enterprise.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

public class Build {
    @SerializedName("id")
    private int id;
    @SerializedName("caseType")
    private KeyboardCase caseType;
    @SerializedName("layout")
    private int layout;
    @SerializedName("keyCaps")
    private KeyCaps keyCaps;
    @SerializedName("pcb")
    private PCB pcb;
    @SerializedName("plate")
    private Plate plate;
    @SerializedName("keySwitches")
    private KeySwitches keySwitches;
}

