/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_29;

/**
 * 4.29 (Quadrado de asteriscos) Escreva um aplicativo que solicita ao usuário que insira o tamanho do lado 
 * de um quadrado e, então, exibe um quadrado vazio desse tamanho com asteriscos. 
 * Seu programa deve trabalhar com quadrados de todos os comprimentos de lado possíveis entre 1 e 20.
 * @author Pedro, 10/01/2022
 */

import java.util.Scanner;

public class Exercicio4_29 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto Scanner
        Scanner entrada = new Scanner(System.in);
        
        // variáveis
        int tamanho;
        int linha = 0;
        int coluna = 0;
        
        // entrada de dados
        System.out.print("Digite o tamanho do quadrado: ");
        tamanho = entrada.nextInt(); // entrada do usuário
        
        // enquanto linha menor ou igual a tamanho
        while( linha < tamanho ){
            System.out.print("* "); // primeira linha
            linha++; // incrementa em 1 a linha
        } // fim while
        System.out.println(); // pula linha
        
        while( coluna < tamanho - 2 ) {
            System.out.print("*"); // primeiro asterisco
            
            int vazio = 0; // cria variável vazio
            while( vazio < tamanho - 2 ) {
                System.out.print("  "); // imprime espaço vazio
                vazio++; // incrementa em 1
            } // fim while vazio            
            System.out.println(" *"); // imprime um asterisco
            
            coluna++; // incrementa a coluna em 1
         }// fim while coluna
        
        int linha2 = 0; // cria uma variável
         // enquanto linha menor ou igual a tamanho
        while( linha2 < tamanho ){
            System.out.print("* ");
            linha2++; // incrementa em 1 a linha
        } // fim while
        
        System.out.println(); // pula uma linha
        
    } // fim main    
} // fim classe
 