/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;
import AnalisadorLexicoCalculadora.ui.Sym;

/**
 *
 * @author rafae
 */
public class Termo {
    Fator fator;
    RepeticaoFator repeticaoFator;
    
    public Termo(Fator fator){
        this.fator = fator;
    }
    
    public Termo(Fator fator, RepeticaoFator repeticaoFator){
        this.fator = fator;
        this.repeticaoFator = repeticaoFator;
    }
    
    public int run(TabelaSimbolos tabela){
        int valor = fator.run(tabela);
        for(RepeticaoFator2 rep2: repeticaoFator.getRepeticoesFator2()){
            switch(rep2.getOperador()){
                case Sym.OPERADOR_MATEMATICO_MULTIPLICACAO:
                    valor *= rep2.getFator().run(tabela);
                    break;
                case Sym.OPERADOR_MATEMATICO_DIVISAO:
                    valor /= rep2.getFator().run(tabela);
                    break;
                case Sym.OPERADOR_LOGICO_AND:
                    // 0 * 0 = 0; 1 * 0 = 0; 1 * 1 = 1
                    valor *= rep2.getFator().run(tabela);
                    break;
                            
            }
        }
        return valor;
    }
}
