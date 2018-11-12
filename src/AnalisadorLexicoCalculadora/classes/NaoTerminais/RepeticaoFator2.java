/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;


/**
 *
 * @author darla
 */
public class RepeticaoFator2 {
    int operador;
    Fator fator;
    
    public RepeticaoFator2(int operador, Fator fator){
        this.operador = operador;
        this.fator = fator;
    }
    
    public int getOperador(){
        return operador;
    }
    
    public Fator getFator(){
        return fator;
    }
}
