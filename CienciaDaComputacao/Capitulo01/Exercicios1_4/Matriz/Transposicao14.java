package Matriz;
import java.util.Scanner;

public class Transposicao14 {
    /**
     * 1.4.14 Escreva um fragmento de código para imprimir a transposição
     * (trocas de linhas e colunas) de um array bidimensional quadrado.
     * Para a matriz de planilha de exemplo no texto, seu código imprimiria o
     * seguinte:
     * 99 98 92 94 99 90 76 92 97 89
     * 85 57 77 32 34 46 59 66 71 29
     * 98 78 76 11 22 54 88 89 24 38
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 120).
     * Pearson Educação. Edição do Kindle.
     * Pedro, 14/04/2022
     */
    public static void main(String[] args) {

        // objeto
        Scanner input = new Scanner(System.in);

        // variável
        System.out.println("Digite o valor da transpodição: ");
        int n = input.nextInt();
        // int n = Integer.parseInt(args[0]); 
        // entrada de dados na linha de comando

        // declara e cria uma matriz n por n
        int[][] matriz = new int[n][n];

        // inicializa valores
        // loop para linha
        for (int linha = 0; linha < n; linha++) {
            // loop para coluna
            for (int coluna = 0; coluna < n; coluna++) {
                // inicializa a matriz que recebe n vezes linha mais coluna
                matriz[linha][coluna] = n * linha + coluna;
            } // fim coluna
        } // fim linha

        System.out.println("\nMatriz original:");
        mostrar(matriz);

        // trocando matriz
        // loop para linha
        for (int linha = 0; linha < n; linha++) {
            // loop para coluna iniciando com o valor linha
            for (int coluna = linha; coluna < n; coluna++) {

                // variável recebe o valor da matriz original
                int temp = matriz[linha][coluna];
                // matriz original recebe matriz invertida
                matriz[linha][coluna] = matriz[coluna][linha];
                // matriz invertida recebe o valor da variável temp
                matriz[coluna][linha] = temp;

            } // fim coluna
        } // fim linha

        System.out.println("\nMatriz transposta:");
        mostrar(matriz);

    } // fim main

    // método mostrar
    public static void mostrar(int[][] matriz) {
        // loop para linha
        for (int linha = 0; linha < matriz.length; linha++) {
            // loop para coluna
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                // imprima
                System.out.printf("%5d", matriz[linha][coluna]);
            } // fim coluna

            // pula linha
            System.out.println();
        } // fim linha
    } // fim método mostrar

} // fim classe,