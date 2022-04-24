import java.security.SecureRandom;

public class VetorAparaVetorB2 {
    /**
     * b)Elaborar um programa que leia oito elementos inteiros em uma matriz A
     * do tipo vetor. Construir uma matriz B de mesma dimensão com os elementos
     * da matriz A multiplicados por 3. O elemento B[1] deve ser implicado pelo
     * elemento A[1] * 3, o elemento B[2] implicado pelo elemento A[2] * 3,
     * e assim por diante, até 8. Apresentar a matriz B.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 311).
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 22/04/2022
     */
    public static void main(String[] args) {

        // objeto randon
        SecureRandom aleatorio = new SecureRandom();

        // criar vetor
        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        // loop adicionar valor
        for (int i = 0; i < 8; i++) {
            vetorA[i] = 1 + aleatorio.nextInt(50);
        } // fi for

        // loop adicionar valor
        for (int i = 0; i < 8; i++) {
            vetorB[i] = vetorA[i] * 3;
        } // fi for

        System.out.println("\nVetorA:");
        // loop ostrar valores
        for (int i = 0; i < 8; i++) {
            System.out.printf("%5d", vetorA[i]);
        } // fi for

        System.out.println("\nVetorB:");
        // loop ostrar valores
        for (int i = 0; i < 8; i++) {
            System.out.printf("%5d", vetorB[i]);
        } // fi for

    } // fi ain
} // fi classe