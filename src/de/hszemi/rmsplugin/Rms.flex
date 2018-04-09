package de.hszemi.rmsplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import de.hszemi.rmsplugin.psi.RmsTypes;
import com.intellij.psi.TokenType;

%%

%class RmsLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R | \n | \r\n
WHITE_SPACE=[\ \n\t\f]
KEYWORD_HASHMACRO=#[a-z_]+
CONST_NAME=[A-Z_][A-Z_0-9]*
HASHMACRO_NAME=[A-Za-z_][a-z_0-9]*
FILENAME=[A-Za-z._][A-Za-z._0-9]*
COMMAND_NAME=[a-z_][a-z_0-9]*
INTEGER=-?[1-9][0-9]* | 0
HEADER_PLAYER_SETUP=<PLAYER_SETUP>
HEADER_LAND_GENERATION=<LAND_GENERATION>
HEADER_ELEVATION_GENERATION=<ELEVATION_GENERATION>
HEADER_CLIFF_GENERATION=<CLIFF_GENERATION>
HEADER_TERRAIN_GENERATION=<TERRAIN_GENERATION>
HEADER_CONNECTION_GENERATION=<CONNECTION_GENERATION>
HEADER_OBJECTS_GENERATION=<OBJECTS_GENERATION>
COMMAND_PLAYER_SETUP=CPS | {CRLF}
COMMAND_LAND_GENERATION=CLG | {CRLF}
COMMAND_ELEVATION_GENERATION=CEG | {CRLF}
COMMAND_CLIFF_GENERATION=CCG | {CRLF}
COMMAND_TERRAIN_GENERATION=CTG | {CRLF}
COMMAND_CONNECTION_GENERATION=CCNG | {CRLF}
COMMAND_OBJECTS_GENERATION=COG | {CRLF}

%{
    // This adds support for nested states. I'm no JFlex pro, so maybe this is overkill, but it works quite well.
    private final java.util.LinkedList<Integer> states = new java.util.LinkedList();

    private void yypushstate(int state) {
        states.addFirst(yystate());
        yybegin(state);
    }
    private void yypopstate() {
        final int state = states.removeFirst();
        yybegin(state);
    }
%}

%state WAITING_VALUE
%state IN_COMMENT
%state IN_HASHMACRO_EXPECT_NAME
%state IN_HASHMACRO_EXPECT_VALUE
%state IN_PLAYER_SETUP
%state IN_LAND_GENERATION
%state IN_ELEVATION_GENERATION
%state IN_CLIFF_GENERATION
%state IN_TERRAIN_GENERATION
%state IN_CONNECTION_GENERATION
%state IN_OBJECTS_GENERATION

%%

<YYINITIAL> {KEYWORD_HASHMACRO}                                 { yybegin(IN_HASHMACRO_EXPECT_NAME); return RmsTypes.KEYWORD_HASHMACRO; }
<IN_HASHMACRO_EXPECT_NAME> {CONST_NAME}                        { yybegin(IN_HASHMACRO_EXPECT_VALUE); return RmsTypes.CONST_NAME; }
<IN_HASHMACRO_EXPECT_NAME> {FILENAME}                        { yybegin(IN_HASHMACRO_EXPECT_VALUE); return RmsTypes.FILENAME; }
<IN_HASHMACRO_EXPECT_VALUE> {INTEGER}                       { yybegin(YYINITIAL); return RmsTypes.INTEGER; }

{HEADER_PLAYER_SETUP}                           { yybegin(IN_PLAYER_SETUP); return RmsTypes.HEADER_PLAYER_SETUP; }
{HEADER_LAND_GENERATION}                        { yybegin(IN_LAND_GENERATION); return RmsTypes.HEADER_LAND_GENERATION; }
{HEADER_ELEVATION_GENERATION}                   { yybegin(IN_ELEVATION_GENERATION); return RmsTypes.HEADER_ELEVATION_GENERATION; }
{HEADER_CLIFF_GENERATION}                       { yybegin(IN_CLIFF_GENERATION); return RmsTypes.HEADER_CLIFF_GENERATION; }
{HEADER_TERRAIN_GENERATION}                     { yybegin(IN_TERRAIN_GENERATION); return RmsTypes.HEADER_TERRAIN_GENERATION; }
{HEADER_CONNECTION_GENERATION}                  { yybegin(IN_CONNECTION_GENERATION); return RmsTypes.HEADER_CONNECTION_GENERATION; }
{HEADER_OBJECTS_GENERATION}                     { yybegin(IN_OBJECTS_GENERATION); return RmsTypes.HEADER_OBJECTS_GENERATION; }

<IN_PLAYER_SETUP> {
 {COMMAND_PLAYER_SETUP}{CRLF}                    { yybegin(IN_PLAYER_SETUP); return RmsTypes.COMMAND_PLAYER_SETUP; }
 {COMMAND_NAME}                                 { return RmsTypes.COMMAND_NAME; }
}
<IN_LAND_GENERATION> {
{COMMAND_LAND_GENERATION}{CRLF}              { yybegin(IN_LAND_GENERATION); return RmsTypes.COMMAND_LAND_GENERATION; }
 {COMMAND_NAME}                                 { return RmsTypes.COMMAND_NAME; }
}
<IN_ELEVATION_GENERATION>{
 {COMMAND_ELEVATION_GENERATION}{CRLF}    { yybegin(IN_ELEVATION_GENERATION); return RmsTypes.COMMAND_ELEVATION_GENERATION; }
 {COMMAND_NAME}                                 { return RmsTypes.COMMAND_NAME; }
}
<IN_CLIFF_GENERATION>{
 {COMMAND_CLIFF_GENERATION}{CRLF}            { yybegin(IN_CLIFF_GENERATION); return RmsTypes.COMMAND_CLIFF_GENERATION; }
 {COMMAND_NAME}                                 { return RmsTypes.COMMAND_NAME; }
}
<IN_TERRAIN_GENERATION>{
 {COMMAND_TERRAIN_GENERATION}{CRLF}        { yybegin(IN_TERRAIN_GENERATION); return RmsTypes.COMMAND_TERRAIN_GENERATION; }
 {COMMAND_NAME}                                 { return RmsTypes.COMMAND_NAME; }
}
<IN_CONNECTION_GENERATION>{
 {COMMAND_CONNECTION_GENERATION}{CRLF}  { yybegin(IN_CONNECTION_GENERATION); return RmsTypes.COMMAND_CONNECTION_GENERATION; }
 {COMMAND_NAME}                                 { return RmsTypes.COMMAND_NAME; }
}
<IN_OBJECTS_GENERATION>{
 {COMMAND_OBJECTS_GENERATION}{CRLF}        { yybegin(IN_OBJECTS_GENERATION); return RmsTypes.COMMAND_OBJECTS_GENERATION; }
 {COMMAND_NAME}                                 { return RmsTypes.COMMAND_NAME; }
}


 {CONST_NAME}                                 { return RmsTypes.CONST_NAME; }
 {INTEGER}                                    { return RmsTypes.INTEGER; }

"/*"                                            { yypushstate(IN_COMMENT); }

<IN_COMMENT> "*/"                                           { yypopstate(); return RmsTypes.COMMENT; }
<IN_COMMENT> [^*\n]+                                        {}
<IN_COMMENT> "*"                                            {}
<IN_COMMENT> \n                                             {}

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }


({CRLF}|{WHITE_SPACE})+                                     { return TokenType.WHITE_SPACE; }

.                                                           { return TokenType.BAD_CHARACTER; }
