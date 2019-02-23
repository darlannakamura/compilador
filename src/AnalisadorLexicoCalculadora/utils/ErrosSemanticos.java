/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.utils;

import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class ErrosSemanticos {
    // Os erros semânticos são registrados em um Array List estático.
    
    private static ArrayList<String> errosSemanticos = new ArrayList();
    
    public static void addErro(String erro){
        errosSemanticos.add(erro);
    }
    
    public static void limparErros(){
        errosSemanticos = new ArrayList();
    }
    
    public static ArrayList<String> getErrosSemanticos(){
        return errosSemanticos;
    }
}
