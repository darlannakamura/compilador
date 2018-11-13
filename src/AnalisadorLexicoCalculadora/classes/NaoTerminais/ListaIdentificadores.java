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
public class ListaIdentificadores {
    ArrayList<String> lista;
    
    public ListaIdentificadores(String id){
        lista = new ArrayList<String>();
        lista.add(id);
    }
    
    public void add(String id){
        lista.add(id);
    }
    
    public ArrayList<String> getLista(){
        return this.lista;
    }   
}
