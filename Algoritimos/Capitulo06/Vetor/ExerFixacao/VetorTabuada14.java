import java.util.Scanner;
/*
 * m)Construir um programa que calcule a tabuada de 
 * um valor qualquer de 1 até 10 e armazene os 
 * resultados em uma matriz A de uma dimensão. 
 * Apresentar os elementos da matriz A.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) (p. 
 * 313). Editora Saraiva. Edição do Kindle. 
 * 17/08/2024
 */
public class VetorTabuada14 {
   public static void main(String[] args) {

      // objeto Scanner
      Scanner input = new Scanner(System.in);

      // vetor
      int[] vetor = new int[11];

      adicionar(vetor); // adiciona valores ao vetor
      exibir(vetor); // exibe os dados do vetor

   } // end main

   // método adicionar
   public static void adicionar(int[] vetor) {

      Scanner input = new Scanner(System.in);

      // variável
      int n = 0;

      // entrada de dados
      System.out.print("Informe o valor para a tabuada: ");
      n = input.nextInt();

      // loop para adicionar valores ao vetor
      for(int i = 1; i < vetor.length; i++) {
         // adiciona valores ao vetor
         vetor[i] = i * n;
      } // end for

   } // end adicionar

   // método exibir valores do vetor
   public static void exibir(int[] vetor) {

      // loop for para exibir os valores do vetor
      // cabeçalho
      System.out.print("Vetor = { ");
      
      for(int i = 1; i < vetor.length; i++) {
         // exibe o vetor
         System.out.printf("%d ", vetor[i]);
      } // end for

      System.out.println("};");

   } // end exibir

} // end class