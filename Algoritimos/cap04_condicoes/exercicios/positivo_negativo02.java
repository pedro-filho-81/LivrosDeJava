package cap04_condicoes.exercicios;
/**
 * b)Efetuar a leitura de um valor numérico inteiro 
 * positivo ou negativo representado pela variável N e 
 * apresentar o valor lido como sendo positivo. Dica: 
 * se o valor lido for menor que zero, ele deve ser 
 * multiplicado por –1.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) (p. 220). 
 * Editora Saraiva. Edição do Kindle. 
 * Pedro,12/09/2024
 */
import java.util.Scanner;

public class positivo_negativo02 {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);

      // variáveis
      int n1;

      // entrada de dados
      System.out.print("Digite um inteiro positivo ou negativo: ");
      n1 = input.nextInt();
      
      // se n1 negativo
      if(n1 < 0)
        n1 *= -1;

      // resultado
      System.out.printf("O valor positivo é: %d", n1);

      input.close();

   } // end main
} // end class
