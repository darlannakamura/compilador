/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;
import AnalisadorLexicoCalculadora.ui.GeracaoDeCodigo;

/**
 *
 * @author rafae
 */

public class Programa {
    Bloco bloco;
    String nomePrograma;
    GeracaoDeCodigo geracaoDeCodigo;
    
    public Programa(Bloco bloco, String nome){
        this.bloco = bloco;
        this.nomePrograma = nome;
        this.geracaoDeCodigo = new GeracaoDeCodigo();
    }
    
    public Programa(Bloco bloco){
        this.bloco = bloco;
        this.nomePrograma = "0global";
    }
    
    public void exec(){
        //geração de código:
        geracaoDeCodigo.add("INPP");
       
        // Cria a tabela global
        TabelaSimbolos tabelaGlobal = new TabelaSimbolos(nomePrograma);
        bloco.setTabela(tabelaGlobal);
        bloco.setGeracaoDeCodigo(geracaoDeCodigo);
        bloco.run(tabelaGlobal);
        geracaoDeCodigo.add("PARA");
        geracaoDeCodigo.gerarArquivo();
        
    }
}
