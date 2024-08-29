package Algoritimos.Capitulo07.arrays.exercicios;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * i)Elaborar um programa que leia 15 elementos 
 * inteiros em uma matriz A. Construir uma matriz B 
 * de mesmos tipo e tamanho, em que cada elemento da 
 * matriz B seja a metade absoluta de cada elemento 
 * da matriz A. Apresentar os elementos da matriz A 
 * em ordem decrescente e os de B em ordem crescente.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) 
 * (pp. 375-376). Editora Saraiva. Edição do Kindle. 
 * Pedro, 29/08/2024
 */
public class VetorBVlrAbsolutoDeA08 {
      
   public static void main(String[] args) {
      
      // constente índice do vetor
      final int SIZE = 15; // tamanho do vetor
      // vetor
      int[] vetorA = new int[SIZE];
      int[] vetorB = new int[SIZE];
      
      // adiciona valores ao vetor
      System.out.println("Vetor original:");
      // adiciona valores ao vetor
      adicionar(vetorA);
      ordenarDecrescente(vetorA);
      // exibe o vetor como foi inicializado
      exibir(vetorA);

      System.out.println("VetorB metade absoluta dos valores do vetorA:");
      // adicionar valores no vetorB
      // loop for para adicionar valores ao vetorB
      for(int i = 0; i < vetorA.length; i++) {
         // vetorB recebe os valores do vetorA convertido
         // para valores positivos
         vetorB[i] = Math.abs(vetorA[i] / 2); 
      } // end for vetorB
      ordenar(vetorB);
      exibir(vetorB);

   } // end Main

   // Método adicionar, não repete valores
   public static void adicionar(int[] vetor) {

      // objeto
      SecureRandom alea = new SecureRandom();

      // variáveis
      int item = 0;
      int i = 0;
      int j = 0;

      do {
         // variável recebe alea
         int valorAlea = 1 + alea.nextInt(50);
         item = 1; // indica que o valor aleatório existe

         // vetor recebe o valoe aleatório
         vetor[i] = valorAlea;
         item = 0; // indica que o valor aleatória não existe

         // loop for para pesquisar valores iguais 
         for(j = 0; j < i; j++) {
            // verifica se os valores dos vetores são iguais
            if (vetor[j] == vetor[i]) {
               // item recebe 1 e o loop do while se repete sem a incrementação
               item = 1;
            } // end if
         } // end for

         // verifica se o item existe ou não exixte no vetor,
         // ou seja se item = 1, exixte o valor
         // se o item = 0, não existe o valor
         if (item == 0) {
            // incrementa o contador i em 1
            i++;
         } // end if

         // loop executa enquanto i for menor que o tamanho do vetor
      } while (i < vetor.length);
   } // end adicionar

   // método ordenar
   public static void ordenarDecrescente(int[] vetor) {

      // loop for para ordenar o vetor
      for(int i = 0; i < vetor.length; i++) {
         for(int j = 0; j < vetor.length; j++) {
            if (vetor[j] < vetor[i]) {
               int temp = vetor[j];
               vetor[j] = vetor[i];
               vetor[i] = temp;
            } // end if
         } // end for j
      } // end for i
   } // end ordenar

   // método ordenar
   public static void ordenar(int[] vetor) {

      // loop for para ordenar o vetor
      for(int i = 0; i < vetor.length; i++) {
         for(int j = 0; j < vetor.length; j++) {
            if (vetor[j] > vetor[i]) {
               int temp = vetor[j];
               vetor[j] = vetor[i];
               vetor[i] = temp;
            } // end if
         } // end for j
      } // end for i
   } // end ordenar

    // método pesquisa binária
    public static int pesquisaBinaria(int[] vetor, int pesquisa) {

      // variáveis
      int inicio = 0;
      int meio = 0;
      int fim = vetor.length;
      boolean achou = false;

      // Enquanto inicio menor ou igual ao fim e
      // achou igual a falso faça
      while(inicio <= fim && achou == false ) {

         // calcular inicio mais fim dividido por 2
         // para achar o valor do meio
          meio = (inicio + fim) / 2;

          // verifica se o valor no vetor é igual 
          // ao valor da pesquisa
          if( vetor[meio] == pesquisa ) { // se verdade
            // achou se torna verdadeiro
            achou = true;
          } // fim if
          // se não, verifica se o valor da pesquisa é  menor que o valor do vetor na posição do valor meio
          else if(pesquisa < vetor[meio]) { // se verdade;
            // fim recebe o valor meio menos 1
              fim = meio - 1;
          } // fim else if
          else { // se não for verdade
            // inicio recebe meio mais 1
              inicio = meio + 1;
          } // fim else
      } // fim while

      // se achou for verdade
      if (achou == true) {
         // retorna 1 confirmando a existência
         return 1;
      } else { // se não
         // retorna zero confirmando a não existência
         return 0;
      } // end if else

  } // fim pesquisa binária

   // método exibir
   public static void exibir(int[] vetor) {
      System.out.print("{");
      // loop for
      for(int i = 0; i < vetor.length; i++) {
         System.out.printf("%5d", vetor[i]);
      } // end for
      System.out.println(" };");
   } // end exibir
   
} // end class
