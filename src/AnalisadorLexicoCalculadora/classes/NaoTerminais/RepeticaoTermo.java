/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import java.util.ArrayList;

/**
 *

 * @author rafae

 */
public class RepeticaoTermo {
    ArrayList<RepeticaoTermo2> repeticaoTermo;
    
    public RepeticaoTermo(RepeticaoTermo2 repeticaoTermo2){
        repeticaoTermo = new ArrayList<>();
        repeticaoTermo.add(repeticaoTermo2);
    }
    

    public RepeticaoTermo add(RepeticaoTermo2 repeticaoTermo2){
        repeticaoTermo.add(repeticaoTermo2);
        return this;

    }
   
    public ArrayList<RepeticaoTermo2> getRepeticoesTermo2(){
        return repeticaoTermo;
    }

}
