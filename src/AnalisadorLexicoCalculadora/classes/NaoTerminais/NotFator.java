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
public class NotFator extends Fator {

    Fator fator;
    
    public NotFator(Fator fator){
        this.fator = fator;
    }
  

    @Override
    public int run(TabelaSimbolos global, TabelaSimbolos local) {
        return (fator.run(global, local) == 0)? 1 : 0;
    }

}
