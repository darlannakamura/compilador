/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import java.util.ArrayList;

/**
 *
 * @author darla
 */
public class RepeticaoFator {
    ArrayList<AnalisadorLexicoCalculadora.classes.NaoTerminais.RepeticaoFator2> repeticaoFator2;
    
    public RepeticaoFator(AnalisadorLexicoCalculadora.classes.NaoTerminais.RepeticaoFator2 rf2){
        this.repeticaoFator2 = new ArrayList<>();
        repeticaoFator2.add(rf2);
        
    }
    
    public ArrayList<AnalisadorLexicoCalculadora.classes.NaoTerminais.RepeticaoFator2> getRepeticoesFator2(){
        return repeticaoFator2;
    }

}
