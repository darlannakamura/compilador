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
public class ComandoCondicionalCasado extends Comando {
    Expressao expressao;
    Casado comandoTrue, comandoFalse;
    
    public ComandoCondicionalCasado(Expressao expressao, Casado comandoTrue, Casado comandoFalse){
        this.expressao = expressao;
        this.comandoTrue = comandoTrue;
        this.comandoFalse = comandoFalse;
    }

    @Override
    public void run(TabelaSimbolos global, TabelaSimbolos local) {
            System.out.println("Entou aqui");
        if(expressao.run(global, local) != 0){
            System.out.println("resultado != 0");
            comandoTrue.run(global, local);
        }
        else{
            System.out.println("resultado == 0");
            comandoFalse.run(global, local);
        }
    }
}
