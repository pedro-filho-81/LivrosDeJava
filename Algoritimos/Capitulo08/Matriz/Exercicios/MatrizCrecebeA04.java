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
        // adiciona os valores do vetor na matriz
        addMatriz(vetor, matriz, LINHA);
        // adiciona os valores fatorial na matriz
        addFatorial(vetor, matriz, LINHA, COLUNA);

        // métodos
        System.out.println("\nVetor original:");
        mostrarVtr(vetor);
        System.out.println("\nMatriz:");
        mostrarMtrz(matriz, LINHA, COLUNA);
    } // fim main

    // adicionar valores na matriz
    public static void addVetor(int[] vetor) {

        // objeto SecureRandom
        SecureRandom aleatorio = new SecureRandom();

        // loop para adicionar valores no vetor
        for (int i = 0; i < vetor.length; i++) {
            // vetor recebe valores aleatórios
            vetor[i] = 1 + aleatorio.nextInt(10);
        } // fim for i
    } // fim adicionar

    // adicionar matriz
    public static void addMatriz(int[] vetor, int[][] matriz, int linha) {
        // loop para adicionar valores do vetor na mmatriz
        for (int i = 0; i < linha; i++) {
            // matriz primeira coluna recebe os valores do vetor mais 5
            matriz[i][0] = vetor[i] + 5;
            // matriz terceira coluna recebe o quadrado dos valores do vetor
            matriz[i][2] = vetor[i] * vetor[i];
        } // fim for
    } // fim adicionar

    // adicionar fatorial na matriz
    public static void addFatorial(int[] vetor, int[][] matriz, int linha, int coluna) {
        // variável
        int fat = 1;

        // loop para linha
        for (int i = 0; i < linha; i++) {

            // loop para calcular os valores do vetor
            for (int j = 1; j <= vetor[i]; j++) {
                // calcula o fatorial dos valores do vetor
                fat *= j;
            } // fim for j

            // matriz recebe o valor do fatorial na segunda coluna
            matriz[i][1] = fat;
            // reinicializa o fatorial
            fat = 1;

        } // fim for i

    } // fim addFatorial

    // mostrar vetor
    public static void mostrarVtr(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%5d", vetor[i]);
        } // fim for
    } // fim mostrar

    // mostrar matriz
    public static void mostrarMtrz(int[][] matriz, int linha, int coluna) {

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%10d", matriz[i][j]);
            } // fim for j
            System.out.println();
        } // fimm for i

    } // fim mostrar

} // fim classe