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

    public int run(TabelaSimbolos global, TabelaSimbolos local) {
        // Primeiro checa se variável está no escopo local, depois no global.
        // Se não achar, dá erro
        if(local.getValorVariavel(identificador) != Integer.MIN_VALUE){
            return local.getValorVariavel(identificador);
        }
        else if(global.getValorVariavel(identificador) != Integer.MIN_VALUE){
            return global.getValorVariavel(identificador);
        }
        else{
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\nERRO SEMÂNTICO: classe Identificador, método .run()\n!!!!!!!!!!!!!!!!!!!!!!!!!!");
            return Integer.MIN_VALUE;
        }
        
    }
    
}
