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
public class NaoCasado extends Comando {
    
    Expressao expressao;
    Comando comando;
    Casado casado;
    NaoCasado naoCasado;
    ComandoRepetitivoNaoCasado comandoRepetitivoNaoCasado;
    
    // 3 construtores diferentes. 1 para cada produção da BNF    
    public NaoCasado(Expressao expressao, Comando comando){
        this.expressao = expressao;
        this.comando = comando;
    }
    
    public NaoCasado(Expressao expressao, Casado casado, NaoCasado naoCasado){
        this.expressao = expressao;
        this.casado = casado;
        this.naoCasado = naoCasado;
    }
    public NaoCasado(ComandoRepetitivoNaoCasado comandoRepetitivoNaoCasado){
        this.comandoRepetitivoNaoCasado = comandoRepetitivoNaoCasado;
    }
    
    @Override
    public void run(TabelaSimbolos global, TabelaSimbolos local, GeracaoDeCodigo geracaoDeCodigo) {
        System.out.println("Entrou no não casado (ELSE) ");
        if (comando != null){ 
            String rotulo = geracaoDeCodigo.getRotulo();
            expressao.run(global, local, geracaoDeCodigo);
            geracaoDeCodigo.add(rotulo, "DSVF");
            comando.run(global, local, geracaoDeCodigo);
        }
        else if(casado != null){
            String rotuloDoElse = geracaoDeCodigo.getRotulo();
            String rotuloDeSaidaDoCasado = geracaoDeCodigo.getRotulo();
            expressao.run(global, local, geracaoDeCodigo);
            geracaoDeCodigo.add(rotuloDoElse, "DSVF");
            casado.run(global, local, geracaoDeCodigo);
            geracaoDeCodigo.add(rotuloDeSaidaDoCasado, "DSVS");
            geracaoDeCodigo.add(rotuloDoElse, "NADA");
            naoCasado.run(global, local, geracaoDeCodigo);
            geracaoDeCodigo.add(rotuloDeSaidaDoCasado, "DSVS");
            geracaoDeCodigo.add(rotuloDeSaidaDoCasado, "NADA");
        }
        else{ // comandoRepetitivoNaoCasado != null
            comandoRepetitivoNaoCasado.run(global, local, geracaoDeCodigo);
        }

    }
}
