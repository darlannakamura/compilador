
%%

%{

private void imprimir(String descricao, String lexema) {
    System.out.println(lexema + " - " + descricao);
}

%}


%class LexicalAnalyzer
%type void


BRANCO = [\n| |\t|\r]
MULTIPLICACAO = "*"
SUBTRACAO = "-"
DIVISAO = "/"
SOMA = "+"
INTEIRO = [0-9][0-9]*
REAL = [0-9].[0-9][0-9]*

%%


{BRANCO}                     { imprimir("Espaço em branco", yytext()); }
{MULTIPLICACAO}                         { imprimir("Operador de Multiplicação", yytext()); }
{DIVISAO}                         { imprimir("Operador de Divisão", yytext()); }
{SOMA}                         { imprimir("Operador de Soma", yytext()); }
{SUBTRACAO}                         { imprimir("Operador de Subtração", yytext()); }
{REAL}                         { imprimir("Número Real", yytext()); }
{INTEIRO}                     { imprimir("Número Inteiro", yytext()); }

. { throw new RuntimeException("Caractere inválido " + yytext()); }