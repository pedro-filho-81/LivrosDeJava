package Capitulo08.Matriz.Exercicios;
import java.security.SecureRandom;

public class FatorialDiagonalPrincipal09 {
    /**
     * i)Elaborar um programa que leia uma matriz A do tipo inteira
     * de duas dimensões com sete linhas e sete colunas. Construir
     * a matriz B de mesma dimensão, em que cada elemento seja
     * o somatório de 1 até o valor armazenado na posição da matriz A,
     * com exceção dos valores situados nos índices ímpares da diagonal
     * principal (B[1,1], B[3,3], B[5,5] e B[7,7]), os quais devem ser
     * o fatorial de cada elemento correspondente da matriz A. Apresentar
     * ao final a matriz B.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (pp. 403-404).
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 02/05/2022
     */
    public static void main(String[] args) {

        // constante
        final int LINHA = 7;
        final int COLUNA = 7;

        // matrizes
        int[][] matrizA = new int[LINHA][COLUNA];
        int[][] matrizB = new int[LINHA][COLUNA];

        // adicionar
        addMatriz(matrizA, LINHA, COLUNA);
        addFatorial(matrizA, matrizB, LINHA, COLUNA);

        // métodos
        System.out.println("\nMatrizA:");
        mostrarMtrz(matrizA, LINHA, COLUNA);

        System.out.println("\nMatrizB fatorial da matrizA:");
        mostrarMtrz(matrizB, LINHA, COLUNA);

    } // fim main

    // adicionar valores na matriz
    public static void addMatriz(int[][] matriz, int linha, int coluna) {

        // objeto SecureRandom
        SecureRandom aleatorio = new SecureRandom();

        // loop para adicionar valores no vetor
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                // matriz recebe valores aleatórios
                matriz[i][j] = 1 + aleatorio.nextInt(10);
            } // fimm for j
        } // fim for i
    } // fim adicionar

    // adicionar fatorial na matriz
    public static void addFatorial(int[][] matrizA, int[][] matrizB, int linha, int coluna) {
        // variável
        int fat = 1;

        // loop para linha
        for (int i = 0; i < linha; i++) {
            // loop para calcular os valores do vetor
            for (int j = 0; j < coluna; j++) {
                
                // matrizB recebe os valores da matrizA somado mais 1
                matrizB[i][j] = matrizA[i][j] + 1;

                // se j for númmero ímpar
                if(j % 2 != 0) { 

                    // loop para calcular o fatorial
                    for (int k = 1; k <= matrizA[j][j]; k++) {
                        // calcula o fatorial dos valores do vetor
                        fat *= k;
                    } // fim for k
                    
                    // matriz recebe o valor do fatorial na segunda coluna
                    matrizB[j][j] = fat;
                    // reinicializa o fatorial
                    fat = 1;

                } // fim if
                    
            } // fim for j
        } // fim for i
    } // fim addFatorial

    // mostrar matriz
    public static void mostrarMtrz(int[][] matriz, int linha, int coluna) {

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%10d", matriz[i][j]);
            } // fim for j
            System.out.println();
        } // fimm for i

    } // fim mostrar

} // fim classe