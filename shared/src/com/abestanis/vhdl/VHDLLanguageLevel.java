package com.abestanis.vhdl;

import org.jetbrains.annotations.NotNull;

public enum VHDLLanguageLevel {
    L_87, L_93c, L_93, L_00, L_02, L_08;
    
    @NotNull
    public String getShortName() {
        return name().substring(name().indexOf('_') + 1);
    }
}
