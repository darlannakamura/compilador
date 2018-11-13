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
public class ListaExpressoes {
    ArrayList<Expressao> listaExpressoes;
    
    public ListaExpressoes(Expressao expressao){
        listaExpressoes = new ArrayList();
        listaExpressoes.add(expressao);
    }
    
    public void add(Expressao expressao){
        listaExpressoes.add(expressao);
    }
    
    public void run(TabelaSimbolos global, TabelaSimbolos local){
        // Executar cada expressão
        for(Expressao e: listaExpressoes){
            e.run(global, local);
        }
    }    
}
