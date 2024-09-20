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

      // constantes índices
      final int ROW = 4; // linha
      final int COLUmNS = 5; // colunas

      // matrizes
      int [][] matrizA = new int[ROW][COLUmNS];
      int [][] matrizB = new int[ROW][COLUmNS];
      int [][] matrizC = new int[ROW][COLUmNS];

      // adiciona valores
      addArrayA(matrizA, ROW, COLUmNS);
      addArrayB(matrizB, ROW, COLUmNS);
      // average(matrizA, ROW, COLUmNS, average);

      // result display => exibe resultado
      System.out.println("\nmatrizA: ");
      exibir(matrizA, ROW, COLUmNS);

      System.out.println("\nmatrizB: ");
      exibir(matrizB, ROW, COLUmNS);

      // loop for para adicionar valores na matrizC
      for(int i = 0; i < ROW; i++) {
         for(int j = 0; j < COLUmNS; j++) {
            // matrizC recebe os valores de matrizA menos matrizB
            matrizC[i][j] = matrizA[i][j] - matrizB[i][j];
         } // end for colunas
      } // end for linhas

      System.out.println("\nmatrizC = matrizA - matrizB:");
      exibir(matrizC, ROW, COLUmNS);

   } // end main
   
   // método adiciona valores
   public static void addArrayA(int[][] matriz, int row, int columns) {

      // objeto
      SecureRandom alea = new SecureRandom();

      // variáveis
      int i = 0, j = 0;
      int valor = 0;
      int item = 0;

      // loop enquando i menor que o tamanho da linha
      while (i < row) {

         // loop for para adicionar valores nas colunas
         for(j = 0; j < columns;) {
            
            // valor recebe valor aleatório
            valor = 1 + alea.nextInt(150);
            // informa que o item existe
            item = 1;

            // verificar se o valor é divisivel por 3 e 4
            if (valor % 3 == 0 && valor % 4 == 0) { // se verdade
               // matriz recebe o valor
               matriz[i][j] = valor;
               // o controlador item recebe zero
               item = 0;               
            } // end if

            // verifica se item é igual a zero
            // ou seja, quando enquantrar um  
            // valor divisível por 3 e 4 transforme
            // item igual a zero
            if (item == 0) { // se verdade
               // a variável j não é incrementado em 1
               j++;
            } // end if j

            // se não, repete o loop até encontrar o valor
            // conforme determinado
            // e item ficar igual a zero

         } // end for

         // verifica se o item é igual a zero 0
         if (item == 0) { // se verdade
            i++; // incrementa i em 1
         } // end if item 0

         // e adiciona uma nova linha até o limite.

      } // end for row

   } // end método adicionar A
   
   // método adiciona valores
   public static void addArrayB(int[][] matriz, int row, int columns) {

      // objeto
      SecureRandom alea = new SecureRandom();

      // variáveis
      int i = 0, j = 0;
      int valor = 0;
      int item = 0;

      // loop enquando i menor que o tamanho da linha
      while (i < row) {

         // loop for para adicionar valores nas colunas
         for(j = 0; j < columns;) {
            
            // valor recebe valor aleatório
            valor = 1 + alea.nextInt(150);
            // informa que o item existe
            item = 1;

            // verificar se o valor é divisivel por 3 e 4
            if (valor % 5 == 0 && valor % 6 == 0) { // se verdade
               // matriz recebe o valor
               matriz[i][j] = valor;
               // o controlador item recebe zero
               item = 0;               
            } // end if

            // verifica se item é igual a zero
            // ou seja, quando enquantrar um  
            // valor divisível por 3 e 4 transforme
            // item igual a zero
            if (item == 0) { // se verdade
               // a variável j não é incrementado em 1
               j++;
            } // end if j

            // se não, repete o loop até encontrar o valor
            // e item ficar igual a zero

         } // end for

         // verifica se o item é igual a zero 0
         if (item == 0) { // se verdade
            i++; // incrementa i em 1
         } // end if item 0

         // e adiciona uma nova linha até o limite.

      } // end for row

   } // end método adicionar B

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
