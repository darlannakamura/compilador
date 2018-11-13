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
public class ComandoCondicionalCasado extends Casado {
    Expressao expressao;
    Casado comandoTrue, comandoFalse;
    
    public ComandoCondicionalCasado(Expressao expressao, Casado comandoTrue, Casado comandoFalse){
        this.expressao = expressao;
        this.comandoTrue = comandoTrue;
        this.comandoFalse = comandoFalse;
    }
    
    public void run(){

    }    
}
