package Exercicios1_2;

public class NumeroMaiorMenorMedia30 {
   /**
    * 1.2.30 Números aleatórios uniformes.
    * Escreva um programa que imprima cinco números aleatórios 
    * uniformes entre 0 e 1, seu valor médio e seus valores 
    * mínimo e máximo. Use Math.random(), Math.min() e Math.max().
    * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 48). 
    * Pearson Educação. Edição do Kindle.
    */
   public static void main(String[] args) {
       
       // variáveis recebem random()
       double num1 = Math.random();
       double num2 = Math.random();
       double num3 = Math.random();
       double num4 = Math.random();
       double num5 = Math.random();

       // calculos
       double soma = num1 + num2 + num3 + num4 + num5;
       double media = soma / 5;
       double menorValor = Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4, num5))));
       double maiorValor = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
       
       // mostra resultado
       System.out.printf("\nNúmero1 = %.5f%n", num1);
       System.out.printf("Número2 = %.5f%n", num2);
       System.out.printf("Número3 = %.5f%n", num3);
       System.out.printf("Número4 = %.5f%n", num4);
       System.out.printf("Número5 = %.5f%n", num5);
       System.out.printf("Soma = %.5f%n", soma);
       System.out.printf("Média = %.5f%n", media);
       System.out.printf("Menor valor = %.5f%n", menorValor );
       System.out.printf("Maior valor = %.5f%n", maiorValor );

   } // fim main    
} // fim class