/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.NaoTerminais.Bloco;

/**
 *
 * @author rafae
 */
public class DeclaracaoProcedimento {
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
