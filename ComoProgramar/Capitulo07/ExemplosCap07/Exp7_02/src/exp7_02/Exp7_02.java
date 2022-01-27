/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp7_02;

/**
 * Cria e inicializa um vetor com 10 elementos
 * @author 27/01/2022
 */
public class Exp7_02 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria e inicializa um vetor
        int[] vetor = { 32, 65, 98, 85, 74, 12, 15, 45, 78, 19 };
        
        // cabeçalho
        System.out.printf("%s%8s%n", "Índice", "Valor" );
        
        // loop para mostrar os valores do vetor
        for( int i = 0; i < 10; i++ ) {
            System.out.printf("%3d%8d%n", i, vetor[ i ] );
        } // fim for
    } // fim main    
} // fim classe
