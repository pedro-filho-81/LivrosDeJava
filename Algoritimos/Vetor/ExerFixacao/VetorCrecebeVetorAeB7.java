import java.security.SecureRandom;

public class VetorCrecebeVetorAeB7 {
    /**
     * g)Elaborar um programa que leia duas matrizes do tipo vetor para 
     * o armazenamento de nomes de pessoas, sendo a matriz A com 20 elementos 
     * e a matriz B com 30 elementos. Construir uma matriz C, sendo esta 
     * a junção das matrizes A e B. Desta forma, a matriz C deve ter a capacidade 
     * de armazenar 50 elementos. Apresentar os elementos da matriz C.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 312). 
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 22/04/2022 
     */
    
    public static void main(String[] args) {
        
        // objeto secure random
        SecureRandom aleatorio = new SecureRandom();

        // vetores
        int[] vetorA = new int[15];
        int[] vetorB = new int[15];
        int[] vetorC = new int[31];

        // dicionar valores aos vetores A e B
        adicionar(vetorA);
        adicionar(vetorB);
        adicionarVtrC(vetorA, vetorB, vetorC);

        // ostrar os vetores A e B
        System.out.println("\nVetorA:");
        exibir(vetorA);

        System.out.println("\nVetorB:");
        exibir(vetorB);

        System.out.println("\nVetorC:");
        exibir(vetorC);

    } // fim main
    
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

    // método adicionar vetor c
    public static void adicionarVtrC(int[] vetorA, int[] vetorB, int[] vetorC) {
        int i, j, k;
        for(i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];            
        } // fim for vetor a
        for(j = 0; j < vetorB.length; j++)
            vetorC[j + 15] = vetorB[j];

    } // fim adicionar

} // fi classe