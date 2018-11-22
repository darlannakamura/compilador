/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;
import AnalisadorLexicoCalculadora.ui.GeracaoDeCodigo;
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

    public ArrayList<Expressao> getListaExpressoes() {
        return listaExpressoes;
    }

    public void setListaExpressoes(ArrayList<Expressao> listaExpressoes) {
        this.listaExpressoes = listaExpressoes;
    }
    
    
    
    public void run(TabelaSimbolos global, TabelaSimbolos local, GeracaoDeCodigo geracaoDeCodigo){
        // Executar cada expressão
        for(Expressao e: listaExpressoes){
            e.run(global, local, geracaoDeCodigo);
        }
    }    
}
