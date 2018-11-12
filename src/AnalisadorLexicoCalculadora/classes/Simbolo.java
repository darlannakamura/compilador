/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes;

/**
 *
 * @author rafae
 */
public class Simbolo {
    private String lexema;
    private String token;
    private String categoria;
    private String tipo;
    private String valor;
    private boolean utilizada;
    
    public Simbolo(String lexema, String token, String categoria, String tipo){
        this.lexema = lexema;
        this.token = token;
        this.categoria = categoria;
        this.tipo = tipo;
        this.valor = null;
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
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
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
}
