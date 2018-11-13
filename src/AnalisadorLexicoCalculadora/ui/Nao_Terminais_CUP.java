/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes;

import AnalisadorLexicoCalculadora.ui.Sym;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
interface Expressao_Interface { int run(TabelaSimbolos tabela); }
interface Condicao_Interface { boolean test(TabelaSimbolos tabela); }
interface Comando_Interface { void run(TabelaSimbolos tabela); }

class Program{
    
    Bloco bloco;
    
    public Program(Bloco bloco){
        this.bloco = bloco;
    }
    
    public void exec(){
        bloco.run();
    }
}

class Bloco{
    
    ParteDeclaracaoVariaveis parteDeclaracaoVariaveis;
    ParteDeclaracaoSubrotinas parteDeclaracaoSubrotinas;
    ComandoComposto comandoComposto;
    TabelaSimbolos tabela;
    
    public Bloco(ParteDeclaracaoVariaveis parteDeclaracaoVariaveis,
                ParteDeclaracaoSubrotinas parteDeclaracaoSubrotinas,
                ComandoComposto comandoComposto){
        this.parteDeclaracaoVariaveis = parteDeclaracaoVariaveis;
        this.parteDeclaracaoSubrotinas = parteDeclaracaoSubrotinas;
        this.comandoComposto = comandoComposto;
    }
    
    public void run(){
        if(parteDeclaracaoVariaveis != null)
            parteDeclaracaoVariaveis.run(tabela);
        if(parteDeclaracaoSubrotinas != null)
            parteDeclaracaoSubrotinas.run();
        comandoComposto.run(tabela);
    }
    
    public TabelaSimbolos getTabela(){
        return tabela;
    }
}

class ParteDeclaracaoVariaveis{
    
    ArrayList<DeclaracaoVariaveis> declaracoesVariaveis;
    
    public ParteDeclaracaoVariaveis(DeclaracaoVariaveis declaracao){
        // Inicializa com uma declaração
        declaracoesVariaveis = new ArrayList<DeclaracaoVariaveis>();
        declaracoesVariaveis.add(declaracao);
    }
    
    public void add(DeclaracaoVariaveis declaracao){
        declaracoesVariaveis.add(declaracao);
    }
    
    public void run(TabelaSimbolos tabela){
        // Roda todas as declarações de variáveis
        for(DeclaracaoVariaveis d: declaracoesVariaveis){
            d.run(tabela);
        }
    }
}

class DeclaracaoVariaveis implements Comando_Interface{

    String tipo;
    ListaIdentificadores listaIdentificadores;
    
    public DeclaracaoVariaveis(String tipo, ListaIdentificadores lista){
        this.tipo = tipo;
        listaIdentificadores = lista;
    }

    @Override
    public void run(TabelaSimbolos tabela) {
        // Adiciona as variáveis na tabela do procedimento (ou global), checando se já existe
        for(String identificador: listaIdentificadores.getLista()){
            tabela.adicionarSimbolo(new Simbolo(identificador, "identificador", "variavel", this.tipo));
        }
    }
    
}

class ListaIdentificadores{
    ArrayList<String> lista;
    
    public ListaIdentificadores(String id){
        lista = new ArrayList<String>();
        lista.add(id);
    }
    
    public void add(String id){
        lista.add(id);
    }
    
    public ArrayList<String> getLista(){
        return this.lista;
    }
}

class ParteDeclaracaoSubrotinas{
    
    ArrayList<DeclaracaoProcedimento> declaracoesProcedimentos;
    
    public ParteDeclaracaoSubrotinas(DeclaracaoProcedimento declaracao){
        declaracoesProcedimentos = new ArrayList<DeclaracaoProcedimento>();
        declaracoesProcedimentos.add(declaracao);
    }
    
    public void add(DeclaracaoProcedimento declaracao){
        declaracoesProcedimentos.add(declaracao);
    }
     
    public void run(){
        // Declara todas as subrotinas
        for(DeclaracaoProcedimento d: declaracoesProcedimentos){
            d.run();
        }
    }
}

class DeclaracaoProcedimento{
    
    String nome;
    SecaoParametrosFormais secaoParametros;
    Bloco b;
    
    public DeclaracaoProcedimento(String nome, SecaoParametrosFormais secaoParametros, Bloco b){
        this.nome = nome;
        this.secaoParametros = secaoParametros;
        this.b = b;
    }
    
    public void run(){
        // Adiciona os parâmetros formais na tabela do procedimento
        secaoParametros.run(b.getTabela());
    }
}

class SecaoParametrosFormais {
    
    ArrayList<SecaoParametrosFormais2> secaoParametros;
    
    public SecaoParametrosFormais(SecaoParametrosFormais2 secaoParametros2){
        secaoParametros = new ArrayList<SecaoParametrosFormais2>();
        secaoParametros.add(secaoParametros2);
    }
    
    public void add(SecaoParametrosFormais2 secaoParametros2){
        secaoParametros.add(secaoParametros2);
    }
    
    public void run(TabelaSimbolos tabela){
        // Adiciona os parâmetros na tabela do procedimento
        for(SecaoParametrosFormais2 sp2: secaoParametros){
            sp2.run(tabela);
        }
    }
}

class SecaoParametrosFormais2 {
    
    private boolean var;
    private String tipo;
    private ListaIdentificadores lista;
    
    public SecaoParametrosFormais2(String var, String tipo, ListaIdentificadores lista){
        this.var = true;
        this.tipo = tipo;
        this.lista = lista;
    }
    
    public SecaoParametrosFormais2(String tipo, ListaIdentificadores lista){
        this.var = false;
        this.tipo = tipo;
        this.lista = lista;
    }
    
    public void run(TabelaSimbolos tabelaProcedimento){
        // Adiciona a seção dos parâmetros no procedimento
        for(String parametro: lista.getLista()){
            /*
            
                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            
                Falta adicionar se tem var ou não.
                Tem que pensar na tabela de símbolos.
            
                """""""""""""""""""""""""""""""""""""""
            
            
            */
            tabelaProcedimento.adicionarSimbolo(new Simbolo(parametro, "identificador", "parametro", this.tipo));
        }
    }
}

class ComandoComposto {
    
    Comandos listaComandos;

    public ComandoComposto(Comandos listaComandos){
        this.listaComandos = listaComandos;
    }
    
    public void run(TabelaSimbolos tabela) {
        // Executar todos os comandos da lista
    }
    
}

class Comandos {
    ArrayList<Comando> comandos;
    
    public Comandos(Comando comando){
        comandos = new ArrayList<Comando>();
        comandos.add(comando);
    }
    
    public void add(Comando comando){
        comandos.add(comando);
    }
    
    public void run(TabelaSimbolos tabela){
        for(Comando c: comandos){
            c.run(tabela);
        }
    }
}

abstract class Comando implements Comando_Interface {
    
    Comando c;
      
    public Comando getComando(){
        return c;
    }
}

class Casado extends Comando {
    
    @Override
    public void run(TabelaSimbolos tabela) {
    }
    
}

class NaoCasado extends Comando {

    Expressao expressao;
    Comando comando;
    Casado casado;
    NaoCasado naoCasado;
    ComandoRepetitivoNaoCasado comandoRepetitivoNaoCasado;
    
    // 3 construtores diferentes. 1 para cada produção da BNF    
    public NaoCasado(Expressao expressao, Comando comando){
        this.expressao = expressao;
        this.comando = comando;
    }
    
    public NaoCasado(Expressao expressao, Casado casado, NaoCasado naoCasado){
        this.expressao = expressao;
        this.casado = casado;
        this.naoCasado = naoCasado;
    }
    public NaoCasado(ComandoRepetitivoNaoCasado comandoRepetitivoNaoCasado){
        this.comandoRepetitivoNaoCasado = comandoRepetitivoNaoCasado;
    }
    
    @Override
    public void run(TabelaSimbolos tabela) {

    }
    
}

class ComandoRepetitivoNaoCasado implements Comando_Interface {
    
    Expressao expressao;
    NaoCasado naoCasado;
    
    public ComandoRepetitivoNaoCasado(Expressao expressao, NaoCasado naoCasado){
        this.expressao = expressao;
        this.naoCasado = naoCasado;
    }
    
    @Override
    public void run(TabelaSimbolos tabela) {

    }
    
}

class ChamadaProcedimento extends Comando {
    
    String identificador;
    ListaExpressoes listaExpressoes;
    
    public ChamadaProcedimento(String identificador, ListaExpressoes listaExpressoes){
        this.identificador = identificador;
        this.listaExpressoes = listaExpressoes;
    }
    
    @Override
    public void run(TabelaSimbolos tabela) {

    }
    
}

class ListaExpressoes {
    ArrayList<Expressao> listaExpressoes;
    
    public ListaExpressoes(Expressao expressao){
        listaExpressoes = new ArrayList();
        listaExpressoes.add(expressao);
    }
    
    public void add(Expressao expressao){
        listaExpressoes.add(expressao);
    }
    
    public void run(){
        // Executar cada expressão
   
    }
    
}

class Atribuicao extends Casado {
    String identificador;
    Expressao expressao;
    
    public Atribuicao(String identificador, Expressao expressao){
        this.identificador = identificador;
        this.expressao = expressao;
    }
    
    public void run(TabelaSimbolos tabela){
        // Adiciona, na tabela de símbolos, o valor atribuído
        
        //tabela.atribuicao(identificador, expressao.run());
    }
}

class ComandoCondicionalCasado extends Casado {
    Expressao expressao;
    Casado comandoTrue, comandoFalse;
    
    public ComandoCondicionalCasado(Expressao expressao, Casado comandoTrue, Casado comandoFalse){
        this.expressao = expressao;
        this.comandoTrue = comandoTrue;
        this.comandoFalse = comandoFalse;
    }
    
    public void run(){

    }
}

class ComandoRepetitivoCasado extends Casado {
    Expressao expressao;
    Casado casado;
    
    public ComandoRepetitivoCasado(Expressao expressao, Casado casado){
        this.expressao = expressao;
        this.casado = casado;
    }
}

class Expressao implements  Expressao_Interface {

        ExpressaoSimples expressaoSimples1;
        int operacao;
        ExpressaoSimples expressaoSimples2;
    
        @Override
        public int run(TabelaSimbolos tabela) {
            if (expressaoSimples2 == null){
                return expressaoSimples1.run(tabela);
            }
            switch(operacao){
                case Sym.SIMBOLOS_ESPECIAIS_IGUAL:
                    return (expressaoSimples1.run(tabela) == expressaoSimples2.run(tabela)) ? 1: 0;
                case Sym.SIMBOLOS_ESPECIAIS_MAIOR_OU_IGUAL:
                    return (expressaoSimples1.run(tabela) >= expressaoSimples2.run(tabela)) ? 1: 0;
                case Sym.SIMBOLOS_ESPECIAIS_MAIOR_QUE:
                    return (expressaoSimples1.run(tabela) > expressaoSimples2.run(tabela)) ? 1: 0;
                case Sym.SIMBOLOS_ESPECIAIS_DIFERENTE:
                    return (expressaoSimples1.run(tabela) != expressaoSimples2.run(tabela)) ? 1: 0;
                case Sym.SIMBOLOS_ESPECIAIS_MENOR_OU_IGUAL:
                    return (expressaoSimples1.run(tabela) <= expressaoSimples2.run(tabela)) ? 1: 0;
                case Sym.SIMBOLOS_ESPECIAIS_MENOR_QUE:
                    return (expressaoSimples1.run(tabela) < expressaoSimples2.run(tabela)) ? 1: 0;
                default:
                    // erro
                    return Integer.MIN_VALUE;
            }
            
        }
        
        public Expressao(ExpressaoSimples expressaoSimples1){
            this.expressaoSimples1 = expressaoSimples1;
            this.operacao = 0;
            this.expressaoSimples2 = null;
        }
        
        public Expressao(ExpressaoSimples expressaoSimples1, int operacao, ExpressaoSimples expressaoSimples2){
            this.expressaoSimples1 = expressaoSimples1;
            this.operacao = operacao;
            this.expressaoSimples2 = expressaoSimples2;
        }
    
}

class ExpressaoSimples implements Expressao_Interface {
    Termo termo;
    RepeticaoTermo repeticaoTermo;
    
    
    public ExpressaoSimples(Termo termo){
        this.termo = termo;
        this.repeticaoTermo = null;
    }
    
    public ExpressaoSimples(Termo termo, RepeticaoTermo repeticaoTermo){
        this.termo = termo;
        this.repeticaoTermo = repeticaoTermo;
    }

    @Override
    public int run(TabelaSimbolos tabela) {
        int valor = termo.run(tabela);
        if (repeticaoTermo != null){
            for(RepeticaoTermo2 rep2: repeticaoTermo.getRepeticoesTermo2()){
                switch(rep2.getOperador()){
                    case Sym.OPERADOR_MATEMATICO_SOMA:
                        valor += rep2.getTermo().run(tabela);
                        break;
                    case Sym.OPERADOR_MATEMATICO_SUBTRACAO:
                        valor -= rep2.getTermo().run(tabela);
                        break;
                    case Sym.OPERADOR_LOGICO_OR:
                        valor += rep2.getTermo().run(tabela);
                        if (valor == 2)
                            valor = 1;
                        break;
                }
            }
        }
        return valor;
    }
    
}


class Termo {
    Fator fator;
    RepeticaoFator repeticaoFator;
    
    public Termo(Fator fator){
        this.fator = fator;
    }
    
    public Termo(Fator fator, RepeticaoFator repeticaoFator){
        this.fator = fator;
        this.repeticaoFator = repeticaoFator;
    }
    
    public int run(TabelaSimbolos tabela){
        int valor = fator.run(tabela);
        for(RepeticaoFator2 rep2: repeticaoFator.getRepeticoesFator2()){
            switch(rep2.getOperador()){
                case Sym.OPERADOR_MATEMATICO_MULTIPLICACAO:
                    valor *= rep2.getFator().run(tabela);
                    break;
                case Sym.OPERADOR_MATEMATICO_DIVISAO:
                    valor /= rep2.getFator().run(tabela);
                    break;
                case Sym.OPERADOR_LOGICO_AND:
                    // 0 * 0 = 0; 1 * 0 = 0; 1 * 1 = 1
                    valor *= rep2.getFator().run(tabela);
                    break;
                            
            }
        }
        return valor;
    }
    
}

class RepeticaoFator {
    ArrayList<RepeticaoFator2> repeticaoFator2;
    
    public RepeticaoFator(RepeticaoFator2 rf2){
        this.repeticaoFator2 = new ArrayList<>();
        repeticaoFator2.add(rf2);
        
    }
    
    public ArrayList<RepeticaoFator2> getRepeticoesFator2(){
        return repeticaoFator2;
    }

}

class RepeticaoFator2 {
    int operador;
    Fator fator;
    
    public RepeticaoFator2(int operador, Fator fator){
        this.operador = operador;
        this.fator = fator;
    }
    
    public int getOperador(){
        return operador;
    }
    
    public Fator getFator(){
        return fator;
    }
}

abstract class Fator implements Expressao_Interface{

}

class Identificador extends Fator{
    String identificador;
    
    public Identificador(String identificador){
        this.identificador = identificador;
    }

    @Override
    public int run(TabelaSimbolos tabela) {
        return tabela.getValorVariavel(identificador);
    }
    
}

class Numero extends Fator {
    Integer numero;
    
    public Numero(Integer numero){
        this.numero = numero;
    }

    @Override
    public int run(TabelaSimbolos tabela) {
        return numero;
    }
    
} 

class NotFator extends Fator{
    Fator fator;
    
    public NotFator(Fator fator){
        this.fator = fator;
    }

    @Override
    public int run(TabelaSimbolos tabela) {
        return (fator.run(tabela) == 0)? 1 : 0;
    }

}

class RepeticaoTermo {
    ArrayList<RepeticaoTermo2> repeticaoTermo;
    
    public RepeticaoTermo(RepeticaoTermo2 repeticaoTermo2){
        repeticaoTermo = new ArrayList<>();
        repeticaoTermo.add(repeticaoTermo2);
    }
    
    public void add(RepeticaoTermo2 repeticaoTermo2){
        repeticaoTermo.add(repeticaoTermo2);
    }
   
    public ArrayList<RepeticaoTermo2> getRepeticoesTermo2(){
        return repeticaoTermo;
    }
    
}

class RepeticaoTermo2 {
    int operador;
    Termo termo;
    
    public RepeticaoTermo2(int operador, Termo termo) {
        this.operador = operador;
        this.termo = termo;
    }
    
    public int getOperador(){
        return operador;
    }
    
    public Termo getTermo(){
        return termo;
    }
}











/*

non terminal program, bloco, parte_de_declaracoes_de_variaveis, declaracao_de_variavel;
non terminal tipo, lista_de_identificadores, parte_de_declaracoes_de_subrotinas;
non terminal declaracao_de_procedimento, parametros_formais, secao_de_parametros_formais;
non terminal comando, comando_composto, comandos, atribuicao;
non terminal expressao, expressao_simples, repeticao_termo;
non terminal termo, repeticao_fator, fator;
non terminal secao_de_parametros_formais2;
non terminal comando_condicional_casado, casado, nao_casado;
non terminal comando_repetitivo_casado, comando_repetitivo_nao_casado;
non terminal repeticao_fator2;
non terminal repeticao_termo2;
non terminal chamada_de_procedimento;
non terminal lista_de_expressoes;

*/