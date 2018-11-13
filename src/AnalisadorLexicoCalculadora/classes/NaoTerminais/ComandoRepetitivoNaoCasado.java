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
public class ComandoRepetitivoNaoCasado implements Comando_Interface {
    Expressao expressao;
    NaoCasado naoCasado;
    
    public ComandoRepetitivoNaoCasado(Expressao expressao, NaoCasado naoCasado){
        this.expressao = expressao;
        this.naoCasado = naoCasado;
    }
    
    public void run(TabelaSimbolos global, TabelaSimbolos local) {
        while(expressao.run(global, local) != 0){
            naoCasado.run(global, local);
        }
    }
}
