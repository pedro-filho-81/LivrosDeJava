package Capitulo08.Matriz.Exercicios;
import java.security.SecureRandom;

public class MatrizBrecebeMtzA11 {
    /**
     * j)Elaborar um programa que leia uma matriz A de duas 
     * dimensões com seis linhas e cinco colunas. Construir 
     * a matriz B de mesma dimensão, que deve ser formada do 
     * seguinte modo: para cada elemento par da matriz A deve 
     * ser somado 5 e de cada elemento ímpar da matriz A deve 
     * ser subtraído 4. Apresentar ao final as matrizes A e B.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 404). 
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 04/05/2022
     */
    public static void main(String[] args) {
        
        // constante
        final int LINHA = 6;
        final int COLUNA = 5;

        // matriz
        int[][] matrizA = new int[LINHA][COLUNA];
        int[][] matrizB = new int[LINHA][COLUNA];

        // adicionar
        adicionar(matrizA, LINHA, COLUNA);
        adicionarMtz(matrizA, matrizB, LINHA, COLUNA);

        // mostrar matriz
        System.out.println("\nMatrizA:");
        mostrarMtrz(matrizA, LINHA, COLUNA);

        System.out.println("\nMatrizB: recebe os valores da matrizA");
        System.out.println("Valores par soma 5, valores ímparas subitrair 4");
        mostrarMtrz(matrizB, LINHA, COLUNA);

    } // fim main

    // adicionar
    public static void adicionar(int[][] matriz, int linha, int coluna) {
        
        SecureRandom aleatorio = new SecureRandom();

        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                matriz[i][j] = 1 + aleatorio.nextInt(50);
            } // fim for j
        } // fim for i
    
    } // fim adicionar

    // adicionar matriz a para b
    public static void adicionarMtz(int[][] matrizA, int[][] matrizB, int linha, int coluna) {

        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                
                matrizB[i][j] = matrizA[i][j] + 5;

                if(matrizA[i][j] % 2 != 0)
                    matrizB[i][j] = matrizA[i][j] - 4;
            } // fim for j
        } // fim for i
    
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