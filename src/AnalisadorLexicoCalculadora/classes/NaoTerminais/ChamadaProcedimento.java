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
public class ChamadaProcedimento extends Comando {
    String identificador;
    ListaExpressoes listaExpressoes;
    
    public ChamadaProcedimento(String identificador, ListaExpressoes listaExpressoes){
        this.identificador = identificador;
        this.listaExpressoes = listaExpressoes;
    }
    
    public void run(TabelaSimbolos tabela) {
        if (listaExpressoes == null){
            // Achar o procedimento e chamar
        }
        else{
            // Calcular cada valor e chamar o procedimento com os valores
        }
    }
}