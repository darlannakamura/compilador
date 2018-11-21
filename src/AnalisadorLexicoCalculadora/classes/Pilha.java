/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author darla
 */
public class Pilha<T> {
     private List<T> elements = new LinkedList<T>();
     
     
     
     public boolean vazia(){
         return this.elements.size() == 0;
     }
     
     public T remove(){
         return this.elements.remove(this.elements.size() -1);
     }
     public void insere(T integer){
         this.elements.add(integer);
     }
}
