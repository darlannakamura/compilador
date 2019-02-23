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
public class ComandoComposto extends Comando {
    Comandos listaComandos;

    public ComandoComposto(Comandos listaComandos){
        this.listaComandos = listaComandos;
    }

    @Override
    public void run(TabelaSimbolos global, TabelaSimbolos local, GeracaoDeCodigo geracaoDeCodigo) {
        // Executar todos os comandos da lista
        listaComandos.run(global, local, geracaoDeCodigo);
    }
}
