package com.abestanis.vhdl.spelling;

import com.intellij.spellchecker.BundledDictionaryProvider;

public class VHDLBundledDictionaryProvider implements BundledDictionaryProvider {
    @Override
    public String[] getBundledDictionaries() {
        return new String[] {
                "vhdl.dic"
        };
    }
}
