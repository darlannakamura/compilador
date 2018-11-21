/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.ui;

import AnalisadorLexicoCalculadora.classes.Instrucao;
import AnalisadorLexicoCalculadora.classes.Pilha;
import java.util.ArrayList;

/**
 *
 * @author darla
 */
public class GeracaoDeCodigo {
    private ArrayList<Instrucao> codigos;
    public int endereco;
    
    public GeracaoDeCodigo(){
        endereco = -1;
        codigos = new ArrayList<>();
    }
    
    public void add(String instrucao){
        Instrucao i = new Instrucao(instrucao);
        i.setDeclarouValor(false);
        codigos.add(i);
    }
    
    public void add(String instrucao, int valor){
        Instrucao i = new Instrucao(instrucao, valor);
        i.setDeclarouValor(true);
        codigos.add(i);
    }
    
    public void add(String rotulo, String instrucao, int valor){
        Instrucao i = new Instrucao(instrucao, valor);
        i.setRotulo(rotulo);
        i.setDeclarouValor(true);
        codigos.add(i);
    }
    
    public ArrayList<Instrucao> getCodigos(){
        return this.codigos;
    }
    
    public int alocaEndereco(){
        return ++endereco;
    }
    
    public void print(){
        for(int i =0 ; i  < codigos.size(); i++){
            Instrucao ins = codigos.get(i);
            if(ins.isDeclarouValor()){
                System.out.println(""+ins.getRotulo()+" "+ins.getInstrucao()+" "+ins.getValor());
            }else{
                System.out.println(""+ins.getRotulo()+" "+ins.getInstrucao());
            }
                
        }
    }
}
