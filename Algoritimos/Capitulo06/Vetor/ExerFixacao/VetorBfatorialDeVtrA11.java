import java.security.SecureRandom;

public class VetorBfatorialDeVtrA11 {
    /**
     * j)Elaborar um programa que leia uma matriz A do tipo vetor com 20 
     * elementos inteiros. Construir uma matriz B dos mesmos tipo 
     * e dimensão da matriz A, sendo cada elemento da matriz B o somatório de 1 
     * até o valor do elemento correspondente armazenado na matriz A. 
     * Se o valor do elemento da matriz A[1] for 5, o elemento correspondente da 
     * matriz B[1] deve ser 15, pois o somatório do elemento da matriz A é 1 + 2 
     * + 3 + 4 + 5. Apresentar os elementos da matriz B.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 312). 
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
        fatorial(vetorA, vetorB);
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
    public static void fatorial( int[] vetorA, int[] vetorB) {
        int fat = 0;
        for(int i = 0; i < vetorB.length; i++) {
            for(int j = 1; j <= vetorA[i]; j++) {
                fat += j; 
            } // fim for j

            vetorB[i] = fat;
            fat = 0;

        } // fim for i
    } // fim método

} // fim classe