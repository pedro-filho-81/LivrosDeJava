import java.security.SecureRandom;

public class MatrizCrecebeMtzAeB02 {
    /**
     * b)Elaborar um programa que leia duas matrizes A e B, cada uma com 
     * uma dimensão para sete elementos inteiros. Construir uma matriz C 
     * de duas dimensões, cuja primeira coluna deve ser formada pelos 
     * elementos da matriz A e a segunda coluna pelos elementos da matriz B. 
     * Apresentar a matriz C.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 402). 
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 30/04/2022 
     */
    public static void main(String[] args) {
        
        // constantes
        final int LINHA = 2;
        final int COLUNA = 7;

        // vetores
        int[] vetorA = new int[COLUNA];
        int[] vetorB = new int[COLUNA];

        // atriz
        int[][] matriz = new int[LINHA][COLUNA];

        // adicionar
        adicionar(vetorA, COLUNA);
        adicionar(vetorB, COLUNA);
        adicionarMtzC(vetorA, vetorB, matriz, LINHA, COLUNA);

        // mostrar
        System.out.println("\nVetorA: ");
        mostrar(vetorA, COLUNA);

        System.out.println("\nVetorB:");
        mostrar(vetorB, COLUNA);

        System.out.println("\nMatriz:");
        mostrarMtz(matriz, LINHA, COLUNA);
        
    } // fim mmain
    
    // adicionar valores na matriz
    public static void adicionar(int[] vetor, int coluna) {
        SecureRandom aleatorio = new SecureRandom();
        for(int j = 0; j < coluna; j++) {
            vetor[j] = 1 + aleatorio.nextInt(20);
        } // fim for i
    } // fim adicionar

    // método adicionar matriz
    public static void adicionarMtzC(int[] vetorA, int[] vetorB, int[][] matrizC, int linha, int coluna) {
        
        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                if( i == 0)
                    matrizC[i][j] = vetorA[j];
                else
                    matrizC[i][j] = vetorB[j];
            } // fim for i
        } // fim for j

    } // fim adicionar

    // adicionar valores na matriz
    public static void mostrar(int[] vetor, int coluna) {
        
            for(int j = 0; j < coluna; j++) {
                System.out.printf("%5d", vetor[j]);
            } // fim for j
    } // fim mostrar
    
    // adicionar valores na matriz
    public static void mostrarMtz(int[][] matriz, int linha, int coluna) {
        
        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                System.out.printf("%5d", matriz[i][j]);
            } // fim for i
            System.out.println();
        } // fim for j
    } // fim mostrar

} // fimm classe