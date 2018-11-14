/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;
import AnalisadorLexicoCalculadora.utils.ErrosSemanticos;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class Atribuicao extends Comando {
    String identificador;
    Expressao expressao;
    
    public Atribuicao(String identificador, Expressao expressao){
        this.identificador = identificador;
        this.expressao = expressao;
    }
    
    /**
     *
     * @param tabela
     */
    @Override
    public void run(TabelaSimbolos global, TabelaSimbolos local){
        // Adiciona, na tabela de símbolos, o valor atribuído
//        global.print();
//        local.print();
        
        int retornoExp = expressao.run(global, local);
        ArrayList<String> resultadoLocal = local.atribuicao(identificador, expressao.run(global, local));
        local.print();
        System.out.println("Retorno exp:"+retornoExp+" size resultadoLocal: "+resultadoLocal.size());
        for(int i =0; i < resultadoLocal.size(); i++){
            System.out.println(resultadoLocal.get(i));
        }
        if(resultadoLocal.size() > 0){
            for(String erro: resultadoLocal){
                ErrosSemanticos.addErro("Erro na atribuição do identificador " + identificador + ": " + erro);
            }
        }
        
        
//        if(local.atribuicao(identificador, expressao.run(global, local)).size() > 0){;
//            if(global.atribuicao(identificador, expressao.run(global, local)).size() > 0){
//                System.out.println("Deu erro!");
//            }
//        }
    }
}
