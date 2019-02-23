/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.ui;

import AnalisadorLexicoCalculadora.classes.Instrucao;
import AnalisadorLexicoCalculadora.classes.Pilha;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author darla
 */
public class GeracaoDeCodigo {
    private ArrayList<Instrucao> codigos;
    public int endereco;
    private Integer linhaAtual = new Integer(-1);
    private int countRotulo;
    
    public GeracaoDeCodigo(){
        endereco = -1;
        countRotulo = -1;
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
    
    public void add(String rotulo, String instrucao){
        Instrucao i = new Instrucao(instrucao);
        i.setRotulo(rotulo);
        i.setDeclarouValor(false);
        codigos.add(i);
        linhaAtual++;
    }
    
    public void add(String rotulo, String instrucao, int valor){
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
    
    public String print(){
        String html = "";
        
        for(int i =0 ; i  < codigos.size(); i++){
            Instrucao ins = codigos.get(i);
            
            if(ins.isDeclarouValor()){
                System.out.println(""+ins.getRotulo()+" "+ins.getInstrucao()+" "+ins.getValor());
                html += ""+ins.getRotulo()+" "+ins.getInstrucao()+" "+ins.getValor()+"\n";
            }else { 
                
                if(ins.getInstrucao().contains("NADA")){
                    System.out.println(""+ins.getRotulo()+" "+ins.getInstrucao());
                    html += ""+ins.getRotulo()+" "+ins.getInstrucao()+"\n";
                } else{
                    System.out.println(""+ins.getInstrucao()+" "+ins.getRotulo());
                    html += ""+ins.getInstrucao()+" "+ins.getRotulo()+"\n";
                }
                
            }
           
                
        }
        
        return html;
    }
    
    public void gerarArquivo(){
        BufferedWriter buffWrite;
        try {
            buffWrite = new BufferedWriter(new FileWriter("compilados/comp.radc"));
            buffWrite.append(this.print());
            buffWrite.close();
        } catch (IOException ex) {
            Logger.getLogger(GeracaoDeCodigo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the linhaAtual
     */
    public Integer getLinhaAtual() {
        return linhaAtual;
    }
    
    public String getRotulo(){
        countRotulo++;
        return "L"+countRotulo;
    }
}
