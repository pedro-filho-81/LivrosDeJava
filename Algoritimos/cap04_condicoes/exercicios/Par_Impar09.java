package cap04_condicoes.exercicios;
/**
 * j)Ler um valor numérico inteiro e apresentar uma 
 * mensagem informando se o valor fornecido é par ou 
 * ímpar.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) (p. 221). 
 * Editora Saraiva. Edição do Kindle. 
 * Pedro, 14/09/2024
 */
import java.util.Scanner;

public class Par_Impar09 {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);

      // variáveis
      int a;
      String msg = "";

      // entrada de dados
      System.out.println("Entrada dos dados");
      System.out.print("Digite  o valor de A: ");
      a = input.nextInt();

      // CONDIÇÕES
      if(a % 2 == 0) {
         msg = a + " é Par";
      } else {
         msg = a + " é Ìmpar";
      } // end else

      // exibe resultado
      System.out.println("\nRESULTADO: ");
      System.out.printf("%s%n%n", msg);

      input.close(); // end input

   } // end main      
}
