package javaParaIniciantes.capitulo01.exemplos;
/**
 * Esse programa ilustra a diferença entre
 * inteiro e double
 */
public class Exemplo03 {
   public static void main(String[] args) {
      
      // declares variables
      int var; // integer
      double x; // flouting point

      // assings values to variables
      var = 10; // assings var the value 10
      x = 10.0; // assings x the value 10.0

      // header
      System.out.println("\nDIFFERENCE BETWEEN \nINTEGER AND DOUBLE");
      // display result
      System.out.println("int var = 10;\nOriginal value of var: " + var);
      System.out.println("double x = 10.0\nOriginal value of x: " + x);

      // divides the two by 4
      var = var / 4;
      x = x / 4;

      // disply result
      System.out.println("var = var / 4;\nvar after division: " + var);
      System.out.println("x = x / 4; \nx after division: " + x);
      System.out.println(); // next line
   } // end main
} // end class
