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

public class Notas_do_aluno03 {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);

      // variáveis
      String nome;
      int n1, n2, n3, n4;
      int soma;
      double media;

      // entrada de dados
      System.out.println("Entrada dos dados");
      System.out.print("Nome: ");
      nome = input.nextLine();
      System.out.print("Digite a primeira nota: ");
      n1 = input.nextInt();
      System.out.print("Digite a segunda nota: ");
      n2 = input.nextInt();
      System.out.print("Digite a terceira nota: ");
      n3 = input.nextInt();
      System.out.print("Digite a quarta nota: ");
      n4 = input.nextInt();
  
      // calcular
      soma = n1 + n2 + n3 + n4;
      media = soma / 4;

      // condições
      String mensagem;

      if(media > 5) {
         mensagem = "Aprovado";
      } else {
         mensagem = "Reprovado";
      } // end else

      // resultado
      System.out.println("\nRelatória das Notas:");
      System.out.printf("Aluno: %s", nome);
      System.out.printf("\nTotal = %d", soma);
      System.out.printf("\nmédia = %.1f", media);
      System.out.printf("\nResultado: %s", mensagem);

      input.close(); // end input

   } // end main
} // end class
