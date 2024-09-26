package javaParaIniciantes.capitulo01.exemplos.instrucaoIF;

public class IfDemo {
   public static void main(String[] args) {
      
      // Declare variables
      int a, b, c;

      // create and assingment
      a = 2; // assingns the value 2(two) to variable a 
      b = 3; // assingns the value 3(three) to variable b

      // display result
      System.out.println("int a = " + a + ";");
      System.out.println("int b = " + b + ";");

      // if a less than b
      if (a < b) { // if true
         // display
         System.out.println("a less than b.");
      } // end if less than

      // if a equal b
      if (a == b) { // if true
         // display
         System.out.println("a equal b");
      } // end if equal

      // new line
      System.out.println();

      c = a - b; // assigns the value of (a - b) to variable c

      // display
      System.out.println("c = a - b;");
      System.out.println("c contain -1");
      // if c greater than or equal to 0
      if (c >= 0) { // if true
         // display
         System.out.println("c is non-negative.");         
      } // end if
      
      // if c less than ou equal to 0
      if (c <= 0) { // if true
         // display
         System.out.println("c is negative.");         
      } // end if

      // new line
      System.out.println();

      c = b - a; // assigns the value of (b - a) to variable c

      // display
      System.out.println("c = b - a;");
      System.out.println("c contain 1");
      // if c greater than or equal to 0
      if (c >= 0) { // if true
         // display
         System.out.println("c is non-negative.");         
      } // end if
      
      // if c less than ou equal to 0
      if (c <= 0) { // if true
         // display
         System.out.println("c is negative.");         
      } // end if

      // new line
      System.out.println();


   } // end main
} // end class
