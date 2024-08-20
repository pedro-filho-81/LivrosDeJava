import java.security.SecureRandom;
/*
 * p)Elaborar um programa que leia 12 elementos 
 * inteiros para uma matriz A de uma dimensão do tipo 
 * vetor. Construir uma matriz B de mesmos tipo e 
 * dimensão, observando a seguinte lei de formação: 
 * “todo elemento da matriz A que for ímpar deve ser 
 * multiplicado por 2; caso contrário, o elemento da 
 * matriz A deve permanecer constante”. Apresentar os 
 * elementos da matriz B.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) 
 * (pp.313-314). Editora Saraiva. Edição do Kindle. 
 */
public class ImparMultiplicarPorDois17 {
   public static void main(String[] args) {
      // MMM
      // objeto secure random
      SecureRandom alea = new SecureRandom();

      // constante
      final int SIZE = 12;
      // vetor
      int[] vetorA = new int[SIZE];
      int[] vetorB = new int[SIZE];

      System.out.println("VetorA: ");
      // chama os métodos
      adicionar(vetorA);
      exibir(vetorA);

      System.out.println("VetorB: ");
      // loop for para adicionar valores ao vetorB
      for(int i = 0; i < vetorA.length; i++) {
         
         // se i for ímpar
         if(vetorA[i] % 2 == 0) {
            vetorB[i] = vetorA[i];
         } else {
            vetorB[i] = vetorA[i] * 2;
         }
      } // end for i

      exibir(vetorB);

   } // end main

   // adicionar valores
   public static void adicionar(int[] vetor) {

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