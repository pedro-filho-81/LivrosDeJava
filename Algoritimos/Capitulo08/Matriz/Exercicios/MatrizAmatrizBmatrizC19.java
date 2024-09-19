package Capitulo08.Matriz.Exercicios;

import java.security.SecureRandom;

public class MatrizAmatrizBmatrizC19 {
    /**
     * s)Elaborar um programa que leia duas matrizes A e B,
     * cada uma de duas dimensões com cinco linhas e seis colunas.
     * A matriz A deve aceitar a entrada de valores pares,
     * enquanto a matriz B deve aceitar a entrada de valores ímpares.
     * As entradas dos valores nas matrizes A e B devem ser validadas
     * pelo programa, e não pelo usuário. Construir a matriz C de mesma
     * dimensão, que seja formada pela soma dos elementos da matriz A
     * com os elementos da matriz B. Apresentar os elementos da matriz C.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (pp. 405-406).
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 10/05/2022
     */
    public static void main(String[] args) {

        // constantes
        final int LINHA = 5;
        final int COLUNA = 6;

        // matriz
        int[][] matrizA = new int[LINHA][COLUNA];
        int[][] matrizB = new int[LINHA][COLUNA];
        int[][] matrizC = new int[LINHA][COLUNA];

        // adicionar valores
        adicionarMtz(matrizA, matrizB, matrizC, LINHA, COLUNA);

        // mostrar valores
        System.out.println("\nMatrizA com valores pares:");
        mostrarMtrz(matrizA, LINHA, COLUNA);

        System.out.println("\nMatrizB com valores ímmpares:");
        mostrarMtrz(matrizB, LINHA, COLUNA);

        System.out.println("\nMatrizC é a soma da matrizA e Bs:");
        mostrarMtrz(matrizC, LINHA, COLUNA);

    } // fim main

    // adicionar matriz
    public static void adicionarMtz(int[][] matrizA, int[][] matrizB, int[][] matrizC, int linha, int coluna) {

        // objeto SecureRandom
        SecureRandom aleatorio = new SecureRandom();

        // loop para linha
        for (int i = 0; i < linha; i++) {
            // loop para a coluna
            for (int j = 0; j < coluna; j++) {

                // loop para adicionar valores na matri
                for (int k = 0; k < coluna; k++) {

                    // gera núemros aleatorios
                    int numero = 1 + aleatorio.nextInt(50);

                    // verifica se o número é par
                    if (numero % 2 == 0) // se verdade
                        // matrizA recebe o número
                        matrizA[i][j] = numero;
                    else // se ímpar
                         // matrizB recebe o número
                        matrizB[i][j] = numero;

                } // fim for k

                // matrizC recebe a soma da matrizA e B
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];

            } // fim for j
        } // fim for i

    } // fim adicionar matrizes

    // mostrar matriz
    public static void mostrarMtrz(int[][] matriz, int linha, int coluna) {

        // 11 espaços em branco para a coluna
        System.out.print("            ");

        // loop para imprimir os núeros das colunar
        for (int a = 0; a < coluna; a++) {
            // mostra os númmeros das colunas
            System.out.printf("%9d", a + 1);
        } // fim loop

        // pula uma linha
        System.out.println("");

        System.out.print("            "); // 11 espaços
        for (int a = 0; a < coluna; a++) { // loop
            System.out.printf("%9s", "*"); // imprime asterisco
        } // fim loop
        System.out.println(); // pula linha

        // loop para a linha
        for (int i = 0; i < linha; i++) {
            // mostra a índice da linha
            System.out.printf("linha %2d -> ", i + 1);

            // loop para a coluna
            for (int j = 0; j < coluna; j++) {
                // mostra o valor da coluna na matriz
                System.out.printf("%9d", matriz[i][j]);
            } // fim for j

            // pula linha
            System.out.println();

        } // fimm for i
    } // fim mostrar matriz

    // fatorial
    public static void fatorial(int[] vetor, int[][] matriz, int tamanho) {
        
        int fat = 1;
        int j;

        for (j = 0; j < tamanho; j++) {

            for (int f = 1; f <= vetor[j]; f++) {
                fat *= f;
            } // fim for f
            matriz[3][j] = fat;
            fat = 1;

        } // fim for j
    } // fim fatorial

} // fim classe