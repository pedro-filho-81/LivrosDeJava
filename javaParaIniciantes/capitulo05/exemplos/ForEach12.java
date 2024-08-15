package javaParaIniciantes.capitulo05.exemplos;

/**
 * ForEach12
 */
public class ForEach12 {

   public static void main(String[] args) {
      // vetor
      int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      // variável
      int sum = 0;

      // Usa o laço forEach para exibir a soma dos valores do vetor
      for (int x : nums) {
         // exibe o valor do elemento do vetor
         System.out.println("Value is: " + x);
         // soma os valores
         sum += x;
      } // end forEach

      // exibe o valor da soma
      System.out.println("Summation: " + sum);
   } // end main
} // end class