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
    
    public void print(){
        System.out.println("NOME:"+nome);
        for(int i = 0; i < tabela.size(); i++){
            System.out.println(tabela.get(i).getLexema()+ "|"+tabela.get(i).getToken()+
                    "|"+tabela.get(i).getTipo()+"|"+tabela.get(i).getCategoria()+"|"+tabela.get(i).getValor()+"|"+tabela.get(i).getEndereco());
        }
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
            if(s.getLexema().equals(identificador) && (s.getCategoria().equals("variavel") || 
                    s.getCategoria().equals("parametro"))){
                return s.getValor();
            }
        }
        return Integer.MIN_VALUE;
    }
    
    public int getEnderecoVariavel(String identificador){
        for(Simbolo s: tabela){
            if(s.getLexema().equals(identificador) && (s.getCategoria().equals("variavel") || 
                    s.getCategoria().equals("parametro"))){
                return s.getEndereco();
            }
        }
        return Integer.MIN_VALUE;
    }
    
    public ArrayList<String> atribuicao(String identificador, int valor){
        ArrayList<String> error = new ArrayList<>();
        boolean existe = false;
        System.out.println("Entra no método atribuição ");
        for(Simbolo s: tabela){
            System.out.println("entrou no for: "+s.getLexema());
            System.out.println("valor: "+String.valueOf(valor));
            if(s.getLexema().equals(identificador) && (s.getCategoria().equals("variavel"))) {
                existe = true;
                s.setValor(valor);
                
                if(s.getTipo().equals("boolean")){
                    if(s.getValor() > 1 || s.getValor() < 0){
                        error.add("Boolean só pode receber true ou false!");
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
