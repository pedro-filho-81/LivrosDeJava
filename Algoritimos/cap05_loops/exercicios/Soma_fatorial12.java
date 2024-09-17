package cap05_loops.exercicios;
/**
 * l)Elaborar um programa que leia quinze valores 
 * numéricos inteiros e no final apresente o somatório 
 * da fatorial de cada valor lido.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) (p. 286). 
 * Editora Saraiva. Edição do Kindle. 
 * Pedro, 17/09/2024
 */
import java.util.Scanner;

public class Soma_fatorial12 {
   public static void main(String[] args) {
      
      // objeto Scanner
      Scanner input = new Scanner(System.in);

      // variáveis
      long soma = 0;
      int key = 0;
      long fat = 1;

      // cabeçalho
      System.out.println("Entrada de dados:");
      // entrada de dados
      // loop for para entrada de dados
      for(int i = 1; i <= 15; i++) {
         // exibe
         System.out.print("Digite um inteiro: ");
         key = input.nextInt(); // entrada do usuário

         // loop for para calcular o vatorial 
         for(int j = 1; j <= key; j++) {
            fat *= j; // calcula o fatorial
         } // end for

         // exibe valor do fatorial
         System.out.println("Fat = " + fat);

         // soma o fatorial
         soma += fat;
         
         // inicializa a variável para novo cálculo
         fat = 1;
      } // end for dados

      // exibe o total da soma
      System.out.println("\nExibe Resultado:\nSoma = " + soma);
      
      input.close(); // fecha o objeto

   } // end main
} // end class
