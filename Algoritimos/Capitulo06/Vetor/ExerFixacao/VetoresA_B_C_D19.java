/**
 * r)Elaborar um programa que leia seis elementos 
 * (valores inteiros) para as matrizes A e B de uma 
 * dimensão do tipo vetor. Construir as matrizes C e 
 * D de mesmo tipo e dimensão. A matriz C deve ser 
 * formada pelos elementos de índice ímpar das 
 * matrizes A e B e a matriz D deve ser formada 
 * pelos elementos de índice par das matrizes A e B. 
 * Apresentar os elementos das matrizes C e D.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) 
 * (p. 314). Editora Saraiva. Edição do Kindle. 
 * Pedro, 24/08/2024
 */
import java.security.SecureRandom;

public class VetoresA_B_C_D19 {
   public static void main(String[] args) {
      
      // constante TAmANHO DO VETOR
      final int SIZE = 6;

      // VETORES
      int[] vetorA = new int[SIZE];
      int[] vetorB = new int[SIZE];
      int[] vetorC = new int[SIZE];
      int[] vetorD = new int[SIZE];

      System.out.println("VetorA:");
      // adiciona valor no vetorA
      adicionarValores(vetorA);
      exibirVetor(vetorA);

      System.out.println("VetorB:");
      adicionarValores(vetorB);
      exibirVetor(vetorB);

      // loop para adicionar valores ao vetorC
      for(int i = 0; i < SIZE; i++) {
         // vetorC recebe os valores dos indices ímpares dos vetores A e B
         // se i igual a zero ou i maior que zero
         // e i for par
         if (i == 0 || i > 0 && i % 2 == 0) {
            // vetorC recebe os valores dos indices ímpares do vetorA
            vetorC[i] = vetorA[i + 1];
            vetorD[i] = vetorA[i];
         } else { // se falso
            // vetorC recebe os valores dos indices ímpares do vetorB
            vetorC[i] = vetorB[i];
            vetorD[i] = vetorB[i - 1];
         } // end else

      } // end for

      System.out.println("VetorC recebe os valores dos índices ímpares dos vetores A e B: ");
      exibirVetor(vetorC);

      System.out.println("VetorD recebe os valores dos índice pares dos vetores A e B:");
      exibirVetor(vetorD);

   } // end main

   // adicionarValores
   public static void adicionarValores(int[] vetor) {

      // objeto
      SecureRandom alea = new SecureRandom();

      // variáveis
      int i = 0; // contador de do_while
      int j = 0; // contador de for
      int item = 0; // indica a existência ou não de valor no vetor
      
      do { // faça verificação no vetor

         // adiciona valor aleatório no vetor
         vetor[i] = 1 + alea.nextInt(50);
         item = 0; // reinicializa item

         // loop for para verificar se no vetor tem um valor igual ao informado por alea
         for(j = 0; j < i; j++) {
            // se o valor do vetorJ for igual ao do vetorI
            if (vetor[j] == vetor[i]) {
               // informar que o ite existe
               item = 1; // item recebe 1 => existe              
            } // end if
         } // end for

         // verifica se não existe valor no vetor
         if (item == 0) {
            // incrementa i em 1
            i++;
         } // end if item zero
         // faça enquanto i menor que o tamanho do vetor
      } while (i < vetor.length);
   } // end adicionar valores

    // étodo exibir
    public static void exibirVetor(int[] vetor) {
      System.out.print("{");
      // loop para exibir vetor
      for (int i = 0; i < vetor.length; i++) {
          // exibir valores
          System.out.printf("%5d", vetor[i]);
      } // fi for
        // pula linha
      System.out.println("  };");
  } // end exibir

} // end class
