package Capitulo08.Matriz.Exercicios;
import java.security.SecureRandom;

public class DiagonalPrincipal08 {
    /**
     * h)Elaborar um programa que leia uma matriz A do tipo inteira 
     * de duas dimensões com cinco linhas e cinco colunas. Construir 
     * uma matriz B de mesma dimensão, em que cada elemento seja 
     * o dobro de cada elemento correspondente da matriz A, com exceção 
     * dos valores situados na diagonal principal (posições B[1,1], B[2,2], 
     * B[3,3], B[4,4] e B[5,5]), os quais devem ser o triplo de cada elemento 
     * correspondente da matriz A. Apresentar ao final a matriz B.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 403). 
     * Editora Saraiva. Edição do Kindle. 
     * Pedro, 01/05/2022
     */
    public static void main(String[] args) {

        // constante
        final int LINHA = 5;
        final int COLUNA = 5;

        // matrizes
        int[][] matrizA = new int[LINHA][COLUNA];
        int[][] matrizB = new int[LINHA][COLUNA];

        // adicionar
        addMatriz(matrizA, LINHA, COLUNA);
        addMatrizB(matrizA, matrizB, LINHA, COLUNA);
        
        // métodos
        System.out.println("\nMatrizA:");
        mostrarMtrz(matrizA, LINHA, COLUNA);

        System.out.println("\nMatrizB:");
        mostrarMtrz(matrizB, LINHA, COLUNA);

    } // fim main

    // adicionar valores na matriz
    public static void addMatriz(int[][] matriz, int linha, int coluna ) {

        // objeto SecureRandom
        SecureRandom aleatorio = new SecureRandom();

        // loop para adicionar valores no vetor
        for (int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) { 
            // matriz recebe valores aleatórios
            matriz[i][j] = 1 + aleatorio.nextInt(50);
            } // fimm for j
        } // fim for i
    } // fim adicionar

    // adicionar fatorial na matriz
    public static void addMatrizB(int[][] matrizA, int[][] matrizB, int linha, int coluna) {
        // loop para linha
        for (int i = 0; i < linha; i++) {
            // loop para calcular os valores do vetor
            for (int j = 0; j < coluna; j++) {    
                // matriz recebe o valor do fatorial na segunda coluna
                matrizB[i][j] = matrizA[i][j] * 2;
                matrizB[j][j] = matrizA[j][j] * 3;
            } // fim for j
        } // fim for i
    } // fim addFatorial

    // mostrar matriz
    public static void mostrarMtrz(int[][] matriz, int linha, int coluna) {

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%5d", matriz[i][j]);
            } // fim for j
            System.out.println();
        } // fimm for i

    } // fim mostrar

} // fim classe