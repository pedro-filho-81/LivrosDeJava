package javaParaIniciantes.capitulo05.exemplos;

public class ForEach12_2 {
   public static void main(String[] args) {
   
      // matriz
      int[][] nums = new int[3][5];
      // variável
      int sum = 0;

      // atribui valores a matriz
      for(int i = 0; i < 3; i++) { // linha
         for(int j = 0; j < 5; j++) { // coluna
            // matriz recebe valores
            nums[i][j] = (i + 1) * (j + 1);
         } // end for coluna
      } // end for linha

      // Usa o laço forEach para exibir a soma dos valores da matriz
      for(int x[] : nums) { // vincula x[] a matriz nums
         for (int y : x) { // vincula y ao vetor x
            // exibe valores do vetor
            System.out.println("Value is: " + y);
            sum += y; // soma os valores do vetor
         } // end forEach y
      } // end forEach x
      
      // exibe o valor da soma
      System.out.println("Summation: " + sum);
   } // end main
} // end class