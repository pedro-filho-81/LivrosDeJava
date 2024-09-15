package cap05_loops.exercicios;
/**
 * 
 * Pedro, 15/09/2024
 */
public class Soma_pares04 {
   public static void main(String[] args) {
      
      //variáveis
      int soma = 0;

      // loop for para somar 100 valores
      for(int i = 1; i <= 500; i++) {
         // se valor for par
         if (i % 2 == 0) {   
            // soma valores de i
            soma += i;
         } // end if
      } // end for

      // resultado
      System.out.println("Soma 500 valores pares.");
      System.out.println("RESULTADO:\nSoma = " + soma);

   } // end main
} // end class
