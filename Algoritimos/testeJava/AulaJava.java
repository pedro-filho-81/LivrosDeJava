package Algoritimos.testeJava;

import java.util.Scanner;

public class AulaJava {
   public static void main(String[] args) {
      // objeto
      Scanner input = new Scanner(System.in);

      // variável
      int a = 5;
      int b = 4;
      System.out.println("a = 5");
      System.out.println("b = 4");
      if (a == b) {
         System.out.println("a igual (==) a b");
      }
      if (a != b) {
         System.out.println("A é diferente (!=) de b");
      }
      if (a > b) {
         System.out.println("a maior que (>) b");
      }
      if (a >= b) {
         System.out.println("a maior ou igual (>=) a b.");
      }

      input.close();
   }
}
