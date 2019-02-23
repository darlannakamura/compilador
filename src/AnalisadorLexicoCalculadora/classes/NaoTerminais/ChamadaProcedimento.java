/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.classes.NaoTerminais;

import AnalisadorLexicoCalculadora.classes.TabelaSimbolos;
import AnalisadorLexicoCalculadora.ui.GeracaoDeCodigo;
import AnalisadorLexicoCalculadora.utils.ErrosSemanticos;

/**
 *
 * @author rafae
 */
public class ChamadaProcedimento extends Comando {

    String identificador;
    ListaExpressoes listaExpressoes;

    public ChamadaProcedimento(String identificador, ListaExpressoes listaExpressoes) {
        System.out.println("Instanciando procedimento: " + identificador);
        this.identificador = identificador;
        this.listaExpressoes = listaExpressoes;
    }

    @Override
    public void run(TabelaSimbolos global, TabelaSimbolos local, GeracaoDeCodigo geracaoDeCodigo) {
        System.out.println("Entra no run de chamada de procedimento");

        if (listaExpressoes == null) {
            // Achar o procedimento e chamar
            System.out.println("Erro semantico!\nRead e Write exigem pelo menos 1 parametro.");
            ErrosSemanticos.addErro("Erro semantico!\nRead e Write exigem pelo menos 1 parametro.");
        } else {
            for (Expressao e : listaExpressoes.getListaExpressoes()) {
                e.run(global, local, geracaoDeCodigo);
                if (identificador.equals("write")) {
                    geracaoDeCodigo.add("IMPR");
                }
                if (identificador.equals("read")) {
                    geracaoDeCodigo.add("LEIT");
                    Identificador i = (Identificador) e.expressaoSimples1.termo.fator;
                    int endereco = global.getEnderecoVariavel(i.identificador);
                    System.out.println("identificador: "+i.identificador);
                    geracaoDeCodigo.add("ARMZ", endereco);
                }
            }
        }
        return;
    }
}
