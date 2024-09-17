package Capitulo08.Matriz.Exercicios;
import java.security.SecureRandom;

public class SoandoMatrizes17 {
    /**
     * q)Elaborar um programa que faça a leitura de 20 valores
     * inteiros em uma matriz A de duas dimensões com quatro linhas
     * e cinco colunas. Construir a matriz B de uma dimensão para
     * quatro elementos que seja formada pelo somatório dos elementos
     * correspondentes de cada linha da matriz A. Construir também
     * a matriz C de uma dimensão para cinco elementos que seja formada
     * pelo somatório dos elementos correspondentes de cada coluna da
     * matriz A. Ao final, o programa deve apresentar o somatório dos
     * elementos da matriz B com o somatório dos elementos da matriz C.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 405).
     * Editora Saraiva. Edição do Kindle.
     */
    public static void main(String[] args) {

        // constante
        final int LINHA = 4;
        final int COLUNA = 5;

        // matriz
        int[][] matrizA = new int[LINHA][COLUNA];
        int[] vetorA = new int[LINHA];
        int[] vetorB = new int[COLUNA];
        int[] vetorC = new int[COLUNA];

        // adicionar
        adicionar(matrizA, LINHA, COLUNA);
        somaLinhaMtz(vetorA, vetorB, matrizA, LINHA, COLUNA);
        somaVtrs(vetorA, vetorB, vetorC);

        // mostrar matriz
        System.out.println("\nMatrizA:");
        mostrarMtrz(matrizA, LINHA, COLUNA);

        System.out.println("\nVetorA: e a soma das linhas da matriz.");
        mostraVtr(vetorA);

        System.out.println("\nVetorB: e a soma das colunas da matriz.");
        mostraVtr(vetorB);

        System.out.println("\nVetorC: e a soma dos vetores A e B.");
        mostraVtr(vetorC);

    } // fim main

    // adicionar
    public static void adicionar(int[][] matriz, int linha, int coluna) {

        SecureRandom aleatorio = new SecureRandom();

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = 1 + aleatorio.nextInt(50);
            } // fim for j
        } // fim for i

    } // fim adicionar

    // adicionar matriz a para b
    public static void somaLinhaMtz(int[] vetorA, int[] vetorB, int[][] matriz, int linha, int coluna) {

        int soma = 0;

        System.out.print("\nSoma numeros pares: ");
        // loop para sommar as linhas da matriz
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                soma += matriz[i][j];
            } // fi j
            vetorA[i] = soma;
            soma = 0;
        } // fim for i

        // loop para sommar as linhas da matriz
        for (int i = 0; i < coluna; i++) {
            for (int j = 0; j < linha; j++) {
                soma += matriz[j][i];
            } // fi j
            vetorB[i] = soma;
            soma = 0;
        } // fim for i

        System.out.printf(" = %d\n", soma);

    } // fimm adicionar matriz a para b

    // mostrar matriz
    public static void mostrarMtrz(int[][] matriz, int linha, int coluna) {

        // 11 espaços em branco para a coluna
        System.out.print("            ");

        // loop para imprimir os núeros das colunar
        for (int a = 0; a < coluna; a++) {
            // mostra os númmeros das colunas
            System.out.printf("%7d", a + 1);
        } // fim loop

        // pula uma linha
        System.out.println("");

        System.out.print("            "); // 11 espaços
        for (int a = 0; a < coluna; a++) { // loop
            System.out.printf("%7s", "*"); // imprime asterisco
        } // fim loop
        System.out.println(); // pula linha

        // loop para a linha
        for (int i = 0; i < linha; i++) {
            // mostra a índice da linha
            System.out.printf("linha %2d -> ", i + 1);

            // loop para a coluna
            for (int j = 0; j < coluna; j++) {
                // mostra o valor da coluna na matriz
                System.out.printf("%7d", matriz[i][j]);
            } // fim for j

            // pula linha
            System.out.println();

        } // fimm for i
    } // fim mostrar matriz

    // soma vetores
    public static void somaVtrs(int[] vetorA, int[] vetorB, int[] vetorC) {

        int i;

        for (i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        } // fim for

        vetorC[i] = vetorB[i];

    } // fim soma vetores

    // mostra vetor
    public static void mostraVtr(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%7d", vetor[i]);
        } // fim for
    } // fim mostra vetpr

} // fim classe