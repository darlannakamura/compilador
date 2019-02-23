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
public class ItemSintatico {
    private String mensagem;
    private int linha;

    public ItemSintatico(String mensagem, int linha){
        this.linha = linha;
        this.mensagem = mensagem;
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
    
}
