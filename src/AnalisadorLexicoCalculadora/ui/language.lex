package AnalisadorLexicoCalculadora.ui;

import java_cup.runtime.Symbol;

%%

%cup
%public
%type java_cup.runtime.Symbol
%class LexicalAnalyzer
%line
%column


OPERADOR_MATEMATICO_DIVISAO = "div"|"/"

NUMERO_INTEIRO = [0-9][0-9]*

QUEBRA_DE_LINHA = \r|\n|\r\n


COMENTARIO = {COMENTARIO_TRADICIONAL} | {COMENTARIO_DE_LINHA}

COMENTARIO_TRADICIONAL   = "{" [^*] ~"}"
COMENTARIO_DE_LINHA     = "//" {CARACTERE_DE_ENTRADA}* {QUEBRA_DE_LINHA}?

BRANCO = [ |\t]

IDENTIFICADOR = [:jletter:][:jletterdigit:]*

CARACTERE_DE_ENTRADA = [^\r\n]

%%

<YYINITIAL> {

    "begin" { return new Symbol(sym.PALAVRA_RESERVADA_BEGIN); }
    "end" { return new Symbol(sym.PALAVRA_RESERVADA_END); }
    "if" { return new Symbol(sym.PALAVRA_RESERVADA_IF); }
    "then" { return new Symbol(sym.PALAVRA_RESERVADA_THEN); }
    "else" { return new Symbol(sym.PALAVRA_RESERVADA_ELSE); }
    "do" { return new Symbol(sym.PALAVRA_RESERVADA_DO); }
    "while" { return new Symbol(sym.PALAVRA_RESERVADA_WHILE); }
    "var" { return new Symbol(sym.PALAVRA_RESERVADA_VAR); }
    "procedure" { return new Symbol(sym.PALAVRA_RESERVADA_PROCEDURE); }
    "program" { return new Symbol(sym.PALAVRA_RESERVADA_PROGRAM); }

    ">=" { return new Symbol(sym.SIMBOLOS_ESPECIAIS_MAIOR_OU_IGUAL);}
    ">" { return new Symbol(sym.SIMBOLOS_ESPECIAIS_MAIOR_QUE);}
    "<>" { return new Symbol(sym.SIMBOLOS_ESPECIAIS_DIFERENTE);}
    "<=" { return new Symbol(sym.SIMBOLOS_ESPECIAIS_MENOR_OU_IGUAL);}
    "<" { return new Symbol(sym.SIMBOLOS_ESPECIAIS_MENOR_QUE);}
    ":=" { return new Symbol(sym.SIMBOLOS_ESPECIAIS_ATRIBUICAO);}
    "=" { return new Symbol(sym.SIMBOLOS_ESPECIAIS_IGUAL);}
    ";" { return new Symbol(sym.SIMBOLOS_ESPECIAIS_PONTO_E_VIRGULA);}
    "," { return new Symbol(sym.SIMBOLOS_ESPECIAIS_VIRGULA);}
    ":" { return new Symbol(sym.SIMBOLOS_ESPECIAIS_DOIS_PONTOS);}


    "and" { return new Symbol(sym.OPERADOR_LOGICO_AND );}
    "or" { return new Symbol(sym.OPERADOR_LOGICO_OR );}
    "not" { return new Symbol(sym.OPERADOR_LOGICO_NOT );}


    "+" { return new Symbol(sym.OPERADOR_MATEMATICO_SOMA);}
    "-" { return new Symbol(sym.OPERADOR_MATEMATICO_SUBTRACAO);}
    "*" { return new Symbol(sym.OPERADOR_MATEMATICO_MULTIPLICACAO );}
    {OPERADOR_MATEMATICO_DIVISAO  } { return new Symbol(sym.OPERADOR_MATEMATICO_DIVISAO );}

    {NUMERO_INTEIRO}                     { return new Symbol(sym.NUMERO_INTEIRO);}

    "int"					{ return new Symbol(sym.TIPO_VARIAVEL_INT);}
    "boolean"				{ return new Symbol(sym.TIPO_VARIAVEL_BOOLEAN);}

    "("                     { return new Symbol(sym.ABRE_PARENTESES);}
    ")"                    { return new Symbol(sym.FECHA_PARENTESES);}


    {COMENTARIO}					 { return new Symbol(sym.COMENTARIO);}


    {QUEBRA_DE_LINHA}				 {}



    {COMENTARIO_TRADICIONAL}    		{}
    {COMENTARIO_DE_LINHA}      		{}

    {BRANCO} 							{}

    {IDENTIFICADOR}    { return new Symbol(sym.IDENTIFICADOR);}

    "."              { return new Symbol(sym.FIM);}

    {CARACTERE_DE_ENTRADA}			{ return new Symbol(sym.DESCONHECIDO);}

} 


. { return new Symbol(sym.DESCONHECIDO);}