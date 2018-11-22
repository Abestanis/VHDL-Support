package com.abestanis.vhdl;

import static com.abestanis.vhdl.psi.VHDLTypes.*;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;


public class VHDLSyntaxHighlighter extends SyntaxHighlighterBase {
    static final         TextAttributesKey KEYWORD_ATTR       = createTextAttributesKey(
            "VHDL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    static final         TextAttributesKey STRING_ATTR        = createTextAttributesKey(
            "VHDL_STRING", DefaultLanguageHighlighterColors.STRING);
    static final         TextAttributesKey BIT_STRING_ATTR    = createTextAttributesKey(
            "BIT_VHDL_STRING", DefaultLanguageHighlighterColors.STRING);
    static final         TextAttributesKey OCT_STRING_ATTR    = createTextAttributesKey(
            "OCT_VHDL_STRING", DefaultLanguageHighlighterColors.STRING);
    static final         TextAttributesKey HEX_STRING_ATTR    = createTextAttributesKey(
            "HEX_VHDL_STRING", DefaultLanguageHighlighterColors.STRING);
    static final         TextAttributesKey CHARACTER_ATTR     = createTextAttributesKey(
            "HEX_VHDL_STRING", DefaultLanguageHighlighterColors.STRING);
    static final         TextAttributesKey NUMBER_ATTR        = createTextAttributesKey(
            "VHDL_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    static final         TextAttributesKey COMMENT_ATTR       = createTextAttributesKey(
            "VHDL_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    private static final TextAttributesKey BAD_CHARACTER_ATTR = createTextAttributesKey(
            "SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] BAD_CHAR_KEYS   = new TextAttributesKey[] {BAD_CHARACTER_ATTR};
    private static final TextAttributesKey[] KEYWORD_KEYS    = new TextAttributesKey[] {KEYWORD_ATTR};
    private static final TextAttributesKey[] STRING_KEYS     = new TextAttributesKey[] {STRING_ATTR};
    private static final TextAttributesKey[] BIT_STRING_KEYS = new TextAttributesKey[] {BIT_STRING_ATTR};
    private static final TextAttributesKey[] OCT_STRING_KEYS = new TextAttributesKey[] {OCT_STRING_ATTR};
    private static final TextAttributesKey[] HEX_STRING_KEYS = new TextAttributesKey[] {HEX_STRING_ATTR};
    private static final TextAttributesKey[] CHARACTER_KEYS  = new TextAttributesKey[] {CHARACTER_ATTR};
    private static final TextAttributesKey[] COMMENT_KEYS    = new TextAttributesKey[] {COMMENT_ATTR};
    private static final TextAttributesKey[] NUMBER_KEYS     = new TextAttributesKey[] {NUMBER_ATTR};
    private static final TextAttributesKey[] EMPTY_KEYS      = new TextAttributesKey[0];
    private static final List<IElementType>  KEYWORDS        = Arrays.asList(
            LIBRARY, ACCESS, USE, OPEN, NEW, ALL, OTHERS, ENTITY, BEGIN, END, IS, AND, OR, XOR,
            NAND, NOR, XNOR, NOT, MODULO, REMAINDER, SHIFT_LEFT, SHIFT_RIGHT, SHIFT_LEFT_A,
            SHIFT_RIGHT_A, ROTATE_LEFT, ROTATE_RIGHT, ABS, NULL, TO, DOWNTO, RETURN, ALIAS,
            ARCHITECTURE, OF, ASSERT, REPORT, SEVERITY, ATTRIBUTE, FOR, BLOCK, CASE, WHEN,
            COMPONENT, POSTPONED, UNTIL, ELSE, CONFIGURATION, CONSTANT, ARRAY, TRANSPORT, REJECT,
            INERTIAL, DISCONNECT, AFTER, PROCEDURE, FUNCTION, PACKAGE, TYPE, SUBTYPE, SIGNAL,
            VARIABLE, LABEL, LITERAL, UNITS, GROUP, FILE, EXIT, GENERATE, IF, GENERIC, MAP, THEN,
            ELSIF, RANGE, IN, BUS, WHILE, LOOP, OUT, INOUT, BUFFER, LINKAGE, NEXT, GUARDED, BODY,
            PACKAGE, PORT, PROCESS, RECORD, WITH, SELECT, ON, REGISTER, PURE, IMPURE, SHARED, WAIT,
            UNAFFECTED
    );

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new VHDLLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(STRING_LITERAL)) {
            return STRING_KEYS;
        } else if (tokenType.equals(BIT_STRING_LITERAL)) {
            return BIT_STRING_KEYS;
        } else if (tokenType.equals(OCT_STRING_LITERAL)) {
            return OCT_STRING_KEYS;
        } else if (tokenType.equals(HEX_STRING_LITERAL)) {
            return HEX_STRING_KEYS;
        } else if (tokenType.equals(CHARACTER_LITERAL)) {
            return CHARACTER_KEYS;
        } else if (tokenType.equals(DECIMAL_LITERAL) || tokenType.equals(BASED_LITERAL)) {
            return NUMBER_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else if (KEYWORDS.contains(tokenType)) {
            return KEYWORD_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
