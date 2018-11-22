package com.abestanis.vhdl;

import com.abestanis.vhdl.psi.VHDLTypes;
import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;

import org.jetbrains.annotations.NotNull;

public class VHDLCompletionContributor extends CompletionContributor {
    public VHDLCompletionContributor() {
        // TODO: Implement
        extend(CompletionType.BASIC,
               PlatformPatterns.psiElement(VHDLTypes.NAME_).withLanguage(VHDLLanguage.INSTANCE),
               new CompletionProvider<CompletionParameters>() {
                   public void addCompletions(@NotNull CompletionParameters parameters,
                                              @NotNull ProcessingContext context,
                                              @NotNull CompletionResultSet resultSet) {
                       resultSet.addElement(LookupElementBuilder.create("Hello"));
                   }
               }
        );
    }
}
