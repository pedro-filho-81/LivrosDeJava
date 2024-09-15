package cap05_loops.exercicios;

public class Divisiveis_por_quatro06 {
   public static void main(String[] args) {
      
      // cabeçalho
      System.out.printf("%n%35s%n","Divisiveis por quatro:");

      // loop for para somar 100 valores
      for(int i = 1; i <= 200; i++) {
      
         // se valor for par
         if (i % 4 == 0) {   
            // exibe os valores
            System.out.printf("%7d", i);
         } // end if
      } // end for
      System.out.println("\n");

   } // end main
} // end class
