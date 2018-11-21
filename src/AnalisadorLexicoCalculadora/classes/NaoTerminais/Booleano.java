/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;
import AnalisadorLexicoCalculadora.ui.GeracaoDeCodigo;

/**
 *
 * @author darla
 */
public class Booleano extends Fator{
    int valor;
    
    
    public Booleano(String valor){
        if(valor.equals("true")){
           this.valor = 1;
        } else{
            this.valor = 0;
        }
    }
    

    @Override
    public int run(TabelaSimbolos global, TabelaSimbolos local, GeracaoDeCodigo geracaoDeCodigo) {
        geracaoDeCodigo.add("CRCT", this.valor);
        System.out.println("Entrou no boolean :D vai retornar: "+this.valor);
        return this.valor;
    }
    
}
