/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp5_06;

/**
 * A classe utiliza a instrução switch para contar as letras das notas escolares.
 * @author 13/01/2022
 */

import java.util.Scanner;

public class Exp5_06 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // variáveis
        int total = 0; // soma as notas
        int contaNotas = 0; // contas as notas inseridas
        int aContas = 0; // conta as notas A
        int bContas = 0; // contas as notas B
        int cContas = 0; // contas as notas C
        int dContas = 0; // contas as notas D
        int fContas = 0; // contas as notas F
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("%s%n%s%n %s%n",
                                    "Digite as notas inteiras no intervalo de 0 a 100.",
                                    "Digite o indicador de fim de arquivo para encerrar a entrada:",
                                    "Digite -1 para sair do programa.");
        
        // faz um loop até o usuário inserir fim do arquivo
        while( entrada.hasNext() ) {
            
            int nota = entrada.nextInt(); // lê a nota
            if( nota == -1 )
                break; // fim programa
            total += nota; // soma as notas
            contaNotas++; // contas as notas lançadas
            
            // incrementa o contador de letras notas adequadas
            switch( nota  / 10 ) {
                case 9: // a nota estava entre 90
                case 10: // e cem
                    ++aContas;
                    break; // sai do switch
                    
                case 8: // notas entre 80 e 89
                    ++bContas;
                    break;
                    
                case 7: // notas entre 70 e 79
                    ++ cContas;
                    break;
                     
                case 6: // notas entre 60 e 69
                    ++dContas;
                    break;
                    
                default:
                    ++fContas;
                    break;
            } // fim switch
        } // fim while
            
            // mostra o relatório de notas
            System.out.println("Relatório de notas.");
            
            // se a contagem das notas for diferente de zero
            if( contaNotas != 0 ) {
                
                // calcular a média de todas as notas inseridas
                double media = (double) total / contaNotas;
                
                // gera uma saída de resumo de resultados
                System.out.printf("Foi lançado %d notas somando %d pontos.%n", contaNotas, total);
                System.out.printf("A média da classe é %.2f%n", media);
                System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                                            "Número de alunos que receberam cada nota:",
                                            "A: ", aContas, // exibe o número de notas A
                                            "B: ", bContas,// exibe o número de notas B
                                            "C: ", cContas,// exibe o número de notas C
                                            "D: ", dContas, // exibe o número de notas D
                                            "F: ", fContas); // número exibe notas F
            } // fim if
        
    } // fim main    
} // fim classe
