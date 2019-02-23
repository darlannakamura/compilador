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
public class ItemLexico {
    String lexema;
    String token;
    int linha;
    int coluna_inicio;
    int coluna_fim;

    public ItemLexico() {
    }

    public ItemLexico(String lexema, String token, int linha, int coluna_inicio, int coluna_fim) {
        this.lexema = lexema;
        this.token = token;
        this.linha = linha;
        this.coluna_inicio = coluna_inicio;
        this.coluna_fim = coluna_fim;
    }

    
    
    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna_inicio() {
        return coluna_inicio;
    }

    public void setColuna_inicio(int coluna_inicio) {
        this.coluna_inicio = coluna_inicio;
    }

    public int getColuna_fim() {
        return coluna_fim;
    }

    public void setColuna_fim(int coluna_fim) {
        this.coluna_fim = coluna_fim;
    }
    
    
}
