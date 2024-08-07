package Exercicios1_2;

   import java.util.Scanner;

   public class VerificandoPedidos28 {
       /*
        * 1.2.28 Verificação do pedido. Escreva um programa que receba três 
        * argumentos de linha de comando duplos x, yez e imprima true se os 
        * valores forem estritamente crescentes ou decrescentes 
        * (x < y < z ou x > y > z), e false caso contrário.
        * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 47). 
        * Pearson Educação. Edição do Kindle.
        * @autor Pedro 17/04/2022
        */
       
       public static void main(String[] args) {
           
           // objeto Scanner
           Scanner input = new Scanner(System.in);
   
           // variável
           boolean crescente;
   
           // entrada de dados
           System.out.print("Digite o valor de x: ");
           double x = input.nextDouble();
           System.out.print("Digite o valor de y: ");
           double y = input.nextDouble();
           System.out.print("Digite o valor de z: ");
           double z = input.nextDouble();
   
           // comparação
           crescente = ( x > y && y > z );
           
           // mostra resultado
           System.out.printf("%.0f maior que %.0f e %.0f maior que %.0f? %b%n", x, y, y, z, crescente );
   
       } // fim main
   } // fim classe}
