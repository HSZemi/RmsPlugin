// This is a generated file. Not intended for manual editing.
package de.hszemi.rmsplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static de.hszemi.rmsplugin.psi.RmsTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class RmsParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == BLOCK_CONTENT) {
      r = block_content(b, 0);
    }
    else if (t == BRACKETS_COMMAND) {
      r = brackets_command(b, 0);
    }
    else if (t == COMMAND) {
      r = command(b, 0);
    }
    else if (t == FOUR_PARAMETER_COMMAND) {
      r = four_parameter_command(b, 0);
    }
    else if (t == HASHMACRO) {
      r = hashmacro(b, 0);
    }
    else if (t == HASHMACRO_NAME) {
      r = hashmacro_name(b, 0);
    }
    else if (t == HEADER) {
      r = header(b, 0);
    }
    else if (t == IF_BLOCK) {
      r = if_block(b, 0);
    }
    else if (t == INTEGER) {
      r = integer(b, 0);
    }
    else if (t == NO_PARAMETER_COMMAND) {
      r = no_parameter_command(b, 0);
    }
    else if (t == NON_BRACKETS_COMMAND_IN_BRACKETS) {
      r = non_brackets_command_in_brackets(b, 0);
    }
    else if (t == ONE_PARAMETER_COMMAND) {
      r = one_parameter_command(b, 0);
    }
    else if (t == PERCENT_CHANCE_BLOCK) {
      r = percent_chance_block(b, 0);
    }
    else if (t == PERCENT_CHANCE_COMMAND) {
      r = percent_chance_command(b, 0);
    }
    else if (t == RANDOM_BLOCK) {
      r = random_block(b, 0);
    }
    else if (t == RNDINT) {
      r = rndint(b, 0);
    }
    else if (t == SIMPLE_COMMAND) {
      r = simple_command(b, 0);
    }
    else if (t == THREE_PARAMETER_COMMAND) {
      r = three_parameter_command(b, 0);
    }
    else if (t == TWO_PARAMETER_COMMAND) {
      r = two_parameter_command(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return rmsFile(b, l + 1);
  }

  /* ********************************************************** */
  // command+
  public static boolean block_content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_content")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_CONTENT, "<block content>");
    r = command(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!command(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_content", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (if_block | one_parameter_command | no_parameter_command ) LEFT_BRACKET (non_brackets_command_in_brackets | CRLF)* RIGHT_BRACKET
  public static boolean brackets_command(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "brackets_command")) return false;
    if (!nextTokenIs(b, "<brackets command>", COMMAND_NAME, IF_STATEMENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BRACKETS_COMMAND, "<brackets command>");
    r = brackets_command_0(b, l + 1);
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && brackets_command_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // if_block | one_parameter_command | no_parameter_command
  private static boolean brackets_command_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "brackets_command_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_block(b, l + 1);
    if (!r) r = one_parameter_command(b, l + 1);
    if (!r) r = no_parameter_command(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (non_brackets_command_in_brackets | CRLF)*
  private static boolean brackets_command_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "brackets_command_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!brackets_command_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "brackets_command_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // non_brackets_command_in_brackets | CRLF
  private static boolean brackets_command_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "brackets_command_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = non_brackets_command_in_brackets(b, l + 1);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // hashmacro | brackets_command | non_brackets_command | header
  public static boolean command(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND, "<command>");
    r = hashmacro(b, l + 1);
    if (!r) r = brackets_command(b, l + 1);
    if (!r) r = non_brackets_command(b, l + 1);
    if (!r) r = header(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COMMAND_NAME (CONST_NAME|integer) (CONST_NAME|integer) (CONST_NAME|integer) (CONST_NAME|integer)
  public static boolean four_parameter_command(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "four_parameter_command")) return false;
    if (!nextTokenIs(b, COMMAND_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMAND_NAME);
    r = r && four_parameter_command_1(b, l + 1);
    r = r && four_parameter_command_2(b, l + 1);
    r = r && four_parameter_command_3(b, l + 1);
    r = r && four_parameter_command_4(b, l + 1);
    exit_section_(b, m, FOUR_PARAMETER_COMMAND, r);
    return r;
  }

  // CONST_NAME|integer
  private static boolean four_parameter_command_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "four_parameter_command_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST_NAME);
    if (!r) r = integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CONST_NAME|integer
  private static boolean four_parameter_command_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "four_parameter_command_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST_NAME);
    if (!r) r = integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CONST_NAME|integer
  private static boolean four_parameter_command_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "four_parameter_command_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST_NAME);
    if (!r) r = integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CONST_NAME|integer
  private static boolean four_parameter_command_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "four_parameter_command_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST_NAME);
    if (!r) r = integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_HASHMACRO hashmacro_name? integer?
  public static boolean hashmacro(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hashmacro")) return false;
    if (!nextTokenIs(b, KEYWORD_HASHMACRO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORD_HASHMACRO);
    r = r && hashmacro_1(b, l + 1);
    r = r && hashmacro_2(b, l + 1);
    exit_section_(b, m, HASHMACRO, r);
    return r;
  }

  // hashmacro_name?
  private static boolean hashmacro_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hashmacro_1")) return false;
    hashmacro_name(b, l + 1);
    return true;
  }

  // integer?
  private static boolean hashmacro_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hashmacro_2")) return false;
    integer(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // CONST_NAME | FILENAME
  public static boolean hashmacro_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hashmacro_name")) return false;
    if (!nextTokenIs(b, "<hashmacro name>", CONST_NAME, FILENAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HASHMACRO_NAME, "<hashmacro name>");
    r = consumeToken(b, CONST_NAME);
    if (!r) r = consumeToken(b, FILENAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // HEADER_PLAYER_SETUP | HEADER_LAND_GENERATION | HEADER_ELEVATION_GENERATION |
  //             HEADER_CLIFF_GENERATION | HEADER_TERRAIN_GENERATION | HEADER_CONNECTION_GENERATION | HEADER_OBJECTS_GENERATION
  public static boolean header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEADER, "<header>");
    r = consumeToken(b, HEADER_PLAYER_SETUP);
    if (!r) r = consumeToken(b, HEADER_LAND_GENERATION);
    if (!r) r = consumeToken(b, HEADER_ELEVATION_GENERATION);
    if (!r) r = consumeToken(b, HEADER_CLIFF_GENERATION);
    if (!r) r = consumeToken(b, HEADER_TERRAIN_GENERATION);
    if (!r) r = consumeToken(b, HEADER_CONNECTION_GENERATION);
    if (!r) r = consumeToken(b, HEADER_OBJECTS_GENERATION);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IF_STATEMENT CONST_NAME block_content? (ELSEIF_STATEMENT CONST_NAME block_content?)* (ELSE_STATEMENT block_content?)* ENDIF_STATEMENT
  public static boolean if_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_block")) return false;
    if (!nextTokenIs(b, IF_STATEMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF_STATEMENT, CONST_NAME);
    r = r && if_block_2(b, l + 1);
    r = r && if_block_3(b, l + 1);
    r = r && if_block_4(b, l + 1);
    r = r && consumeToken(b, ENDIF_STATEMENT);
    exit_section_(b, m, IF_BLOCK, r);
    return r;
  }

  // block_content?
  private static boolean if_block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_block_2")) return false;
    block_content(b, l + 1);
    return true;
  }

  // (ELSEIF_STATEMENT CONST_NAME block_content?)*
  private static boolean if_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_block_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!if_block_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_block_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ELSEIF_STATEMENT CONST_NAME block_content?
  private static boolean if_block_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_block_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ELSEIF_STATEMENT, CONST_NAME);
    r = r && if_block_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // block_content?
  private static boolean if_block_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_block_3_0_2")) return false;
    block_content(b, l + 1);
    return true;
  }

  // (ELSE_STATEMENT block_content?)*
  private static boolean if_block_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_block_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!if_block_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_block_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ELSE_STATEMENT block_content?
  private static boolean if_block_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_block_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE_STATEMENT);
    r = r && if_block_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // block_content?
  private static boolean if_block_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_block_4_0_1")) return false;
    block_content(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // INT | rndint
  public static boolean integer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer")) return false;
    if (!nextTokenIs(b, "<integer>", INT, RND)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER, "<integer>");
    r = consumeToken(b, INT);
    if (!r) r = rndint(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // command|COMMENT|CRLF
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = command(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COMMAND_NAME
  public static boolean no_parameter_command(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "no_parameter_command")) return false;
    if (!nextTokenIs(b, COMMAND_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMAND_NAME);
    exit_section_(b, m, NO_PARAMETER_COMMAND, r);
    return r;
  }

  /* ********************************************************** */
  // if_block | random_block | simple_command | COMMENT
  static boolean non_brackets_command(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "non_brackets_command")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = if_block(b, l + 1);
    if (!r) r = random_block(b, l + 1);
    if (!r) r = simple_command(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // non_brackets_command
  public static boolean non_brackets_command_in_brackets(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "non_brackets_command_in_brackets")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NON_BRACKETS_COMMAND_IN_BRACKETS, "<non brackets command in brackets>");
    r = non_brackets_command(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COMMAND_NAME (CONST_NAME|integer)
  public static boolean one_parameter_command(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "one_parameter_command")) return false;
    if (!nextTokenIs(b, COMMAND_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMAND_NAME);
    r = r && one_parameter_command_1(b, l + 1);
    exit_section_(b, m, ONE_PARAMETER_COMMAND, r);
    return r;
  }

  // CONST_NAME|integer
  private static boolean one_parameter_command_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "one_parameter_command_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST_NAME);
    if (!r) r = integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // percent_chance_command block_content?
  public static boolean percent_chance_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "percent_chance_block")) return false;
    if (!nextTokenIs(b, PERCENT_CHANCE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = percent_chance_command(b, l + 1);
    r = r && percent_chance_block_1(b, l + 1);
    exit_section_(b, m, PERCENT_CHANCE_BLOCK, r);
    return r;
  }

  // block_content?
  private static boolean percent_chance_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "percent_chance_block_1")) return false;
    block_content(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // PERCENT_CHANCE integer?
  public static boolean percent_chance_command(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "percent_chance_command")) return false;
    if (!nextTokenIs(b, PERCENT_CHANCE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERCENT_CHANCE);
    r = r && percent_chance_command_1(b, l + 1);
    exit_section_(b, m, PERCENT_CHANCE_COMMAND, r);
    return r;
  }

  // integer?
  private static boolean percent_chance_command_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "percent_chance_command_1")) return false;
    integer(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // START_RANDOM (percent_chance_block)* END_RANDOM
  public static boolean random_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "random_block")) return false;
    if (!nextTokenIs(b, START_RANDOM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, START_RANDOM);
    r = r && random_block_1(b, l + 1);
    r = r && consumeToken(b, END_RANDOM);
    exit_section_(b, m, RANDOM_BLOCK, r);
    return r;
  }

  // (percent_chance_block)*
  private static boolean random_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "random_block_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!random_block_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "random_block_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (percent_chance_block)
  private static boolean random_block_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "random_block_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = percent_chance_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean rmsFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rmsFile")) return false;
    int c = current_position_(b);
    while (true) {
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rmsFile", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // RND LEFT_PARENTHESIS INT COMMA INT RIGHT_PARENTHESIS
  public static boolean rndint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rndint")) return false;
    if (!nextTokenIs(b, RND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, RND, LEFT_PARENTHESIS, INT, COMMA, INT, RIGHT_PARENTHESIS);
    exit_section_(b, m, RNDINT, r);
    return r;
  }

  /* ********************************************************** */
  // four_parameter_command | three_parameter_command | two_parameter_command | one_parameter_command | no_parameter_command
  public static boolean simple_command(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_command")) return false;
    if (!nextTokenIs(b, COMMAND_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = four_parameter_command(b, l + 1);
    if (!r) r = three_parameter_command(b, l + 1);
    if (!r) r = two_parameter_command(b, l + 1);
    if (!r) r = one_parameter_command(b, l + 1);
    if (!r) r = no_parameter_command(b, l + 1);
    exit_section_(b, m, SIMPLE_COMMAND, r);
    return r;
  }

  /* ********************************************************** */
  // COMMAND_NAME (CONST_NAME|integer) (CONST_NAME|integer) (CONST_NAME|integer)
  public static boolean three_parameter_command(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "three_parameter_command")) return false;
    if (!nextTokenIs(b, COMMAND_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMAND_NAME);
    r = r && three_parameter_command_1(b, l + 1);
    r = r && three_parameter_command_2(b, l + 1);
    r = r && three_parameter_command_3(b, l + 1);
    exit_section_(b, m, THREE_PARAMETER_COMMAND, r);
    return r;
  }

  // CONST_NAME|integer
  private static boolean three_parameter_command_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "three_parameter_command_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST_NAME);
    if (!r) r = integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CONST_NAME|integer
  private static boolean three_parameter_command_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "three_parameter_command_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST_NAME);
    if (!r) r = integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CONST_NAME|integer
  private static boolean three_parameter_command_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "three_parameter_command_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST_NAME);
    if (!r) r = integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COMMAND_NAME (CONST_NAME|integer) (CONST_NAME|integer)
  public static boolean two_parameter_command(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "two_parameter_command")) return false;
    if (!nextTokenIs(b, COMMAND_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMAND_NAME);
    r = r && two_parameter_command_1(b, l + 1);
    r = r && two_parameter_command_2(b, l + 1);
    exit_section_(b, m, TWO_PARAMETER_COMMAND, r);
    return r;
  }

  // CONST_NAME|integer
  private static boolean two_parameter_command_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "two_parameter_command_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST_NAME);
    if (!r) r = integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CONST_NAME|integer
  private static boolean two_parameter_command_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "two_parameter_command_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST_NAME);
    if (!r) r = integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
