
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package AnalisadorLexicoCalculadora.ui;

import java_cup.runtime.*;
import java.util.*;
import java.io.*;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\075\000\002\002\004\000\002\002\004\000\002\003" +
    "\004\000\002\004\004\000\002\004\003\000\002\005\005" +
    "\000\002\006\003\000\002\006\003\000\002\007\005\000" +
    "\002\007\003\000\002\010\004\000\002\010\003\000\002" +
    "\011\011\000\002\012\005\000\002\013\005\000\002\013" +
    "\003\000\002\030\006\000\002\030\005\000\002\015\005" +
    "\000\002\016\004\000\002\016\003\000\002\014\003\000" +
    "\002\014\003\000\002\032\004\000\002\032\003\000\002" +
    "\032\003\000\002\032\003\000\002\031\010\000\002\033" +
    "\006\000\002\033\010\000\002\033\003\000\002\017\005" +
    "\000\002\020\004\000\002\034\006\000\002\035\006\000" +
    "\002\021\003\000\002\021\005\000\002\021\005\000\002" +
    "\021\005\000\002\021\005\000\002\021\005\000\002\021" +
    "\005\000\002\022\004\000\002\022\003\000\002\023\004" +
    "\000\002\023\003\000\002\037\004\000\002\037\006\000" +
    "\002\024\004\000\002\024\003\000\002\025\004\000\002" +
    "\025\003\000\002\036\004\000\002\036\004\000\002\036" +
    "\004\000\002\026\003\000\002\026\003\000\002\026\005" +
    "\000\002\026\004\000\002\027\003\000\002\027\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\055\000\012\032\011\037\013\042\014\044\012\001" +
    "\002\000\022\016\051\017\044\020\050\021\046\022\045" +
    "\024\047\043\uffde\045\uffde\001\002\000\004\002\043\001" +
    "\002\000\036\016\uffd0\017\uffd0\020\uffd0\021\uffd0\022\uffd0" +
    "\024\uffd0\030\034\031\uffd0\033\uffd0\034\uffd0\035\032\036" +
    "\033\043\uffd0\045\uffd0\001\002\000\026\016\uffd6\017\uffd6" +
    "\020\uffd6\021\uffd6\022\uffd6\024\uffd6\033\024\034\022\043" +
    "\uffd6\045\uffd6\001\002\000\004\045\020\001\002\000\012" +
    "\032\011\037\013\042\014\044\012\001\002\000\036\016" +
    "\uffca\017\uffca\020\uffca\021\uffca\022\uffca\024\uffca\030\uffca" +
    "\031\uffca\033\uffca\034\uffca\035\uffca\036\uffca\043\uffca\045" +
    "\uffca\001\002\000\036\016\uffc9\017\uffc9\020\uffc9\021\uffc9" +
    "\022\uffc9\024\uffc9\030\uffc9\031\uffc9\033\uffc9\034\uffc9\035" +
    "\uffc9\036\uffc9\043\uffc9\045\uffc9\001\002\000\012\032\011" +
    "\037\013\042\014\044\012\001\002\000\004\043\016\001" +
    "\002\000\036\016\uffc8\017\uffc8\020\uffc8\021\uffc8\022\uffc8" +
    "\024\uffc8\030\uffc8\031\uffc8\033\uffc8\034\uffc8\035\uffc8\036" +
    "\uffc8\043\uffc8\045\uffc8\001\002\000\036\016\uffc7\017\uffc7" +
    "\020\uffc7\021\uffc7\022\uffc7\024\uffc7\030\uffc7\031\uffc7\033" +
    "\uffc7\034\uffc7\035\uffc7\036\uffc7\043\uffc7\045\uffc7\001\002" +
    "\000\004\002\000\001\002\000\026\016\uffd7\017\uffd7\020" +
    "\uffd7\021\uffd7\022\uffd7\024\uffd7\033\024\034\022\043\uffd7" +
    "\045\uffd7\001\002\000\012\032\011\037\013\042\014\044" +
    "\012\001\002\000\026\016\uffd4\017\uffd4\020\uffd4\021\uffd4" +
    "\022\uffd4\024\uffd4\033\uffd4\034\uffd4\043\uffd4\045\uffd4\001" +
    "\002\000\012\032\011\037\013\042\014\044\012\001\002" +
    "\000\026\016\uffd3\017\uffd3\020\uffd3\021\uffd3\022\uffd3\024" +
    "\uffd3\033\uffd3\034\uffd3\043\uffd3\045\uffd3\001\002\000\004" +
    "\031\027\001\002\000\012\032\011\037\013\042\014\044" +
    "\012\001\002\000\026\016\uffd2\017\uffd2\020\uffd2\021\uffd2" +
    "\022\uffd2\024\uffd2\033\uffd2\034\uffd2\043\uffd2\045\uffd2\001" +
    "\002\000\026\016\uffd5\017\uffd5\020\uffd5\021\uffd5\022\uffd5" +
    "\024\uffd5\033\uffd5\034\uffd5\043\uffd5\045\uffd5\001\002\000" +
    "\012\032\011\037\013\042\014\044\012\001\002\000\012" +
    "\032\011\037\013\042\014\044\012\001\002\000\012\032" +
    "\011\037\013\042\014\044\012\001\002\000\036\016\uffce" +
    "\017\uffce\020\uffce\021\uffce\022\uffce\024\uffce\030\uffce\031" +
    "\uffce\033\uffce\034\uffce\035\uffce\036\uffce\043\uffce\045\uffce" +
    "\001\002\000\036\016\uffd1\017\uffd1\020\uffd1\021\uffd1\022" +
    "\uffd1\024\uffd1\030\034\031\uffd1\033\uffd1\034\uffd1\035\032" +
    "\036\033\043\uffd1\045\uffd1\001\002\000\036\016\uffcf\017" +
    "\uffcf\020\uffcf\021\uffcf\022\uffcf\024\uffcf\030\uffcf\031\uffcf" +
    "\033\uffcf\034\uffcf\035\uffcf\036\uffcf\043\uffcf\045\uffcf\001" +
    "\002\000\036\016\uffcb\017\uffcb\020\uffcb\021\uffcb\022\uffcb" +
    "\024\uffcb\030\uffcb\031\uffcb\033\uffcb\034\uffcb\035\uffcb\036" +
    "\uffcb\043\uffcb\045\uffcb\001\002\000\036\016\uffcc\017\uffcc" +
    "\020\uffcc\021\uffcc\022\uffcc\024\uffcc\030\uffcc\031\uffcc\033" +
    "\uffcc\034\uffcc\035\uffcc\036\uffcc\043\uffcc\045\uffcc\001\002" +
    "\000\036\016\uffcd\017\uffcd\020\uffcd\021\uffcd\022\uffcd\024" +
    "\uffcd\030\uffcd\031\uffcd\033\uffcd\034\uffcd\035\uffcd\036\uffcd" +
    "\043\uffcd\045\uffcd\001\002\000\004\002\001\001\002\000" +
    "\012\032\011\037\013\042\014\044\012\001\002\000\012" +
    "\032\011\037\013\042\014\044\012\001\002\000\012\032" +
    "\011\037\013\042\014\044\012\001\002\000\012\032\011" +
    "\037\013\042\014\044\012\001\002\000\012\032\011\037" +
    "\013\042\014\044\012\001\002\000\012\032\011\037\013" +
    "\042\014\044\012\001\002\000\006\043\uffdc\045\uffdc\001" +
    "\002\000\006\043\uffda\045\uffda\001\002\000\006\043\uffdd" +
    "\045\uffdd\001\002\000\006\043\uffd9\045\uffd9\001\002\000" +
    "\006\043\uffd8\045\uffd8\001\002\000\006\043\uffdb\045\uffdb" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\055\000\014\002\004\021\007\022\003\024\006\026" +
    "\005\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\025\035\036\034\001\001\000\006\023\020\037\022\001" +
    "\001\000\002\001\001\000\004\026\016\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\021\014\022\003\024" +
    "\006\026\005\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\037\030\001" +
    "\001\000\006\024\025\026\005\001\001\000\002\001\001" +
    "\000\006\024\024\026\005\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\024\027\026\005\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\026\041\001\001\000" +
    "\004\026\040\001\001\000\004\026\037\001\001\000\002" +
    "\001\001\000\004\036\036\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\022\056\024\006\026\005\001\001\000" +
    "\010\022\055\024\006\026\005\001\001\000\010\022\054" +
    "\024\006\026\005\001\001\000\010\022\053\024\006\026" +
    "\005\001\001\000\010\022\052\024\006\026\005\001\001" +
    "\000\010\022\051\024\006\026\005\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    public void report_error(String message, Object info)  {
        System.out.println("Warning - " + message);
    }

    public void report_fatal_error(String message, Object info)  {
        System.out.println("Error - " + message);
        System.exit(-1);
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= expressao FIM 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // bloco ::= parte_de_declaracoes_de_variaveis comando_composto 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("bloco",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // parte_de_declaracoes_de_variaveis ::= parte_de_declaracoes_de_variaveis declaracao_de_variavel 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parte_de_declaracoes_de_variaveis",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // parte_de_declaracoes_de_variaveis ::= declaracao_de_variavel 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parte_de_declaracoes_de_variaveis",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // declaracao_de_variavel ::= tipo lista_de_identificadores SIMBOLOS_ESPECIAIS_PONTO_E_VIRGULA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracao_de_variavel",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // tipo ::= TIPO_VARIAVEL_INT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipo",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // tipo ::= TIPO_VARIAVEL_BOOLEAN 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tipo",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // lista_de_identificadores ::= lista_de_identificadores SIMBOLOS_ESPECIAIS_VIRGULA IDENTIFICADOR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_de_identificadores",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // lista_de_identificadores ::= IDENTIFICADOR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_de_identificadores",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // parte_de_declaracoes_de_subrotinas ::= parte_de_declaracoes_de_subrotinas declaracao_de_procedimento 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parte_de_declaracoes_de_subrotinas",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // parte_de_declaracoes_de_subrotinas ::= declaracao_de_procedimento 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parte_de_declaracoes_de_subrotinas",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // declaracao_de_procedimento ::= PALAVRA_RESERVADA_PROCEDURE IDENTIFICADOR ABRE_PARENTESES parametros_formais FECHA_PARENTESES SIMBOLOS_ESPECIAIS_PONTO_E_VIRGULA bloco 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracao_de_procedimento",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // parametros_formais ::= ABRE_PARENTESES secao_de_parametros_formais FECHA_PARENTESES 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parametros_formais",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // secao_de_parametros_formais ::= secao_de_parametros_formais SIMBOLOS_ESPECIAIS_PONTO_E_VIRGULA secao_de_parametros_formais2 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("secao_de_parametros_formais",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // secao_de_parametros_formais ::= secao_de_parametros_formais2 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("secao_de_parametros_formais",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // secao_de_parametros_formais2 ::= PALAVRA_RESERVADA_VAR lista_de_identificadores SIMBOLOS_ESPECIAIS_DOIS_PONTOS IDENTIFICADOR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("secao_de_parametros_formais2",22, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // secao_de_parametros_formais2 ::= lista_de_identificadores SIMBOLOS_ESPECIAIS_DOIS_PONTOS IDENTIFICADOR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("secao_de_parametros_formais2",22, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // comando_composto ::= PALAVRA_RESERVADA_BEGIN comandos PALAVRA_RESERVADA_END 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("comando_composto",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // comandos ::= comandos comando 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("comandos",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // comandos ::= comando 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("comandos",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // comando ::= casado 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("comando",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // comando ::= nao_casado 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("comando",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // casado ::= atribuicao SIMBOLOS_ESPECIAIS_PONTO_E_VIRGULA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("casado",24, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // casado ::= chamada_de_procedimento 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("casado",24, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // casado ::= comando_condicional_casado 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("casado",24, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // casado ::= comando_repetitivo_casado 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("casado",24, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // comando_condicional_casado ::= PALAVRA_RESERVADA_IF expressao PALAVRA_RESERVADA_THEN casado PALAVRA_RESERVADA_ELSE casado 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("comando_condicional_casado",23, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // nao_casado ::= PALAVRA_RESERVADA_IF expressao PALAVRA_RESERVADA_THEN comando 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("nao_casado",25, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // nao_casado ::= PALAVRA_RESERVADA_IF expressao PALAVRA_RESERVADA_THEN casado PALAVRA_RESERVADA_ELSE nao_casado 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("nao_casado",25, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // nao_casado ::= comando_repetitivo_nao_casado 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("nao_casado",25, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // atribuicao ::= IDENTIFICADOR SIMBOLOS_ESPECIAIS_ATRIBUICAO expressao 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("atribuicao",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // chamada_de_procedimento ::= IDENTIFICADOR lista_de_expressoes 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("chamada_de_procedimento",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // comando_repetitivo_casado ::= PALAVRA_RESERVADA_WHILE expressao PALAVRA_RESERVADA_DO casado 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("comando_repetitivo_casado",26, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // comando_repetitivo_nao_casado ::= PALAVRA_RESERVADA_WHILE expressao PALAVRA_RESERVADA_DO nao_casado 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("comando_repetitivo_nao_casado",27, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // expressao ::= expressao_simples 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expressao",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // expressao ::= expressao_simples SIMBOLOS_ESPECIAIS_IGUAL expressao_simples 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expressao",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // expressao ::= expressao_simples SIMBOLOS_ESPECIAIS_MAIOR_OU_IGUAL expressao_simples 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expressao",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // expressao ::= expressao_simples SIMBOLOS_ESPECIAIS_MAIOR_QUE expressao_simples 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expressao",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // expressao ::= expressao_simples SIMBOLOS_ESPECIAIS_DIFERENTE expressao_simples 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expressao",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // expressao ::= expressao_simples SIMBOLOS_ESPECIAIS_MENOR_OU_IGUAL expressao_simples 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expressao",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // expressao ::= expressao_simples SIMBOLOS_ESPECIAIS_MENOR_QUE expressao_simples 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expressao",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // expressao_simples ::= termo repeticao_termo 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expressao_simples",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // expressao_simples ::= termo 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expressao_simples",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // repeticao_termo ::= repeticao_termo repeticao_termo2 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("repeticao_termo",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // repeticao_termo ::= repeticao_termo2 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("repeticao_termo",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // repeticao_termo2 ::= OPERADOR_MATEMATICO_SOMA termo 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("repeticao_termo2",29, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // repeticao_termo2 ::= OPERADOR_MATEMATICO_SUBTRACAO termo OPERADOR_LOGICO_OR termo 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("repeticao_termo2",29, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // termo ::= fator repeticao_fator 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("termo",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // termo ::= fator 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("termo",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // repeticao_fator ::= repeticao_fator repeticao_fator2 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("repeticao_fator",19, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // repeticao_fator ::= repeticao_fator2 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("repeticao_fator",19, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // repeticao_fator2 ::= OPERADOR_MATEMATICO_MULTIPLICACAO fator 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("repeticao_fator2",28, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // repeticao_fator2 ::= OPERADOR_MATEMATICO_DIVISAO fator 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("repeticao_fator2",28, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // repeticao_fator2 ::= OPERADOR_LOGICO_AND fator 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("repeticao_fator2",28, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 55: // fator ::= IDENTIFICADOR 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("fator",20, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 56: // fator ::= NUMERO_INTEIRO 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("fator",20, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 57: // fator ::= ABRE_PARENTESES expressao FECHA_PARENTESES 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("fator",20, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 58: // fator ::= OPERADOR_LOGICO_NOT fator 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("fator",20, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 59: // lista_de_expressoes ::= expressao 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_de_expressoes",21, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 60: // lista_de_expressoes ::= lista_de_expressoes SIMBOLOS_ESPECIAIS_VIRGULA expressao 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_de_expressoes",21, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
