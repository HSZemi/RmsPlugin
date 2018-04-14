/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package de.hszemi.rmsplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import de.hszemi.rmsplugin.psi.RmsTypes;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Rms.flex</tt>
 */
class RmsLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int WAITING_VALUE = 2;
  public static final int IN_COMMENT = 4;
  public static final int IN_PLAYER_SETUP = 6;
  public static final int IN_LAND_GENERATION = 8;
  public static final int IN_ELEVATION_GENERATION = 10;
  public static final int IN_CLIFF_GENERATION = 12;
  public static final int IN_TERRAIN_GENERATION = 14;
  public static final int IN_CONNECTION_GENERATION = 16;
  public static final int IN_OBJECTS_GENERATION = 18;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3, 
     3,  3,  3, 3
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\1\1\1\4\1\1\22\0\1\3\2\0\1\5\4\0\1\63\1\64\1\67\1\0\1\65\1\13"+
    "\1\12\1\66\1\11\11\14\2\0\1\36\1\0\1\50\2\0\1\41\1\61\1\57\1\52\1\43\1\60"+
    "\1\53\1\7\1\54\1\62\1\7\1\40\1\7\1\51\1\55\1\37\1\7\1\44\1\45\1\46\1\47\1"+
    "\56\2\7\1\42\1\7\4\0\1\10\1\0\1\21\1\6\1\31\1\24\1\27\1\34\1\6\1\32\1\33\2"+
    "\6\1\35\1\26\1\23\1\25\1\30\1\6\1\22\1\17\1\20\6\6\1\15\1\0\1\16\7\0\1\1\242"+
    "\0\2\1\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\2\1\1\1\3\1\4\1\5\1\1"+
    "\1\5\1\6\1\7\5\3\1\1\1\10\1\11\1\12"+
    "\1\1\1\2\2\13\5\14\7\15\1\16\5\3\1\17"+
    "\6\0\1\20\1\21\1\22\5\15\1\17\1\3\1\23"+
    "\3\3\7\0\1\15\1\23\3\15\3\3\1\24\1\3"+
    "\7\0\3\15\1\24\1\15\2\3\1\25\2\3\7\0"+
    "\2\15\1\25\2\15\2\3\1\26\1\3\7\0\2\15"+
    "\1\26\1\15\3\3\7\0\3\15\3\3\7\0\3\15"+
    "\3\3\7\0\3\15\1\3\1\27\1\3\7\0\1\15"+
    "\1\27\1\15\2\3\7\0\2\15\1\30\1\3\7\0"+
    "\1\30\1\15\1\3\7\0\1\15\1\31\1\32\6\0"+
    "\1\31\14\0\1\33\10\0\1\34\6\0\1\35\1\36"+
    "\3\0\1\37\1\0\1\40";

  private static int [] zzUnpackAction() {
    int [] result = new int[255];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\70\0\160\0\250\0\340\0\u0118\0\u0150\0\u0188"+
    "\0\u01c0\0\340\0\u01f8\0\u0230\0\340\0\340\0\u0268\0\u02a0"+
    "\0\u02d8\0\u0310\0\u0348\0\u0380\0\340\0\340\0\340\0\u03b8"+
    "\0\u03f0\0\u03f0\0\u0428\0\u0460\0\u0498\0\u0118\0\u04d0\0\u0508"+
    "\0\u0540\0\u0578\0\u05b0\0\u05e8\0\u0620\0\u0658\0\u0690\0\u0150"+
    "\0\u06c8\0\u0700\0\u0738\0\u0770\0\u07a8\0\u0188\0\u07e0\0\u0818"+
    "\0\u0850\0\u0888\0\u08c0\0\u08f8\0\340\0\u03f0\0\340\0\u0930"+
    "\0\u0968\0\u09a0\0\u09d8\0\u0a10\0\u0540\0\u0a48\0\u0188\0\u0a80"+
    "\0\u0ab8\0\u0af0\0\u0b28\0\u0b60\0\u0b98\0\u0bd0\0\u0c08\0\u0c40"+
    "\0\u0c78\0\u0cb0\0\u0540\0\u0ce8\0\u0d20\0\u0d58\0\u0d90\0\u0dc8"+
    "\0\u0e00\0\u0e38\0\u0e70\0\u0ea8\0\u0ee0\0\u0f18\0\u0f50\0\u0f88"+
    "\0\u0fc0\0\u0ff8\0\u1030\0\u1068\0\u10a0\0\u10d8\0\u1110\0\u1148"+
    "\0\u1180\0\u0188\0\u11b8\0\u11f0\0\u1228\0\u1260\0\u1298\0\u12d0"+
    "\0\u1308\0\u1340\0\u1378\0\u13b0\0\u13e8\0\u0540\0\u1420\0\u1458"+
    "\0\u1490\0\u14c8\0\u0188\0\u1500\0\u1538\0\u1570\0\u15a8\0\u15e0"+
    "\0\u1618\0\u1650\0\u1688\0\u16c0\0\u16f8\0\u0540\0\u1730\0\u1768"+
    "\0\u17a0\0\u17d8\0\u1810\0\u1848\0\u1880\0\u18b8\0\u18f0\0\u1928"+
    "\0\u1960\0\u1998\0\u19d0\0\u1a08\0\u1a40\0\u1a78\0\u1ab0\0\u1ae8"+
    "\0\u1b20\0\u1b58\0\u1b90\0\u1bc8\0\u1c00\0\u1c38\0\u1c70\0\u1ca8"+
    "\0\u1ce0\0\u1d18\0\u1d50\0\u1d88\0\u1dc0\0\u1df8\0\u1e30\0\u1e68"+
    "\0\u1ea0\0\u1ed8\0\u1f10\0\u1f48\0\u1f80\0\u1fb8\0\u1ff0\0\u0188"+
    "\0\u2028\0\u2060\0\u2098\0\u20d0\0\u2108\0\u2140\0\u2178\0\u21b0"+
    "\0\u21e8\0\u0540\0\u2220\0\u2258\0\u2290\0\u22c8\0\u2300\0\u2338"+
    "\0\u2370\0\u23a8\0\u23e0\0\u2418\0\u2450\0\u2488\0\u0188\0\u24c0"+
    "\0\u24f8\0\u2530\0\u2568\0\u25a0\0\u25d8\0\u2610\0\u2648\0\u0540"+
    "\0\u2680\0\u26b8\0\u26f0\0\u2728\0\u2760\0\u2798\0\u27d0\0\u2808"+
    "\0\u2840\0\u2878\0\u0188\0\340\0\u28b0\0\u28e8\0\u2920\0\u2958"+
    "\0\u2990\0\u29c8\0\u0540\0\u2a00\0\u2a38\0\u2a70\0\u2aa8\0\u2ae0"+
    "\0\u2b18\0\u2b50\0\u2b88\0\u2bc0\0\u2bf8\0\u2c30\0\u2c68\0\340"+
    "\0\u2ca0\0\u2cd8\0\u2d10\0\u2d48\0\u2d80\0\u2db8\0\u2df0\0\u2e28"+
    "\0\340\0\u2e60\0\u2e98\0\u2ed0\0\u2f08\0\u2f40\0\u2f78\0\340"+
    "\0\340\0\u2fb0\0\u2fe8\0\u3020\0\340\0\u3058\0\340";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[255];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\4\6\1\7\1\10\2\11\1\12\1\10\1\13"+
    "\1\14\1\15\1\16\1\17\2\10\1\20\4\10\1\21"+
    "\1\22\2\10\1\23\2\10\1\24\11\11\1\5\12\11"+
    "\1\25\1\26\1\27\1\30\2\5\1\31\1\32\1\33"+
    "\1\32\1\7\1\10\2\11\1\12\1\10\1\13\1\14"+
    "\1\15\1\16\1\17\2\10\1\20\4\10\1\21\1\22"+
    "\2\10\1\23\2\10\1\24\11\11\1\5\12\11\1\25"+
    "\1\26\1\27\1\30\1\5\1\34\1\35\1\36\2\35"+
    "\61\34\1\37\1\40\1\5\4\6\1\7\1\41\1\11"+
    "\1\42\1\12\1\10\1\13\1\14\1\15\1\16\1\43"+
    "\2\41\1\44\4\41\1\45\1\46\2\41\1\47\2\41"+
    "\1\24\11\11\1\5\12\11\1\25\1\26\1\27\1\30"+
    "\1\5\71\0\4\6\71\0\1\50\1\0\1\50\6\0"+
    "\17\50\40\0\5\10\1\0\1\10\2\0\17\10\1\0"+
    "\11\10\1\0\12\10\13\0\1\10\3\11\1\10\1\0"+
    "\1\11\2\0\17\10\1\0\11\11\1\0\12\11\21\0"+
    "\1\14\64\0\1\14\2\0\1\14\61\0\5\10\1\0"+
    "\1\10\2\0\1\10\1\51\15\10\1\0\11\10\1\0"+
    "\12\10\13\0\5\10\1\0\1\10\2\0\4\10\1\52"+
    "\12\10\1\0\11\10\1\0\12\10\13\0\5\10\1\0"+
    "\1\10\2\0\4\10\1\53\11\10\1\54\1\0\11\10"+
    "\1\0\12\10\13\0\5\10\1\0\1\10\2\0\10\10"+
    "\1\55\6\10\1\0\11\10\1\0\12\10\13\0\5\10"+
    "\1\0\1\10\2\0\15\10\1\56\1\10\1\0\11\10"+
    "\1\0\12\10\44\0\1\57\1\60\2\0\1\61\2\0"+
    "\1\62\6\0\1\63\1\0\1\64\77\0\1\65\1\0"+
    "\4\66\64\0\1\6\3\33\63\0\2\34\1\0\64\34"+
    "\1\0\1\34\1\35\1\6\2\35\62\34\1\0\2\34"+
    "\1\0\64\34\1\65\66\0\1\67\7\0\1\41\1\10"+
    "\2\41\1\10\1\0\1\41\2\0\17\41\1\0\11\10"+
    "\1\0\12\10\13\0\1\41\1\11\2\42\1\10\1\0"+
    "\1\42\2\0\17\41\1\0\11\11\1\0\12\11\13\0"+
    "\1\41\1\10\2\41\1\10\1\0\1\41\2\0\1\41"+
    "\1\70\15\41\1\0\11\10\1\0\12\10\13\0\1\41"+
    "\1\10\2\41\1\10\1\0\1\41\2\0\4\41\1\71"+
    "\12\41\1\0\11\10\1\0\12\10\13\0\1\41\1\10"+
    "\2\41\1\10\1\0\1\41\2\0\4\41\1\72\11\41"+
    "\1\73\1\0\11\10\1\0\12\10\13\0\1\41\1\10"+
    "\2\41\1\10\1\0\1\41\2\0\10\41\1\74\6\41"+
    "\1\0\11\10\1\0\12\10\13\0\1\41\1\10\2\41"+
    "\1\10\1\0\1\41\2\0\15\41\1\75\1\41\1\0"+
    "\11\10\1\0\12\10\13\0\5\10\1\0\1\10\2\0"+
    "\2\10\1\76\14\10\1\0\11\10\1\0\12\10\13\0"+
    "\5\10\1\0\1\10\2\0\5\10\1\77\11\10\1\0"+
    "\11\10\1\0\12\10\13\0\5\10\1\0\1\10\2\0"+
    "\5\10\1\100\11\10\1\0\11\10\1\0\12\10\13\0"+
    "\5\10\1\0\1\10\2\0\1\101\16\10\1\0\11\10"+
    "\1\0\12\10\13\0\5\10\1\0\1\10\2\0\3\10"+
    "\1\102\13\10\1\0\11\10\1\0\12\10\45\0\1\103"+
    "\70\0\1\104\66\0\1\105\72\0\1\106\105\0\1\107"+
    "\46\0\1\110\14\0\1\111\20\0\1\41\1\10\2\41"+
    "\1\10\1\0\1\41\2\0\2\41\1\112\14\41\1\0"+
    "\11\10\1\0\12\10\13\0\1\41\1\10\2\41\1\10"+
    "\1\0\1\41\2\0\5\41\1\113\11\41\1\0\11\10"+
    "\1\0\12\10\13\0\1\41\1\10\2\41\1\10\1\0"+
    "\1\41\2\0\5\41\1\114\11\41\1\0\11\10\1\0"+
    "\12\10\13\0\1\41\1\10\2\41\1\10\1\0\1\41"+
    "\2\0\1\115\16\41\1\0\11\10\1\0\12\10\13\0"+
    "\1\41\1\10\2\41\1\10\1\0\1\41\2\0\3\41"+
    "\1\116\13\41\1\0\11\10\1\0\12\10\13\0\5\10"+
    "\1\0\1\10\2\0\3\10\1\117\13\10\1\0\11\10"+
    "\1\0\12\10\13\0\2\10\1\120\2\10\1\0\1\10"+
    "\2\0\14\10\1\121\2\10\1\0\11\10\1\0\12\10"+
    "\13\0\5\10\1\0\1\10\2\0\10\10\1\122\6\10"+
    "\1\0\11\10\1\0\12\10\13\0\5\10\1\0\1\10"+
    "\2\0\12\10\1\123\4\10\1\0\11\10\1\0\12\10"+
    "\46\0\1\124\77\0\1\125\61\0\1\126\70\0\1\127"+
    "\105\0\1\130\61\0\1\131\64\0\1\132\24\0\1\41"+
    "\1\10\2\41\1\10\1\0\1\41\2\0\3\41\1\133"+
    "\13\41\1\0\11\10\1\0\12\10\13\0\1\41\1\10"+
    "\1\134\1\41\1\10\1\0\1\41\2\0\14\41\1\135"+
    "\2\41\1\0\11\10\1\0\12\10\13\0\1\41\1\10"+
    "\2\41\1\10\1\0\1\41\2\0\10\41\1\136\6\41"+
    "\1\0\11\10\1\0\12\10\13\0\1\41\1\10\2\41"+
    "\1\10\1\0\1\41\2\0\12\41\1\137\4\41\1\0"+
    "\11\10\1\0\12\10\13\0\5\10\1\0\1\10\2\0"+
    "\1\10\1\140\15\10\1\0\11\10\1\0\12\10\13\0"+
    "\5\10\1\0\1\10\2\0\3\10\1\141\13\10\1\0"+
    "\11\10\1\0\12\10\13\0\5\10\1\0\1\10\2\0"+
    "\15\10\1\142\1\10\1\0\11\10\1\0\12\10\13\0"+
    "\5\10\1\0\1\10\2\0\14\10\1\143\2\10\1\0"+
    "\11\10\1\0\12\10\13\0\5\10\1\0\1\10\2\0"+
    "\10\10\1\144\6\10\1\0\11\10\1\0\12\10\47\0"+
    "\1\145\77\0\1\146\73\0\1\147\55\0\1\150\66\0"+
    "\1\151\104\0\1\152\60\0\1\153\24\0\1\41\1\10"+
    "\2\41\1\10\1\0\1\41\2\0\1\41\1\154\15\41"+
    "\1\0\11\10\1\0\12\10\13\0\1\41\1\10\2\41"+
    "\1\10\1\0\1\41\2\0\3\41\1\155\13\41\1\0"+
    "\11\10\1\0\12\10\13\0\1\41\1\10\2\41\1\10"+
    "\1\0\1\41\2\0\15\41\1\156\1\41\1\0\11\10"+
    "\1\0\12\10\13\0\1\41\1\10\2\41\1\10\1\0"+
    "\1\41\2\0\14\41\1\157\2\41\1\0\11\10\1\0"+
    "\12\10\13\0\1\41\1\10\2\41\1\10\1\0\1\41"+
    "\2\0\10\41\1\160\6\41\1\0\11\10\1\0\12\10"+
    "\13\0\2\10\1\161\2\10\1\0\1\10\2\0\17\10"+
    "\1\0\11\10\1\0\12\10\13\0\5\10\1\0\1\10"+
    "\2\0\2\10\1\162\14\10\1\0\11\10\1\0\12\10"+
    "\13\0\5\10\1\0\1\10\2\0\15\10\1\163\1\10"+
    "\1\0\11\10\1\0\12\10\13\0\5\10\1\0\1\10"+
    "\2\0\4\10\1\164\12\10\1\0\11\10\1\0\12\10"+
    "\50\0\1\165\34\0\1\166\120\0\1\167\67\0\1\170"+
    "\105\0\1\171\70\0\1\172\52\0\1\173\32\0\1\41"+
    "\1\10\1\174\1\41\1\10\1\0\1\41\2\0\17\41"+
    "\1\0\11\10\1\0\12\10\13\0\1\41\1\10\2\41"+
    "\1\10\1\0\1\41\2\0\2\41\1\175\14\41\1\0"+
    "\11\10\1\0\12\10\13\0\1\41\1\10\2\41\1\10"+
    "\1\0\1\41\2\0\15\41\1\176\1\41\1\0\11\10"+
    "\1\0\12\10\13\0\1\41\1\10\2\41\1\10\1\0"+
    "\1\41\2\0\4\41\1\177\12\41\1\0\11\10\1\0"+
    "\12\10\13\0\5\10\1\0\1\10\2\0\3\10\1\200"+
    "\13\10\1\0\11\10\1\0\12\10\13\0\5\10\1\0"+
    "\1\10\2\0\4\10\1\201\12\10\1\0\11\10\1\0"+
    "\12\10\13\0\5\10\1\0\1\10\2\0\1\10\1\202"+
    "\15\10\1\0\11\10\1\0\12\10\51\0\1\203\76\0"+
    "\1\204\62\0\1\205\75\0\1\206\61\0\1\207\31\0"+
    "\1\210\136\0\1\211\16\0\1\41\1\10\2\41\1\10"+
    "\1\0\1\41\2\0\3\41\1\212\13\41\1\0\11\10"+
    "\1\0\12\10\13\0\1\41\1\10\2\41\1\10\1\0"+
    "\1\41\2\0\4\41\1\213\12\41\1\0\11\10\1\0"+
    "\12\10\13\0\1\41\1\10\2\41\1\10\1\0\1\41"+
    "\2\0\1\41\1\214\15\41\1\0\11\10\1\0\12\10"+
    "\13\0\5\10\1\0\1\10\2\0\2\10\1\215\14\10"+
    "\1\0\11\10\1\0\12\10\13\0\5\10\1\0\1\10"+
    "\2\0\5\10\1\216\11\10\1\0\11\10\1\0\12\10"+
    "\13\0\2\10\1\217\2\10\1\0\1\10\2\0\17\10"+
    "\1\0\11\10\1\0\12\10\15\0\1\220\122\0\1\221"+
    "\100\0\1\222\64\0\1\223\63\0\1\224\75\0\1\225"+
    "\62\0\1\226\27\0\1\41\1\10\2\41\1\10\1\0"+
    "\1\41\2\0\2\41\1\227\14\41\1\0\11\10\1\0"+
    "\12\10\13\0\1\41\1\10\2\41\1\10\1\0\1\41"+
    "\2\0\5\41\1\230\11\41\1\0\11\10\1\0\12\10"+
    "\13\0\1\41\1\10\1\231\1\41\1\10\1\0\1\41"+
    "\2\0\17\41\1\0\11\10\1\0\12\10\13\0\5\10"+
    "\1\0\1\10\2\0\4\10\1\232\12\10\1\0\11\10"+
    "\1\0\12\10\13\0\5\10\1\0\1\10\2\0\6\10"+
    "\1\233\10\10\1\0\11\10\1\0\12\10\13\0\5\10"+
    "\1\0\1\10\2\0\12\10\1\234\4\10\1\0\11\10"+
    "\1\0\12\10\52\0\1\235\73\0\1\236\73\0\1\237"+
    "\22\0\1\240\67\0\1\241\122\0\1\242\100\0\1\243"+
    "\21\0\1\41\1\10\2\41\1\10\1\0\1\41\2\0"+
    "\4\41\1\244\12\41\1\0\11\10\1\0\12\10\13\0"+
    "\1\41\1\10\2\41\1\10\1\0\1\41\2\0\6\41"+
    "\1\245\10\41\1\0\11\10\1\0\12\10\13\0\1\41"+
    "\1\10\2\41\1\10\1\0\1\41\2\0\12\41\1\246"+
    "\4\41\1\0\11\10\1\0\12\10\13\0\5\10\1\0"+
    "\1\10\2\0\5\10\1\247\11\10\1\0\11\10\1\0"+
    "\12\10\13\0\5\10\1\0\1\10\2\0\7\10\1\250"+
    "\7\10\1\0\11\10\1\0\12\10\13\0\5\10\1\0"+
    "\1\10\2\0\13\10\1\251\3\10\1\0\11\10\1\0"+
    "\12\10\50\0\1\252\67\0\1\253\75\0\1\254\71\0"+
    "\1\255\67\0\1\256\65\0\1\257\73\0\1\260\20\0"+
    "\1\41\1\10\2\41\1\10\1\0\1\41\2\0\5\41"+
    "\1\261\11\41\1\0\11\10\1\0\12\10\13\0\1\41"+
    "\1\10\2\41\1\10\1\0\1\41\2\0\7\41\1\262"+
    "\7\41\1\0\11\10\1\0\12\10\13\0\1\41\1\10"+
    "\2\41\1\10\1\0\1\41\2\0\13\41\1\263\3\41"+
    "\1\0\11\10\1\0\12\10\13\0\5\10\1\0\1\10"+
    "\2\0\6\10\1\264\10\10\1\0\11\10\1\0\12\10"+
    "\13\0\5\10\1\0\1\10\2\0\2\10\1\265\14\10"+
    "\1\0\11\10\1\0\12\10\53\0\1\266\65\0\1\267"+
    "\33\0\1\270\122\0\1\271\67\0\1\272\67\0\1\273"+
    "\75\0\1\274\24\0\1\41\1\10\2\41\1\10\1\0"+
    "\1\41\2\0\6\41\1\275\10\41\1\0\11\10\1\0"+
    "\12\10\13\0\1\41\1\10\2\41\1\10\1\0\1\41"+
    "\2\0\2\41\1\276\14\41\1\0\11\10\1\0\12\10"+
    "\13\0\5\10\1\0\1\10\2\0\7\10\1\277\7\10"+
    "\1\0\11\10\1\0\12\10\13\0\5\10\1\0\1\10"+
    "\2\0\4\10\1\300\12\10\1\0\11\10\1\0\12\10"+
    "\54\0\1\301\61\0\1\302\101\0\1\303\65\0\1\304"+
    "\67\0\1\305\62\0\1\306\33\0\1\307\65\0\1\41"+
    "\1\10\2\41\1\10\1\0\1\41\2\0\7\41\1\310"+
    "\7\41\1\0\11\10\1\0\12\10\13\0\1\41\1\10"+
    "\2\41\1\10\1\0\1\41\2\0\4\41\1\311\12\41"+
    "\1\0\11\10\1\0\12\10\13\0\5\10\1\0\1\10"+
    "\2\0\12\10\1\312\4\10\1\0\11\10\1\0\12\10"+
    "\44\0\1\313\76\0\1\314\64\0\1\315\67\0\1\316"+
    "\67\0\1\317\65\0\1\320\101\0\1\321\22\0\1\41"+
    "\1\10\2\41\1\10\1\0\1\41\2\0\12\41\1\322"+
    "\4\41\1\0\11\10\1\0\12\10\13\0\5\10\1\0"+
    "\1\10\2\0\10\10\1\323\6\10\1\0\11\10\1\0"+
    "\12\10\55\0\1\324\73\0\1\325\64\0\1\326\62\0"+
    "\1\327\67\0\1\330\71\0\1\331\64\0\1\332\32\0"+
    "\1\41\1\10\2\41\1\10\1\0\1\41\2\0\10\41"+
    "\1\333\6\41\1\0\11\10\1\0\12\10\62\0\1\334"+
    "\55\0\1\335\65\0\1\336\67\0\1\337\102\0\1\340"+
    "\64\0\1\341\67\0\1\342\62\0\1\343\71\0\1\344"+
    "\67\0\1\345\76\0\1\346\55\0\1\347\74\0\1\350"+
    "\60\0\1\351\102\0\1\352\67\0\1\353\64\0\1\354"+
    "\62\0\1\355\71\0\1\356\76\0\1\357\67\0\1\360"+
    "\62\0\1\361\60\0\1\362\102\0\1\363\64\0\1\364"+
    "\67\0\1\365\64\0\1\366\76\0\1\367\62\0\1\370"+
    "\67\0\1\371\73\0\1\372\64\0\1\373\73\0\1\374"+
    "\62\0\1\375\70\0\1\376\66\0\1\377\17\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[12432];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\1\11\4\1\1\11\2\1\2\11\6\1\3\11"+
    "\27\1\6\0\1\11\1\1\1\11\13\1\7\0\12\1"+
    "\7\0\12\1\7\0\11\1\7\0\7\1\7\0\6\1"+
    "\7\0\6\1\7\0\6\1\7\0\5\1\7\0\4\1"+
    "\7\0\3\1\7\0\2\1\1\11\6\0\1\1\14\0"+
    "\1\11\10\0\1\11\6\0\2\11\3\0\1\11\1\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[255];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  RmsLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 33: break;
          case 2: 
            { return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 34: break;
          case 3: 
            { return RmsTypes.FILENAME;
            } 
            // fall through
          case 35: break;
          case 4: 
            { return RmsTypes.CONST_NAME;
            } 
            // fall through
          case 36: break;
          case 5: 
            { return RmsTypes.INT;
            } 
            // fall through
          case 37: break;
          case 6: 
            { return RmsTypes.LEFT_BRACKET;
            } 
            // fall through
          case 38: break;
          case 7: 
            { return RmsTypes.RIGHT_BRACKET;
            } 
            // fall through
          case 39: break;
          case 8: 
            { return RmsTypes.LEFT_PARENTHESIS;
            } 
            // fall through
          case 40: break;
          case 9: 
            { return RmsTypes.RIGHT_PARENTHESIS;
            } 
            // fall through
          case 41: break;
          case 10: 
            { return RmsTypes.COMMA;
            } 
            // fall through
          case 42: break;
          case 11: 
            { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 43: break;
          case 12: 
            { 
            } 
            // fall through
          case 44: break;
          case 13: 
            { return RmsTypes.COMMAND_NAME;
            } 
            // fall through
          case 45: break;
          case 14: 
            { return RmsTypes.KEYWORD_HASHMACRO;
            } 
            // fall through
          case 46: break;
          case 15: 
            { return RmsTypes.IF_STATEMENT;
            } 
            // fall through
          case 47: break;
          case 16: 
            { yypushstate(IN_COMMENT);
            } 
            // fall through
          case 48: break;
          case 17: 
            { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 49: break;
          case 18: 
            { yypopstate(); return RmsTypes.COMMENT;
            } 
            // fall through
          case 50: break;
          case 19: 
            { return RmsTypes.RND;
            } 
            // fall through
          case 51: break;
          case 20: 
            { return RmsTypes.ELSE_STATEMENT;
            } 
            // fall through
          case 52: break;
          case 21: 
            { return RmsTypes.ENDIF_STATEMENT;
            } 
            // fall through
          case 53: break;
          case 22: 
            { return RmsTypes.ELSEIF_STATEMENT;
            } 
            // fall through
          case 54: break;
          case 23: 
            { return RmsTypes.END_RANDOM;
            } 
            // fall through
          case 55: break;
          case 24: 
            { return RmsTypes.START_RANDOM;
            } 
            // fall through
          case 56: break;
          case 25: 
            { return RmsTypes.PERCENT_CHANCE;
            } 
            // fall through
          case 57: break;
          case 26: 
            { yybegin(IN_PLAYER_SETUP); return RmsTypes.HEADER_PLAYER_SETUP;
            } 
            // fall through
          case 58: break;
          case 27: 
            { yybegin(IN_LAND_GENERATION); return RmsTypes.HEADER_LAND_GENERATION;
            } 
            // fall through
          case 59: break;
          case 28: 
            { yybegin(IN_CLIFF_GENERATION); return RmsTypes.HEADER_CLIFF_GENERATION;
            } 
            // fall through
          case 60: break;
          case 29: 
            { yybegin(IN_TERRAIN_GENERATION); return RmsTypes.HEADER_TERRAIN_GENERATION;
            } 
            // fall through
          case 61: break;
          case 30: 
            { yybegin(IN_OBJECTS_GENERATION); return RmsTypes.HEADER_OBJECTS_GENERATION;
            } 
            // fall through
          case 62: break;
          case 31: 
            { yybegin(IN_ELEVATION_GENERATION); return RmsTypes.HEADER_ELEVATION_GENERATION;
            } 
            // fall through
          case 63: break;
          case 32: 
            { yybegin(IN_CONNECTION_GENERATION); return RmsTypes.HEADER_CONNECTION_GENERATION;
            } 
            // fall through
          case 64: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
