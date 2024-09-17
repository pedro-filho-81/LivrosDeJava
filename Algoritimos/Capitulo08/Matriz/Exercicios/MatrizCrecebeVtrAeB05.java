package Capitulo08.Matriz.Exercicios;
import java.security.SecureRandom;

public class MatrizCrecebeVtrAeB05 {

    /**
     * e)Elaborar um programa que leia duas matrizes A e B,
     * cada uma com uma dimensão para 12 elementos reais.
     * Construir uma matriz C de duas dimensões, sendo a
     * primeira coluna da matriz C formada pelos elementos
     * da matriz A multiplicados por 2 e a segunda coluna
     * formada pelos elementos da matriz B subtraídos de 5.
     * Apresentar separadamente as matrizes.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (pp. 402-403).
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 01/05/2022
     */
    public static void main(String[] args) {

        // constante
        final int LINHA = 12;
        final int COLUNA = 2;

        // VETOR
        double[] vetorA = new double[LINHA];
        double[] vetorB = new double[LINHA];

        // adicionar valores ao vetor
        addVetor(vetorA);
        addVetor(vetorB);

        // matriz
        double[][] matriz = new double[LINHA][COLUNA];
        // adicionar valores a mmatriz
        addMatriz(vetorA, vetorB, matriz, LINHA, COLUNA);

        // métodos
        System.out.println("\nVetorA:");
        mostrarVtr(vetorA);

        // métodos
        System.out.println("\nVetorB:");
        mostrarVtr(vetorB);
                
        System.out.println("\nMatriz:");
        mostrarMtrz(matriz, LINHA, COLUNA);        
    } // fim main

    // adicionar valores na matriz
    public static void addVetor(double[] vetor) {

        // objeto SecureRandom
        SecureRandom aleatorio = new SecureRandom();

        // loop para adicionar valores no vetor
        for (int i = 0; i < vetor.length; i++) {
            // vetor recebe valores aleatórios
            vetor[i] = 1 + aleatorio.nextInt(50) / 7.37;
        } // fim for i
    } // fim adicionar

    // adicionar matriz
    public static void addMatriz(double[] vetorA, double[] vetorB, double[][] matriz, int linha, int coluna) {
        // loop para adicionar valores do vetor na mmatriz
        for (int i = 0; i < linha; i++) {
            // matriz primeira coluna recebe os valores do vetor mais 5
            matriz[i][0] = vetorA[i] * 2;
            // matriz terceira coluna recebe o quadrado dos valores do vetor
            matriz[i][1] = vetorB[i] - 5;
        } // fim for
    } // fim adicionar

    // mostrar vetor
    public static void mostrarVtr(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%5.2f", vetor[i]);
        } // fim for
    } // fim mostrar

    // mostrar matriz
    public static void mostrarMtrz(double[][] matriz, int linha, int coluna) {

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%10.2f", matriz[i][j]);
            } // fim for j
            System.out.println();
        } // fimm for i

    } // fim mostrar

} // fim classe