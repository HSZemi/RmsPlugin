// This is a generated file. Not intended for manual editing.
package de.hszemi.rmsplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import de.hszemi.rmsplugin.impl.*;

public interface RmsTypes {

  IElementType BLOCK_CONTENT = new RmsElementType("BLOCK_CONTENT");
  IElementType BRACKETS_COMMAND = new RmsElementType("BRACKETS_COMMAND");
  IElementType COMMAND = new RmsElementType("COMMAND");
  IElementType FOUR_PARAMETER_COMMAND = new RmsElementType("FOUR_PARAMETER_COMMAND");
  IElementType HASHMACRO = new RmsElementType("HASHMACRO");
  IElementType HASHMACRO_NAME = new RmsElementType("HASHMACRO_NAME");
  IElementType HEADER = new RmsElementType("HEADER");
  IElementType IF_BLOCK = new RmsElementType("IF_BLOCK");
  IElementType INTEGER = new RmsElementType("INTEGER");
  IElementType NON_BRACKETS_COMMAND_IN_BRACKETS = new RmsElementType("NON_BRACKETS_COMMAND_IN_BRACKETS");
  IElementType NO_PARAMETER_COMMAND = new RmsElementType("NO_PARAMETER_COMMAND");
  IElementType ONE_PARAMETER_COMMAND = new RmsElementType("ONE_PARAMETER_COMMAND");
  IElementType PERCENT_CHANCE_BLOCK = new RmsElementType("PERCENT_CHANCE_BLOCK");
  IElementType PERCENT_CHANCE_COMMAND = new RmsElementType("PERCENT_CHANCE_COMMAND");
  IElementType RANDOM_BLOCK = new RmsElementType("RANDOM_BLOCK");
  IElementType RNDINT = new RmsElementType("RNDINT");
  IElementType SIMPLE_COMMAND = new RmsElementType("SIMPLE_COMMAND");
  IElementType THREE_PARAMETER_COMMAND = new RmsElementType("THREE_PARAMETER_COMMAND");
  IElementType TWO_PARAMETER_COMMAND = new RmsElementType("TWO_PARAMETER_COMMAND");

  IElementType COMMA = new RmsTokenType("COMMA");
  IElementType COMMAND_NAME = new RmsTokenType("COMMAND_NAME");
  IElementType COMMENT = new RmsTokenType("COMMENT");
  IElementType CONST_NAME = new RmsTokenType("CONST_NAME");
  IElementType CRLF = new RmsTokenType("CRLF");
  IElementType ELSEIF_STATEMENT = new RmsTokenType("ELSEIF_STATEMENT");
  IElementType ELSE_STATEMENT = new RmsTokenType("ELSE_STATEMENT");
  IElementType ENDIF_STATEMENT = new RmsTokenType("ENDIF_STATEMENT");
  IElementType END_RANDOM = new RmsTokenType("END_RANDOM");
  IElementType FILENAME = new RmsTokenType("FILENAME");
  IElementType HEADER_CLIFF_GENERATION = new RmsTokenType("HEADER_CLIFF_GENERATION");
  IElementType HEADER_CONNECTION_GENERATION = new RmsTokenType("HEADER_CONNECTION_GENERATION");
  IElementType HEADER_ELEVATION_GENERATION = new RmsTokenType("HEADER_ELEVATION_GENERATION");
  IElementType HEADER_LAND_GENERATION = new RmsTokenType("HEADER_LAND_GENERATION");
  IElementType HEADER_OBJECTS_GENERATION = new RmsTokenType("HEADER_OBJECTS_GENERATION");
  IElementType HEADER_PLAYER_SETUP = new RmsTokenType("HEADER_PLAYER_SETUP");
  IElementType HEADER_TERRAIN_GENERATION = new RmsTokenType("HEADER_TERRAIN_GENERATION");
  IElementType IF_STATEMENT = new RmsTokenType("IF_STATEMENT");
  IElementType INT = new RmsTokenType("INT");
  IElementType KEYWORD_HASHMACRO = new RmsTokenType("KEYWORD_HASHMACRO");
  IElementType LEFT_BRACKET = new RmsTokenType("LEFT_BRACKET");
  IElementType LEFT_PARENTHESIS = new RmsTokenType("LEFT_PARENTHESIS");
  IElementType PERCENT_CHANCE = new RmsTokenType("PERCENT_CHANCE");
  IElementType RIGHT_BRACKET = new RmsTokenType("RIGHT_BRACKET");
  IElementType RIGHT_PARENTHESIS = new RmsTokenType("RIGHT_PARENTHESIS");
  IElementType RND = new RmsTokenType("RND");
  IElementType START_RANDOM = new RmsTokenType("START_RANDOM");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == BLOCK_CONTENT) {
        return new RmsBlockContentImpl(node);
      }
      else if (type == BRACKETS_COMMAND) {
        return new RmsBracketsCommandImpl(node);
      }
      else if (type == COMMAND) {
        return new RmsCommandImpl(node);
      }
      else if (type == FOUR_PARAMETER_COMMAND) {
        return new RmsFourParameterCommandImpl(node);
      }
      else if (type == HASHMACRO) {
        return new RmsHashmacroImpl(node);
      }
      else if (type == HASHMACRO_NAME) {
        return new RmsHashmacroNameImpl(node);
      }
      else if (type == HEADER) {
        return new RmsHeaderImpl(node);
      }
      else if (type == IF_BLOCK) {
        return new RmsIfBlockImpl(node);
      }
      else if (type == INTEGER) {
        return new RmsIntegerImpl(node);
      }
      else if (type == NON_BRACKETS_COMMAND_IN_BRACKETS) {
        return new RmsNonBracketsCommandInBracketsImpl(node);
      }
      else if (type == NO_PARAMETER_COMMAND) {
        return new RmsNoParameterCommandImpl(node);
      }
      else if (type == ONE_PARAMETER_COMMAND) {
        return new RmsOneParameterCommandImpl(node);
      }
      else if (type == PERCENT_CHANCE_BLOCK) {
        return new RmsPercentChanceBlockImpl(node);
      }
      else if (type == PERCENT_CHANCE_COMMAND) {
        return new RmsPercentChanceCommandImpl(node);
      }
      else if (type == RANDOM_BLOCK) {
        return new RmsRandomBlockImpl(node);
      }
      else if (type == RNDINT) {
        return new RmsRndintImpl(node);
      }
      else if (type == SIMPLE_COMMAND) {
        return new RmsSimpleCommandImpl(node);
      }
      else if (type == THREE_PARAMETER_COMMAND) {
        return new RmsThreeParameterCommandImpl(node);
      }
      else if (type == TWO_PARAMETER_COMMAND) {
        return new RmsTwoParameterCommandImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
