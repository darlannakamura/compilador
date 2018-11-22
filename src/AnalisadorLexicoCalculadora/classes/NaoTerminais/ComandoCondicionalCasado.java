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
public class ComandoCondicionalCasado extends Comando {
    Expressao expressao;
    Casado comandoTrue, comandoFalse;
    
    public ComandoCondicionalCasado(Expressao expressao, Casado comandoTrue, Casado comandoFalse){
        this.expressao = expressao;
        this.comandoTrue = comandoTrue;
        this.comandoFalse = comandoFalse;
    }


    @Override
    public void run(TabelaSimbolos global, TabelaSimbolos local, GeracaoDeCodigo geracaoDeCodigo) {

        String rotuloDoElse = geracaoDeCodigo.getRotulo();
        String rotuloDoFim = geracaoDeCodigo.getRotulo();

        expressao.run(global, local, geracaoDeCodigo);
        geracaoDeCodigo.add(rotuloDoElse, "DVSF");
        comandoTrue.run(global, local, geracaoDeCodigo);
        geracaoDeCodigo.add(rotuloDoFim, "DSVS");
        geracaoDeCodigo.add(rotuloDoElse, "NADA");
        comandoFalse.run(global, local, geracaoDeCodigo);
        geracaoDeCodigo.add(rotuloDoFim, "DSVS");
        geracaoDeCodigo.add(rotuloDoFim, "NADA");
    }
}
