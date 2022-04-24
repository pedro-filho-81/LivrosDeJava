import java.security.SecureRandom;

public class VetorDrecebeVetorABC10 {
    /**
     * i)Escrever um programa que leia três matrizes (A, B e C)
     * de uma dimensão do tipo vetor com cinco elementos cada que
     * sejam do tipo real. Construir uma matriz D, sendo esta
     * o resultado da junção das três matrizes (A, B e C).
     * Desta forma, a matriz D deve ter o triplo de elementos das
     * matrizes A, B e C, ou seja, 15 elementos. Apresentar
     * os elementos da matriz D.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 312).
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 23/04/2022
     */
    public static void main(String[] args) {

        // objeto randon
        SecureRandom aleatorio = new SecureRandom();

        // vetores
        double[] vetorA = new double[5];
        double[] vetorB = new double[5];
        double[] vetorC = new double[5];
        double[] vetorD = new double[15];

        // cabecalho
        System.out.println("Vetor A");
        adicionar(vetorA);
        exibir(vetorA);

        // cabecalho
        System.out.println("Vetor B");
        adicionar(vetorB);
        exibir(vetorB);

        // cabecalho
        System.out.println("Vetor C");
        adicionar(vetorC);
        exibir(vetorC);

        System.out.println("Vetor D");
        adicionarVtrA(vetorA, vetorB, vetorC, vetorD);
        exibir(vetorD);

    } // fi main

    // étodo adicionar
    public static void adicionar(double[] vetor) {

        // objeto randon
        SecureRandom aleatorio = new SecureRandom();

        // loop para adicionar valor no vetor
        for (int i = 0; i < vetor.length; i++) {
            // adiciona valor aleatório entre 1 e 10 inclusive no vetor
            vetor[i] = 1 + aleatorio.nextDouble(50 / 7);
        } // fi for

    } // fi função

    // método exibir
    public static void exibir(double[] vetor) {
        // loop para exibir vetor
        for (int i = 0; i < vetor.length; i++) {
            // exibir valores
            System.out.printf("%7.2f", vetor[i]);
        } // fi for
          // pula linha
        System.out.println();
    } // fi exibir

    // método adicionar vetor c
    public static void adicionarVtrA(double[] vetorA, double[] vetorB, double[] vetorC, double[] vetorD) {
        int i;
        // loop para exibir vetor
        for (i = 0; i < vetorA.length; i++)
            vetorD[i] = vetorA[i] ;
        for(int j = 0; j < vetorB.length; j++)
            vetorD[j + 5] = vetorB[j];
        for(int k = 0; k < vetorB.length; k++)
            vetorD[k + 10] = vetorC[k];
    } // fim adicionar

    // inverter
    public static void mostraInverte(double[] vetor) {
        // loop for para inverter valores do vetor
        for (int i = vetor.length - 1; i >= 0; i--)
            // ostra os valores do vetor invertido
            System.out.printf("%7.2f", vetor[i]);
    }// fimm inverter

} // fim classe
