package cap05_loops.exercicios;
/**
 * h)Escrever um programa que apresente como resultado 
 * a potência de uma base qualquer elevada a um 
 * expoente qualquer, ou seja, de BE, em que B é o 
 * valor da base e E o valor do expoente. Considere 
 * apenas a entrada de valores inteiros e positivos, ou 
 * seja, de valores naturais. Sugestão: não utilize o 
 * formato “base ↑ expoente”, pois é uma solução muito 
 * trivial. Use a técnica de laço, em que o valor da 
 * base deve ser multiplicado o número de vezes 
 * determinado no expoente.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) 
 * (pp. 284-285). Editora Saraiva. Edição do Kindle. 
 * Pedro, 15/09/2024
 */
import java.util.Scanner;

public class Base_expoente_quqlquer08 {
   public static void main(String[] args) {

      // objeto
      Scanner input = new Scanner(System.in);
   
      // variáveis
      int base, expo;
      int potencia = 1;

      System.out.println("Calcula a potência:");
      // entrada de dados
      System.out.print("Digite o valor da base: ");
      base = input.nextInt();
      System.out.print("Digite o expoente: ");
      expo = input.nextInt();

      // exibe os valores
      // se base e expoente maior que zero 
      if (base > 0 && expo >0) {
         // loop for para calcular a potência
         for(int i = 1; i <= expo; i++) {
            // calcula a potência
            potencia *= base;
         } // end for

         // exibe resultado
         System.out.printf("potência = %d", potencia);
      } // end if

      input.close();

   } // end main
} // end class
