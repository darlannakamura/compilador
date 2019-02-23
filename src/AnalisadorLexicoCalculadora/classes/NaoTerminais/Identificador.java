/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.NaoTerminais.Fator;
import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;
import AnalisadorLexicoCalculadora.ui.GeracaoDeCodigo;
import AnalisadorLexicoCalculadora.utils.ErrosSemanticos;

/**
 *

 * @author rafae
 */
public class Identificador extends Fator {

    String identificador;


    public Identificador(String identificador){
        this.identificador = identificador;
    }


    @Override
    public int run(TabelaSimbolos global, TabelaSimbolos local, GeracaoDeCodigo geracaoDeCodigo) {
        
        int enderecoMemoria = local.getEnderecoVariavel(identificador);
        if(enderecoMemoria == Integer.MIN_VALUE){
            System.out.println("ERRO! não foi possível pegar o endereco de memoria de "+identificador+" na classe Identificador");
        }else{
            geracaoDeCodigo.add("CRVL", enderecoMemoria);
        }
        
        // Primeiro checa se variável está no escopo local, depois no global.
        // Se não achar, dá erro
        if(local.getValorVariavel(identificador) != Integer.MIN_VALUE){
            System.out.println("Pegou o valor de "+identificador+" da tabela local");
            return local.getValorVariavel(identificador);
        }
        else if(global.getValorVariavel(identificador) != Integer.MIN_VALUE){
            System.out.println("Pegou o valor de "+identificador+" da tabela global");
            return global.getValorVariavel(identificador);
        }
        else{
            ErrosSemanticos.addErro("O identificador " + identificador + " foi utilizado sem ser declarado");
            return Integer.MIN_VALUE;
        }
        
    }
    
}

