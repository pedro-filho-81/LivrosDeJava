/**
 * Figura 8.14: StaticImportTest.java
 * Importação static dos métodos da classe Math.
 */
import static java.lang.Math.*;

class ImporteStatic {

    public static void main(String[] args)
    {
        System.out.printf("sqrt(900,0) = %.1f%n", sqrt(900.0));
        System.out.printf("ceil(-9,8) = %.1f%n", ceil(-9.8));
        System.out.printf("E = %f%n", E);
        System.out.printf("pi = %f%n", PI);

    } // final principal
} // final da classe