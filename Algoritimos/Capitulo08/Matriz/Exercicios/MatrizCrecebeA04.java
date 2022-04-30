import java.security.SecureRandom;

class MatrizCrecebeA04 {
    /**
     * d)Elaborar um programa que leia uma matriz A de uma dimensão 
     * com dez elementos inteiros. Construir uma matriz C de duas 
     * dimensões com três colunas, sendo a primeira coluna da matriz C 
     * formada pelos elementos da matriz A somados com 5, a segunda 
     * coluna formada pelo valor do cálculo da fatorial de cada elemento 
     * correspondente da matriz A e a terceira e última coluna pelos 
     * quadrados dos elementos correspondentes da matriz A. 
     * Apresentar a matriz C. 
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 402). 
     * Editora Saraiva. Edição do Kindle. 
     * Pedro, 30/04/2022
     */
    public static void main(String[] args) {
        
        // constante
        final int LINHA = 10;
        final int COLUNA = 3;

        // VETOR
        int[] vetor = new int[LINHA];
        addVetor(vetor);

        // matriz
        int[][] matriz = new int[LINHA][COLUNA];
        addMatriz(vetor, matriz, LINHA);

    } // fim main
    
    // adicionar valores na matriz
    public static void addVetor(int[] vetor) {
        SecureRandom aleatorio = new SecureRandom();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 1 + aleatorio.nextInt(20);
        } // fim for i
    } // fim adicionar

    // adicionar matriz
    public static void addMatriz(int[] vetor, int[][] matriz, int linha) {
        for(int i = 0; i < linha; i++) {
            matriz[i][0] = vetor[i] + 5;
            matriz[i][1] = // cria o vatorial
            matriz[i][2] = vetor[i] * vetor[i]; 
        } // fim for
    } // fim adicionar

} // fim classe