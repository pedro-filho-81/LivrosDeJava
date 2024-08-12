package javaParaIniciantes.capitulo05.exemplos;

public class MinMax02 {
   public static void main(String[] args) {
      // declara e cria uM vetor
      int nums[] = new int[10];
      // variáveis
      int min, max;

      // atribuindo valores ao vetor
      nums[0] = 99;
      nums[1] = -10;
      nums[2] = 100123;
      nums[3] = 18;
      nums[4] = -978;
      nums[5] = 5623;
      nums[6] = 463;
      nums[7] = -9;
      nums[8] = 287;
      nums[9] = 49;

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
