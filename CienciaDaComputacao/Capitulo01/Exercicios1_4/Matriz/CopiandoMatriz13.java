package Matriz;

public class CopiandoMatriz13 {
    /**
     * 1.4.13 Escreva fragmentos de código para criar um array
     * bidimensional b[][] que é uma cópia de um array bidimensional
     * existente a[][], sob cada uma das seguintes suposições:
     * 
     * a. a[][] é quadrado b
     * b. a[][] é retangular
     * c. a[][] pode ser irregular
     * 
     * Sua solução para b deve funcionar para a, e sua solução para c
     * deve funcionar para b e a, e seu código deve ficar
     * progressivamente mais complicado.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 119).
     * Pearson Educação. Edição do Kindle.
     * Pedro, 14/04/2022
     */
    public static void main(String[] args) {

        // constante
        final int LINHA = 5;
        final int COLUNA = 3;

        // declara, cria e inicialia uma matriz
        int[][] matrizA = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 },
                { 13, 14, 15 }
        };

        // declara e cria a matriz B
        int[][] matrizB = new int[LINHA][COLUNA];

        System.out.println("\nMatriz A original:");
        // chama método mostrar para matrizA
        mostrar(matrizA);

        // loop para copiar a matriz A para B
        for( int i = 0; i < matrizA.length; i++) {
            for(int j = 0; j < matrizA[i].length; j++) {
                // matriz B recebe os elementos da matriz A
                matrizB[i][j] = matrizA[i][j];
            } // fim for coluna
        } // fim for linha

        // mostra  matris B
        System.out.println("\nMatriz B Cópia da A:");
        // chama método mostrar para matrizA
        mostrar(matrizB);

        // loop para a matriz A ser o quadrado de B
        for( int i = 0; i < matrizA.length; i++) {
            for(int j = 0; j < matrizA[i].length; j++) {
                // matriz A recebe o quadrado dos elementos da matriz B
                matrizA[i][j] = matrizB[i][j] * matrizB[i][j];
            } // fim for coluna
        } // fim for linha

        System.out.println("\nMatriz A é o quadrado da matrizB:");
        // chama método mostrar para matrizA
        mostrar(matrizA);

    } // fim main

    // método mostrar valores
    public static void mostrar(int[][] matriz) {

        // loop para linha
        for (int i = 0; i < matriz.length; i++) {
            // loop para a coluna
            for (int j = 0; j < matriz[i].length; j++) {
                // imprime oa elementos da matriz
                System.out.printf("%5d", matriz[i][j]);
            } // fim for coluna
            // pula linha
            System.out.println();
        } // fim for linha
    } // fim mostrar
    
} // fim classe