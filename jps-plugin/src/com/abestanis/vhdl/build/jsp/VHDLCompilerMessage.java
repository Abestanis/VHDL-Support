package com.abestanis.vhdl.build.jsp;

import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.VfsUtilCore;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jps.incremental.messages.BuildMessage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class VHDLCompilerMessage {
    private static final Pattern COMPILER_MESSAGE_PATTERN   = Pattern.compile(
            "^(.+):(\\d+):(\\d+):\\s*(.+)$");
    private static final Pattern COMMAND_LINE_ERROR_PATTERN = Pattern.compile(
            "^(.+):\\*command-line\\*:\\s*(.+)$");

    @NotNull
    private final String            message;
    @Nullable
    private final String            url;
    private final long              line;
    private final long              column;
    @NotNull
    private final BuildMessage.Kind category;

    private VHDLCompilerMessage(@NotNull String message, @Nullable String url, long line,
                                long column, @NotNull BuildMessage.Kind category) {
        this.message = message;
        this.url = url;
        this.line = line;
        this.column = column;
        this.category = category;
    }

    @NotNull
    String getMessage() {
        return message;
    }

    @Nullable
    String getUrl() {
        return url;
    }

    long getLine() {
        return line;
    }

    long getColumn() {
        return column;
    }

    @NotNull
    BuildMessage.Kind getCategory() {
        return category;
    }

    @Nullable
    public static VHDLCompilerMessage create(@NotNull String compilerMessage) {
        Matcher matcher;
        if ((matcher = COMPILER_MESSAGE_PATTERN.matcher(compilerMessage)).matches()) {
            String path = FileUtil.toSystemIndependentName(StringUtil.notNullize(
                    FileUtil.toCanonicalPath(matcher.group(1))));
            long lineNumber = parseLong(matcher.group(2));
            long columnNumber = parseLong(matcher.group(3));
            String details = matcher.group(4);
            return new VHDLCompilerMessage(details, VfsUtilCore.pathToUrl(path), lineNumber,
                                           columnNumber, BuildMessage.Kind.ERROR);
        } else if ((matcher = COMMAND_LINE_ERROR_PATTERN.matcher(compilerMessage)).matches()) {
            return new VHDLCompilerMessage(matcher.group(2), null, -1,
                                           -1, BuildMessage.Kind.ERROR);
        } // TODO: Also match warnings and other compiler output
        return null;
    }

    private static long parseLong(@NotNull String string) {
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException ignored) {
            return -1;
        }
    }
}
