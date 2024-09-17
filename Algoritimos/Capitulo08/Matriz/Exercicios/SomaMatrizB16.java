package Capitulo08.Matriz.Exercicios;
import java.security.SecureRandom;

public class SomaMatrizB16 {
    /**
     * o)Elaborar um programa que leia uma matriz A do tipo real
     * de duas dimensões com oito linhas e seis colunas. Construir
     * a matriz B de uma dimensão que seja formada pela soma de
     * cada linha da matriz A. Ao final, apresentar o somatório dos
     * elementos da matriz B.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (pp. 404-405).
     * Editora Saraiva. Edição do Kindle.
     * Pedro,05/05/2022
     */
    public static void main(String[] args) {

        // constante
        final int LINHA = 8;
        final int COLUNA = 6;

        // matriz
        double[][] matrizA = new double[LINHA][COLUNA];
        double[] vetorA = new double[LINHA];
        double[] vetorB = new double[COLUNA];

        // adicionar
        adicionar(matrizA, LINHA, COLUNA);
        somaLinhaMtz(vetorA, vetorB, matrizA, LINHA, COLUNA);

        // mostrar matriz
        System.out.println("\nMatrizA:");
        mostrarMtrz(matrizA, LINHA, COLUNA);
        
        System.out.println("\nVetorA: e a soma das linhas da matriz.");
        mostraVtr(vetorA);

        System.out.println("\nVetorB: e a soma das colunas da matriz.");
        mostraVtr(vetorB);

    } // fim main

    // adicionar
    public static void adicionar(double[][] matriz, int linha, int coluna) {

        SecureRandom aleatorio = new SecureRandom();

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = 1 + aleatorio.nextInt(50) / 3.5;
            } // fim for j
        } // fim for i

    } // fim adicionar

    // adicionar matriz a para b
    public static void somaLinhaMtz(double[] vetorA, double[] vetorB, double[][] matriz, int linha, int coluna) {

        double soma = 0.0;

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

        System.out.printf(" = %.2f\n", soma);

    } // fimm adicionar matriz a para b

    // mostrar matriz
    public static void mostrarMtrz(double[][] matriz, int linha, int coluna) {

        // 11 espaços em branco para a coluna
        System.out.print("           ");
        
        // loop para imprimir os núeros das colunar
        for (int a = 0; a < coluna; a++) {
            // mostra os númmeros das colunas
            System.out.printf("%7d", a + 1);
        } // fim loop
        
        // pula uma linha
        System.out.println("");

        System.out.print("           "); // 11 espaços
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
                System.out.printf("%7.2f", matriz[i][j]);
            } // fim for j
            
            // pula linha
            System.out.println();
        
        } // fimm for i
    } // fim mostrar matriz

    // mostra vetor
    public static void mostraVtr(double[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("%7.2f", vetor[i]);
        } // fim for
    } // fim mostra vetpr

} // fim classe