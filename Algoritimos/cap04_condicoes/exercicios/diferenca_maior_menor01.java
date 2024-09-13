package cap04_condicoes.exercicios;

import java.util.Scanner;

public class Diferenca_maior_menor01 {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);

      // variáveis
      int n1, n2;

      // entrada de dados
      System.out.print("Digite um inteiro: ");
      n1 = input.nextInt();
      System.out.print("Outro inteiro: ");
      n2 = input.nextInt();

      // calcular
      int soma = n1 + n2;

      // condição
      if(n2 > n1)
         soma = n2 + n1;

      // resultado
      System.out.printf("Soma: %d + %d = %d",
               n1, n2, soma);

      input.close();
   } // end main
} // end class
