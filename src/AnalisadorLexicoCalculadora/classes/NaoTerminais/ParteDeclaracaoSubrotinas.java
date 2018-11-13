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
public class ParteDeclaracaoSubrotinas {
    ArrayList<DeclaracaoProcedimento> declaracoesProcedimentos;
    
    public ParteDeclaracaoSubrotinas(DeclaracaoProcedimento declaracao){
        declaracoesProcedimentos = new ArrayList<DeclaracaoProcedimento>();
        declaracoesProcedimentos.add(declaracao);
    }
    
    public void add(DeclaracaoProcedimento declaracao){
        declaracoesProcedimentos.add(declaracao);
    }
     
    public void run(){
        // Declara todas as subrotinas
        for(DeclaracaoProcedimento d: declaracoesProcedimentos){
            d.run();
        }
    }    
}
