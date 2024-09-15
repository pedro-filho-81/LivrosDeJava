package cap05_loops.exercicios;
import java.util.Scanner;
public class Tabuada02 {
   public static void main(String[] args) {
      
      // objeto
      Scanner input = new Scanner(System.in);

      // variável
      int n;

      // entrada de dados
      System.out.print("Deseja a tabuada de? ");
      n = input.nextInt();

      System.out.println("\n*********************");
      System.out.printf("%17s%n", "T A B U A D A");
      System.out.println("*********************");
      // loop for para a tabuada
      for(int i = 1; i < 11; i++) {
         // exibe os valores
         System.out.printf("%d%5s%5d%5s%5d%n", n, "x", i, "=", n * i);
      } // end for
      System.out.println("*********************");
      input.close();
   } // end main
} // end class
