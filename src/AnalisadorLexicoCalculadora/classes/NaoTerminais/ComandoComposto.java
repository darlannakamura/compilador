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
public class ComandoComposto extends Comando {
    Comandos listaComandos;

    public ComandoComposto(Comandos listaComandos){
        this.listaComandos = listaComandos;
    }
    
    public void run(TabelaSimbolos global, TabelaSimbolos local) {
        // Executar todos os comandos da lista
        listaComandos.run(global, local);
    }  
}
