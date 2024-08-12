package javaParaIniciantes.capitulo05.exemplos;

// inicializando array
public class MinMax02_2 {
   public static void main(String[] args) {
      
      // inicializando array
      // atribuindo valores ao vetor
      int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

      // variáveis
      int min, max;
      // min e max recebem valor do vetor
      min = max = nums[0];

      // loop for para encontrar min e max no vetor
      for(int i = 0; i < 10; i = i + 1) {
         if (nums[i] < min) { min = nums[i];}
         if (nums[i] > max) { max = nums[i];}
      } // end for

      // exibe resultado
      System.out.println("min and max: " + min + " " + max);
   } // end main
} // end class
