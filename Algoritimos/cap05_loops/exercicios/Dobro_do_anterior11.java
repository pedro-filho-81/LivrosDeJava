package cap05_loops.exercicios;
/**
 * 
 * Pedro, 16/09/2024
 */
public class Dobro_do_anterior11 {
   public static void main(String[] args) {
      
      // variáveis
      long dobro = 0;
      long soma = 0;

      // loop para calcular quantidade dos grãos
      for(int i = 1; i <= 63; i++) {
         // se i menor ou igual a dois
         if (i <= 2) {
            // soma os valores de i até 2
            soma += i;
            // exibe o resultado
            System.out.printf("%3s%3d%12s%21d%18s%21d%n", "Na casa ", i, " coloca-se ", i, " grão(s) total: ", soma);
            // dobro recebe o valor de i que é 2
            dobro = i;
         } else {  // se não
            // dobra dpor dois
            dobro *= 2;
            // soma do dobro 
            soma += dobro;  
            // exibe o resultado
            // exibe o resultado
            System.out.printf("%3s%3d%12s%21d%18s%21d%n", "Na casa ", i, " coloca-se ", dobro, " grão(s) total: ", soma); 

         } // end else if
         
      } // end for
      
   } // end main
} // end class
