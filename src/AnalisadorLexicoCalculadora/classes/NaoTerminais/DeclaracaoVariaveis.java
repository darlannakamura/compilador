/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.Simbolo;
import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;

/**
 *
 * @author rafae
 */
public class DeclaracaoVariaveis {
    Tipo tipo;
    ListaIdentificadores listaIdentificadores;
    
    public DeclaracaoVariaveis(Tipo tipo, ListaIdentificadores lista){
        this.tipo = tipo;
        this.listaIdentificadores = lista;
    }

    public void run(TabelaSimbolos local) {
        // Adiciona as variáveis na tabela do procedimento (ou global), checando se já existe
        for(String identificador: listaIdentificadores.getLista()){
            local.adicionarSimbolo(new Simbolo(identificador, "identificador", "variavel", this.tipo.getTipo()));
        }
    }    
}
