package com.abestanis.vhdl;

import com.intellij.lang.Language;


public class VHDLLanguage extends Language {
    public static final VHDLLanguage INSTANCE = new VHDLLanguage();

    private VHDLLanguage() {
        super("VHDL");
    }
}
