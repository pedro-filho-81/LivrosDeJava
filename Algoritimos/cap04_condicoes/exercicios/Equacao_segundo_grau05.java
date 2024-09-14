package cap04_condicoes.exercicios;
/**
 * e)Efetuar a leitura de três valores numéricos 
 * (representados pelas variáveis A, B e C) e processar 
 * o cálculo da equação completa de segundo grau, 
 * utilizando a fórmula de Bhaskara (considerar para a 
 * solução do problema todas as possíveis condições 
 * para delta: delta < 0 – não há solução real, delta > 
 * 0 – há duas soluções reais e diferentes e delta = 0 
 * – há apenas uma solução real). Lembre-se de que é 
 * completa a equação de segundo grau que possui todos 
 * os coeficientes A, B e C diferentes de zero. O 
 * programa deve apresentar respostas para todas as 
 * condições estabelecidas para delta.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) 
 * (pp. 220-221). Editora Saraiva. Edição do Kindle. 
 * Pedro, 13/09/2024
 */
import java.util.Scanner;

public class Equacao_segundo_grau05 {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);

      // variáveis
      double a, b, c;
      double delta = 0.0;
      double raiz1, raiz2;
      String msg = "";

      // entrada de dados
      System.out.println("Entrada dos dados");
      System.out.print("Digite  o valor de A: ");
      a = input.nextDouble();
      System.out.print("Digite o valor de B: ");
      b = input.nextDouble();
      System.out.print("Digite o valor de C: ");
      c = input.nextDouble();
  
      // calcular a Discriminantes 
      /*
       * "Discriminante é a expressão presente dentro 
       * da raiz na fórmula de Bhaskara. É comumente 
       * representado pela letra grega Δ (Delta)"".
       * Veja mais sobre "Fórmula de Bhaskara" em: 
       * https://brasilescola.uol.com.br/matematica/
       * formula-bhaskara.htm
       */
      // CONDIÇÃO PARA CALCULA A EQUAÇÃO DO 2º GRAU
      // fórmula para calcular o delta: "b2 – 4ac"
      // se a, b e c diferente de zero
      if (a != 0 && b != 0 && c != 0) { // se verdade
         // calcular o delta
         delta = Math.pow(b, 2) - 4 * a * c;
      } // end if

      // condições
      // se o delta menor que zero
      if (delta < 0.0) {
         // exibir
         msg = "Nâo possui resultado reais.";

         // se o delta igual a zero
      } else if (delta == 0) {
         // exibir
         msg = "\"A equação possui apenas um resultado real.\"";

         // se delta maior que zero
      } else if (delta > 0) {
         // exiba
         msg = "\"Possui dois resultados distintos reais.\"";
      } // end if delta 

      // calcular as raizes
      raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
      raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
   
      // exibe resultado
      System.out.println("\nResultado");
      System.out.printf("Delta = %.0f%n", delta);
      System.out.printf("Delta: %s\n", msg);
      System.out.println("Raiz 1 = " + raiz1);
      System.out.println("Raiz 2 = " + raiz2);

      input.close(); // end input

   } // end main
} // end class
