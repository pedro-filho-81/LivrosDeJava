import java.security.SecureRandom;

public class VetorBfatorialDeA5 {
    /**
     * e)Elaborar um programa que leia uma matriz A do tipo vetor com 15
     * elementos inteiros. Construir uma matriz B de mesmo tipo, e cada
     * elemento da matriz B deve ser o resultado da fatorial correspondente
     * de cada elemento da matriz A. Apresentar as matrizes A e B.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 311).
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 22/04/2022
     */

    public static void main(String[] args) {

        // objeto randon
        SecureRandom aleatorio = new SecureRandom();

        // vetores
        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        System.out.println("\nVetorA");
        adicionar(vetorA); // adiciona valor
        exibir(vetorA); // exibe o vetor

        System.out.println("VetorB = fatorial do vetorA");
        fatorial(vetorA, vetorB); // calcula o fatorial de A e adiciona no B
        exibir(vetorB); // exibe o vetor B

    } // fi ain

    // étodo adicionar
    public static void adicionar(int[] vetor) {

        // objeto randon
        SecureRandom aleatorio = new SecureRandom();

        // loop para adicionar valor no vetor
        for (int i = 0; i < vetor.length; i++) {
            // adiciona valor aleatório entre 1 e 10 inclusive no vetor
            vetor[i] = 1 + aleatorio.nextInt(10);
        } // fi for

    } // fi função

    // étodo exibir
    public static void exibir(int[] vetor) {
        // loop para exibir vetor
        for (int i = 0; i < vetor.length; i++) {
            // exibir valores
            System.out.printf("%7d", vetor[i]);
        } // fi for
          // pula linha
        System.out.println();
    } // fi exibir

    // função fatorial
    public static void fatorial(int[] vetorA, int[] vetorB) {
        int fat = 1; // variável
        // loop de controle
        for (int i = 0; i < 15; i++) {
            // loop para calcular o fatorial
            for (int conta = 1; conta <= vetorA[i]; conta++) {
                // calcula o fatorial
                fat *= conta;
            } // fi for
              // vetor B recebe o valor do fatorial
            vetorB[i] = fat;
            // reinicializa a variável
            fat = 1;
        } // fi for

    } // fi fatorial

} // fi classe