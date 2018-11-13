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
    private TabelaSimbolos tabelaLocal;
    // Para o bloco do programa, essa tabela será igual a global. Para procedimentos, 
    // será a tabela do procedimento, enquanto a tabela local é perpetuada no primeiro
    // parâmetro do método run
    
    public Bloco(ParteDeclaracaoVariaveis parteDeclaracaoVariaveis,
                ParteDeclaracaoSubrotinas parteDeclaracaoSubrotinas,
                ComandoComposto comandoComposto){
        this.parteDeclaracaoVariaveis = parteDeclaracaoVariaveis;
        this.parteDeclaracaoSubrotinas = parteDeclaracaoSubrotinas;
        this.comandoComposto = comandoComposto;
    }
    
    public void run(TabelaSimbolos global){
        if(parteDeclaracaoVariaveis != null)
            parteDeclaracaoVariaveis.run(global, tabelaLocal);
        if(parteDeclaracaoSubrotinas != null)
            parteDeclaracaoSubrotinas.run(global, tabelaLocal);
        comandoComposto.run(global, tabelaLocal);
    }

    /**
     * @return the tabelaLocal
     */
    public TabelaSimbolos getTabela() {
        return tabelaLocal;
    }

    /**
     * @param tabelaLocal the tabelaLocal to set
     */
    public void setTabela(TabelaSimbolos tabelaLocal) {
        this.tabelaLocal = tabelaLocal;
    }

    
}
