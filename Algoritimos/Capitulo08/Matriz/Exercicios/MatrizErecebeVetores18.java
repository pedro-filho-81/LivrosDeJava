import java.security.SecureRandom;

public class MatrizErecebeVetores18 {
    /**
     * r)Elaborar um programa que leia quatro matrizes A, B, C e D
     * de uma dimensão com quatro elementos. Construir uma matriz E
     * de duas dimensões do tipo 4 × 4, sendo a primeira linha formada
     * pelo dobro dos valores dos elementos da matriz A, a segunda linha
     * formada pelo triplo dos valores dos elementos da matriz B,
     * a terceira linha formada pelo quádruplo dos valores dos elementos
     * da matriz C e a quarta linha formada pelo fatorial dos valores dos
     * elementos da matriz D. Apresentar a matriz E.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 405).
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 08/02/2022
     */
    public static void main(String[] args) {

        // constantes
        final int TAMANHO = 4;

        // vetor
        int[] vetorA = new int[TAMANHO];
        int[] vetorB = new int[TAMANHO];
        int[] vetorC = new int[TAMANHO];
        int[] vetorD = new int[TAMANHO];

        // matriz
        int[][] matrizE = new int[TAMANHO][TAMANHO];

        // adicionar valores
        adicionar(vetorA);
        adicionar(vetorB);
        adicionar(vetorC);
        adicionar(vetorD);
        adicionarMtz(vetorA, vetorB, vetorC, vetorD, matrizE, TAMANHO);

        // mostrar
        System.out.println("\nVetorA:");
        mostraVtr(vetorA);
        System.out.println("\nVetorB:");
        mostraVtr(vetorB);
        System.out.println("\nVetorC:");
        mostraVtr(vetorC);
        System.out.println("\nVetorD:");
        mostraVtr(vetorD);
        System.out.println("\nMatrizE:");
        mostrarMtrz(matrizE, TAMANHO);

    } // fim main

    // método adicionar
    public static void adicionar(int[] vetor) {

        SecureRandom aleatorio = new SecureRandom();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 1 + aleatorio.nextInt(50);
        } // fim for

    } // fim adicionar

    // adicionar matriz
    public static void adicionarMtz(int[] vetorA, int[] vetorB, int[] vetorC, int[] vetorD, int[][] matrizE,
            int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == 0)
                    matrizE[i][j] = vetorA[j];
                else if (i == 1)
                    matrizE[i][j] = vetorB[j];
                else if (i == 2)
                    matrizE[i][j] = vetorC[j];
                else
                    matrizE[i][j] = vetorD[j];
            } // fim for j
        } // fim for i
    } // fim adicionar matrizes

    public static void mostraVtr(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%5d", vetor[i]);
        } // fim for
    } // fim mostrar

    // mostrar matriz
    public static void mostrarMtrz(int[][] matriz, int tamanho) {

        // 11 espaços em branco para a coluna
        System.out.print("            ");

        // loop para imprimir os núeros das colunar
        for (int a = 0; a < tamanho; a++) {
            // mostra os númmeros das colunas
            System.out.printf("%7d", a + 1);
        } // fim loop

        // pula uma linha
        System.out.println("");

        System.out.print("            "); // 11 espaços
        for (int a = 0; a < tamanho; a++) { // loop
            System.out.printf("%7s", "*"); // imprime asterisco
        } // fim loop
        System.out.println(); // pula linha

        // loop para a linha
        for (int i = 0; i < tamanho; i++) {
            // mostra a índice da linha
            System.out.printf("linha %2d -> ", i + 1);

            // loop para a coluna
            for (int j = 0; j < tamanho; j++) {
                // mostra o valor da coluna na matriz
                System.out.printf("%7d", matriz[i][j]);
            } // fim for j

            // pula linha
            System.out.println();

        } // fimm for i
    } // fim mostrar matriz

} // fim classe