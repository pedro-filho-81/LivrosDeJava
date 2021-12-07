package Exemplos1_4.Matrizes1_4;

import java.util.Scanner; 

public class AritmeticaComMatriz02 {
    public static void main(String[] args) {
        
        // variável Scanner
        Scanner entrada = new Scanner(System.in);

        // constantes
        int LINHA = 3;
        int COLUNA = 4;

        // cria uma matriz bidimensional
        double[][] matriz1 = new double[ LINHA ][ COLUNA ];
        double[][] matriz2 = new double[ LINHA ][ COLUNA ];
        double[][] matriz3 = new double[ LINHA ][ COLUNA ];

        // loop para atribuir valores a matriz
        // loop para linha
        for( int i = 0; i < LINHA; i++ ) {
            // loop para a coluna
            for( int j = 0; j < COLUNA; j++ ) {
                
                // matriz recebe valores aleatórios
                matriz1[ i ][ j ] = Math.random() * 100;
                matriz2[ i ][ j ] = Math.random() * 100;

                // soma a matriz1 com a matriz2 e atribui o resultado a matriz3
                matriz3[ i ][ j ] = matriz1[ i ][ j ] + matriz2[ i ][ j ];

            } // fim for interno
        } // fim for externo

        System.out.println("Matriz1:"); // pula uma linha

        // loop para mostrar os valores da matriz1
        // loop para linha
        for( int i = 0; i < LINHA; i++ ) {        
            // loop para a coluna
            for( int j = 0; j < COLUNA; j++ ) {
                // mostra os valores da matriz1
                System.out.print("  \t" + matriz1[ i ][ j ]);
            } // fim for internof        
            System.out.println(); // pula uma linha
        } // fim for externo   

        System.out.println("Matriz2: "); // pula uma linha

        // loop para mostrar os valores da matriz2
        // loop para linha
        for( int i = 0; i < LINHA; i++ ) {        
            // loop para a coluna
            for( int j = 0; j < COLUNA; j++ ) {
                // mostra os valores da matriz1
                System.out.print("  \t" + matriz2[ i ][ j ]);
            } // fim for internof        
            System.out.println(); // pula uma linha
        } // fim for externo   

        System.out.println("Matriz3: "); // pula uma linha

        // loop para mostrar os valores da matriz3
        // loop para linha
        for( int i = 0; i < LINHA; i++ ) {        
            // loop para a coluna
            for( int j = 0; j < COLUNA; j++ ) {
                // mostra os valores da matriz1
                System.out.print("  \t" + matriz3[ i ][ j ]);
            } // fim for internof        
            System.out.println(); // pula uma linha
        } // fim for externo   

        System.out.println(); // pula uma linha

    } // fim main        
} // fim classe
