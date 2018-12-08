package com.abestanis.vhdl;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.abestanis.vhdl.psi.VHDLTypes.*;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;

%%

%class VHDLLexer
%implements FlexLexer
%unicode
%caseless
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R
WHITE_SPACE=[\ \t\f]
END_OF_LINE_COMMENT="--"[^\r\n]*
UPPER_CASE_LETTER=[A-Z] // | UC_A_Grave .. UC_O_Diaeresis | UC_O_Oblique_Stroke .. UC_Icelandic_Thorn
LOWER_CASE_LETTER=[a-z] // | LC_German_Sharp_S .. LC_O_Diaeresis | LC_O_Oblique_Stroke .. LC_Y_Diaeresis
LETTER=({UPPER_CASE_LETTER} | {LOWER_CASE_LETTER})
BASIC_GRAPHIC_CHARACTER=({UPPER_CASE_LETTER} | [0-9#&'()+,-./:;<=>\[\]_|*] | {WHITE_SPACE})
GRAPHIC_CHARACTER=({BASIC_GRAPHIC_CHARACTER} | {LOWER_CASE_LETTER} | [\!$%@?\\`\^{}~¡-¿×÷])
BASIC_IDENTIFIER={LETTER}(_?([0-9] | {LETTER}))*
INTEGER=[0-9](_?[0-9])*
BASED_INTEGER=[0-9A-Za-z](_?[0-9A-Za-z])*
EXPONENT_POS="e"\+?{INTEGER}
EXPONENT_NEG="e"-{INTEGER}
EXPONENT=({EXPONENT_POS}|{EXPONENT_NEG})
%state WAITING_VALUE

%%


<YYINITIAL> {
    {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return COMMENT; }
    \\({GRAPHIC_CHARACTER})+\\                                      { yybegin(YYINITIAL); return EXTENDED_IDENTIFIER; }
    b\"([01](_?[01])*)?\"                           { yybegin(YYINITIAL); return BIT_STRING_LITERAL; }
    o\"([0-8](_?[0-8])*)?\"                           { yybegin(YYINITIAL); return OCT_STRING_LITERAL; }
    x\"([0-9A-Fa-f](_?[0-9A-Fa-f])*)?\"                           { yybegin(YYINITIAL); return HEX_STRING_LITERAL; }
    \"({GRAPHIC_CHARACTER}|(\"\"))*\"                           { yybegin(YYINITIAL); return STRING_LITERAL; }
    \'({GRAPHIC_CHARACTER}|\")\'                           { yybegin(YYINITIAL); return CHARACTER_LITERAL; }
    {INTEGER}#{BASED_INTEGER}(\.{BASED_INTEGER})?#{EXPONENT}?                           { yybegin(YYINITIAL); return BASED_LITERAL; }
    {INTEGER}(\.{INTEGER})?{EXPONENT}?                           { yybegin(YYINITIAL); return DECIMAL_LITERAL; }

    "configuration"          { return CONFIGURATION; }
    "architecture"           { return ARCHITECTURE; }
    "disconnect"             { return DISCONNECT; }
    "unaffected"             { return UNAFFECTED; }
    "postponed"              { return POSTPONED; }
    "attribute"              { return ATTRIBUTE; }
    "component"              { return COMPONENT; }
    "transport"              { return TRANSPORT; }
    "procedure"              { return PROCEDURE; }
    "constant"               { return CONSTANT; }
    "severity"               { return SEVERITY; }
    "function"               { return FUNCTION; }
    "inertial"               { return INERTIAL; }
    "variable"               { return VARIABLE; }
    "generate"               { return GENERATE; }
    "register"               { return REGISTER; }
    "generic"                { return GENERIC; }
    "library"                { return LIBRARY; }
    "package"                { return PACKAGE; }
    "subtype"                { return SUBTYPE; }
    "literal"                { return LITERAL; }
    "linkage"                { return LINKAGE; }
    "guarded"                { return GUARDED; }
    "process"                { return PROCESS; }
    "access"                 { return ACCESS; }
    "others"                 { return OTHERS; }
    "entity"                 { return ENTITY; }
    "downto"                 { return DOWNTO; }
    "return"                 { return RETURN; }
    "assert"                 { return ASSERT; }
    "report"                 { return REPORT; }
    "reject"                 { return REJECT; }
    "record"                 { return RECORD; }
    "select"                 { return SELECT; }
    "impure"                 { return IMPURE; }
    "shared"                 { return SHARED; }
    "signal"                 { return SIGNAL; }
    "buffer"                 { return BUFFER; }
    "until"                  { return UNTIL; }
    "begin"                  { return BEGIN; }
    "alias"                  { return ALIAS; }
    "block"                  { return BLOCK; }
    "array"                  { return ARRAY; }
    "after"                  { return AFTER; }
    "label"                  { return LABEL; }
    "units"                  { return UNITS; }
    "elsif"                  { return ELSIF; }
    "range"                  { return RANGE; }
    "while"                  { return WHILE; }
    "inout"                  { return INOUT; }
    "group"                  { return GROUP; }
    "open"                   { return OPEN; }
    "nand"                   { return NAND; }
    "xnor"                   { return XNOR; }
    "null"                   { return NULL; }
    "case"                   { return CASE; }
    "when"                   { return WHEN; }
    "else"                   { return ELSE; }
    "type"                   { return TYPE; }
    "then"                   { return THEN; }
    "file"                   { return FILE; }
    "exit"                   { return EXIT; }
    "loop"                   { return LOOP; }
    "next"                   { return NEXT; }
    "body"                   { return BODY; }
    "port"                   { return PORT; }
    "with"                   { return WITH; }
    "pure"                   { return PURE; }
    "wait"                   { return WAIT; }
    "use"                    { return USE; }
    "new"                    { return NEW; }
    "all"                    { return ALL; }
    "end"                    { return END; }
    "and"                    { return AND; }
    "xor"                    { return XOR; }
    "nor"                    { return NOR; }
    "not"                    { return NOT; }
    "mod"                    { return MODULO; }
    "rem"                    { return REMAINDER; }
    "sll"                    { return SHIFT_LEFT; }
    "srl"                    { return SHIFT_RIGHT; }
    "sla"                    { return SHIFT_LEFT_A; }
    "sra"                    { return SHIFT_RIGHT_A; }
    "rol"                    { return ROTATE_LEFT; }
    "ror"                    { return ROTATE_RIGHT; }
    "abs"                    { return ABS; }
    "for"                    { return FOR; }
    "map"                    { return MAP; }
    "bus"                    { return BUS; }
    "out"                    { return OUT; }
    "is"                     { return IS; }
    "or"                     { return OR; }
    "to"                     { return TO; }
    "of"                     { return OF; }
    "if"                     { return IF; }
    "in"                     { return IN; }
    "on"                     { return ON; }
    "=>"                     { return CASE_THEN; }
    "/="                     { return NOT_EQUAL; }
    "<="                     { return EQUAL_LESS_THAN; }
    ">="                     { return EQUAL_MORE_THAN; }
    "<>"                     { return DIAMOND; }
    ":="                     { return ASSIGNMENT_OP; }
    "**"                     { return POW; }
    "*"                      { return MULTIPLY; }
    "/"                      { return DIVIDE; }
    "&"                      { return CONCAT; }
    "+"                      { return PLUS; }
    "-"                      { return MINUS; }
    "<"                      { return LESS_THAN; }
    ">"                      { return MORE_THAN; }
    "="                      { return EQUALS; }
    "'"                      { return SINGLE_QUOTE; }
    "\""                     { return DOUBLE_QUOTE; }
    "{"                      { return LEFT_BRACE; }
    "}"                      { return RIGHT_BRACE; }
    "["                      { return LEFT_BRACK; }
    "]"                      { return RIGHT_BRACK; }
    "("                      { return LEFT_PAREN; }
    ")"                      { return RIGHT_PAREN; }
    "|"                      { return VERTICAL_BAR; }
    ":"                      { return COLON; }
    ";"                      { return SEMICOLON; }
    ","                      { return COMMA; }
    "."                      { return POINT; }

    {BASIC_IDENTIFIER}                                      { yybegin(YYINITIAL); return BASIC_IDENTIFIER; }
}

({WHITE_SPACE} | {CRLF})+                              { yybegin(YYINITIAL); return WHITE_SPACE; }

[^]                                                         { return BAD_CHARACTER; }