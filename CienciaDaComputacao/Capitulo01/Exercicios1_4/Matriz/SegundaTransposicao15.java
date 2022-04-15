package Matriz;

import java.security.DomainLoadStoreParameter;

public class SegundaTransposicao15 {
    /**
     * 1.4.15 Escreva um fragmento de código para transpor um array
     * bidimensional quadrado sem criar um segundo array.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 120).
     * Pearson Educação. Edição do Kindle.
     * Pedro, 14/04/2022
     */
    public static void main(String[] args) {

        // variável para entrada de dados via teclado
        int num = Integer.parseInt(args[0]);

        // declar e cria a matriz
        int[][] matriz = new int[num][num];

        // inicializa a magriz
        // loop para linha
        for (int linha = 0; linha < num; linha++) {
            // loop para coluna
            for (int coluna = 0; coluna < num; coluna++) {
                // inicializando a matriz
                matriz[linha][coluna] = num * linha + coluna;
            } // fim for coluna
        } // fim for linha

        System.out.println("\nMatriz original:");
        mostrar(matriz);

        // faz a transposição
        // loop para linha
        for (int linha = 0; linha < num; linha++) {
            // loop para a coluna começando com o valor da linha
            for (int coluna = linha; coluna < num; coluna++) {
                // variável temporária
                int temp = matriz[linha][coluna];
                matriz[linha][coluna] = matriz[coluna][linha];
                matriz[coluna][linha] = temp;

            } // fim coluna
        } // fim linha

        System.out.println("\nMatriz transposta:");
        mostrar(matriz);

    } // fim main

    // método mostrar
    public static void mostrar(int[][] matriz) {

        // loop for para linha
        for (int linha = 0; linha < matriz.length; linha++) {
            // loop para coluna
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                // mostra os elementos do vetor
                System.out.printf("%5d", matriz[linha][coluna]);
            } // fim for coluna
            System.out.println();
        } // fim for linha

    } // fim mostrar

} // fim classe