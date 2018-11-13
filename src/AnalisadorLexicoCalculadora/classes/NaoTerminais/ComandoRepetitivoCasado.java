/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.NaoTerminais.Expressao;
import AnalisadorLexicoCalculadora.classes.NaoTerminais.Casado;
import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;

/**
 *
 * @author rafae
 */
public class ComandoRepetitivoCasado extends Casado {
    Expressao expressao;
    Casado casado;
    
    public ComandoRepetitivoCasado(Expressao expressao, Casado casado){
        this.expressao = expressao;
        this.casado = casado;
    }
    
    @Override
    public void run(TabelaSimbolos tabela){
        while(expressao.run(tabela) != 0){
            casado.run(tabela);
        }
    }

}
