package com.abestanis.vhdl.build.jsp;

import com.intellij.execution.process.ProcessAdapter;
import com.intellij.execution.process.ProcessEvent;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.vfs.VirtualFileManager;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.incremental.CompileContext;
import org.jetbrains.jps.incremental.messages.BuildMessage;
import org.jetbrains.jps.incremental.messages.CompilerMessage;
import org.jetbrains.jps.model.module.JpsModule;

import java.util.Optional;


public class VHDLCompilerProcessAdapter extends ProcessAdapter {
    private final CompileContext context;
    private final String         name;
    private final JpsModule      module;
    private static final Logger LOGGER = Logger.getInstance(VHDLBuilder.class);

    VHDLCompilerProcessAdapter(@NotNull CompileContext context,
                               @NotNull String name, @NotNull JpsModule module) {
        this.context = context;
        this.name = name;
        this.module = module;
    }

    @Override
    public void onTextAvailable(@NotNull ProcessEvent event, @NotNull Key outputType) {
        LOGGER.warn("build.out: " + event.getText());
        for (String line : event.getText().split("\n")) {
            VHDLCompilerMessage message = VHDLCompilerMessage.create(line);
            if (message != null) {
                String sourcePath = Optional.ofNullable(message.getUrl())
                        .map(VirtualFileManager::extractPath).orElse(null);
                CompilerMessage msg = new CompilerMessage(
                        name, message.getCategory(), message.getMessage(),
                        sourcePath, -1, -1, -1,
                        message.getLine(), message.getColumn());
                context.processMessage(msg);
            }
        }
    }

    @Override
    public void processTerminated(@NotNull ProcessEvent event) {
        super.processTerminated(event);
        LOGGER.debug("Build process exited with code " + event.getExitCode());
        if (event.getExitCode() != 0) {
            CompilerMessage msg = new CompilerMessage(
                    name, BuildMessage.Kind.INFO,
                    "Errors occurred while compiling module '" + module.getName() + "'");
            context.processMessage(msg);
        }
    }
}
