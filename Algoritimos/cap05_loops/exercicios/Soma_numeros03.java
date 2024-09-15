package cap05_loops.exercicios;
/**
 * c)Construir um programa que apresente a soma dos cem 
 * primeiros números naturais 
 * (1 + 2 + 3 +...+ 98 + 99 + 100).
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) (p. 284). 
 * Editora Saraiva. Edição do Kindle. 
 * Pedro, 15/09/2024
 */
public class Soma_numeros03 {
   public static void main(String[] args) {
      
      //variáveis
      int soma = 0;

      // loop for para somar 100 valores
      for(int i = 1; i <= 100; i++) {
         // soma 100 valores
         soma += i;
      } // end for

      // resultado
      System.out.println("Soma 100 valores");
      System.out.println("RESULTADO:\nSoma = " + soma);

   } // end main
} // end class
