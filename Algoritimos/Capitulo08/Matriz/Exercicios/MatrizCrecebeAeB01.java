package Capitulo08.Matriz.Exercicios;
import java.security.SecureRandom;

public class MatrizCrecebeAeB01 {
    /**
     * a)Elaborar um programa que leia duas matrizes A e B, cada uma de 
     * duas dimensões com cinco linhas e três colunas para valores inteiros. 
     * Construir uma matriz C de mesma dimensão, que seja formada pela soma 
     * dos elementos da matriz A com os elementos da matriz B. 
     * Apresentar os elementos da matriz C.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 402). 
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 30/04/2022 
     */
    public static void main(String[] args) {
        
        // objeto secure randon
        SecureRandom aleatorio = new SecureRandom();

        // constantes
        final int LINHA = 5;
        final int COLUNA = 3;

        // mmatrizes
        int[][] matrizA = new int[LINHA][COLUNA];
        int[][] matrizB = new int[LINHA][COLUNA];
        int[][] matrizC = new int[LINHA][COLUNA];

        // adicionar valores na matriz
        adicionar(matrizA, LINHA, COLUNA);
        adicionar(matrizB, LINHA, COLUNA);
        adicionarMtzC(matrizA, matrizB, matrizC, LINHA, COLUNA);
        
        // mmostrar valores
        System.out.println("\nMatriz A:");
        // mostrar valores da matriz
        mostrar(matrizA, LINHA, COLUNA);
        
        System.out.println("\nMatriz B:");
        mostrar(matrizB, LINHA, COLUNA);
        
        System.out.println("\nMatriz C:");
        mostrar(matrizC, LINHA, COLUNA);

    } // fim mmain

    // adicionar valores na matriz
    public static void adicionar(int[][] matriz, int linha, int coluna) {
        SecureRandom aleatorio = new SecureRandom();
        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                matriz[i][j] = 1 + aleatorio.nextInt(20);
            } // fim for i
        } // fim for j
    } // fim adicionar

    // método adicionar matriz
    public static void adicionarMtzC(int[][] matrizA, int[][] matrizB, int[][] matrizC, int linha, int coluna) {
        
        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            } // fim for i
        } // fim for j
    } // fim adicionar

    // adicionar valores na matriz
    public static void mostrar(int[][] matriz, int linha, int coluna) {
        
        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                System.out.printf("%5d", matriz[i][j]);
            } // fim for i
            System.out.println();
        } // fim for j
    } // fim mostrar

} // fim classe