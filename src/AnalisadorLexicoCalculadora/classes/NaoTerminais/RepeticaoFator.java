/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.NaoTerminais.RepeticaoFator2;

/**
 *
 * @author rafae
 */
public class RepeticaoFator {
    ArrayList<RepeticaoFator2> repeticaoFator2;
    
    public RepeticaoFator(RepeticaoFator2 rf2){
        this.repeticaoFator2 = new ArrayList<>();
        repeticaoFator2.add(rf2);
        
    }
    
    public ArrayList<RepeticaoFator2> getRepeticoesFator2(){
        return repeticaoFator2;
    }
}
