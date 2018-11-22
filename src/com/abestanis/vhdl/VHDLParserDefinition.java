package com.abestanis.vhdl;

import com.abestanis.vhdl.psi.VHDLFile;
import com.abestanis.vhdl.psi.VHDLTypes;
import com.abestanis.vhdl.parser.VHDLParser;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;

import org.jetbrains.annotations.NotNull;

public class VHDLParserDefinition implements ParserDefinition {
    private static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    private static final TokenSet COMMENTS     = TokenSet.create(VHDLTypes.COMMENT);
    private static final TokenSet STRING       = TokenSet.create(VHDLTypes.STRING_LITERAL);

    public static final IFileElementType FILE = new IFileElementType(VHDLLanguage.INSTANCE);
    
    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new VHDLLexerAdapter();
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return STRING;
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        return new VHDLParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new VHDLFile(viewProvider);
    }

    @Deprecated
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return VHDLTypes.Factory.createElement(node);
    }
}
