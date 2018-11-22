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
    private Integer linhaAtual = new Integer(-1);
    
    public GeracaoDeCodigo(){
        endereco = -1;
        codigos = new ArrayList<>();
    }
    
    public void add(String instrucao){
        Instrucao i = new Instrucao(instrucao);
        i.setDeclarouValor(false);
        codigos.add(i);
        linhaAtual++;
    }
    
    public void add(String instrucao, int valor){
        Instrucao i = new Instrucao(instrucao, valor);
        i.setDeclarouValor(true);
        codigos.add(i);
        linhaAtual++;
    }
    
    public void add(int rotulo, String instrucao, int valor){
        Instrucao i = new Instrucao(instrucao, valor);
        i.setRotulo(rotulo);
        i.setDeclarouValor(true);
        codigos.add(i);
        linhaAtual++;
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
                String rotuloAux = String.valueOf(ins.getRotulo());
                if(rotuloAux.equals(String.valueOf(Integer.MIN_VALUE))){
                    rotuloAux = "";
                }
                String valorAux = String.valueOf(ins.getValor());
                if(valorAux.equals(String.valueOf(Integer.MIN_VALUE))){
                    valorAux = "";
                }
                System.out.println(""+rotuloAux+" "+ins.getInstrucao()+" "+valorAux);
            }else{
                String rotuloAux = String.valueOf(ins.getRotulo());
                if(rotuloAux.equals(String.valueOf(Integer.MIN_VALUE))){
                    rotuloAux = "";
                }
                System.out.println(""+rotuloAux+" "+ins.getInstrucao());
            }
                
        }
    }

    /**
     * @return the linhaAtual
     */
    public Integer getLinhaAtual() {
        return linhaAtual;
    }
}
