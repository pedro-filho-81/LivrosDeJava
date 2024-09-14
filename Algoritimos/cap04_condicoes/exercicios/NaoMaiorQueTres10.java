package cap04_condicoes.exercicios;

/**
 * l)Fazer a leitura de um valor numérico inteiro 
 * qualquer e apresentá-lo caso não seja maior que 3. 
 * Dica: para a solução deste problem, utilize apenas o 
 * operador lógico de negação.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) 
 * (pp. 221-222). Editora Saraiva. Edição do Kindle.  
 * Pedro, 14/09/2024
 */
import java.util.Scanner;

public class NaoMaiorQueTres10 {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);

      // variáveis
      int a = 0;
      String msg = "";

      // entrada de dados
      System.out.println("Entrada dos dados");
      System.out.print("Digite  um valor entre 0 e 3: ");
      a = input.nextInt();

      // CONDIÇÕES
      // verifica se a maior que 0 e menor que 3
      if(!(a >= 0 && a <= 3)) { // se verdade
         // exibe
         msg = a + " está na faixa de 0 a 3.";
      } else { // se não
         // exibr
         msg = a + " não está na faixa de 0 a 3.";
      } // end else

      // exibe resultado
      System.out.println("\nRESULTADO:");
      System.out.println("Condição:");
      System.out.println("SE NÃO(a maior ou igual a zero \ne a menor ou igual a três) faça:");
      System.out.println("O operador lógico de negação NÃO\n(faz o inverso expressão)");
      System.out.println("if(!(a >= 0 && a <= 3))");
      System.out.printf("%s%n%n", msg);

      input.close(); // end input

   } // end main      
}
