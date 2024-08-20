import java.security.SecureRandom;

public class CelsiusFahrenheit16 {
   public static void main(String[] args) {
      
      // objeto SecureRandom
      SecureRandom alea = new SecureRandom();

      // constante
      final int   SIZE = 25;

      // vetores
      int[] celsius = new int[SIZE];
      int[] fahrenheit = new int[SIZE];

      System.out.println("Vetor Celsius: ");
      adicionar(celsius); // adiciona valores ao vetor celsius
      exibir(celsius); // exibe os valores do vetor

      System.out.println("Celsius Organizado:");
      organizar(celsius); // organiza os valores do vetor
      exibir(celsius); // exibe os valores do vetor

      // loop para adicionar valores ao vetor fahrenheit
      for(int i = 0; i < SIZE; i++) {
         // converte graus celsius em fahrenheit
         fahrenheit[i] = (int) (celsius[i] * 1.8) + 32;
      } // end for fahrenheit

      System.out.println("Vetor fahrenheit:");
      exibir(fahrenheit); // exibe os valores do vetor

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
            vetor[i] = -20 + alea.nextInt(100);
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
         // método organizar
   public static void organizar(int[] vetor) {
      int temp;
      for(int i = 1; i < vetor.length; i++) {
         for(int j = vetor.length - 1; j >= i; j--) {
            if (vetor[j - 1] > vetor[j]) {
               temp = vetor[j - 1];
               vetor[j - 1] = vetor[j];
               vetor[j] = temp;
            } // end if
         } // end for j
      } // end for i
   } // end organizar

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