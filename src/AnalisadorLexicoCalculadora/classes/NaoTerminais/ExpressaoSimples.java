/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.NaoTerminais.RepeticaoTermo;
import AnalisadorLexicoCalculadora.classes.NaoTerminais.RepeticaoTermo2;
import AnalisadorLexicoCalculadora.classes.NaoTerminais.Termo;
import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;
import AnalisadorLexicoCalculadora.ui.Sym;

/**
 *
 * @author rafae
 */
public class ExpressaoSimples implements Expressao_Interface {
    Termo termo;
    RepeticaoTermo repeticaoTermo;
    
    
    public ExpressaoSimples(Termo termo){
        this.termo = termo;
        this.repeticaoTermo = null;
    }
    
    public ExpressaoSimples(Termo termo, RepeticaoTermo repeticaoTermo){
        this.termo = termo;
        this.repeticaoTermo = repeticaoTermo;
    }

    @Override
    public int run(TabelaSimbolos tabela) {
        int valor = termo.run(tabela);
        if (repeticaoTermo != null){
            for(RepeticaoTermo2 rep2: repeticaoTermo.getRepeticoesTermo2()){
                switch(rep2.getOperador()){
                    case Sym.OPERADOR_MATEMATICO_SOMA:
                        valor += rep2.getTermo().run(tabela);
                        break;
                    case Sym.OPERADOR_MATEMATICO_SUBTRACAO:
                        valor -= rep2.getTermo().run(tabela);
                        break;
                    case Sym.OPERADOR_LOGICO_OR:
                        valor += rep2.getTermo().run(tabela);
                        if (valor == 2)
                            valor = 1;
                        break;
                }
            }
        }
        return valor;
    }
}
