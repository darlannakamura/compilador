/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes;

import AnalisadorLexicoCalculadora.ui.GeracaoDeCodigo;

/**
 *
 * @author rafae
 */
public class Simbolo {
    private String lexema;
    private String token;
    private String categoria;
    private String tipo;
    private int valor;
    private boolean utilizada;
    private int endereco;
    
    public Simbolo(String lexema){
        this.lexema = lexema;
        this.utilizada = false;
        this.valor = 0;
    }
    
    public Simbolo(String lexema, String token, String categoria, String tipo, int endereco){
        this.lexema = lexema;
        this.token = token;
        this.categoria = categoria;
        this.tipo = tipo;
        this.valor = 0;
        this.utilizada = false;
        this.endereco = endereco;
    }

    
    
    
    /**
     * categoria: se é uma variável, se é nome de procedimento, nome do programa
     * Tipo: int ou boolean -> se for variável
     * valor -> valor
     * utilizada -> simm ou não
     **/
    public Simbolo(String lexema, String token, String categoria, String tipo){
        this.lexema = lexema;
        this.token = token;
        this.categoria = categoria;
        this.tipo = tipo;
        this.valor = 0;
        this.utilizada = false;
    }

    /**
     * @return the lexema
     */
    public String getLexema() {
        return lexema;
    }

    /**
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the utilizada
     */
    public boolean isUtilizada() {
        return utilizada;
    }

    /**
     * @param utilizada the utilizada to set
     */
    public void setUtilizada(boolean utilizada) {
        this.utilizada = utilizada;
    }

    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }
    
    
}
