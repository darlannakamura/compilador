/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.NaoTerminais.Expressao;
import AnalisadorLexicoCalculadora.classes.NaoTerminais.Casado;
import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;
import AnalisadorLexicoCalculadora.ui.GeracaoDeCodigo;

/**
 *
 * @author rafae
 */
public class ComandoRepetitivoCasado extends Comando {

    Expressao expressao;
    Casado casado;

    public ComandoRepetitivoCasado(Expressao expressao, Casado casado) {
        this.expressao = expressao;
        this.casado = casado;
    }

    @Override
    public void run(TabelaSimbolos global, TabelaSimbolos local, GeracaoDeCodigo geracaoDeCodigo) {
        int x = geracaoDeCodigo.getLinhaAtual();
        int y = new Integer(-300);
        geracaoDeCodigo.add(x, "NADA", Integer.MIN_VALUE);
        expressao.run(global, local, geracaoDeCodigo);
        geracaoDeCodigo.add("DSVF", y);
        casado.run(global, local, geracaoDeCodigo);
        geracaoDeCodigo.add("DSVS", x); // voltar para o início da expressão
        y = geracaoDeCodigo.getLinhaAtual();
        geracaoDeCodigo.add(y, "NADA", Integer.MIN_VALUE);
    }

    
}
