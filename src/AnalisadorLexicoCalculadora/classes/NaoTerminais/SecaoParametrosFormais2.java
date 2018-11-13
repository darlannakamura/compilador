/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.Simbolo;
import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;

/**
 *
 * @author rafae
 */
public class SecaoParametrosFormais2 {
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
