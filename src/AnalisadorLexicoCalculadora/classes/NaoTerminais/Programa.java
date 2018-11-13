/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

/**
 *
 * @author rafae
 */

public class Programa {
    Bloco bloco;
    
    public Programa(Bloco bloco){
        this.bloco = bloco;
    }
    
    public void exec(){
        bloco.run();
    }
}
