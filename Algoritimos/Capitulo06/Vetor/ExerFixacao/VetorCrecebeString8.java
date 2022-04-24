public class VetorCrecebeString8 {
    /**
     * g)Elaborar um programa que leia duas matrizes do tipo vetor para 
     * o armazenamento de nomes de pessoas, sendo a matriz A com 20 elementos 
     * e a matriz B com 30 elementos. Construir uma matriz C, 
     * sendo esta a junção das matrizes A e B. Desta forma, a matriz C deve ter 
     * a capacidade de armazenar 50 elementos. Apresentar os elementos da matriz C.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 312). 
     * Editora Saraiva. Edição do Kindle. 
     * Pedro, 23/04/2022
     */
    public static void main(String[] args) {
        
        // vetores
        String[] vetorA = {"Pedro", "Maria", "Jose", "Paulo", "Cleonice"};
        String[] vetorB = {"Motocicleta", "Carro", "Televisao", "Geladeira", "Viagem"};
        String[] vetorC = new String[10];

        for(int nome = 0; nome < vetorA.length; nome++)
            vetorC[nome] = vetorA[nome];

        for(int nome = 0; nome < vetorA.length; nome++)
            vetorC[nome + 5] = vetorB[nome];
        System.out.println("\nVetorA");    
        exibir(vetorA);
        System.out.println("VetorB:");
        exibir(vetorB);
        System.out.println("VetorC");
        exibir(vetorC);
    }
    
    // étodo exibir
    public static void exibir(String[] vetor) {
        // loop para exibir vetor
        for (int i = 0; i < vetor.length; i++) {
            // exibir valores
            System.out.printf("%s   ", vetor[i]);
        } // fi for
          // pula linha
        System.out.println();
    } // fi exibir
}
