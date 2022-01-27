/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp7_04;

/**
 *Cria e inicializa um vetor depois soma os valores
 * @author 27/01/2022
 */
public class Exp7_04 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria a constante
        final int TAMANHO = 10;
        int total = 0;
        
        // CRIA e inicializa um vetor
        int[] vetor = { 12,23,32,36,65,45,98,78,85,25 };
        
        // cabeçalho
        System.out.printf("%s%8s%n", "Ìndice", "Valor");
        
        // loop para mostrar valores
        for( int i = 0; i < TAMANHO; i++ ) {
            
            total += vetor[ i ]; // soma os valores
            
            System.out.printf("%3d%9d%n", i, vetor[ i ] );
        } // fim for
        
        System.out.println("\nO total dos valores do vetor é " + total );
    } // fim main    
} // fim classe
