/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.NaoTerminais.Fator;
import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;

/**
 *
 * @author darla
 */
public class Numero extends Fator {
    Integer numero;
    
    public Numero(Integer numero){
        this.numero = numero;
    }

    @Override
    public int run(TabelaSimbolos tabela) {
        return numero;
    }
    
} 
