/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_26;

/**
 *
 * @author Pedro Filho
 */
public class Exercicio4_26 {

    public static void main(String[] args) {
        // TODO code application logic here
        // variável
        int linha = 10;
        
        // enquanto linha maior que 1 faça
        while( linha >= 1 ) {
            
            // variável
            int coluna = 1;
            
            // enquanto coluna menor ou igual a 10 faça
            while( coluna <= 10 ) {
                 // se linha for ímpar imprima < se não imprima >
                 System.out.println( linha % 2 == 1? "1 < " : "2 > " );
                 // incrementa coluna
                 ++coluna;
            } // fim while coluna
            
            // decrementa linha
            --linha;
            
            // pula linha
            System.out.println();
        } // fim while linha
    } // fim main     
} // fim classe
