package Capitulo08.Matriz.Exercicios;
import java.security.SecureRandom;

public class VetoresBeCrecebeDeMatrizA10 {

    /**
     * q)Elaborar um programa que faça a leitura de 20 valores inteiros em uma
     * matriz A de duas dimensões com quatro linhas e cinco colunas. Construir
     * a matriz B de uma dimensão para quatro elementos que seja formada pelo
     * somatório dos elementos correspondentes de cada linha da matriz A.
     * Construir também a matriz C de uma dimensão para cinco elementos que seja
     * formada pelo somatório dos elementos correspondentes de cada coluna da matriz
     * A.
     * Ao final, o programa deve apresentar o somatório dos elementos da matriz B
     * com
     * o somatório dos elementos da matriz C.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 405).
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 03/05/2022
     */
    public static void main(String[] args) {

        // constantes
        final int LINHA = 4;
        final int COLUNA = 5;

        // matriz e vetores
        int[][] matrizA = new int[LINHA][COLUNA];
        int[] vetorA = new int[LINHA];
        int[] vetorB = new int[COLUNA];

        // adicionar valores na matriz
        addMatriz(matrizA, LINHA, COLUNA);

        // adicionar valores da linha da matriz no vetorA
        addVtrDaLinha(vetorA, matrizA, LINHA, COLUNA);

        // adicionar valores da linha da matriz no vetorA
        addVtrDaColuna(vetorB, matrizA, LINHA, COLUNA);

        // MMOSTRAR
        System.out.println("\nMatrizA:        Colunas:");
        // mostrar os valores da matriz
        mostrarMtrz(matrizA, LINHA, COLUNA);

        System.out.println("\nVetorA = soma das linhas:");
        mostrarVtr(vetorA);

        System.out.println("\nVetorB = soma das colunas:");
        mostrarVtr(vetorB);

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

    // mostrar matriz
    public static void mostrarMtrz(int[][] matriz, int linha, int coluna) {

        // espaço e branco para a coluna
        System.out.print("            ");
        // loop para imprimir os núeros das colunar
        for (int a = 0; a < coluna; a++) {
            // mostra os númmeros das colunas
            System.out.printf("%5d", a + 1);
        } // fim loop
          // pula uma linha
        System.out.println("");

        System.out.print("            "); // espaço
        for (int a = 0; a < coluna; a++) { // loop
            System.out.printf("%5s", "*"); // imprime asterisco
        } // fim loop
        System.out.println(); // pula linha

        // loop para a linha
        for (int i = 0; i < linha; i++) {
            // mostra a índice da linha
            System.out.printf("linha %2d -> ", i + 1);
            // loop para a coluna
            for (int j = 0; j < coluna; j++) {
                // mostra o valor da coluna na matriz
                System.out.printf("%5d", matriz[i][j]);
            } // fim for j
              // pula linha
            System.out.println();
        } // fimm for i
    } // fim mostrar matriz

    // mostrar vetor
    public static void addVtrDaLinha(int[] vetor, int[][] matriz, int linha, int coluna) {

        // variável
        int soma = 0;
        // loop for linha
        for (int i = 0; i < linha; i++) {
            // loop for coluna
            for (int j = 0; j < coluna; j++) {
                // vetor recebe os valores da linha da matriz
                soma += matriz[i][j];
            } // fim for j
              // vetor recebe soma
            vetor[i] = soma;
            soma = 0; // inicializa soma

        } // fim for i
    } // fim adicionar no vetor a linha da matriz

    // adicionar vetor coluna
    public static void addVtrDaColuna(int[] vetor, int[][] matriz, int linha, int coluna) {

        // variável
        int soma = 0;
        // loop for linha
        for (int i = 0; i < coluna; i++) {
            // loop for coluna
            for (int j = 0; j < linha; j++) {
                // vetor recebe os valores da linha da matriz
                soma += matriz[j][i];
            } // fim for j
              // vetor recebe soma
            vetor[i] = soma;
            soma = 0; // inicializa soma

        } // fim for i
    } // fim adicionar no vetor a linha da matriz

    // moatrar vetor
    public static void mostrarVtr(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%5d", vetor[i]);
        } // fim for
    } // fim mmostrar vetor

} // fim classe