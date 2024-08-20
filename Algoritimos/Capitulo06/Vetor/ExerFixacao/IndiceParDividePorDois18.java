import java.security.SecureRandom;
/*
 * q)Elaborar um programa que leia 15 elementos reais 
 * para uma matriz A de uma dimensão do tipo vetor. 
 * Construir uma matriz B de mesmos tipo e dimensão, 
 * observando a seguinte lei de formação: “todo 
 * elemento da matriz A que possuir índice par deve 
 * ter seu elemento dividido por 2; caso contrário, o 
 * elemento da matriz A deve ser multiplicado por 1.
 * 5”. Apresentar os elementos da matriz B.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) 
 * (p. 314). Editora Saraiva. Edição do Kindle. 
 */
public class IndiceParDividePorDois18 {
   public static void main(String[] args) {
   
      // objeto
      SecureRandom alea = new SecureRandom();

      final int SIZE = 15;

      // vetores
      int[] vetorA = new int[SIZE];
      int[] vetorB = new int[SIZE];

      System.out.println("\nVetorA: ");
      adicionar(vetorA);
      exibir(vetorA);

      System.out.println("\nTodo índice par divida por 2.");
      System.out.println("VetorB:");
      // adiciona valor ao vetorB
      for(int i = 0; i < vetorA.length; i++) {
         if (i % 2 == 0) {
            vetorB[i] = vetorA[i] / 2;
         } else {
            vetorB[i] = vetorA[i]; 
         } // end else

      } // end for i

      exibir(vetorB);

   } // end main

   // método adicionar
   public static void adicionar(int[] vetor) {

      // objeto
      SecureRandom alea = new SecureRandom();

      // variáveis
      int i = 0;
      int j = 0;
      int item = 0;

      // loop do_while para adicionar os valores
      do {
         
         // vetor recebe alea
         vetor[i] = 1 + alea.nextInt(50);
         // reinicializa item
         item = 0;

         for(j = 0; j < i; j++) {
            // se vetores forem iguais
            if (vetor[j] == vetor[i]) {
               // item existe
               item = 1;
            } // end if vetor
         } // end for j

         // se item igual a zero 0
         if (item == 0) {
            // incrementa i
            i++;
         } // end if item igual a zero

         // enquanto i menor que tamanho do vetor
      } while (i < vetor.length);

   } // end adicionar
      
   // método exibir valores do vetor
   public static void exibir(int[] vetor) {

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
