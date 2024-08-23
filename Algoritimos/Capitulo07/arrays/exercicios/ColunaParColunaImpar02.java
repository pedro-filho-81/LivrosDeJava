package Algoritimos.Capitulo07.arrays.exercicios;
/*
 * b)Elaborar um programa que leia duas matrizes A e 
 * B, cada uma com uma dimensão para sete elementos 
 * inteiros. Construir uma matriz C de duas 
 * dimensões, cuja primeira coluna deve ser formada 
 * pelos elementos da matriz A e a segunda coluna 
 * pelos elementos da matriz B. Apresentar a matriz.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) (p. 
 * 402). Editora Saraiva. Edição do Kindle. 
 */
import java.security.SecureRandom;

public class ColunaParColunaImpar02 {
   public static void main(String[] args) {
  
      // constante
      final int LINHAS = 7;
      final int COLUNAS = 2;

      // VETORES
      int[] vetorA = new int[LINHAS];
      int[] vetorB = new int[LINHAS];

      // Matriz
      int[][] matrizC = new int[LINHAS][COLUNAS];

      System.out.println("VetorA:");
      // chama adicionar
      adicionarVetor(vetorA); // adiciona valores ao vetorA
      exibirVetor(vetorA);

      System.out.println("VetorB:");
      adicionarVetor(vetorB); // adiciona valores ao vetorB
      exibirVetor(vetorB);

      // ADICONARA VETORES NA MATRIZ-C
      for(int i = 0; i < LINHAS; i++) {
            // MM
            // MatrizC coluna 0 recebe valores do vetorA
            matrizC[i][0] = vetorA[i];
            // MatrizC coluna 1 recebe os valores do vetor b
            matrizC[i][1] = vetorB[i];
      } // end for i

      // exive os valores da MatrizC
      System.out.println("MatrizC:");
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
         vetor[i] = 1 + alea.nextInt(50);
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
            System.out.printf("%5d", matriz[i][j]);
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
