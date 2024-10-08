import java.security.SecureRandom;

/**
 * s)Elaborar um programa que leia duas matrizes A e 
 * B de uma dimensão com seis elementos. A matriz A 
 * deve aceitar apenas a entrada de valores pares, 
 * enquanto a matriz B deve aceitar apenas a entrada 
 * de valores ímpares. A entrada das matrizes deve 
 * ser validada pelo programa, e não pelo usuário. 
 * Construir uma matriz C que seja o resultado da 
 * junção das matrizes A e B, de modo que a matriz C 
 * contenha 12 elementos. Apresentar os elementos da 
 * matriz C.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) 
 * (p. 314). Editora Saraiva. Edição do Kindle. 
 * Pedro, 25/09/2024
 */
public class VetorCRecebeVtrAeVtrB20 {
   public static void main(String[] args) {
      
      // constante índice
      final int SIZE = 6;

      // vetores
      int[] vetorA = new int[SIZE]; // vetor par
      int[] vetorB = new int[SIZE]; // vetor ímpar
      int[] vetorC = new int[SIZE * 2]; // junção de vtrA e vtrB

      // resultado
      System.out.println("VetorA:");
      adicionaPar(vetorA);
      exibirVetor(vetorA);

      System.out.println("VetorB:");
      adicionaImpares(vetorB);
      exibirVetor(vetorB);

      // loop para adicionar valores ao vetor C
      for(int i = 0; i < (SIZE * 2); i++) {
         // se i menor que o tamanho do vetor
         if(i < SIZE)
            // o vetor C recebe os valores do vetor A
            vetorC[i] = vetorA[i];
         else // se não
         // o vetor C recebe os valores do vetorB
          vetorC[i] = vetorB[i - 6];
      } // end for

      // exibe 
      System.out.println("VetorC formado pelos vetores A e B:");
      exibirVetor(vetorC);

   } // end main

   // método adicionar valores pares
   public static void adicionaPar(int[] vetor) {

      // objeto
      SecureRandom alea = new SecureRandom();

      // variáveis
      int i = 0, j = 0;
      int item = 0;

      do {
         // adiciona valor aleatório
         int valorAlea = 1 + alea.nextInt(50);
         // indica que o vetor tem um valor igual
         item = 1; // e o incremento não será executado

         // se o valor for par
         if (valorAlea % 2 == 0) {
            // vetor recebe o valor
            vetor[i] = valorAlea;
            // e informa que o contador pode ser incrementado
            item = 0; //  reinicializa
         } // end if par
         
         // loop pelo vetor para verificar se 
         // o vetor tem um valor igual
         for(j = 0; j < i; j++) {
            // se os vetores tiverem valores iguais
            if (vetor[j] == vetor[i]) {
               // informa que exixte no vetor um valor igual
               item = 1;
            } // end if
         } // end for

         // se o valor adicionado ao vetor não for igual
         if (item == 0) {
            // incrementa i em 1
            i++;

         } // end if item

         // faça enquanto o índice for menor que o vetor
      } while (i < vetor.length);
   } // end adicionar
   
   // método adicionar valores ímpares
   public static void adicionaImpares(int[] vetor) {

      // objeto
      SecureRandom alea = new SecureRandom();

      // variáveis
      int i = 0, j = 0;
      int item = 0;

      do {
         // adiciona valor
         int valorAlea = 1 + alea.nextInt(50);
         item = 1;

         if (valorAlea % 2 != 0) {
            vetor[i] = valorAlea;
            item = 0; //  reinicializa
         } // end if par
         
         for(j = 0; j < i; j++) {
            if (vetor[j] == vetor[i]) {
               item = 1;
            } // end if
         } // end for

         if (item == 0) {
            i++;
         } // end if item

      } while (i < vetor.length);
   } // end adicionar
   
    // método exibir
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
