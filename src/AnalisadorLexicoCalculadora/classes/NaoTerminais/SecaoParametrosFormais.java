/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class SecaoParametrosFormais {
    ArrayList<SecaoParametrosFormais2> secaoParametros;
    
    public SecaoParametrosFormais(SecaoParametrosFormais2 secaoParametros2){
        secaoParametros = new ArrayList<SecaoParametrosFormais2>();
        secaoParametros.add(secaoParametros2);
    }
    
    public SecaoParametrosFormais add(SecaoParametrosFormais2 secaoParametros2){
        secaoParametros.add(secaoParametros2);
        return this;
    }
    
    public void run(TabelaSimbolos global, TabelaSimbolos local){
        // Adiciona os parâmetros na tabela do procedimento
        for(SecaoParametrosFormais2 sp2: secaoParametros){
            sp2.run(global, local);
        }
    }
}
