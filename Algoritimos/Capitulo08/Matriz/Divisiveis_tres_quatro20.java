package Capitulo08.Matriz;
/**
 * t)Elaborar um programa que leia duas matrizes A e B de 
 * duas dimensões com quatro linhas e cinco colunas. A 
 * matriz A deve ser formada por valores divisíveis por 3 
 * e 4, enquanto a matriz B deve ser formada por valores 
 * divisíveis por 5 ou 6. As entradas dos valores nas 
 * matrizes devem ser validadas pelo programa, e não pelo 
 * usuário. Construir e apresentar a matriz C de mesma 
 * dimensão e número de elementos que contenha a subtração 
 * dos elementos da matriz A em relação aos elementos da 
 * matriz B.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) (p. 406). 
 * Editora Saraiva. Edição do Kindle. 
 * Pedro, 18/09/2024
 */

import java.security.SecureRandom;

public class Divisiveis_tres_quatro20 {

      public static void main(String[] args) {

      // constantes
      final int ROW = 6;
      final int COLUmNS = 5;

      // variables

      // matrizes
      int [][] matrizA = new int[ROW][COLUmNS];
      int [][] matrizB = new int[ROW][COLUmNS];

      // vetores
      // int[] average = new int[ROW];

      // adiciona valores
      add(matrizA, ROW, COLUmNS);
      // add(matrizB, ROW, COLUmNS);
      // average(matrizA, ROW, COLUmNS, average);

      // result display => exibe resultado
      System.out.println("\nmatrizA: ");
      exibir(matrizA, ROW, COLUmNS);
/*
      System.out.println("\nmatrizB: ");
      exibir(matrizB, ROW, COLUmNS);
*/
   } // end main
   
   // método adiciona valor
   public static void add(int[][] matriz, int row, int columns) {

      // objeto
      SecureRandom alea = new SecureRandom();

      // variáveis
      int i = 0, j = 0;
      int valor = 0;
      int item = 0;
      int contar = 0;

      // loop for linha
      while (i < row) {

         for(j = 0; j < columns; j++) {
            
            // matriz recebe valor alea
            valor = 1 + alea.nextInt(150);
            item = 1;

            // verificar se valor é divisivel por 3 e 4
            if (valor % 3 == 0 && valor % 4 == 0) {
               matriz[i][j] = valor;
               item = 0;               
            } // end if

         } // end for

         // verifica se o item é igual a zero 0
         if (item == 0) { // se verdade
            // System.out.println("iiiiii");
            i++; // incrementa i em 1
         } // end if item 0

      } // end for row

   } // end método adicionar

   // método adiciona valor
   public static void addArrayB(int[][] matriz, int row, int columns) {

      // objeto
      SecureRandom alea = new SecureRandom();

      // variáveis
      int i, j;

      // loop for linha
      for(i = 0; i < row; i++) {
         // loop for coluna
         for(j = 0; j < columns; j++) {
            // matriz recebe valor alea
            matriz[i][j] = 1 + alea.nextInt(50);
         } // end for columns
      } // end for row

   } // end método adicionar

   // método adiciona valor
   public static void exibir(int[][] matriz, int row, int columns) {

      // exibe
      System.out.print("          "); // 10 espaços

      // loop para os números das colunas
      for(int c = 0; c < columns; c++) {
         // exibe numeração das colunas
         System.out.printf("%5d", c + 1);
      } // end for

      System.out.println(); // pula linha

      // exibe
      System.out.print("**********"); // 10 asterisco
      // loop for para ast
      for(int ast = 0; ast < columns; ast++) {
         // exibe asteriscos
         System.out.printf("%5s", "*");
      } // end for ast
      
      System.out.println(); // pula linha

      // loop for para linhas
      for(int i = 0; i < row; i++) {
         // exibe as linhas
         System.out.printf("Linha %d =>", i+1);
      
         // loop das colunas
         for(int j = 0; j < columns; j++) {
            // exibe os valores da matriz
            System.out.printf("%5d", matriz[i][j]);
         } // end for coluna
      
         System.out.println(); // pula linha
      
      } // end for linha
   } // end método adicionar

   // método média
   public static void average(int[][] matriz, int linha, int coluna, int[] vetor) {
      
      // variáveis
      int i, j;
      int soma = 0;

      // loop para linha
      for(i = 0; i < linha; i++) {
         // loop para coluna
         for(j = 0; j < coluna; j++) {
            // soma recebe o valor da matriz
             soma += matriz[i][j];
         } // end for soma
         // vetor recebe a média dos valores da matriz
         vetor[linha] = soma / coluna;
         soma = 0; // reinicializa a soma
      } // end for linha
   } // end average

} // end class
