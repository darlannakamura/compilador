/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;

/**
 *
 * @author rafae
 */

public class Programa {
    Bloco bloco;
    String nomePrograma;
    
    public Programa(Bloco bloco, String nome){
        this.bloco = bloco;
        this.nomePrograma = nome;
    }
    
    public void exec(){
        // Cria a tabela global
        TabelaSimbolos tabelaGlobal = new TabelaSimbolos("0global");
        bloco.setTabela(tabelaGlobal);
        bloco.run(tabelaGlobal);
        
    }
}
