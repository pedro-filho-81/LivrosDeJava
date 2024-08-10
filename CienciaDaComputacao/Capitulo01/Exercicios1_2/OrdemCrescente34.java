package Exercicios1_2;
/*
 * 1.2.34 Three sort.
 * Escreva um programa que receba três argumentos de linha de comando 
 * inteiros e os imprima em ordem crescente. Use Math.min() e Math.max().
 * Sedgewick, Robert; Wayne, Kevin. Computer Science:
 * An Interdisciplinary Approach (p. 49). Pearson Education. 
 * Edição do Kindle.
 */
import java.util.Scanner;

public class OrdemCrescente34 {
   public static void main(String[] args) {

      // objeto Scanner
      Scanner input = new Scanner(System.in);

      // variáveis
      int n1, n2, n3;
      int menor, maior, meio;

      // entrada de dados
      System.out.print("Digite um inteiro: ");
      n1 = input.nextInt();
      System.out.print("Digite outro inteiro: ");
      n2 = input.nextInt();
      System.out.print("Digite o terceiro inteiro: ");
      n3 = input.nextInt();

      // menor e maior recebe n1;
      menor = Math.min(n1, Math.min(n2, n3));
      maior = Math.max(n1, Math.max(n2, n3));

      // soma dos valores menos maior e menor o resto é o meio
      meio = n1 + n2 + n3 - menor - maior;

      // colocando em oredem e exibe os valores
      System.out.printf("Ordem crescente: %d %d %d %n", menor, meio, maior);
      System.out.printf("Ordem Decrescente: %d %d %d %n", maior, meio, menor);

      input.close();

   } // end main
} // end class
