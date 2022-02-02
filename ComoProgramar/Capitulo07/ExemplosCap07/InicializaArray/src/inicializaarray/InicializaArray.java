/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicializaarray;

/**
 * Inicializando arrays bidimensional
 * 02/02/2022
 */
public class InicializaArray {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria matrizes
        int[][] matriz1 = { { 1, 2, 3 }, { 3, 4, 5 } };
        int[][] matriz2 = { { 1, 2 }, { 3 }, { 4, 5, 6 } };
        
        System.out.println("Mostra a matriz1");
        mostraMatriz( matriz1 );
        
        System.out.println("Mostra a matriz2");
        mostraMatriz( matriz2 );        
    }// fim main
    
    // método mostra matriz
    public static void mostraMatriz( int[][] matriz ) {
        
        // loop for linha
        for( int linha = 0; linha < matriz.length; linha++ ) {
            // loop for coluna
            for( int coluna = 0; coluna < matriz[ linha ].length; coluna++ ) {
                System.out.printf("%d  ", matriz[ linha ][ coluna ] );
            } // fim for coluna
            System.out.println();
        } // fim for
        
    } // fim mostra matriz
} // fim classe
