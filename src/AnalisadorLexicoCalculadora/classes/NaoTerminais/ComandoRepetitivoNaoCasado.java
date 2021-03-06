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
public class ComandoRepetitivoNaoCasado implements Comando_Interface {
    Expressao expressao;
    NaoCasado naoCasado;
    
    public ComandoRepetitivoNaoCasado(Expressao expressao, NaoCasado naoCasado){
        this.expressao = expressao;
        this.naoCasado = naoCasado;
    }
    
    

    @Override
    public void run(TabelaSimbolos global, TabelaSimbolos local, GeracaoDeCodigo geracaoDeCodigo) {
//        int x = geracaoDeCodigo.getLinhaAtual();
//        int y = new Integer(-400);
//        geracaoDeCodigo.add(x, "NADA", Integer.MIN_VALUE);
//        expressao.run(global, local, geracaoDeCodigo);
//        geracaoDeCodigo.add("DSVF", y);
//        naoCasado.run(global, local, geracaoDeCodigo);
//        geracaoDeCodigo.add("DSVS", x); // voltar para o início da expressão
//        y = geracaoDeCodigo.getLinhaAtual();
//        geracaoDeCodigo.add(y, "NADA", Integer.MIN_VALUE);
        
        String rotuloComeco = geracaoDeCodigo.getRotulo();
        String rotuloDoElse = geracaoDeCodigo.getRotulo();
        
        geracaoDeCodigo.add(rotuloComeco, "NADA");
        expressao.run(global, local, geracaoDeCodigo);
        geracaoDeCodigo.add(rotuloDoElse, "DSVF");
        naoCasado.run(global, local, geracaoDeCodigo);
        geracaoDeCodigo.add(rotuloComeco, "DSVS");
        
        
    }
}
