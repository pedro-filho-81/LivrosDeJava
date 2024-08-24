package Algoritimos.Capitulo07.arrays.exercicios;

import java.security.SecureRandom;

/**
 * g)Elaborar um programa que leia uma matriz A de 
 * duas dimensões com quatro linhas e cinco colunas, 
 * armazenando nessa matriz os valores das 
 * temperaturas em graus Celsius. Construir a matriz 
 * B de mesma dimensão, em que cada elemento seja o 
 * valor da temperatura em graus Fahrenheit de cada 
 * elemento correspondente da matriz A. Apresentar 
 * ao final as matrizes A e B.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) 
 * (p. 403). Editora Saraiva. Edição do Kindle. 
 * Pedro, 24/08/2024
 */
public class MatrizCelsiusFahrenheit06 {  
   public static void main(String[] args) {
      // MMM      
      // constante
      final int LINHAS = 4; // index linhas
      final int COLUNAS = 5; // index colunas

      // matrizes
      int[][] celsius = new int[LINHAS][COLUNAS];
      double[][] fahrenheit = new double[LINHAS][COLUNAS];

      // ADICIONAR e EXIBIR
      System.out.println("Temperaturas em graus Celsiusl:");
      adicionarMatriz(celsius, LINHAS, COLUNAS);
      exibirMatriz(celsius, LINHAS, COLUNAS);

      // CELSIUS PARA FAHRENHEIT
      // loop for linha
      for(int i = 0; i < LINHAS; i++) {
         // loop for colunas
         for(int j = 0; j < COLUNAS; j++) {      
            // Fahrenheit recebe a conversão de graus Celsius
            fahrenheit[i][j] = celsius[i][j] * 1.8 + 32;
      
         } // end for j
      } // end for i

      // exibir resultado
      System.out.println("Conversão de Temperaturas Celsius para Fahrenheit:");
      exibirMatriz(fahrenheit, LINHAS, COLUNAS);

   } // end main

   // método adicionar
   public static void adicionarMatriz(int[][] matriz, int linhas, int colunas) {
      
      SecureRandom alea = new SecureRandom();
      
      int i, j;
      for(i = 0; i < linhas; i++) {
         for(j = 0; j < colunas; j++) {
            matriz[i][j] = -20 + alea.nextInt(50);
         } // end for j
      } // end for i

   } // end adicionar

   // método exibir
   public static void exibirMatriz(double[][] matriz, int linhas, int colunas) {
      
      for(int i = 0; i < linhas; i++) {
         for(int j = 0; j < colunas; j++) {
            System.out.printf("%11.1f", matriz[i][j]);
         } // end for j
         System.out.println();
      } // end for i
      
   } // end exibir

      // método exibir
      public static void exibirMatriz(int[][] matriz, int linhas, int colunas) {
      
         for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
               System.out.printf("%11d", matriz[i][j]);
            } // end for j
            System.out.println();
         } // end for i
         
      } // end exibir   

} // end class
