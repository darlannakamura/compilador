/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

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
    public void run(TabelaSimbolos tabela) {

    }
}
