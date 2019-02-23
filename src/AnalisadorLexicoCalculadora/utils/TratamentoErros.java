/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.utils;

import AnalisadorLexicoCalculadora.classes.ItemErro;
import AnalisadorLexicoCalculadora.classes.ItemLexico;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class TratamentoErros {
    
    public static ArrayList<ItemErro> tratamentoLexico(ArrayList<ItemLexico> itensLexicos){
        ArrayList<ItemErro> itensErro = new ArrayList();
        for(ItemLexico lexico: itensLexicos){
            ItemErro erro = null;
            switch(lexico.getToken()){
                case "DESCONHECIDO":
                    if(lexico.getLexema().equals("{")){
                        erro = new ItemErro("Comentário não finalizado", lexico.getLexema(), lexico.getLinha());
                        itensErro.add(erro);
                    }
                    else{
                        erro = new ItemErro("Caractere desconhecido", lexico.getLexema(), lexico.getLinha());
                        itensErro.add(erro);
                    }
                    break;
                case "NUMERO_INTEIRO":
                    if(lexico.getLexema().length() > 10){
                        erro = new ItemErro("Inteiro com mais de 10 dígitos", lexico.getLexema(), lexico.getLinha());
                        itensErro.add(erro);
                    }
                    break;
                case "IDENTIFICADOR":
                    if(lexico.getLexema().length() > 20){
                        erro = new ItemErro("Identificador com mais de 20 caracteres", lexico.getLexema(), lexico.getLinha());
                        itensErro.add(erro);
                    }
                    break;
                default:
                    break;
            }
        }
        return itensErro;
    }
}
