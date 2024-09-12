package cap04_condicoes.exercicios;
/**
 * c)Realizar a leitura dos valores de quatro notas 
 * escolares bimestrais de um aluno representadas pelas 
 * variáveis N1, N2, N3 e N4. Calcular a média 
 * aritmética (variável MD) desse aluno e apresentar a 
 * mensagem “Aprovado” se a média obtida for maior ou 
 * igual a 5; caso contrário, apresentar a mensagem 
 * “Reprovado”. Informar também, após a apresentação 
 * das mensagens, o valor da média obtida pelo aluno.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) (p. 220). 
 * Editora Saraiva. Edição do Kindle. 
 * Pedro,12/09/2024
 */
import java.util.Scanner;

public class notas_do_aluno04 {
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
