/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEPA;

import AnalisadorLexicoCalculadora.classes.Instrucao;
import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author rafae
 */
public class MEPA {
    
    private ArrayList<Instrucao> codigo;
    private Stack<Integer> dados;
    private int contadorPrograma;
    // Topo da pilha foi omitido, pois a classe Stack já é uma pilha
   
    
    
    public void interpretar(ArrayList<Instrucao> codigo){
        this.contadorPrograma = 0;
        this.codigo = codigo;
        do{
            Instrucao instrucao = codigo.get(contadorPrograma);
            if (instrucao.getInstrucao().equals("PARA")){
                // chegou no fim do programa, sai do loop
                break;
            }
            else{
                // Se não chegou no fim, executa a instrução
                System.out.println("INSTRUÇÃO\n");
                String valorInstrucao = String.valueOf(instrucao.getValor());
                if(valorInstrucao.equals(Integer.MIN_VALUE)){
                    // Usamos MIN_VALUE como indicativo de rótulo vazio
                    valorInstrucao = "";
                }
                System.out.println(instrucao.getRotulo() + "\t" + instrucao.getInstrucao() +
                        "\t" + valorInstrucao);
                switch(instrucao.getInstrucao()){
                    case "INPP":
                        // inicializa a pilha e o contador de programa
                        dados = new Stack();
                        contadorPrograma = 0;
                        break;
                    case "AMEM":
                        // Aloca a quantidade de inteiros na pilha (na LALG será sempre
                        // 1, mas deixamos com um for)
                        for(int i=0; i<instrucao.getValor(); i++){
                            dados.add(Integer.MIN_VALUE);
                        }
                        break;
                    case "DMEM":
                        // desaloca
                        for(int i=0; i<instrucao.getValor(); i++){
                            dados.pop();
                        }
                        break;
                    // case "PARA": (não foi necessário, fica apenas como referência)
                    case "CRCT":
                        // carrega uma constante na pilha
                        dados.add(instrucao.getValor());
                        break;
                    case "CRVL":
                        // carrega o valor do endereço n no topo da pilha
                        Integer endereco = instrucao.getValor();
                        Integer valor = dados.get(endereco);
                        dados.add(valor);
                        break;
                    case "ARMZ":
                        // armazena o topo da pilha no endereço n
                        Integer topo = dados.pop();
                        dados.set(instrucao.getValor(), topo);
                        break;
                    case "SOMA":
                        topo = dados.pop();
                        Integer penultimo = dados.pop();
                        dados.add(penultimo + topo);
                        break;
                    case "SUBT":
                        topo = dados.pop();
                        penultimo = dados.pop();
                        dados.add(penultimo - topo);
                        break;
                    case "MULT":
                        topo = dados.pop();
                        penultimo = dados.pop();
                        dados.add(penultimo * topo);
                        break;
                    case "DIVI":
                        topo = dados.pop();
                        penultimo = dados.pop();
                        dados.add(penultimo / topo);
                        break;
                    case "MODI":
                        topo = dados.pop();
                        penultimo = dados.pop();
                        dados.add(penultimo % topo);
                        break;
                    case "INVR":
                        topo = dados.pop();
                        dados.add(-topo);
                        break;
                    case "CONJ":
                        // AND
                        topo = dados.pop();
                        penultimo = dados.pop();
                        if (topo == 1 && penultimo == 1){
                            dados.add(1);
                        }
                        else{
                            dados.add(0);
                        }
                        break;
                    case "DISJ":
                        // OR
                        topo = dados.pop();
                        penultimo = dados.pop();
                        if (topo == 0 && penultimo == 0){
                            dados.add(0);
                        }
                        else{
                            dados.add(1);
                        }
                        break;
                    case "NEGA":
                        topo = dados.pop();
                        dados.add(1 - topo);
                        break;
                    case "CMME":
                        topo = dados.pop();
                        penultimo = dados.pop();
                        if (penultimo < topo){
                            dados.add(1);
                        }
                        else{
                            dados.add(0);
                        }
                        break;
                    case "CMMA":
                        topo = dados.pop();
                        penultimo = dados.pop();
                        if (penultimo > topo){
                            dados.add(1);
                        }
                        else{
                            dados.add(0);
                        }
                        break;
                    case "CMIG":
                        topo = dados.pop();
                        penultimo = dados.pop();
                        if (penultimo == topo){
                            dados.add(1);
                        }
                        else{
                            dados.add(0);
                        }
                        break;
                    case "CMDG":
                        topo = dados.pop();
                        penultimo = dados.pop();
                        if (penultimo != topo){
                            dados.add(1);
                        }
                        else{
                            dados.add(0);
                        }
                        break;
                    case "CMAG":
                        topo = dados.pop();
                        penultimo = dados.pop();
                        if (penultimo >= topo){
                            dados.add(1);
                        }
                        else{
                            dados.add(0);
                        }
                        break;
                    case "CMEG":
                        topo = dados.pop();
                        penultimo = dados.pop();
                        if (penultimo <= topo){
                            dados.add(1);
                        }
                        else{
                            dados.add(0);
                        }
                        break;
                    case "DSVS":
                        // desvia para o rotulo p
                        contadorPrograma = getLinhaRotulo(instrucao.getValor()) - 1;
                        // -1 é para compensar o incremento após o switch
                        break;
                    case "DSVF":
                        topo = dados.pop();
                        if(topo == 0){
                            contadorPrograma = getLinhaRotulo(instrucao.getValor()) - 1;
                            // -1 é para compensar o incremento após o switch
                        }
                        break;
                    case "NADA":
                        break;
                    default:
                        System.out.println("Instrução inválida: " + instrucao.getInstrucao());
                        break;
                        
                }
                // Sempre incrementa o contador de programa
                contadorPrograma += 1;
                // Imprime a pilha para o usuário
                System.out.println("PILHA\n");
                for(int i=dados.size()-1; i >= 0; i--){
                    System.out.println(String.valueOf(dados.get(i)));
                }
                System.out.println("-----------------------------\n\n");
            }
        }
        while(true);
    }
    
    private int getLinhaRotulo(int rotulo){
        // Busca o rótulo no código e retorna a linha correspondente
        for(int i=0; i<codigo.size(); i++){
            if(codigo.get(i).getRotulo() == rotulo){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }
    
    public static void main(String[] args){
        ArrayList<Instrucao> codigo = new ArrayList();
        codigo.add(new Instrucao("INPP"));
        codigo.add(new Instrucao("AMEM", 1));
        codigo.add(new Instrucao("AMEM", 1));
        codigo.add(new Instrucao("CRCT", 5));
        codigo.add(new Instrucao("ARMZ", 0));
        codigo.add(new Instrucao("CRCT", 9));
        codigo.add(new Instrucao("ARMZ", 1));
        codigo.add(new Instrucao("CRVL", 0));
        codigo.add(new Instrucao("CRVL", 1));
        codigo.add(new Instrucao("CMMA"));
        codigo.add(new Instrucao("DSVF", 0));
        codigo.add(new Instrucao("CRVL", 0));
        codigo.add(new Instrucao(0, "NADA", Integer.MIN_VALUE));
        codigo.add(new Instrucao("PARA"));
        MEPA maquina = new MEPA();
        maquina.interpretar(codigo);
        
    }
}