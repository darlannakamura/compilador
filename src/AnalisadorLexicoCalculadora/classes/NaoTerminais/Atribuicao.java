/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;
import AnalisadorLexicoCalculadora.ui.GeracaoDeCodigo;
import AnalisadorLexicoCalculadora.utils.ErrosSemanticos;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class Atribuicao extends Comando {

    String identificador;
    Expressao expressao;

    public Atribuicao(String identificador, Expressao expressao) {
        this.identificador = identificador;
        this.expressao = expressao;
    }


    @Override
    public void run(TabelaSimbolos global, TabelaSimbolos local, GeracaoDeCodigo geracaoDeCodigo) {
        
        
        int retornoExp = expressao.run(global, local, geracaoDeCodigo);
        
        //expressão vai deixar o valor no topo da pilha como resultado da operação, é só armazenar na variável
        int enderecoDeMemoria = local.getEnderecoVariavel(identificador);
        if(enderecoDeMemoria != Integer.MIN_VALUE){
            geracaoDeCodigo.add("ARMZ", enderecoDeMemoria);
        }else{
            System.out.println("ERRO ao receber endereço de memória do identificador: "+identificador+ " na classe Atribuição");
        }
        
        ArrayList<String> resultadoLocal = local.atribuicao(identificador, expressao.run(global, local, geracaoDeCodigo));
        local.print();
        System.out.println("Retorno exp:" + retornoExp + " size resultadoLocal: " + resultadoLocal.size());
        for (int i = 0; i < resultadoLocal.size(); i++) {
            System.out.println(resultadoLocal.get(i));
        }
        if (resultadoLocal.size() > 0) {
            for (String erro : resultadoLocal) {
                ErrosSemanticos.addErro("Erro na atribuição do identificador " + identificador + ": " + erro);
            }
        }

    }
}
