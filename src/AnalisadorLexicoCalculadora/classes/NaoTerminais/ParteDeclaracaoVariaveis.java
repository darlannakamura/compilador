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
public class ParteDeclaracaoVariaveis {
    ArrayList<DeclaracaoVariaveis> declaracoesVariaveis;
    
    public ParteDeclaracaoVariaveis(DeclaracaoVariaveis declaracao){
        // Inicializa com uma declaração
        declaracoesVariaveis = new ArrayList<DeclaracaoVariaveis>();
        declaracoesVariaveis.add(declaracao);
    }
    
    public ParteDeclaracaoVariaveis add(DeclaracaoVariaveis declaracao){
        declaracoesVariaveis.add(declaracao);
        return this;
    }
    
    public void run(TabelaSimbolos global, TabelaSimbolos local){
        // Roda todas as declarações de variáveis
        for(DeclaracaoVariaveis d: declaracoesVariaveis){
            d.run(global, local);
        }
    }
}
