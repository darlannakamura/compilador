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
public class Atribuicao extends Casado {
    String identificador;
    Expressao expressao;
    
    public Atribuicao(String identificador, Expressao expressao){
        this.identificador = identificador;
        this.expressao = expressao;
    }
    
    /**
     *
     * @param tabela
     */
    @Override
    public void run(TabelaSimbolos global, TabelaSimbolos local){
        // Adiciona, na tabela de símbolos, o valor atribuído
        if(tabela.atribuicao(identificador, expressao.run(tabela)).size() > 0){
            System.out.println("Deu erro!");
        }
    }
}
