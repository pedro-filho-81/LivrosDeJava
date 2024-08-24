package Algoritimos.Capitulo07.arrays.exercicios;

import java.security.SecureRandom;

/**
 * d)Elaborar um programa que leia uma matriz A de 
 * uma dimensão com dez elementos inteiros. 
 * Construir uma matriz C de duas dimensões com três 
 * colunas, sendo a primeira coluna da matriz C 
 * formada pelos elementos da matriz A somados com 
 * 5, a segunda coluna formada pelo valor do cálculo 
 * da fatorial de cada elemento correspondente da 
 * matriz A e a terceira e última coluna pelos 
 * quadrados dos elementos correspondentes da matriz 
 * A. Apresentar a matriz C.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) 
 * (p. 402). Editora Saraiva. Edição do Kindle. 
 * Pedro, 23/08/2024.
 */
public class VetorFatorialMatrizC03 {
   public static void main(String[] args) {
   
      // constante
      final int LINHAS = 10;
      final int COLUNAS = 3;

      // vetor
      int[] vetorA = new int[LINHAS];
      // matriz
      int[][] matrizC = new int[LINHAS][COLUNAS];

      System.out.println("VetorA:");
      // adicionar
      adicionarVetor(vetorA); // adiciona valores ao vetorA 
      exibirVetor(vetorA); // exibe os valores do vetorA

      // variável fat
      int fat = 1; // para calcular o fatorial
      System.out.println("MatrizC:"); // cabeçlho
      System.out.println("Coluna 1 vetorA + 5.");
      System.out.println("Coluna 2 fatorial do vetorA.");
      System.out.println("Coluna 3 o quadrado do valor do vetorA.");
      // loop for para adicionar valores a MatrizC
      for(int i = 0; i < vetorA.length; i++) {
         // adiciona os valores do vetorA + 5, a coluna 0 da matriz
         matrizC[i][0] = vetorA[i] + 5;

         // loop para calcular o fatoria dos valores do vetorA
         for(int j = vetorA[i]; j > 1; j--) {
            // calcula o fatorial
            fat *= j;
         } // end for j
         // adiciona o valor do fatorial na coluna 2 da matriz
         matrizC[i][1] = fat;
         fat = 1; // inicializa a variavél fat

         // matrizC coluna 3 recebe o quadrado dos valores do vetorA
         matrizC[i][2] = vetorA[i] * vetorA[i];
      } // end for i
      
      // exibe os elementos da matrizC
      exibirMatriz(matrizC, LINHAS, COLUNAS);

   } // end main
   
   // adicionar valores
   public static void adicionarVetor(int[] vetor) {

      // objeto
      SecureRandom alea = new SecureRandom();

      // variáveis
      int i = 0, j = 0, item = 0;

      // loop do_while para adicionar valores
      do {
         
         // vetor recebe valores aleatório
         vetor[i] = 1 + alea.nextInt(12);
            // reinicializa o item 
            item = 0;

         for(j = 0; j < i; j++) {
            // se os vetores forem iguais
            if (vetor[j] == vetor[i]) {
               // item recebe 1 
               // informando que já existe o valor no vetor
               // e retorna para o vetor receber novo
               // valor sem incrementar 
               item = 1;            
            } // end if
         } // for j
            
         // se item igual a zero 0
         if (item == 0) {
            //  incrementa i em 1
            i++;
         } // end if item
         // e repete enquanto i menor que o tamanho do vetor
      } while (i < vetor.length);

   } // end adicionar

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
            System.out.printf("%11d", matriz[i][j]);
         } // end for j
         System.out.println();
      } // end for i
      
   } // end exibir

   // método exibir valores do vetor
   public static void exibirVetor(int[] vetor) {

      // loop for para exibir os valores do vetor
      // cabeçalho
      System.out.print("Vetor = { ");
      
      for(int i = 0; i < vetor.length; i++) {
         // exibe o vetor
         System.out.printf("%d ", vetor[i]);
      } // end for

      System.out.println("};");

   } // end exibir

} // end class
