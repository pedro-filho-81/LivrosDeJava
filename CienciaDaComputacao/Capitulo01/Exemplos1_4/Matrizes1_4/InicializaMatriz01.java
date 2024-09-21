package Exemplos1_4.Matrizes1_4;

import java.util.Scanner;

public class InicializaMatriz01 {
    public static void main(String[] args) {
        
        // variável Scanner
        Scanner entrada = new Scanner(System.in);

        // constantes
        int LINHA = 11;
        int COLUNA = 4;

        // cria uma matriz bidimensional
        double[][] matriz = new double[ LINHA ][ COLUNA ];

        // loop para atribuir valores a matriz
        // loop para linha
        for( int i = 0; i < LINHA; i++ )
            // loop para a coluna
            for( int j = 0; j < COLUNA; j++ )
                // matriz recebe valores aleatórios
                matriz[ i ][ j ] = (int) (Math.random() * 100);

        // loop para mostrar os valores da matriz
        // loop para linha
        for( int i = 0; i < LINHA; i++ ) {
        
            // loop para a coluna
            for( int j = 0; j < COLUNA; j++ ) {
                // mostra os valores da matriz
                System.out.printf("%5.0f", matriz[ i ][ j ]);
            } // fim for internof
            
            System.out.println(); // pula uma linha
        } // fim for externo   

    } // fim main    
} // fim classe
