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
 * @author rafae
 */
public class Identificador extends Fator {

    String identificador;
    
    public Identificador(String identificador){
        this.identificador = identificador;
    }

    public int run(TabelaSimbolos tabela) {
        return tabela.getValorVariavel(identificador);
    }
    
}
