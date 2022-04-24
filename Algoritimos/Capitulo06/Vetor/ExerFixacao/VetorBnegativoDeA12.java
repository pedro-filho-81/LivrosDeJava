import java.security.SecureRandom;

public class VetorBnegativoDeA12 {
    /**
     * k)Elaborar um programa que leia uma matriz A do tipo vetor
     * com dez elementos inteiros positivos. Construir uma matriz B
     * de mesmos tipo e dimensão, em que cada elemento da matriz B
     * deve ser o valor negativo do elemento correspondente da matriz A.
     * Desta forma, se em A[1] estiver armazenado o elemento 8, deve estar
     * em B[1] o valor –8 e assim por diante. Apresentar os elementos da matriz B.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (pp. 312-313).
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 23/04/2022
     */
    public static void main(String[] args) {

        // vetores
        int[] vetorA = new int[20];
        int[] vetorB = new int[20];

        System.out.println("\nVetorA");
        adicionar(vetorA);
        exibir(vetorA);

        System.out.println("VetorB");
        mostraNegativo(vetorA, vetorB);
        exibir(vetorB);

    } // fim ain

    // étodo adicionar
    public static void adicionar(int[] vetor) {

        // objeto randon
        SecureRandom aleatorio = new SecureRandom();

        // loop para adicionar valor no vetor
        for (int i = 0; i < vetor.length; i++) {
            // adiciona valor aleatório entre 1 e 10 inclusive no vetor
            vetor[i] = 1 + aleatorio.nextInt(20);
        } // fi for

    } // fi função

    // método exibir
    public static void exibir(int[] vetor) {
        // loop para exibir vetor
        for (int i = 0; i < vetor.length; i++) {
            // exibir valores
            System.out.printf("%4d", vetor[i]);
        } // fi for
          // pula linha
        System.out.println();
    } // fi exibir

    // fatorial
    public static void mostraNegativo(int[] vetorA, int[] vetorB) {

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] * -1;
        } // fim for i
    } // fim método

} // fim classe