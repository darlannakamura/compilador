/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes;

import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class TabelaSimbolos {
    // A tabela de símbolos é implementada como um ArrayList
    private ArrayList<Simbolo> tabela;
    private String nome;
    
    public TabelaSimbolos(String nome){
        this.nome = nome;
        this.tabela = new ArrayList();
    }
    
    public void adicionarSimbolo(Simbolo simbolo){
        tabela.add(simbolo);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the tabela
     */
    public ArrayList<Simbolo> getTabela() {
        return tabela;
    }
    
    public int getValorVariavel(String identificador){
        for(Simbolo s: tabela){
            if(s.getLexema().equals(identificador) && (s.getTipo().equals("variavel") || 
                    s.getLexema().equals("parametro"))){
                return s.getValor();
            }
        }
        return Integer.MIN_VALUE;
    }
    
    public ArrayList<String> atribuicao(String identificador, int valor){
        ArrayList<String> error = new ArrayList<>();
        boolean existe = false;
        for(Simbolo s: tabela){
            if(s.getLexema().equals(identificador) && (s.getTipo().equals("variavel"))) {
                existe = true;
                s.setValor(valor);
                
                if(s.getTipo().equals("boolean")){
                    if(s.getValor() > 1 || s.getValor() < 0){
                        error.add("Boolean só pode receber 1 ou 0!");
                        //BOOLEAN só pode receber 1 ou 0
                        //return Integer.MIN_VALUE;
                    }
                }
            }
        }
        if(!existe){
            error.add("Variável inexistente!");
            //Variável inexistente!
        }
        return error;
    }
}
