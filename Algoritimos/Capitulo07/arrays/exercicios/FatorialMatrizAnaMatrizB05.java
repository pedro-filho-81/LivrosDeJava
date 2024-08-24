package Algoritimos.Capitulo07.arrays.exercicios;
/*
 * f)Elaborar um programa que leia uma matriz A de 
 * duas dimensões com cinco linhas e quatro colunas. 
 * Construir uma matriz B de mesma dimensão, em que 
 * cada elemento seja o fatorial de cada elemento 
 * correspondente armazenado na matriz A. Apresentar 
 * ao final as matrizes A e B.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) 
 * (p. 403). Editora Saraiva. Edição do Kindle. 
 * Pedro, 24/08/2024
 */
import java.security.SecureRandom;

public class FatorialMatrizAnaMatrizB05 {   
   public static void main(String[] args) {
      // MMM      
      // constante
      final int LINHAS = 5;
      final int COLUNAS = 4;

      // matrizes
      int[][] matrizA = new int[LINHAS][COLUNAS];
      int[][] matrizB = new int[LINHAS][COLUNAS];

      // ADICIONAR e EXIBIR
      System.out.println("matrizA original:");
      adicionarMatriz(matrizA, LINHAS, COLUNAS);
      exibirMatriz(matrizA, LINHAS, COLUNAS);

      int fat = 1; // variável para calcular o fatorial
      // CRIAR FATORIAL
      // loop for linha
      for(int i = 0; i < LINHAS; i++) {
         // loop for colunas
         for(int j = 0; j < COLUNAS; j++) {
            
            // loop for para calcular o fatorial da matrizA
            for(int k = matrizA[i][j]; k > 1; k--) {
               fat *= k;
            } // end for k
      
            // matrizB recebe o fatorial dos valores da matrizA
            matrizB[i][j] = fat;
            fat = 1; // reinicializa fat
      
         } // end for j
      } // end for i

      // exibe a MatrizB
      System.out.println("matrizB fatorial da matrizA:");
      exibirMatriz(matrizB, LINHAS, COLUNAS);

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
            matriz[i][j] = 1 + alea.nextInt(10);
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
