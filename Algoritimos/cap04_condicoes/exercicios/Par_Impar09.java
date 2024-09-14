package cap04_condicoes.exercicios;
/**
 * k)Efetuar a leitura de um valor numérico inteiro que 
 * esteja na faixa de valores de 1 até 9. O programa 
 * deve apresentar a mensagem “O valor está na faixa 
 * permitida”, caso o valor informado esteja entre 1 e 
 * 9. Se o valor estiver fora da faixa, o programa deve 
 * apresentar a mensagem “O valor está fora da faixa 
 * permitida”.
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
      System.out.print("Digite  um valor entre 1 e 9: ");
      a = input.nextInt();

      // CONDIÇÕES
      // verifica se a multiplo de dois é par
      if(a >= 1 && a < 10) {
         // exibe
         msg = a + " está na faixa permitida.";
      } else { // se não
         // exibr
         msg = a + " não está na faixa permitida.";
      } // end else

      // exibe resultado
      System.out.println("\nRESULTADO: ");
      System.out.printf("%s%n%n", msg);

      input.close(); // end input

   } // end main      
}
