package cap05_loops.exercicios;
/**
 * j)Elaborar um programa que apresente os valores de 
 * conversão de graus Celsius em graus Fahrenheit, de 
 * dez em dez graus, iniciando a contagem em dez graus 
 * Celsius e finalizando em cem graus Celsius. O 
 * programa deve apresentar os valores das duas 
 * temperaturas.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) (p. 285). 
 * Editora Saraiva. Edição do Kindle. 
 * Pedro, 16/09/2024
 */
public class Celsius_Fahrenheit10 {
   public static void main(String[] args) {
      
      // variável
      double fahrenheit = 0.0f;

      // cabeçalho
      System.out.println("Celsius para fahrenheit.");
      // loop para conversão c para f
      for(int celsius = 0; celsius <= 100; celsius += 10) {
         // calcular
         // fórmula f = (c * 9/5) + 32.
         fahrenheit = celsius / 1.8 + 32;

         // exibe resultado
         System.out.printf("%3dº%7s%9.1fº%n", celsius, "=>", fahrenheit);

      } // end for
   } // end main
} // end class
