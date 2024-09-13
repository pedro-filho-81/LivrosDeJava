package cap04_condicoes.exercicios;
/**
 * d)Ler os valores de quatro notas escolares 
 * bimestrais de um aluno representadas pelas variáveis 
 * N1, N2, N3 e N4. Calcular a média aritmética 
 * (variável MD1) desse aluno e apresentar a mensagem 
 * “Aprovado” se a média obtida for maior ou igual a 7; 
 * caso contrário, o programa deve solicitar a quinta 
 * nota (nota de exame, representada pela variável NE) 
 * do aluno e calcular uma nova média aritmética 
 * (variável MD2) entre a nota de exame e a primeira 
 * média aritmética. Se o valor da nova média for maior 
 * ou igual a cinco, apresentar a mensagem “Aprovado em 
 * exame”; caso contrário, apresentar a mensagem 
 * “Reprovado”. Informar também, após a apresentação 
 * das mensagens, o valor da média obtida pelo aluno.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) (p. 220). 
 * Editora Saraiva. Edição do Kindle. 
 * Pedro,12/09/2024
 */
import java.util.Scanner;

public class Notas_do_aluno04 {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);

      // variáveis
      String nome, msg = "";
      double n1, n2, n3, n4, n5;
      double soma;
      double media = 0.0;

      // entrada de dados
      System.out.println("Entrada dos dados");
      System.out.print("Nome: ");
      nome = input.nextLine();
      System.out.print("Digite a primeira nota: ");
      n1 = input.nextDouble();
      System.out.print("Digite a segunda nota: ");
      n2 = input.nextDouble();
      System.out.print("Digite a terceira nota: ");
      n3 = input.nextDouble();
      System.out.print("Digite a quarta nota: ");
      n4 = input.nextDouble();
  
      // calcular
      // soma recebe o resultado de n1 a n4
      soma = n1 + n2 + n3 + n4;
      media = soma / 4; // calcula a primeira média
      // exibe a média1
      System.out.printf("média 1 = %.1f", media);

      // condições
      // verifica se média é menor que zero
      // ou se é maior que 10
      if (media < 0.0 || media > 10.0) { // se verdade
         // exibe
         System.out.println("\nAs notas devem ser\nmaiores que 0 e menores que 11. ");
      } else { // se não
         // verifica se a média é maior ou igual a sete
         // e se é menor ou igual a 10
         if(media >= 7.0f && media <= 10.0) { // se verdade
            // exibe
            msg = "Aprovado";

            // se não, verifica se a média é maior que 0
            // e menor ou igual a 5
         } else if(media > 0.0 && media <= 5.0f) { // se verdade
            // entra com novos dados
            System.out.print("\nFêz prova final.");
            System.out.print("\nDigite a quinta nota: ");

            // n5 recebe valor do usuário
            n5 = input.nextDouble(); // entra com a quinta nota
            
            // calcula a nova média
            soma += n5; // soma recebe o valor da quinta nota
            // e exibe
            System.out.println("soma 2 = " + soma);
            media = soma / 5; // e calcula a média com a 5ª nota

            // verifica se a média é maior ou igual a 5 
            // e menor que 7
            if (media >= 5.0 && media < 7.0) { // se verdade
               // imprime
               msg = "Aprovado pelo exame.";
            } else { // se não
               // exibe
               msg = "Reprovado.";
            } // fim else 

         } // end média menor que 5 
      } // else principal

      // verifica se a média está entre 0 e 10
      if (media >= 0.0 && media <= 10.0) { // se verdade
         // exibe o resultado
         System.out.println("\n\nRelatória das Notas:");
         System.out.printf("Aluno: %s", nome);
         System.out.printf("\nTotal = %.1f", soma);
         System.out.printf("\nmédia final = %.1f", media);
         System.out.printf("\nResultado: %s", msg);
      } // end if 

      input.close(); // end input

   } // end main
} // end class
