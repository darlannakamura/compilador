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
public class Expressao extends Fator{

        ExpressaoSimples expressaoSimples1;
        int operacao;
        ExpressaoSimples expressaoSimples2;
    
        @Override
        public int run(TabelaSimbolos global, TabelaSimbolos local) {
            if (expressaoSimples2 == null){
                return expressaoSimples1.run(global, local);
            }
            switch(operacao){
                case Sym.SIMBOLOS_ESPECIAIS_IGUAL:
                    return (expressaoSimples1.run(global, local) == expressaoSimples2.run(global, local)) ? 1: 0;
                case Sym.SIMBOLOS_ESPECIAIS_MAIOR_OU_IGUAL:
                    return (expressaoSimples1.run(global, local) >= expressaoSimples2.run(global, local)) ? 1: 0;
                case Sym.SIMBOLOS_ESPECIAIS_MAIOR_QUE:
                    return (expressaoSimples1.run(global, local) > expressaoSimples2.run(global, local)) ? 1: 0;
                case Sym.SIMBOLOS_ESPECIAIS_DIFERENTE:
                    return (expressaoSimples1.run(global, local) != expressaoSimples2.run(global, local)) ? 1: 0;
                case Sym.SIMBOLOS_ESPECIAIS_MENOR_OU_IGUAL:
                    return (expressaoSimples1.run(global, local) <= expressaoSimples2.run(global, local)) ? 1: 0;
                case Sym.SIMBOLOS_ESPECIAIS_MENOR_QUE:
                    System.out.println("Entrou no menor que:");
                    System.out.println("Exp 1: "+ expressaoSimples1.run(global, local));
                    System.out.println("Exp 2: "+expressaoSimples2.run(global, local));
                    int resp = (expressaoSimples1.run(global, local) < expressaoSimples2.run(global, local)) ? 1: 0;
                    System.out.println("resultado:" + resp);
                    return resp;

                default:
                    // erro
                    return Integer.MIN_VALUE;
            }
            
        }
        
        public Expressao(ExpressaoSimples expressaoSimples1){
            this.expressaoSimples1 = expressaoSimples1;
            this.operacao = 0;
            this.expressaoSimples2 = null;
        }
        
        public Expressao(ExpressaoSimples expressaoSimples1, int operacao, ExpressaoSimples expressaoSimples2){
            this.expressaoSimples1 = expressaoSimples1;
            this.operacao = operacao;
            this.expressaoSimples2 = expressaoSimples2;
        }

}
