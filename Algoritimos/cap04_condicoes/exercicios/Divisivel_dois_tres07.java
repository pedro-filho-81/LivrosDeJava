package cap04_condicoes.exercicios;
/**
 * g)Fazer a leitura de quatro valores numéricos 
 * inteiros representados pelas variáveis A, B, C e D. 
 * Apresentar apenas os valores que sejam divisíveis 
 * por 2 e 3.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) (p. 221). 
 * Editora Saraiva. Edição do Kindle.  
 * Pedro, 14/09/2024
 */
import java.util.Scanner;

public class Divisivel_dois_tres07 {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);

      // variáveis
      int a, b, c;
      String msg = "";

      // entrada de dados
      System.out.println("Entrada dos dados");
      System.out.print("Digite  o valor de A: ");
      a = input.nextInt();
      System.out.print("Digite o valor de B: ");
      b = input.nextInt();
      System.out.print("Digite o valor de C: ");
      c = input.nextInt();
  
      // condições para o maior valor
      // verifica se a divisivel por 2 e 3
      if (a % 2 == 0 && a % 3 == 0) { // se verdade
         // a é divisivel
         msg = a + " é divisivel por 2 e 3.";
         // se não, b é divisível
      } else if (b % 2 == 0 && b % 3 == 0) {
         // exibe b é divisível
         msg = b + " é divisivel por 2 e 3.";
      } else if (c % 2 == 0 && c % 3 == 0) {
         msg = c + " é divisível por 2 e 3.";
      } else {
         msg = a + ", " + b + ", " + c + ", \n" +
               "Não são divisíveis por 2 e 3.";
      }

      // exibe resultado
      System.out.println("\nRESULTADO: ");
      System.out.printf("%s%n", msg);

      input.close(); // end input

   } // end main   
}
