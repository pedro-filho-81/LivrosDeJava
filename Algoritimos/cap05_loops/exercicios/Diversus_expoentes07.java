package cap05_loops.exercicios;
/**
 * g)Elaborar um programa que apresente os resultados 
 * das potências do valor de base 3, elevado a um 
 * expoente que varie do valor 0 até o valor 15. O 
 * programa deve apresentar os valores 1, 3, 9. 
 * 27, ..., 14.348.907. Sugestão: leve em consideração 
 * as definições matemáticas do cálculo de potência, em 
 * que qualquer valor numérico diferente de zero 
 * elevado a zero é 1, e todo valor numérico elevado a 
 * 1 é ele próprio. Não use o operador aritmético de 
 * exponenciação apresentado no Capítulo 3; resolva o 
 * problema com a técnica de laço.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) (p. 284). 
 * Editora Saraiva. Edição do Kindle. 
 * Pedro,15/09/2024
 */
public class Diversus_expoentes07 {
   public static void main(String[] args) {
      
      // cabeçalho
      System.out.printf("%n%35s%n%35s%n","Valores com a Base 3,", " e expoente entre 1 e 15:");

      // loop for para os expoentes
      for(int i = 1; i <= 15; i++) {
          // exibe os valores
            System.out.printf("%11.0f", Math.pow(3, i));
      } // end for

      // pula linha
      System.out.println("\n");

   } // end main
   
} // end class
