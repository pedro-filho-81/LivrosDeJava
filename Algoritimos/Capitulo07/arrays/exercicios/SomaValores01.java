package Algoritimos.Capitulo07.arrays.exercicios;

import java.security.SecureRandom;

public class SomaValores01 {
/*
 * a)Elaborar um programa que leia duas matrizes A e 
 * B, cada uma de duas dimensões com cinco linhas e 
 * três colunas para valores inteiros. Construir uma 
 * matriz C de mesma dimensão, que seja formada pela 
 * soma dos elementos da matriz A com os elementos 
 * da matriz B. Apresentar os elementos da matriz C.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) (p. 
 * 402). Editora Saraiva. Edição do Kindle. 
 */
   public static void main(String[] args) {
      // objeto
      SecureRandom alea = new SecureRandom();

      // constante
      final int LINHAS = 5;
      final int COLUNAS = 3;

      // matrizes
      int[][] matrizA = new int[LINHAS][COLUNAS];
      int[][] matrizB = new int[LINHAS][COLUNAS];
      int[][] matrizC = new int[LINHAS][COLUNAS];

      adicionar(matrizA, LINHAS, COLUNAS);
      System.out.println("matrizA:");
      exibir(matrizA, LINHAS, COLUNAS);
      
      System.out.println("matrizB:");
      adicionar(matrizB, LINHAS, COLUNAS);
      exibir(matrizB, LINHAS, COLUNAS);
      
      System.out.println("matrizC:");
      for(int i = 0; i < LINHAS; i++) {
         for(int j = 0; j < COLUNAS; j++) {
            matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
         } // end for j
      } // end for i
      exibir(matrizC, LINHAS, COLUNAS);

   } // end main

   // método adicionar
   public static void adicionar(int[][] matriz, int linhas, int colunas) {
      
      SecureRandom alea = new SecureRandom();
      
      int i, j;
      for(i = 0; i < linhas; i++) {
         for(j = 0; j < colunas; j++) {
            matriz[i][j] = 1 + alea.nextInt(50);
         } // end for j
      } // end for i

   } // end adicionar

   // método exibir
   public static void exibir(int[][] matriz, int linhas, int colunas) {
      
      for(int i = 0; i < linhas; i++) {
         for(int j = 0; j < colunas; j++) {
            System.out.printf("%5d", matriz[i][j]);
         } // end for j
         System.out.println();
      } // end for i
      
   } // end exibir

} // end class