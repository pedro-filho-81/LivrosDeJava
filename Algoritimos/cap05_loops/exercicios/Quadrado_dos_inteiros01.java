package cap05_loops.exercicios;

/**
 * a)Elaborar um programa que apresente como resultado 
 * os quadrados armazenados na memória dos números 
 * inteiros existentes na faixa de valores de 15 a 200.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) 
 * (pp. 283-284). Editora Saraiva. Edição do Kindle. 
 * Pedro, 15/09/2024
 */

public class Quadrado_dos_inteiros01 {
   public static void main(String[] args) {
      
      for(int i = 15; i <= 200; i++) {
         System.out.println("O quadrado de " + i + " é " + i * i);
      } // end for i

   } // end main
} // end class
