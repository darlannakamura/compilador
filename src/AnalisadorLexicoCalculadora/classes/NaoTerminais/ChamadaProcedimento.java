/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;
import AnalisadorLexicoCalculadora.ui.GeracaoDeCodigo;

/**
 *
 * @author rafae
 */
public class ChamadaProcedimento extends Comando {
    String identificador;
    ListaExpressoes listaExpressoes;
    
    public ChamadaProcedimento(String identificador, ListaExpressoes listaExpressoes){
        System.out.println("Instanciando procedimento: "+identificador);
        this.identificador = identificador;
        this.listaExpressoes = listaExpressoes;
    }
    
   
    @Override
    public void run(TabelaSimbolos global, TabelaSimbolos local, GeracaoDeCodigo geracaoDeCodigo) {
        System.out.println("Entra no run de chamada de procedimento");
        if (listaExpressoes == null){
            // Achar o procedimento e chamar
            if(identificador.equals("write")){
                geracaoDeCodigo.add("IMPR");
                
            }
        }
        else{
            // Calcular cada valor e chamar o procedimento com os valores
            
        }
        return;
    }
}
