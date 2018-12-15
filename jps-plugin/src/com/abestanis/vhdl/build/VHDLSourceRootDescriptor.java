package com.abestanis.vhdl.build;

import com.intellij.openapi.util.io.FileUtilRt;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.builders.BuildTarget;
import org.jetbrains.jps.builders.impl.BuildRootDescriptorImpl;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;


class VHDLSourceRootDescriptor extends BuildRootDescriptorImpl {
    VHDLSourceRootDescriptor(BuildTarget target, File root) {
        super(target, root);
    }

    @NotNull
    @Override
    public FileFilter createFileFilter() {
        return new FileFilter() {
            final List<String> allowedExtensions = Arrays.asList("vhd", "vhdl");
            
            @Override
            public boolean accept(@NotNull File file) {
                return allowedExtensions.contains(FileUtilRt.getExtension(file.getName()));
            }
        };
    }
}
