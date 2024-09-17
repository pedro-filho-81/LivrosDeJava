package Capitulo08.Matriz.Exercicios;
import java.security.SecureRandom;

public class MostrarMatriz03 {
    /**
     * c)Elaborar um programa que leia 20 elementos para uma matriz qualquer,
     * considerando que essa matriz tenha o tamanho de quatro linhas por cinco
     * colunas. Em, seguida, apresentar a matriz.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 402).
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 30/04/2022
     */
    public static void main(String[] args) {

        // constante
        final int LINHA = 4;
        final int COLUNA = 5;

        // matriz
        int[][] matriz = new int[LINHA][COLUNA];

        // adicionar
        adicionar(matriz, LINHA, COLUNA);

        System.out.println("MatrizA:");
        //Mostrar
        mostrar(matriz, LINHA, COLUNA);
        
    } // fim main

    // adicionar valores na matriz
    public static void adicionar(int[][] matriz, int linha, int coluna) {
        SecureRandom aleatorio = new SecureRandom();
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = 1 + aleatorio.nextInt(20);
            } // fim for i
        } // fim for j
    } // fim adicionar

    // mostrar valores na matriz
    public static void mostrar(int[][] matriz, int linha, int coluna) {

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%5d", matriz[i][j]);
            } // fim for i
            System.out.println();
        } // fim for j
    } // fim mostrar

} // fi classe