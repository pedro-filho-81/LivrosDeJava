package Algoritimos.Capitulo07.arrays.exercicios;

import java.security.SecureRandom;

/*
 * e)Elaborar um programa que leia duas matrizes A e 
 * B, cada uma com uma dimensão para 12 elementos 
 * reais. Construir uma matriz C de duas dimensões, 
 * sendo a primeira coluna da matriz C formada pelos 
 * elementos da matriz A multiplicados por 2 e a 
 * segunda coluna formada pelos elementos da matriz 
 * B subtraídos de 5. Apresentar separadamente as matrizes.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) 
 * (pp. 402-403). Editora Saraiva. Edição do Kindle. 
 * Pedro, 24/08/2024
 */
public class DoisVetoresUmaMatriz04 {
   public static void main(String[] args) {
      // MMM
      
      // constante
      final int LINHAS = 12;
      final int COLUNAS = 2;

      // vetor
      int[] vetorA = new int[LINHAS];
      int[] vetorB = new int[LINHAS];
      // matriz
      int[][] matrizC = new int[LINHAS][COLUNAS];

      System.out.println("VetorA:");
      // adicionar
      adicionarVetor(vetorA); // adiciona valores ao vetorA 
      exibirVetor(vetorA); // exibe os valores do vetorA

      System.out.println("VetorB:");
      adicionarVetor(vetorB);
      exibirVetor(vetorB);

      // variável fat
      int fat = 1; // para calcular o fatorial
      System.out.println("MatrizC:"); // cabeçlho
      System.out.println("Coluna 1, os valores do vetorA.");
      System.out.println("Coluna 2, os valores vetorB.");
      // loop for para adicionar valores a MatrizC
      for(int i = 0; i < vetorA.length; i++) {
         // adiciona os valores do vetorA, na coluna 0 da matriz
         matrizC[i][0] = vetorA[i];

         // matrizC coluna 2 recebe os valores do vetorB
         matrizC[i][1] = vetorB[i] * vetorA[i];
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
