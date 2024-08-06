/*
 * 2.10 Supondo que x = 2 e y = 3, o que cada uma das instruções a seguir exibe?
   a) System.out.printf(“x = %d%n”, x);
   b) System.out.printf(“Value of %d + %d is %d%n”, x, x, (x + x));
   c) System.out.printf(“x =”);
   d) System.out.printf(“%d = %d%n”, (x + y), (y + x))
 */
public class Exercicio2_10 {
   public static void main(String[] args) {
      
      int x = 2;
      int y = 3;
      System.out.println("int x = 2;\nint y = 3;");

      // a) System.out.printf(“x = %d%n”, x);
      System.out.printf("“x = %d%n”", x);
      // b) System.out.printf(“Value of %d + %d is %d%n”, x, x, (x + x));
      System.out.printf("“Value of %d + %d is %d%n”", x, x, (x + x));
      // c) System.out.printf(“x =”);
      System.out.printf("“x =”", x);
      // d) System.out.printf(“%d = %d%n”, (x + y), (y + x))
      System.out.printf("“%d = %d%n”", (x + y), (y + x));
   } // end main
} // end class