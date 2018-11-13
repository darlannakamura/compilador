/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class Comandos {
    ArrayList<Comando> comandos;
    
    public Comandos(Comando comando){
        comandos = new ArrayList<Comando>();
        comandos.add(comando);
    }
    
    public void add(Comando comando){
        comandos.add(comando);
    }
    
    public void run(TabelaSimbolos tabela){
        for(Comando c: comandos){
            c.run(tabela);
        }
    }   
}
