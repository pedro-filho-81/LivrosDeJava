package cap05_loops.exercicios;

public class Diversus_expoentes07 {
   public static void main(String[] args) {
      
      // cabeçalho
      System.out.printf("%n%35s%n%35s%n","Valores com a Base 3,", "expoente entre 1 e 15:");

      // loop for para somar 100 valores
      for(int i = 1; i <= 15; i++) {
          // exibe os valores
            System.out.printf("%11.0f", Math.pow(3, i));
      } // end for

      // pula linha
      System.out.println("\n");

   } // end main
} // end class
