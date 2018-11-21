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
             System.out.println("Entou no comando condicional casado");
        if(expressao.run(global, local, geracaoDeCodigo) != 0){
            System.out.println("resultado != 0");
            comandoTrue.run(global, local, geracaoDeCodigo);
        }
        else{
            System.out.println("resultado == 0");
            comandoFalse.run(global, local, geracaoDeCodigo);
        }
    }
}
