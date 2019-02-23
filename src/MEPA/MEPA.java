/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEPA;

import AnalisadorLexicoCalculadora.classes.Instrucao;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class MEPA {
    
    private ArrayList<Instrucao> codigo;
    private Stack<Integer> dados;
    private int contadorPrograma;
    private String saida;
    // Topo da pilha foi omitido, pois a classe Stack já é uma pilha
   
    public MEPA(){
        saida = "";
        codigo = new ArrayList<>();
        
    }
    
    
    public void interpretar(){
        this.contadorPrograma = 0;
       
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
                        
                    case "LEIT":
                        int v = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da variável :"));
                        dados.add(v);
                        break;
                    case "IMPR":
                        //imprimimos
                        int vl = dados.pop();
                        System.out.println("SAIDA:"+vl);
                        this.saida = ""+vl+"\n";
                        JOptionPane.showMessageDialog(null, vl);
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
                        contadorPrograma = getLinhaRotulo(instrucao.getRotulo()) - 1;
                        // -1 é para compensar o incremento após o switch
                        break;
                    case "DSVF":
                        topo = dados.pop();
                        if(topo == 0){
                            contadorPrograma = getLinhaRotulo(instrucao.getRotulo()) - 1;
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
    
    private int getLinhaRotulo(String rotulo){
        // Busca o rótulo no código e retorna a linha correspondente
        for(int i=0; i<codigo.size(); i++){
//            if(codigo.get(i).getRotulo() == ""){;
//                return i;
//            }

              if(codigo.get(i).getRotulo().equals(rotulo) && codigo.get(i).getInstrucao().equals("NADA")){
                  return i;
              }

            
        }
        return Integer.MIN_VALUE;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }
    
    
    
    public void leArquivo(String path) throws FileNotFoundException, IOException{
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                if(linha.contains(" ")){
                //System.out.println(linha);
                String[] arr = linha.split(" ");
                //é porque é 1 comando só
                if(arr.length == 1){ 
                    codigo.add( new Instrucao(arr[0]));
                } else if(arr.length == 2){ //é porque OU é ROTULO e NADA ou é comando seguido de valor
                    if(linha.contains("NADA")){
                        Instrucao inst = new Instrucao(arr[1]);
                        inst.setRotulo(arr[0]);
                        codigo.add(inst);
                    } else {
                        
                        if(linha.contains("DS") || linha.contains("DV")){
                            Instrucao ins = new Instrucao(arr[0]);
                            ins.setRotulo(arr[1]);
                            ins.setDeclarouValor(false);
                            codigo.add(ins);
                        }else{
                          Instrucao instrucao = new Instrucao(arr[0]);
                          instrucao.setValor(Integer.parseInt(arr[1]));
                          instrucao.setDeclarouValor(true); 
                          codigo.add(instrucao);
                        }
                        
                    }
                }
                
                }
                 
 
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
    
    public static void main(String[] args){
        MEPA maquina = new MEPA();
        
        try {
            maquina.leArquivo("compilados/comp.radc");
            maquina.interpretar();
            System.out.println(""+maquina.saida);
            JOptionPane.showMessageDialog(null, ""+maquina.saida);
        } catch (IOException ex) {
            Logger.getLogger(MEPA.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}