package cap04_condicoes.exercicios;
/**
 * f)Ler três valores inteiros representados pelas 
 * variáveis A, B e C e apresentar os valores lidos 
 * dispostos em ordem crescente. Dica: utilizar tomada 
 * de decisão sequencial e as ideias trabalhadas nos 
 * exercícios “g” (propriedade distributiva) e “f” 
 * (troca de valores) do Capítulo 3.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) (p. 221). 
 * Editora Saraiva. Edição do Kindle. 
 * Pedro,14/09/2024
 */
import java.util.Scanner;

public class Ordem_crescente06 {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);

      // variáveis
      double a, b, c;
      double maior, menor;
      String msg = "";

      // entrada de dados
      System.out.println("Entrada dos dados");
      System.out.print("Digite  o valor de A: ");
      a = input.nextDouble();
      System.out.print("Digite o valor de B: ");
      b = input.nextDouble();
      System.out.print("Digite o valor de C: ");
      c = input.nextDouble();
  
      maior = c; // recebe o maior valor

      // condições para o maior valor
      // verifica se a é o maior valor
      if (a > b && a > c) { // se verdade
         // maior recebe a
         maior = a;
         // se não, se b for o maior
      } else if (b > a && b > c) {
         // maior recebe b
         maior = b;
      } // end else if

      // condições para o menor valor
      menor = c; // menor recebe c

      // condições para o menor valor
      // verifica o menor valor
      if (a < b && a < c) {
         menor = a;
      } else if (b < a && b < c) {
         menor = b;
      } // end else if

      // calcular para achar o valor do meio
      double meio = (a + b + c) - maior - menor;

      // exibe resultado
      System.out.println("\nRESULTADO: ");
      System.out.printf("Ordem crescente: %.0f %.0f %.0f\n", menor, meio, maior);
      System.out.printf("Ordem decrescente: %.0f %.0f %.0f\n", maior, meio, menor);

      input.close(); // end input

   } // end main

}
