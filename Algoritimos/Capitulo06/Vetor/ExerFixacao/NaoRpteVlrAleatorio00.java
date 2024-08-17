import java.security.SecureRandom;
/*
 * cria um vetor que recebe valores aleatórios 
 * que não se repetem
 */
public class NaoRpteVlrAleatorio00 {
   public static void main(String[] args) {
   
      // objeto SecureRandom
      SecureRandom alea = new SecureRandom();

      final int SIZE = 25;

      // variável
      int i = 0;
      int j = 0;

      // vetor
      int[] vetor = new int[SIZE];

      adicionar(vetor);
      exibir(vetor);

   } // end main

   // método adicionar valores
   public static void adicionar(int[] vetor) {

      // objeto secure random
      SecureRandom alea = new SecureRandom();

      // variáveis
      int i = 0;
      int j = 0;
      int igual = 0;

      // loop do while para adicionar valores ao vetor
      do { // faça

         // vetor recebe valor aleatório
         vetor[i] = alea.nextInt(50);
         // variável igual e inicializada
         igual = 0;

         // loop for para verificar se vetor tem valores iguais
         for(j = 0; j < i; j++) {
            // se o valor do vetor j igual ao vetor i
            if (vetor[j] == vetor[i]) {
               // informe 1 para igual
               igual = 1;
            } // end if
         } // end for j

         // se igual permanecer zero
         // ou seja, se não tiver o valor
         if (igual == 0)
            // incremente i em 1, ou seja, some 1 a i
            i++; // incrementa i

      // faça enquando i menor que o tamanho do vetor 
      } while(i < vetor.length); // end do while

   } // end adicionar

   // método exibir valores do vetor
   public static void exibir(int[] vetor) {

      // loop for para exibir os valores do vetor
      // cabeçalho
      System.out.print("Vetor = { ");
      
      for(int i = 1; i < vetor.length; i++) {
         // exibe o vetor
         System.out.printf("%d ", vetor[i]);
      } // end for

      System.out.println("};");

   } // end exibir

} // end class