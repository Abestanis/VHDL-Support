package com.abestanis.vhdl;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;

import org.jetbrains.annotations.NotNull;

public class VHDLFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(VHDLFileType.INSTANCE);
        fileTypeConsumer.consume(VHDLFileType.VHDL.INSTANCE);
    }
}
