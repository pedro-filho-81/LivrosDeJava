package javaParaIniciantes.capitulo05.exemplos;

// Demonstra a classificação por bolha

public class Bubble04 {
   public static void main(String[] args) {
      
      // inicializando array
      // atribuindo valores ao vetor
      int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

      int a, b, t;
      int size = 10;
      
      // loop para exibir os valores do vetor
      System.out.println("Vetor Original:");
      System.out.print("vetor = { ");
      for(int i = 0; i < size; i = i + 1)
         // exibi os valores
         System.out.print(" " + nums[i]);
      System.err.println(" };");

      System.out.print("""
            \nA classificação por bolha é boa para arrays pequenos, 
            mas não é eficiente quando usada em arrays maiores.
            """);
      // Classificação por bolha
      for(a = 1; a < size; a++) {
         for(b = size - 1; b >= a; b--) {
            // se o valor anterior for o maior
           if (nums[b-1] > nums[b]) { // se fora de ordem
               t = nums[b - 1]; // temporário recebe o valor maior
               nums[b - 1] = nums[b]; // local do maior recebe valor menor
               nums[b] = t; // local do menor recebe o temporário
            } // end if
         } // end for b
      } // end for a

      // loop para exibir os valores do vetor
      System.out.println("Vetor Organizado:");
      System.out.print("vetor = { ");
      for(int i = 0; i < size; i = i + 1)
         // exibi os valores
         System.out.print(" " + nums[i]);
      System.err.println(" };\n");

   } // end main 
} // end class
