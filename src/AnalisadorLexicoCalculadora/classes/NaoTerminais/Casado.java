/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.NaoTerminais.Comando;
import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;

/**
 *
 * @author rafae
 */
public class Casado extends Comando {
    ComandoComposto comandoComposto;
    Atribuicao atribuicao;
    ComandoCondicionalCasado comandoCondicionalCasado;
    ComandoRepetitivoCasado comandoRepetitivoCasado;

    public Casado(ComandoComposto comandoComposto) {
        System.out.println("comandoComposto");
        this.comandoComposto = comandoComposto;
    }

    public Casado(Atribuicao atribuicao) {
        System.out.println("atribu");
        this.atribuicao = atribuicao;
    }

    public Casado(ComandoCondicionalCasado comandoCondicionalCasado) {
        System.out.println("comando condicial casado");
        this.comandoCondicionalCasado = comandoCondicionalCasado;
    }

    public Casado(ComandoRepetitivoCasado comandoRepetitivoCasado) {
        System.out.println("comando repetitivo casado");
        this.comandoRepetitivoCasado = comandoRepetitivoCasado;
    }
    
    
    @Override
    public void run(TabelaSimbolos global, TabelaSimbolos local) {
        System.out.println("entrou no run!!");
        if (comandoComposto != null){
            System.out.println("comando composto!!!");
            comandoComposto.run(global, local);
        } else if (atribuicao != null){
            System.out.println("atribbb");
            atribuicao.run(global, local);
        } else if (comandoCondicionalCasado != null) {
            System.out.println("c.c casado");
            comandoCondicionalCasado.run(global, local);
        } else if (comandoRepetitivoCasado != null ){
            System.out.println("c. repetitivo casado");
            comandoRepetitivoCasado.run(global, local);
        }
    }
                
}
