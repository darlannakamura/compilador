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
        repeticaoFator = null;
    }
    
    public Termo(Fator fator, RepeticaoFator repeticaoFator){
        this.fator = fator;
        this.repeticaoFator = repeticaoFator;
    }
    
    public int run(TabelaSimbolos global, TabelaSimbolos local){
  
        int valor = fator.run(global, local);
        System.out.println("valor: "+valor);
        if(repeticaoFator != null){
            for(RepeticaoFator2 rep2: repeticaoFator.getRepeticoesFator2()){
                switch(rep2.getOperador()){
                    case Sym.OPERADOR_MATEMATICO_MULTIPLICACAO:
                        valor *= rep2.getFator().run(global, local);
                        break;
                    case Sym.OPERADOR_MATEMATICO_DIVISAO:
                        //TO DO
                        //Se rep2.getFator().run(global, local) == 0 dá erro
                        //pois não se pode dividir por zero!!!
                        int retorno = rep2.getFator().run(global, local);
                        if(retorno == 0){
                            System.out.println("Não se pode fazer divisão por zero!");
                            System.exit(1);
                        }
                        valor /= retorno;
                        break;
                    case Sym.OPERADOR_LOGICO_AND:
                        // 0 * 0 = 0; 1 * 0 = 0; 1 * 1 = 1
                        valor *= rep2.getFator().run(global, local);
                        break;

                }
            }
        }
        return valor;
    }
}
