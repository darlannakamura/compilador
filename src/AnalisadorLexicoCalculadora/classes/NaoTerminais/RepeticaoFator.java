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
public class RepeticaoFator {
    ArrayList<RepeticaoFator2> repeticaoFator2;
    
    public RepeticaoFator(RepeticaoFator2 rf2){

  
        this.repeticaoFator2 = new ArrayList<>();
        repeticaoFator2.add(rf2);
        
    }
    
    public RepeticaoFator add(RepeticaoFator2 rf2){
        repeticaoFator2.add(rf2);
        return this;
    }
    
    public ArrayList<RepeticaoFator2> getRepeticoesFator2(){
        return repeticaoFator2;
    }

}
