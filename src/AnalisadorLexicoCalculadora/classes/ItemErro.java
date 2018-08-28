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
public class ItemErro {
    private String mensagem;
    private String lexema;
    private int linha;
    
    public ItemErro(String mensagem, String lexema, int linha){
        this.mensagem = mensagem;
        this.lexema = lexema;
        this.linha = linha;
    }

    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @return the linha
     */
    public int getLinha() {
        return linha;
    }

    /**
     * @return the lexema
     */
    public String getLexema() {
        return lexema;
    }
    
    
}
