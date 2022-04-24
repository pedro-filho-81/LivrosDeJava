import java.security.SecureRandom;

public class VetorBrecebeAroteV9 {
    /**
     * h)Elaborar um programa que leia 20 elementos do tipo real
     * em uma matriz A unidimensional e construir uma matriz B
     * de mesma dimensão com os mesmos elementos armazenados na
     * matriz A, porém de forma invertida. Ou seja, o primeiro
     * elemento da matriz A passa a ser o último da matriz B,
     * o segundo elemento da matriz A passa a ser o penúltimo da
     * matriz B, e assim por diante. Apresentar os elementos das
     * matrizes A e B.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 312).
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 23/04/2022
     */
    public static void main(String[] args) {

        // vetores
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        System.out.println("\nVetorA");
        adicionar(vetorA);
        exibir(vetorA);

        System.out.println("VetorB");
        adicionarVtrA(vetorA, vetorB);
        mostraInverte(vetorB);

    } // fim ain

    // étodo adicionar
    public static void adicionar(int[] vetor) {

        // objeto randon
        SecureRandom aleatorio = new SecureRandom();

        // loop para adicionar valor no vetor
        for (int i = 0; i < vetor.length; i++) {
            // adiciona valor aleatório entre 1 e 10 inclusive no vetor
            vetor[i] = 1 + aleatorio.nextInt(50);
        } // fi for

    } // fi função

    // método exibir
    public static void exibir(int[] vetor) {
        // loop para exibir vetor
        for (int i = 0; i < vetor.length; i++) {
            // exibir valores
            System.out.printf("%7d", vetor[i]);
        } // fi for
          // pula linha
        System.out.println();
    } // fi exibir

    // método adicionar vetor c
    public static void adicionarVtrA(int[] vetorA, int[] vetorB) {
        int i;
        // loop para exibir vetor
        for (i = 0; i < vetorA.length; i++)
            vetorB[i] = vetorA[i];
    } // fim adicionar

    // inverter
    public static void mostraInverte(int[] vetor) {
        // loop for para inverter valores do vetor
        for (int i = vetor.length - 1; i >= 0; i--)
            // ostra os valores do vetor invertido
            System.out.printf("%7d", vetor[i]);
    }// fimm inverter

} // fim classe