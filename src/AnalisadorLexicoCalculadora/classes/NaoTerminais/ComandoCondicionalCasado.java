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
        expressao.run(global, local, geracaoDeCodigo);
        Integer x = new Integer(-100);
        geracaoDeCodigo.add("DSVF", x); // desviar pro início do false
        comandoTrue.run(global, local, geracaoDeCodigo);
        Integer y = new Integer(-200);
        geracaoDeCodigo.add("DSVS", y); // desvia pra após o false
        x = geracaoDeCodigo.getLinhaAtual();
        geracaoDeCodigo.add(x, "NADA", Integer.MIN_VALUE);
        comandoFalse.run(global, local, geracaoDeCodigo);
        y = geracaoDeCodigo.getLinhaAtual();
        geracaoDeCodigo.add(y, "NADA", Integer.MIN_VALUE);
    }
}
