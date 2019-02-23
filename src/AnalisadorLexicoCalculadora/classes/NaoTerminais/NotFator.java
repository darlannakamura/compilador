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
public class NotFator extends Fator {

    Fator fator;
    
    public NotFator(Fator fator){
        this.fator = fator;
    }
  

    @Override
    public int run(TabelaSimbolos global, TabelaSimbolos local, GeracaoDeCodigo geracaoDeCodigo) {
        
        int r =  (fator.run(global, local, geracaoDeCodigo) == 0)? 1 : 0;
        geracaoDeCodigo.add("NEGA");
        return r;

    }

}
