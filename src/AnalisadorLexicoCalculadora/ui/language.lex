package AnalisadorLexicoCalculadora.ui;
import AnalisadorLexicoCalculadora.classes.ItemLexico;
import java.util.ArrayList;
%%


%{

//private void imprimir(String descricao, String lexema) {
//System.out.println(lexema + " - " + descricao);
//descricoes.add(descricao);
//lexemas.add(lexema);
//}

private void add(String token){
    ItemLexico item = new ItemLexico();
    item.setLexema(yytext());
    item.setToken(token);
    item.setLinha(yyline);
    item.setColuna_inicio(yycolumn);   
    item.setColuna_fim(yycolumn - yylength());

    itens.add(item);
}

//Vamos colorir o código-fonte, se você digitar a cor, o texto do token vai ser colorido
//com a cor especificada. 
private void escrever(String cor){
	if(cor != null && !cor.equals("")){
		codigoFonteColorido += "<span style=\"color:"+cor+"\"><b>"+yytext()+"</span></b>";
	}
	else{
		codigoFonteColorido += yytext();
	}
}


private ArrayList<ItemLexico> itens = new ArrayList<>();
private String codigoFonteColorido = "";

public String getCodigoFonteColorido(){
	return codigoFonteColorido;
}

public void setCodigoFonteColorido(String codigo){
	codigoFonteColorido = codigo;
}

public ArrayList<ItemLexico> getItens() {
return itens;
}

public void setItens(ArrayList<ItemLexico> itens) {
this.itens = itens;
}


%}


%class LexicalAnalyzer
%type void
%line
%column

PALAVRA_RESERVADA_BEGIN = "begin"
PALAVRA_RESERVADA_END = "end"
PALAVRA_RESERVADA_IF = "if"
PALAVRA_RESERVADA_THEN = "then"
PALAVRA_RESERVADA_ELSE = "else"
PALAVRA_RESERVADA_DO = "do"
PALAVRA_RESERVADA_WHILE = "while"
PALAVRA_RESERVADA_VAR = "var"
PALAVRA_RESERVADA_PROCEDURE = "procedure"
PALAVRA_RESERVADA_PROGRAM = "program"


SIMBOLOS_ESPECIAIS_MAIOR_OU_IGUAL = ">="
SIMBOLOS_ESPECIAIS_MAIOR_QUE = ">"
SIMBOLOS_ESPECIAIS_DIFERENTE = "<>"
SIMBOLOS_ESPECIAIS_MENOR_OU_IGUAL = "<="
SIMBOLOS_ESPECIAIS_MENOR_QUE = "<"
SIMBOLOS_ESPECIAIS_ATRIBUICAO = ":="
SIMBOLOS_ESPECIAIS_IGUAL = "="
SIMBOLOS_ESPECIAIS_PONTO_E_VIRGULA = ";"
SIMBOLOS_ESPECIAIS_VIRGULA = ","
SIMBOLOS_ESPECIAIS_DOIS_PONTOS = ":"


OPERADOR_LOGICO_AND = "and"
OPERADOR_LOGICO_OR = "or"
OPERADOR_LOGICO_NOT = "not"

OPERADOR_MATEMATICO_SOMA = "+"
OPERADOR_MATEMATICO_SUBTRACAO = "-"
OPERADOR_MATEMATICO_MULTIPLICACAO = "*"
OPERADOR_MATEMATICO_DIVISAO = "div"|"/"

NUMERO_INTEIRO = [0-9][0-9]*

TIPO_VARIAVEL_INT = "int"
TIPO_VARIAVEL_BOOLEAN = "boolean"

ABRE_PARENTESE = "("
FECHA_PARENTESE = ")"

ABRE_COMENTARIO = "{"
FECHA_COMENTARIO = "}"
COMENTARIO_LINHA = "//"

QUEBRA_DE_LINHA = \r|\n|\r\n


COMENTARIO = {COMENTARIO_TRADICIONAL} | {COMENTARIO_DE_LINHA}

COMENTARIO_TRADICIONAL   = "{" [^*] ~"}"
COMENTARIO_DE_LINHA     = "//" {CARACTERE_DE_ENTRADA}* {QUEBRA_DE_LINHA}?

BRANCO = [ |\t]

IDENTIFICADOR = [:jletter:][:jletterdigit:]*

CARACTERE_DE_ENTRADA = [^\r\n]

%%
{PALAVRA_RESERVADA_BEGIN} {  add("PALAVRA_RESERVADA_BEGIN"); escrever("blue"); }
{PALAVRA_RESERVADA_END} {  add("PALAVRA_RESERVADA_END"); escrever("blue"); }
{PALAVRA_RESERVADA_IF} {  add("PALAVRA_RESERVADA_IF"); escrever("blue"); }
{PALAVRA_RESERVADA_THEN} {  add("PALAVRA_RESERVADA_THEN"); escrever("blue"); }
{PALAVRA_RESERVADA_ELSE} {  add("PALAVRA_RESERVADA_ELSE"); escrever("blue"); }
{PALAVRA_RESERVADA_DO} {  add("PALAVRA_RESERVADA_DO"); escrever("blue"); }
{PALAVRA_RESERVADA_WHILE} {  add("PALAVRA_RESERVADA_WHILE"); escrever("blue"); }
{PALAVRA_RESERVADA_VAR} {  add("PALAVRA_RESERVADA_VAR"); escrever("blue"); }
{PALAVRA_RESERVADA_PROCEDURE} { add("PALAVRA_RESERVADA_PROCEDURE"); escrever("blue"); }
{PALAVRA_RESERVADA_PROGRAM} { add("PALAVRA_RESERVADA_PROGRAM"); escrever("blue"); }

{SIMBOLOS_ESPECIAIS_MAIOR_OU_IGUAL} { add("SIMBOLOS_ESPECIAIS_MAIOR_OU_IGUAL"); escrever("black"); }
{SIMBOLOS_ESPECIAIS_MAIOR_QUE} { add("SIMBOLOS_ESPECIAIS_MAIOR_QUE"); escrever("black"); }
{SIMBOLOS_ESPECIAIS_DIFERENTE} { add("SIMBOLOS_ESPECIAIS_DIFERENTE"); escrever("black"); }
{SIMBOLOS_ESPECIAIS_MENOR_OU_IGUAL} { add("SIMBOLOS_ESPECIAIS_MENOR_OU_IGUAL"); escrever("black");   }
{SIMBOLOS_ESPECIAIS_MENOR_QUE} { add("SIMBOLOS_ESPECIAIS_MENOR_QUE"); escrever("black");  }
{SIMBOLOS_ESPECIAIS_ATRIBUICAO} { add("SIMBOLOS_ESPECIAIS_ATRIBUICAO"); escrever("black");  }
{SIMBOLOS_ESPECIAIS_IGUAL} { add("SIMBOLOS_ESPECIAIS_IGUAL"); escrever("black");  }
{SIMBOLOS_ESPECIAIS_PONTO_E_VIRGULA} { add("SIMBOLOS_ESPECIAIS_PONTO_E_VIRGULA"); escrever("black"); }
{SIMBOLOS_ESPECIAIS_VIRGULA} { add("SIMBOLOS_ESPECIAIS_VIRGULA"); escrever("black"); }
{SIMBOLOS_ESPECIAIS_DOIS_PONTOS} { add("SIMBOLOS_ESPECIAIS_DOIS_PONTOS"); escrever("black"); }


{OPERADOR_LOGICO_AND } { add("OPERADOR_LOGICO_AND "); escrever("black"); }
{OPERADOR_LOGICO_OR } { add("OPERADOR_LOGICO_OR "); escrever("black"); }
{OPERADOR_LOGICO_NOT } { add("OPERADOR_LOGICO_NOT "); escrever("black"); }


{OPERADOR_MATEMATICO_SOMA } { add("OPERADOR_MATEMATICO_SOMA"); escrever("black"); }
{OPERADOR_MATEMATICO_SUBTRACAO  } { add("OPERADOR_MATEMATICO_SUBTRACAO"); escrever("black"); }
{OPERADOR_MATEMATICO_MULTIPLICACAO  } { add("OPERADOR_MATEMATICO_MULTIPLICACAO "); escrever("black"); }
{OPERADOR_MATEMATICO_DIVISAO  } { add("OPERADOR_MATEMATICO_DIVISAO "); escrever("black"); }

{NUMERO_INTEIRO}                     { add("NUMERO_INTEIRO"); escrever(""); }

{TIPO_VARIAVEL_INT}					{ add("TIPO_VARIAVEL_INT"); escrever("red");}
{TIPO_VARIAVEL_BOOLEAN}				{ add("TIPO_VARIAVEL_BOOLEAN"); escrever("red"); }

{ABRE_PARENTESE}                     { add("ABRE_PARENTESES"); escrever(""); }
{FECHA_PARENTESE}                    { add("FECHA_PARENTESES"); escrever(""); }


{COMENTARIO}					 { add("COMENTARIO"); escrever("gray"); }


{QUEBRA_DE_LINHA}				 { escrever(""); }



{COMENTARIO_TRADICIONAL}    		{}
{COMENTARIO_DE_LINHA}      		{}

{BRANCO} 							{}

{IDENTIFICADOR}    { add("IDENTIFICADOR"); escrever(""); }

{CARACTERE_DE_ENTRADA}			{}



. { add("DESCONHECIDO"); escrever("red"); }