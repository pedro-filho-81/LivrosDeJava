import java.security.SecureRandom;

public class VetorBquadradoDeA4 {
    /**
     * d)Elaborar um programa que leia 15 elementos inteiros de uma matriz A 
     * do tipo vetor. Construir uma matriz B de mesmo tipo, observando 
     * a seguinte lei de formação: “todo elemento da matriz B deve ser 
     * o quadrado do elemento da matriz A correspondente. 
     * Apresentar os elementos das matrizes A e B.
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
        adicionar(vetorA);
        exibir(vetorA);

        System.out.println("VetorB = vetorA * vetorA");
        // loop for
        for(int i = 0; i < vetorB.length; i++)
            vetorB[i] = vetorA[i] * vetorA[i];
        exibir(vetorB);

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