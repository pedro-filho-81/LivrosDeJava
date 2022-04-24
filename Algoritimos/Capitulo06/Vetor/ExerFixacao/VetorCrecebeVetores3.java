import java.security.SecureRandom;

class VetorCrecebeVetores3 {
    /**
     * c)Escrever um programa que leia duas matrizes (denominadas A e B) 
     * do tipo vetor com 20 elementos reais. Construir uma matriz C, 
     * sendo cada elemento da matriz C a subtração de um elemento 
     * correspondente da matriz A com um elemento correspondente da matriz B, 
     * ou seja, a operação de processamento deve estar baseada na operação 
     * C[I] = A[I] – B[I]. Ao final, apresentar os elementos da matriz C.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 311). 
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 22/04/2022 
     */
    public static void main(String[] args) {
        
        // objeto randon
        SecureRandom aleatorio = new SecureRandom();

        // vetores
        int[] vetorA = new int[20];
        int[] vetorB = new int[20];
        int[] vetorC = new int[20];

        System.out.println("\nVetorA");
        adicionar(vetorA);
        exibir(vetorA);

        System.out.println("VetorB");
        adicionar(vetorB);
        exibir(vetorB);

        System.out.println("VetorC = vetorA - vetorB");
        // loop for
        for(int i = 0; i < vetorC.length; i++)
            vetorC[i] = vetorA[i] - vetorB[i];
        exibir(vetorC);

    } // fi ain

    // étodo adicionar
    public static void adicionar(int[] vetor) {
        
        // objeto randon
        SecureRandom aleatorio = new SecureRandom();

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(50);
        } // fi fof
    } // fi função

    // étodo exibir
    public static void exibir(int[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("%5d", vetor[i]);
        } // fi for
        System.out.println();
    } // fi exibir

} // fi classe