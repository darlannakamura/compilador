/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes;

/**
 *
 * @author darla
 */
public class Instrucao {
   private String rotulo;
   private String instrucao;
   private Integer valor;
   private boolean declarouValor;

    public Instrucao(String instrucao) {
        this.rotulo = "";
        this.instrucao = instrucao;
        this.valor = 0;
    }

    public Instrucao(String instrucao, Integer valor) {
        this.rotulo = "";
        this.instrucao = instrucao;
        this.valor = valor;
    }

    public Instrucao(String rotulo, String instrucao, Integer valor) {
        this.rotulo = rotulo;
        this.instrucao = instrucao;
        this.valor = valor;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }
    
    

    public String getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(String instrucao) {
        this.instrucao = instrucao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public boolean isDeclarouValor() {
        return declarouValor;
    }

    public void setDeclarouValor(boolean declarouValor) {
        this.declarouValor = declarouValor;
    }
   
    
    
}
