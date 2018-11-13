/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.NaoTerminais.Termo;

/**
 *
 * @author rafae

 */
public class RepeticaoTermo2 {
    int operador;
    Termo termo;
    
    public RepeticaoTermo2(int operador, Termo termo) {
        this.operador = operador;
        this.termo = termo;
    }
    
    public int getOperador(){
        return operador;
    }
    
    public Termo getTermo(){
        return termo;
    }
}
