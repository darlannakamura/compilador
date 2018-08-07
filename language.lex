	
%%

%{

private void imprimir(String descricao, String lexema) {
System.out.println(lexema + " - " + descricao);
descricoes.add(descricao);
lexemas.add(lexema);
}

private ArrayList<String> descricoes = new ArrayList<>();
private ArrayList<String> lexemas = new ArrayList<>();

public ArrayList<String> getDescricoes() {
return descricoes;
}

public void setDescricoes(ArrayList<String> descricoes) {
this.descricoes = descricoes;
}

public ArrayList<String> getLexemas() {
return lexemas;
}

public void setLexemas(ArrayList<String> lexemas) {
this.lexemas = lexemas;
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
REAL = [0-9][0-9]*.[0-9][0-9]*|[0-9][0-9]*,[0-9][0-9]*
ABRE_PARENTESE = "("
FECHA_PARENTESE = ")"

%%

{BRANCO}						{}
{MULTIPLICACAO}                         { imprimir("OP_MULT", yytext()); }
{DIVISAO}                         { imprimir("OP_DIV", yytext()); }
{SOMA}                         { imprimir("OP_SOMA", yytext()); }
{SUBTRACAO}                         { imprimir("OP_SUB", yytext()); }
{REAL}                         { imprimir("NUM_REAL", yytext()); }
{INTEIRO}                     { imprimir("NUM_INT", yytext()); }
{ABRE_PARENTESE}                     { imprimir("ABRE_PARENTESES", yytext()); }
{FECHA_PARENTESE}                     { imprimir("FECHA_PARENTESES", yytext()); }


. { imprimir("DESCONHECIDO", yytext()); }