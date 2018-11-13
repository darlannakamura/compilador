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
public class Atribuicao extends Casado {
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
