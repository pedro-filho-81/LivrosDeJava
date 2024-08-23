package Algoritimos.Capitulo07.arrays.exercicios;
/*
 * c)Elaborar um programa que leia 20 elementos para 
 * uma matriz qualquer, considerando que essa matriz 
 * tenha o tamanho de quatro linhas por cinco 
 * colunas. Em, seguida, apresentar a matriz.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) 
 * (p. 402). Editora Saraiva. Edição do Kindle. 
 * 22/08/2024
 */
import java.security.SecureRandom;

public class Matriz20Valores03 {
   public static void main(String[] args) {
      
      // constante
      final int LINHAS = 4;
      final int COLUNAS = 5;

      // matriz
      int[][] matrizA = new int[LINHAS][COLUNAS];

      // adiciona valores a matriz
      adicionarMatriz(matrizA, LINHAS, COLUNAS);

      // cabeçalho
      System.out.println("MatrizA:");
      exibirMatriz(matrizA, LINHAS, COLUNAS);

   } // end main
   
   // método adicionar
   public static void adicionarMatriz(int[][] matriz, int linhas, int colunas) {
      
      SecureRandom alea = new SecureRandom();
      
      int i, j;
      for(i = 0; i < linhas; i++) {
         for(j = 0; j < colunas; j++) {
            matriz[i][j] = 1 + alea.nextInt(50);
         } // end for j
      } // end for i

   } // end adicionar

   // método exibir
   public static void exibirMatriz(int[][] matriz, int linhas, int colunas) {
      
      for(int i = 0; i < linhas; i++) {
         for(int j = 0; j < colunas; j++) {
            System.out.printf("%5d", matriz[i][j]);
         } // end for j
         System.out.println();
      } // end for i
      
   } // end exibir

} // end class