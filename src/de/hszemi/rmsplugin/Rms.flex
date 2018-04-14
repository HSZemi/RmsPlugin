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
FILENAME=[A-Za-z._][A-Za-z._0-9]*
COMMAND_NAME=[a-z_][a-z_0-9]*
INT=-?[1-9][0-9]* | 0
LEFT_BRACKET=\{
RIGHT_BRACKET=\}
START_RANDOM=start_random
END_RANDOM=end_random
PERCENT_CHANCE=percent_chance
IF_STATEMENT=if
ELSEIF_STATEMENT=elseif
ELSE_STATEMENT=else
ENDIF_STATEMENT=endif
HEADER_PLAYER_SETUP=<PLAYER_SETUP>
HEADER_LAND_GENERATION=<LAND_GENERATION>
HEADER_ELEVATION_GENERATION=<ELEVATION_GENERATION>
HEADER_CLIFF_GENERATION=<CLIFF_GENERATION>
HEADER_TERRAIN_GENERATION=<TERRAIN_GENERATION>
HEADER_CONNECTION_GENERATION=<CONNECTION_GENERATION>
HEADER_OBJECTS_GENERATION=<OBJECTS_GENERATION>
RND=rnd
LEFT_PARENTHESIS=\(
RIGHT_PARENTHESIS=\)
COMMA=,

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
%state IN_PLAYER_SETUP
%state IN_LAND_GENERATION
%state IN_ELEVATION_GENERATION
%state IN_CLIFF_GENERATION
%state IN_TERRAIN_GENERATION
%state IN_CONNECTION_GENERATION
%state IN_OBJECTS_GENERATION

%%

"/*"                                            { yypushstate(IN_COMMENT); }

<IN_COMMENT> "*/"                                           { yypopstate(); return RmsTypes.COMMENT; }
<IN_COMMENT> [^*\n]+                                        {}
<IN_COMMENT> "*"                                            {}
<IN_COMMENT> \n                                             {}


{HEADER_PLAYER_SETUP}                           { yybegin(IN_PLAYER_SETUP); return RmsTypes.HEADER_PLAYER_SETUP; }
{HEADER_LAND_GENERATION}                        { yybegin(IN_LAND_GENERATION); return RmsTypes.HEADER_LAND_GENERATION; }
{HEADER_ELEVATION_GENERATION}                   { yybegin(IN_ELEVATION_GENERATION); return RmsTypes.HEADER_ELEVATION_GENERATION; }
{HEADER_CLIFF_GENERATION}                       { yybegin(IN_CLIFF_GENERATION); return RmsTypes.HEADER_CLIFF_GENERATION; }
{HEADER_TERRAIN_GENERATION}                     { yybegin(IN_TERRAIN_GENERATION); return RmsTypes.HEADER_TERRAIN_GENERATION; }
{HEADER_CONNECTION_GENERATION}                  { yybegin(IN_CONNECTION_GENERATION); return RmsTypes.HEADER_CONNECTION_GENERATION; }
{HEADER_OBJECTS_GENERATION}                     { yybegin(IN_OBJECTS_GENERATION); return RmsTypes.HEADER_OBJECTS_GENERATION; }

{LEFT_BRACKET}                                   { return RmsTypes.LEFT_BRACKET; }
{RIGHT_BRACKET}                                  { return RmsTypes.RIGHT_BRACKET; }
{LEFT_PARENTHESIS}                                   { return RmsTypes.LEFT_PARENTHESIS; }
{RIGHT_PARENTHESIS}                                  { return RmsTypes.RIGHT_PARENTHESIS; }
{COMMA}                                             { return RmsTypes.COMMA; }
{RND}                                             { return RmsTypes.RND; }
{START_RANDOM}                                   { return RmsTypes.START_RANDOM; }
{END_RANDOM}                                     { return RmsTypes.END_RANDOM; }
{PERCENT_CHANCE}                                     { return RmsTypes.PERCENT_CHANCE; }
{IF_STATEMENT}                                     { return RmsTypes.IF_STATEMENT; }
{ELSEIF_STATEMENT}                                     { return RmsTypes.ELSEIF_STATEMENT; }
{ELSE_STATEMENT}                                     { return RmsTypes.ELSE_STATEMENT; }
{ENDIF_STATEMENT}                                     { return RmsTypes.ENDIF_STATEMENT; }

<IN_PLAYER_SETUP> {
 {COMMAND_NAME}                                 { return RmsTypes.COMMAND_NAME; }
}
<IN_LAND_GENERATION> {
 {COMMAND_NAME}                                 { return RmsTypes.COMMAND_NAME; }
}
<IN_ELEVATION_GENERATION>{
 {COMMAND_NAME}                                 { return RmsTypes.COMMAND_NAME; }
}
<IN_CLIFF_GENERATION>{
 {COMMAND_NAME}                                 { return RmsTypes.COMMAND_NAME; }
}
<IN_TERRAIN_GENERATION>{
 {COMMAND_NAME}                                 { return RmsTypes.COMMAND_NAME; }
}
<IN_CONNECTION_GENERATION>{
 {COMMAND_NAME}                                 { return RmsTypes.COMMAND_NAME; }
}
<IN_OBJECTS_GENERATION>{
 {COMMAND_NAME}                                 { return RmsTypes.COMMAND_NAME; }
}


{CONST_NAME}                                    { return RmsTypes.CONST_NAME; }
{KEYWORD_HASHMACRO}                             { return RmsTypes.KEYWORD_HASHMACRO; }
{FILENAME}                                      { return RmsTypes.FILENAME; }
{INT}                                       { return RmsTypes.INT; }



<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }


({CRLF}|{WHITE_SPACE})+                                     { return TokenType.WHITE_SPACE; }

.                                                           { return TokenType.BAD_CHARACTER; }
