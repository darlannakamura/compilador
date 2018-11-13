/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;

/**
 *
 * @author rafae
 */
public class Bloco {
    ParteDeclaracaoVariaveis parteDeclaracaoVariaveis;
    ParteDeclaracaoSubrotinas parteDeclaracaoSubrotinas;
    ComandoComposto comandoComposto;
    TabelaSimbolos tabela;
    
    public Bloco(ParteDeclaracaoVariaveis parteDeclaracaoVariaveis,
                ParteDeclaracaoSubrotinas parteDeclaracaoSubrotinas,
                ComandoComposto comandoComposto){
        this.parteDeclaracaoVariaveis = parteDeclaracaoVariaveis;
        this.parteDeclaracaoSubrotinas = parteDeclaracaoSubrotinas;
        this.comandoComposto = comandoComposto;
    }
    
    public void run(){
        if(parteDeclaracaoVariaveis != null)
            parteDeclaracaoVariaveis.run(tabela);
        if(parteDeclaracaoSubrotinas != null)
            parteDeclaracaoSubrotinas.run();
        comandoComposto.run(tabela);
    }
    
    public TabelaSimbolos getTabela(){
        return tabela;
    }
}
