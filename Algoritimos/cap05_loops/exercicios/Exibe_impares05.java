package cap05_loops.exercicios;

public class Exibe_impares05 {
   public static void main(String[] args) {
      
      System.out.printf("%n%20s%n","Valores ímpares:");
      // loop for para somar 100 valores
      for(int i = 0; i <= 20; i++) {
         // se valor for par
         if (i % 2 != 0) {   
            // soma valores de i
            System.out.printf("%5d", i);
         } // end if
      } // end for
      System.out.println("\n");

   } // end main
} // end class
