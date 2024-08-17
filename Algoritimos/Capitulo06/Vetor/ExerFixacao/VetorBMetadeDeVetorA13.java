import java.security.SecureRandom;
/*
 * l)Elaborar um programa que leia uma matriz A do 
 * tipo vetor com dez elementos inteiros. Construir 
 * uma matriz B de mesmo tipo, em que cada elemento 
 * deve ser a metade exata de cada um dos elementos 
 * existentes da matriz A. Apresentar os elementos 
 * das matrizes A e B.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) (p. 
 * 313). Editora Saraiva. Edição do Kindle. 
 * 17/08/2024
 */
public class VetorBMetadeDeVetorA13 {
   public static void main(String[] args) {
      // MMM
      // constante
      final int SIZE = 10;

      // vetores
      int[] vetorA = new int[SIZE];
      int[] vetorB = new int[SIZE];

      // cabeçalho
      System.out.println("VetorA: ");
      adicionar(vetorA); // adiciona valores
      exibir(vetorA); // exibe o vetor

      // adiciona valores no vetorB
      for(int i = 0; i < vetorA.length; i++) {
         // vetorB recebe a metade do valor do vetorA
         vetorB[i] = (int) vetorA[i] / 2;
      } // end for
      
      // exibe vetorB
      System.out.println("\nVetorB é a metade do vetorA:"); // cabeçalho
      exibir(vetorB); // exibe o vetor

   } // end main

   // método adicionar
   public static void adicionar(int[] vetor) {
      
      // create object SecureRandom
      SecureRandom alea = new SecureRandom();

      // loop for para adicionar valores ao vetor
      for(int i = 0; i < vetor.length; i++) {
         // adiciona os valores aleatórios
         // entre 1 e 50 inclusive ao vetor
         vetor[i] = 1 + alea.nextInt(50);
      } // end for

   } // end add valeo

   // método exibir
   public static void exibir(int[] vetor) {

      // loop for para exibir e somar os valores do vetor
      // cabeçalho
      System.out.print("Vetor = { ");
      for(int i = 0; i < vetor.length; i++) {
         // exibe o vetor
         System.out.printf("%d ",vetor[i]);
      } // end for
      System.out.println("};");

   } // end exibir

} // end class
