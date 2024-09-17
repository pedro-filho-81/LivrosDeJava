package cap05_loops.exercicios;
/**
 * i)Escrever um programa que apresente os valores da 
 * sequência numérica de Fibonacci até o décimo quinto 
 * termo. A sequência de Fibonacci é formada pelos 
 * valores numéricos 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 
 * 55, 89, 144, 233, 377, ... etc., obtendo-se o 
 * próximo termo a partir da soma do termo atual com o 
 * anterior sucessivamente até o infinito se a 
 * sequência não for interrompida, sendo determinada a 
 * partir da fórmula Fn = Fn-1 + Fn-2. Utilize para 
 * este exercício as variáveis ATUAL, ANTERIOR e 
 * PRÓXIMO.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) (p. 285). 
 * Editora Saraiva. Edição do Kindle. 
 * Pedro, 15/09/2024
 */
import java.util.Scanner;

public class Fibonacci09 {
   public static void main(String[] args) {

      // objeto
      Scanner input = new Scanner(System.in);

      // variáveis
      int anterior = 0;
      int atual = 1;
      int proximo;

      // entrada de dados
      System.out.print("Digite o número inteiro: ");
      proximo = input.nextInt(); // entrada do usuário

      // imprime o valor 0 zero
      System.out.print(anterior + " ");

      // loop para contar até o valor do próximo
      // informado pelo usuário
      for(int i = 1; i < proximo; i++) {

         // se i for igual a 1
         if (i == 1) {
            // no início do loop
            atual = 1; // atual recebe 1
            anterior = 0; // e anterior recebe zero
         } else { // quando i for diferente de 1
            // o atual soma seu valor
            // com valor anterior
            // no início atual é 1 
            // e anterior é 0
            atual += anterior; // soma = 1
            
            // e o anterior recebe o valor atual
            // diminuido do anterior
            // atual = 1 e anterior = 0
            anterior = atual - anterior; // = 1 - 0
         } // end else

            // e exibe o valor atual
            System.out.print(atual + " ");// = 1

      } // end for

      input.close();
      
   } // end main
} // end class
