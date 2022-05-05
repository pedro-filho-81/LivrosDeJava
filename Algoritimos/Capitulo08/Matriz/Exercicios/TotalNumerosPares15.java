import java.security.SecureRandom;

public class TotalNumerosPares15 {
    /**
     * n)Elaborar um programa que leia uma matriz A de duas dimensões
     * com sete linhas e sete colunas. Ao final, apresentar o total de
     * elementos pares existentes na matriz.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 404).
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 05/05/2022
     */
    public static void main(String[] args) {

        // constante
        final int LINHA = 7;
        final int COLUNA = 7;

        // matriz
        int[][] matrizA = new int[LINHA][COLUNA];

        // adicionar
        adicionar(matrizA, LINHA, COLUNA);

        // mostrar matriz
        System.out.println("\nMatrizA:");
        mostrarMtrz(matrizA, LINHA, COLUNA);
        somaNumerosPares(matrizA, LINHA, COLUNA);

    } // fim main

    // adicionar
    public static void adicionar(int[][] matriz, int linha, int coluna) {

        SecureRandom aleatorio = new SecureRandom();

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = 1 + aleatorio.nextInt(50);
            } // fim for j
        } // fim for i

    } // fim adicionar

    // adicionar matriz a para b
    public static void somaNumerosPares(int[][] matriz, int linha, int coluna) {

        int soma = 0;

        System.out.print("\nSoma numeros pares: ");

        for (int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) { 

                if (matriz[i][j] % 2 == 0) {

                    System.out.printf("%3d", matriz[i][j]);
                    soma += matriz[i][j];

                } // fim if
            } // fi j
        } // fim for i

        System.out.printf(" = %d\n", soma);

    } // fimm adicionar matriz a para b

    // mostrar matriz
    public static void mostrarMtrz(int[][] matriz, int linha, int coluna) {

        // espaço e branco para a coluna
        System.out.print("            ");
        // loop para imprimir os núeros das colunar
        for (int a = 0; a < coluna; a++) {
            // mostra os númmeros das colunas
            System.out.printf("%5d", a + 1);
        } // fim loop
          // pula uma linha
        System.out.println("");

        System.out.print("            "); // espaço
        for (int a = 0; a < coluna; a++) { // loop
            System.out.printf("%5s", "*"); // imprime asterisco
        } // fim loop
        System.out.println(); // pula linha

        // loop para a linha
        for (int i = 0; i < linha; i++) {
            // mostra a índice da linha
            System.out.printf("linha %2d -> ", i + 1);
            // loop para a coluna
            for (int j = 0; j < coluna; j++) {
                // mostra o valor da coluna na matriz
                System.out.printf("%5d", matriz[i][j]);
            } // fim for j
              // pula linha
            System.out.println();
        } // fimm for i
    } // fim mostrar matriz

} // fim classe