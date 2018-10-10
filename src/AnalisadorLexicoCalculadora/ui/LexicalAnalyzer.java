/* The following code was generated by JFlex 1.6.1 */

package AnalisadorLexicoCalculadora.ui;

import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>language.lex</tt>
 */
public class LexicalAnalyzer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\15\1\13\1\7\1\52\1\52\1\6\16\15\4\0\1\13\3\0"+
    "\1\14\3\0\1\47\1\50\1\11\1\45\1\44\1\46\1\51\1\4"+
    "\12\5\1\42\1\43\1\41\1\40\1\37\2\0\32\14\4\0\1\14"+
    "\1\0\1\31\1\16\1\34\1\1\1\17\1\22\1\20\1\24\1\2"+
    "\2\14\1\25\1\36\1\21\1\27\1\33\1\14\1\32\1\26\1\23"+
    "\1\35\1\3\1\30\3\14\1\10\1\13\1\12\1\0\6\15\1\53"+
    "\32\15\2\0\4\14\4\0\1\14\2\0\1\15\7\0\1\14\4\0"+
    "\1\14\5\0\27\14\1\0\37\14\1\0\u01ca\14\4\0\14\14\16\0"+
    "\5\14\7\0\1\14\1\0\1\14\21\0\160\15\5\14\1\0\2\14"+
    "\2\0\4\14\10\0\1\14\1\0\3\14\1\0\1\14\1\0\24\14"+
    "\1\0\123\14\1\0\213\14\1\0\5\15\2\0\236\14\11\0\46\14"+
    "\2\0\1\14\7\0\47\14\7\0\1\14\1\0\55\15\1\0\1\15"+
    "\1\0\2\15\1\0\2\15\1\0\1\15\10\0\33\14\5\0\3\14"+
    "\15\0\5\15\6\0\1\14\4\0\13\15\5\0\53\14\37\15\4\0"+
    "\2\14\1\15\143\14\1\0\1\14\10\15\1\0\6\15\2\14\2\15"+
    "\1\0\4\15\2\14\12\15\3\14\2\0\1\14\17\0\1\15\1\14"+
    "\1\15\36\14\33\15\2\0\131\14\13\15\1\14\16\0\12\15\41\14"+
    "\11\15\2\14\4\0\1\14\5\0\26\14\4\15\1\14\11\15\1\14"+
    "\3\15\1\14\5\15\22\0\31\14\3\15\104\0\1\14\1\0\13\14"+
    "\67\0\33\15\1\0\4\15\66\14\3\15\1\14\22\15\1\14\7\15"+
    "\12\14\2\15\2\0\12\15\1\0\7\14\1\0\7\14\1\0\3\15"+
    "\1\0\10\14\2\0\2\14\2\0\26\14\1\0\7\14\1\0\1\14"+
    "\3\0\4\14\2\0\1\15\1\14\7\15\2\0\2\15\2\0\3\15"+
    "\1\14\10\0\1\15\4\0\2\14\1\0\3\14\2\15\2\0\12\15"+
    "\4\14\7\0\1\14\5\0\3\15\1\0\6\14\4\0\2\14\2\0"+
    "\26\14\1\0\7\14\1\0\2\14\1\0\2\14\1\0\2\14\2\0"+
    "\1\15\1\0\5\15\4\0\2\15\2\0\3\15\3\0\1\15\7\0"+
    "\4\14\1\0\1\14\7\0\14\15\3\14\1\15\13\0\3\15\1\0"+
    "\11\14\1\0\3\14\1\0\26\14\1\0\7\14\1\0\2\14\1\0"+
    "\5\14\2\0\1\15\1\14\10\15\1\0\3\15\1\0\3\15\2\0"+
    "\1\14\17\0\2\14\2\15\2\0\12\15\1\0\1\14\17\0\3\15"+
    "\1\0\10\14\2\0\2\14\2\0\26\14\1\0\7\14\1\0\2\14"+
    "\1\0\5\14\2\0\1\15\1\14\7\15\2\0\2\15\2\0\3\15"+
    "\10\0\2\15\4\0\2\14\1\0\3\14\2\15\2\0\12\15\1\0"+
    "\1\14\20\0\1\15\1\14\1\0\6\14\3\0\3\14\1\0\4\14"+
    "\3\0\2\14\1\0\1\14\1\0\2\14\3\0\2\14\3\0\3\14"+
    "\3\0\14\14\4\0\5\15\3\0\3\15\1\0\4\15\2\0\1\14"+
    "\6\0\1\15\16\0\12\15\11\0\1\14\7\0\3\15\1\0\10\14"+
    "\1\0\3\14\1\0\27\14\1\0\12\14\1\0\5\14\3\0\1\14"+
    "\7\15\1\0\3\15\1\0\4\15\7\0\2\15\1\0\2\14\6\0"+
    "\2\14\2\15\2\0\12\15\22\0\2\15\1\0\10\14\1\0\3\14"+
    "\1\0\27\14\1\0\12\14\1\0\5\14\2\0\1\15\1\14\7\15"+
    "\1\0\3\15\1\0\4\15\7\0\2\15\7\0\1\14\1\0\2\14"+
    "\2\15\2\0\12\15\1\0\2\14\17\0\2\15\1\0\10\14\1\0"+
    "\3\14\1\0\51\14\2\0\1\14\7\15\1\0\3\15\1\0\4\15"+
    "\1\14\10\0\1\15\10\0\2\14\2\15\2\0\12\15\12\0\6\14"+
    "\2\0\2\15\1\0\22\14\3\0\30\14\1\0\11\14\1\0\1\14"+
    "\2\0\7\14\3\0\1\15\4\0\6\15\1\0\1\15\1\0\10\15"+
    "\22\0\2\15\15\0\60\14\1\15\2\14\7\15\4\0\10\14\10\15"+
    "\1\0\12\15\47\0\2\14\1\0\1\14\2\0\2\14\1\0\1\14"+
    "\2\0\1\14\6\0\4\14\1\0\7\14\1\0\3\14\1\0\1\14"+
    "\1\0\1\14\2\0\2\14\1\0\4\14\1\15\2\14\6\15\1\0"+
    "\2\15\1\14\2\0\5\14\1\0\1\14\1\0\6\15\2\0\12\15"+
    "\2\0\4\14\40\0\1\14\27\0\2\15\6\0\12\15\13\0\1\15"+
    "\1\0\1\15\1\0\1\15\4\0\2\15\10\14\1\0\44\14\4\0"+
    "\24\15\1\0\2\15\5\14\13\15\1\0\44\15\11\0\1\15\71\0"+
    "\53\14\24\15\1\14\12\15\6\0\6\14\4\15\4\14\3\15\1\14"+
    "\3\15\2\14\7\15\3\14\4\15\15\14\14\15\1\14\17\15\2\0"+
    "\46\14\1\0\1\14\5\0\1\14\2\0\53\14\1\0\u014d\14\1\0"+
    "\4\14\2\0\7\14\1\0\1\14\1\0\4\14\2\0\51\14\1\0"+
    "\4\14\2\0\41\14\1\0\4\14\2\0\7\14\1\0\1\14\1\0"+
    "\4\14\2\0\17\14\1\0\71\14\1\0\4\14\2\0\103\14\2\0"+
    "\3\15\40\0\20\14\20\0\125\14\14\0\u026c\14\2\0\21\14\1\0"+
    "\32\14\5\0\113\14\3\0\3\14\17\0\15\14\1\0\4\14\3\15"+
    "\13\0\22\14\3\15\13\0\22\14\2\15\14\0\15\14\1\0\3\14"+
    "\1\0\2\15\14\0\64\14\40\15\3\0\1\14\3\0\2\14\1\15"+
    "\2\0\12\15\41\0\3\15\2\0\12\15\6\0\130\14\10\0\51\14"+
    "\1\15\1\14\5\0\106\14\12\0\35\14\3\0\14\15\4\0\14\15"+
    "\12\0\12\15\36\14\2\0\5\14\13\0\54\14\4\0\21\15\7\14"+
    "\2\15\6\0\12\15\46\0\27\14\5\15\4\0\65\14\12\15\1\0"+
    "\35\15\2\0\13\15\6\0\12\15\15\0\1\14\130\0\5\15\57\14"+
    "\21\15\7\14\4\0\12\15\21\0\11\15\14\0\3\15\36\14\15\15"+
    "\2\14\12\15\54\14\16\15\14\0\44\14\24\15\10\0\12\15\3\0"+
    "\3\14\12\15\44\14\122\0\3\15\1\0\25\15\4\14\1\15\4\14"+
    "\3\15\2\14\11\0\300\14\47\15\25\0\4\15\u0116\14\2\0\6\14"+
    "\2\0\46\14\2\0\6\14\2\0\10\14\1\0\1\14\1\0\1\14"+
    "\1\0\1\14\1\0\37\14\2\0\65\14\1\0\7\14\1\0\1\14"+
    "\3\0\3\14\1\0\7\14\3\0\4\14\2\0\6\14\4\0\15\14"+
    "\5\0\3\14\1\0\7\14\16\0\5\15\30\0\1\52\1\52\5\15"+
    "\20\0\2\14\23\0\1\14\13\0\5\15\5\0\6\15\1\0\1\14"+
    "\15\0\1\14\20\0\15\14\3\0\33\14\25\0\15\15\4\0\1\15"+
    "\3\0\14\15\21\0\1\14\4\0\1\14\2\0\12\14\1\0\1\14"+
    "\3\0\5\14\6\0\1\14\1\0\1\14\1\0\1\14\1\0\4\14"+
    "\1\0\13\14\2\0\4\14\5\0\5\14\4\0\1\14\21\0\51\14"+
    "\u0a77\0\57\14\1\0\57\14\1\0\205\14\6\0\4\14\3\15\2\14"+
    "\14\0\46\14\1\0\1\14\5\0\1\14\2\0\70\14\7\0\1\14"+
    "\17\0\1\15\27\14\11\0\7\14\1\0\7\14\1\0\7\14\1\0"+
    "\7\14\1\0\7\14\1\0\7\14\1\0\7\14\1\0\7\14\1\0"+
    "\40\15\57\0\1\14\u01d5\0\3\14\31\0\11\14\6\15\1\0\5\14"+
    "\2\0\5\14\4\0\126\14\2\0\2\15\2\0\3\14\1\0\132\14"+
    "\1\0\4\14\5\0\51\14\3\0\136\14\21\0\33\14\65\0\20\14"+
    "\u0200\0\u19b6\14\112\0\u51cd\14\63\0\u048d\14\103\0\56\14\2\0\u010d\14"+
    "\3\0\20\14\12\15\2\14\24\0\57\14\1\15\4\0\12\15\1\0"+
    "\31\14\7\0\1\15\120\14\2\15\45\0\11\14\2\0\147\14\2\0"+
    "\4\14\1\0\4\14\14\0\13\14\115\0\12\14\1\15\3\14\1\15"+
    "\4\14\1\15\27\14\5\15\20\0\1\14\7\0\64\14\14\0\2\15"+
    "\62\14\21\15\13\0\12\15\6\0\22\15\6\14\3\0\1\14\4\0"+
    "\12\15\34\14\10\15\2\0\27\14\15\15\14\0\35\14\3\0\4\15"+
    "\57\14\16\15\16\0\1\14\12\15\46\0\51\14\16\15\11\0\3\14"+
    "\1\15\10\14\2\15\2\0\12\15\6\0\27\14\3\0\1\14\1\15"+
    "\4\0\60\14\1\15\1\14\3\15\2\14\2\15\5\14\2\15\1\14"+
    "\1\15\1\14\30\0\3\14\2\0\13\14\5\15\2\0\3\14\2\15"+
    "\12\0\6\14\2\0\6\14\2\0\6\14\11\0\7\14\1\0\7\14"+
    "\221\0\43\14\10\15\1\0\2\15\2\0\12\15\6\0\u2ba4\14\14\0"+
    "\27\14\4\0\61\14\u2104\0\u016e\14\2\0\152\14\46\0\7\14\14\0"+
    "\5\14\5\0\1\14\1\15\12\14\1\0\15\14\1\0\5\14\1\0"+
    "\1\14\1\0\2\14\1\0\2\14\1\0\154\14\41\0\u016b\14\22\0"+
    "\100\14\2\0\66\14\50\0\15\14\3\0\20\15\20\0\7\15\14\0"+
    "\2\14\30\0\3\14\31\0\1\14\6\0\5\14\1\0\207\14\2\0"+
    "\1\15\4\0\1\14\13\0\12\15\7\0\32\14\4\0\1\14\1\0"+
    "\32\14\13\0\131\14\3\0\6\14\2\0\6\14\2\0\6\14\2\0"+
    "\3\14\3\0\2\14\3\0\2\14\22\0\3\15\4\0\14\14\1\0"+
    "\32\14\1\0\23\14\1\0\2\14\1\0\17\14\2\0\16\14\42\0"+
    "\173\14\105\0\65\14\210\0\1\15\202\0\35\14\3\0\61\14\57\0"+
    "\37\14\21\0\33\14\65\0\36\14\2\0\44\14\4\0\10\14\1\0"+
    "\5\14\52\0\236\14\2\0\12\15\u0356\0\6\14\2\0\1\14\1\0"+
    "\54\14\1\0\2\14\3\0\1\14\2\0\27\14\252\0\26\14\12\0"+
    "\32\14\106\0\70\14\6\0\2\14\100\0\1\14\3\15\1\0\2\15"+
    "\5\0\4\15\4\14\1\0\3\14\1\0\33\14\4\0\3\15\4\0"+
    "\1\15\40\0\35\14\203\0\66\14\12\0\26\14\12\0\23\14\215\0"+
    "\111\14\u03b7\0\3\15\65\14\17\15\37\0\12\15\20\0\3\15\55\14"+
    "\13\15\2\0\1\15\22\0\31\14\7\0\12\15\6\0\3\15\44\14"+
    "\16\15\1\0\12\15\100\0\3\15\60\14\16\15\4\14\13\0\12\15"+
    "\u04a6\0\53\14\15\15\10\0\12\15\u0936\0\u036f\14\221\0\143\14\u0b9d\0"+
    "\u042f\14\u33d1\0\u0239\14\u04c7\0\105\14\13\0\1\14\56\15\20\0\4\15"+
    "\15\14\u4060\0\2\14\u2163\0\5\15\3\0\26\15\2\0\7\15\36\0"+
    "\4\15\224\0\3\15\u01bb\0\125\14\1\0\107\14\1\0\2\14\2\0"+
    "\1\14\2\0\2\14\2\0\4\14\1\0\14\14\1\0\1\14\1\0"+
    "\7\14\1\0\101\14\1\0\4\14\2\0\10\14\1\0\7\14\1\0"+
    "\34\14\1\0\4\14\1\0\5\14\1\0\1\14\3\0\7\14\1\0"+
    "\u0154\14\2\0\31\14\1\0\31\14\1\0\37\14\1\0\31\14\1\0"+
    "\37\14\1\0\31\14\1\0\37\14\1\0\31\14\1\0\37\14\1\0"+
    "\31\14\1\0\10\14\2\0\62\15\u1600\0\4\14\1\0\33\14\1\0"+
    "\2\14\1\0\1\14\2\0\1\14\1\0\12\14\1\0\4\14\1\0"+
    "\1\14\1\0\1\14\6\0\1\14\4\0\1\14\1\0\1\14\1\0"+
    "\1\14\1\0\3\14\1\0\2\14\1\0\1\14\2\0\1\14\1\0"+
    "\1\14\1\0\1\14\1\0\1\14\1\0\1\14\1\0\2\14\1\0"+
    "\1\14\2\0\4\14\1\0\7\14\1\0\4\14\1\0\4\14\1\0"+
    "\1\14\1\0\12\14\1\0\21\14\5\0\3\14\1\0\5\14\1\0"+
    "\21\14\u1144\0\ua6d7\14\51\0\u1035\14\13\0\336\14\u3fe2\0\u021e\14\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u05ee\0"+
    "\1\15\36\0\140\15\200\0\360\15\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\3\2\1\3\1\4\2\5\1\1\1\6"+
    "\11\2\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\2\1\22\1\2\1\23"+
    "\1\2\1\24\1\0\6\2\1\25\3\2\1\26\1\27"+
    "\1\30\1\31\1\3\1\32\1\33\2\24\2\2\1\34"+
    "\1\2\1\35\2\2\1\36\3\2\1\37\1\40\3\2"+
    "\1\41\1\2\1\42\5\2\1\43\1\44\2\2\1\45";

  private static int [] zzUnpackAction() {
    int [] result = new int[86];
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
    "\0\0\0\54\0\130\0\204\0\260\0\334\0\u0108\0\u0134"+
    "\0\54\0\u0160\0\54\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c"+
    "\0\u0268\0\u0294\0\u02c0\0\u02ec\0\u0318\0\54\0\u0344\0\u0370"+
    "\0\54\0\54\0\54\0\54\0\54\0\54\0\54\0\u039c"+
    "\0\u018c\0\u03c8\0\u018c\0\u03f4\0\u0420\0\u044c\0\u0478\0\u04a4"+
    "\0\u04d0\0\u04fc\0\u0528\0\u0554\0\u018c\0\u0580\0\u05ac\0\u05d8"+
    "\0\54\0\54\0\54\0\54\0\u018c\0\u018c\0\u018c\0\u0604"+
    "\0\54\0\u0630\0\u065c\0\u018c\0\u0688\0\u018c\0\u06b4\0\u06e0"+
    "\0\u018c\0\u070c\0\u0738\0\u0764\0\u018c\0\u018c\0\u0790\0\u07bc"+
    "\0\u07e8\0\u018c\0\u0814\0\u018c\0\u0840\0\u086c\0\u0898\0\u08c4"+
    "\0\u08f0\0\u018c\0\u018c\0\u091c\0\u0948\0\u018c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[86];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\2\1\11\1\14\1\2\1\15\1\16"+
    "\1\14\1\17\1\14\1\20\3\14\1\21\1\22\1\23"+
    "\1\14\1\24\3\14\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\57\0\1\14"+
    "\1\40\1\14\1\0\1\14\6\0\13\14\1\41\7\14"+
    "\14\0\1\14\1\0\3\14\1\0\1\14\6\0\5\14"+
    "\1\42\1\43\14\14\14\0\1\14\1\0\3\14\1\0"+
    "\1\14\6\0\15\14\1\44\5\14\14\0\1\14\4\0"+
    "\1\45\54\0\1\7\55\0\1\11\44\0\11\46\1\0"+
    "\42\46\1\0\3\14\1\0\1\14\6\0\23\14\14\0"+
    "\1\14\1\0\3\14\1\0\1\14\6\0\3\14\1\47"+
    "\7\14\1\50\7\14\14\0\1\14\1\0\3\14\1\0"+
    "\1\14\6\0\5\14\1\51\3\14\1\52\11\14\14\0"+
    "\1\14\1\0\3\14\1\0\1\14\6\0\13\14\1\53"+
    "\7\14\14\0\1\14\1\0\3\14\1\0\1\14\6\0"+
    "\10\14\1\54\12\14\14\0\1\14\1\0\3\14\1\0"+
    "\1\14\6\0\16\14\1\55\4\14\14\0\1\14\1\0"+
    "\3\14\1\0\1\14\6\0\10\14\1\56\12\14\14\0"+
    "\1\14\1\0\3\14\1\0\1\14\6\0\5\14\1\57"+
    "\15\14\14\0\1\14\1\0\3\14\1\0\1\14\6\0"+
    "\16\14\1\60\4\14\14\0\1\14\40\0\1\61\52\0"+
    "\1\62\1\63\53\0\1\64\14\0\2\14\1\65\1\0"+
    "\1\14\6\0\23\14\14\0\1\14\1\0\3\14\1\0"+
    "\1\14\6\0\7\14\1\66\13\14\14\0\1\14\1\0"+
    "\3\14\1\0\1\14\6\0\16\14\1\67\4\14\14\0"+
    "\1\14\6\45\1\70\1\71\44\45\12\46\1\71\41\46"+
    "\1\0\3\14\1\0\1\14\6\0\4\14\1\72\16\14"+
    "\14\0\1\14\1\0\3\14\1\0\1\14\6\0\13\14"+
    "\1\73\7\14\14\0\1\14\1\0\1\74\2\14\1\0"+
    "\1\14\6\0\23\14\14\0\1\14\1\0\3\14\1\0"+
    "\1\14\6\0\12\14\1\75\10\14\14\0\1\14\1\0"+
    "\3\14\1\0\1\14\6\0\7\14\1\76\13\14\14\0"+
    "\1\14\1\0\3\14\1\0\1\14\6\0\3\14\1\77"+
    "\17\14\14\0\1\14\1\0\1\14\1\100\1\14\1\0"+
    "\1\14\6\0\23\14\14\0\1\14\1\0\1\101\2\14"+
    "\1\0\1\14\6\0\23\14\14\0\1\14\1\0\3\14"+
    "\1\0\1\14\6\0\13\14\1\102\7\14\14\0\1\14"+
    "\7\0\1\71\45\0\1\14\1\103\1\14\1\0\1\14"+
    "\6\0\23\14\14\0\1\14\1\0\3\14\1\0\1\14"+
    "\6\0\11\14\1\104\11\14\14\0\1\14\1\0\3\14"+
    "\1\0\1\14\6\0\3\14\1\105\17\14\14\0\1\14"+
    "\1\0\3\14\1\0\1\14\6\0\5\14\1\106\15\14"+
    "\14\0\1\14\1\0\3\14\1\0\1\14\6\0\11\14"+
    "\1\107\11\14\14\0\1\14\1\0\3\14\1\0\1\14"+
    "\6\0\4\14\1\110\13\14\1\111\2\14\14\0\1\14"+
    "\1\0\3\14\1\0\1\14\6\0\5\14\1\112\15\14"+
    "\14\0\1\14\1\0\3\14\1\0\1\14\6\0\3\14"+
    "\1\113\17\14\14\0\1\14\1\0\3\14\1\0\1\14"+
    "\6\0\3\14\1\114\17\14\14\0\1\14\1\0\3\14"+
    "\1\0\1\14\6\0\16\14\1\115\4\14\14\0\1\14"+
    "\1\0\3\14\1\0\1\14\6\0\3\14\1\116\17\14"+
    "\14\0\1\14\1\0\3\14\1\0\1\14\6\0\15\14"+
    "\1\117\5\14\14\0\1\14\1\0\3\14\1\0\1\14"+
    "\6\0\15\14\1\120\5\14\14\0\1\14\1\0\1\121"+
    "\2\14\1\0\1\14\6\0\23\14\14\0\1\14\1\0"+
    "\3\14\1\0\1\14\6\0\5\14\1\122\15\14\14\0"+
    "\1\14\1\0\3\14\1\0\1\14\6\0\22\14\1\123"+
    "\14\0\1\14\1\0\3\14\1\0\1\14\6\0\21\14"+
    "\1\124\1\14\14\0\1\14\1\0\3\14\1\0\1\14"+
    "\6\0\16\14\1\125\4\14\14\0\1\14\1\0\3\14"+
    "\1\0\1\14\6\0\3\14\1\126\17\14\14\0\1\14";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2420];
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
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\6\1\1\11\1\1\1\11\12\1\1\11"+
    "\2\1\7\11\6\1\1\0\12\1\4\11\4\1\1\11"+
    "\35\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[86];
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
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */

    public int getYyline() {
        return yyline;
    }

    public int getYycolumn() {
        return yycolumn;
    }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexicalAnalyzer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2838) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
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
          { return new java_cup.runtime.Symbol(Sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return new Symbol(Sym.DESCONHECIDO);
            }
          case 38: break;
          case 2: 
            { return new Symbol(Sym.IDENTIFICADOR);
            }
          case 39: break;
          case 3: 
            { return new Symbol(Sym.OPERADOR_MATEMATICO_DIVISAO );
            }
          case 40: break;
          case 4: 
            { return new Symbol(Sym.NUMERO_INTEIRO);
            }
          case 41: break;
          case 5: 
            { 
            }
          case 42: break;
          case 6: 
            { return new Symbol(Sym.OPERADOR_MATEMATICO_MULTIPLICACAO );
            }
          case 43: break;
          case 7: 
            { return new Symbol(Sym.SIMBOLOS_ESPECIAIS_MAIOR_QUE);
            }
          case 44: break;
          case 8: 
            { return new Symbol(Sym.SIMBOLOS_ESPECIAIS_IGUAL);
            }
          case 45: break;
          case 9: 
            { return new Symbol(Sym.SIMBOLOS_ESPECIAIS_MENOR_QUE);
            }
          case 46: break;
          case 10: 
            { return new Symbol(Sym.SIMBOLOS_ESPECIAIS_DOIS_PONTOS);
            }
          case 47: break;
          case 11: 
            { return new Symbol(Sym.SIMBOLOS_ESPECIAIS_PONTO_E_VIRGULA);
            }
          case 48: break;
          case 12: 
            { return new Symbol(Sym.SIMBOLOS_ESPECIAIS_VIRGULA);
            }
          case 49: break;
          case 13: 
            { return new Symbol(Sym.OPERADOR_MATEMATICO_SOMA);
            }
          case 50: break;
          case 14: 
            { return new Symbol(Sym.OPERADOR_MATEMATICO_SUBTRACAO);
            }
          case 51: break;
          case 15: 
            { return new Symbol(Sym.ABRE_PARENTESES);
            }
          case 52: break;
          case 16: 
            { return new Symbol(Sym.FECHA_PARENTESES);
            }
          case 53: break;
          case 17: 
            { return new Symbol(Sym.FIM);
            }
          case 54: break;
          case 18: 
            { return new Symbol(Sym.PALAVRA_RESERVADA_DO);
            }
          case 55: break;
          case 19: 
            { return new Symbol(Sym.PALAVRA_RESERVADA_IF);
            }
          case 56: break;
          case 20: 
            { return new Symbol(Sym.COMENTARIO);
            }
          case 57: break;
          case 21: 
            { return new Symbol(Sym.OPERADOR_LOGICO_OR );
            }
          case 58: break;
          case 22: 
            { return new Symbol(Sym.SIMBOLOS_ESPECIAIS_MAIOR_OU_IGUAL);
            }
          case 59: break;
          case 23: 
            { return new Symbol(Sym.SIMBOLOS_ESPECIAIS_DIFERENTE);
            }
          case 60: break;
          case 24: 
            { return new Symbol(Sym.SIMBOLOS_ESPECIAIS_MENOR_OU_IGUAL);
            }
          case 61: break;
          case 25: 
            { return new Symbol(Sym.SIMBOLOS_ESPECIAIS_ATRIBUICAO);
            }
          case 62: break;
          case 26: 
            { return new Symbol(Sym.TIPO_VARIAVEL_INT);
            }
          case 63: break;
          case 27: 
            { return new Symbol(Sym.PALAVRA_RESERVADA_VAR);
            }
          case 64: break;
          case 28: 
            { return new Symbol(Sym.PALAVRA_RESERVADA_END);
            }
          case 65: break;
          case 29: 
            { return new Symbol(Sym.OPERADOR_LOGICO_NOT );
            }
          case 66: break;
          case 30: 
            { return new Symbol(Sym.OPERADOR_LOGICO_AND );
            }
          case 67: break;
          case 31: 
            { return new Symbol(Sym.PALAVRA_RESERVADA_ELSE);
            }
          case 68: break;
          case 32: 
            { return new Symbol(Sym.PALAVRA_RESERVADA_THEN);
            }
          case 69: break;
          case 33: 
            { return new Symbol(Sym.PALAVRA_RESERVADA_BEGIN);
            }
          case 70: break;
          case 34: 
            { return new Symbol(Sym.PALAVRA_RESERVADA_WHILE);
            }
          case 71: break;
          case 35: 
            { return new Symbol(Sym.TIPO_VARIAVEL_BOOLEAN);
            }
          case 72: break;
          case 36: 
            { return new Symbol(Sym.PALAVRA_RESERVADA_PROGRAM);
            }
          case 73: break;
          case 37: 
            { return new Symbol(Sym.PALAVRA_RESERVADA_PROCEDURE);
            }
          case 74: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
