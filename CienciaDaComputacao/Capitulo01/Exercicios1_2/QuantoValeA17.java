package Exercicios1_2;

public class QuantoValeA17 {

    /*
     * 1.2.17 Forneça o valor da variável a após a execução de cada uma
     * das seguintes sequências de instruções:
     * 
     * int a = 1; booleano a = verdadeiro; int a = 2;
     * a = a + a; a =! a; a = a * a;
     * a = a + a; a =! a; a = a * a;
     * a = a + a; a =! a; a = a * a;
     * 
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (p. 46).
     * Pearson Education. Edição do Kindle.
     * Pedro, 29/11/2021
     */

    public static void main(String[] args) {

        // variáveis
        int a = 1;
        System.out.println("\nint a = 1;");
        a = a + a;
        System.out.println("a = a + a; = " + a);
        a = a + a;
        System.out.println("a = a + a; = " + a);
        a = a + a;
        System.out.println("a = a + a; = " + a);

        boolean b = true;
        System.out.println("\nboolean b = true;");
        b = !b;
        System.out.println("b = !b; = " + b);
        b = !b;
        System.out.println("b = !b; = " + b);
        b = !b;
        System.out.println("b = !b; = " + b);

        float c = 2;
        System.out.println("\nfloat c = 2;");
        
        System.out.println("c = 2; = " + c);
        c = c * c;
        System.out.println("c = c * c; = " + c);
        c = c * c;
        System.out.println("c = c * c; = " + c);
        c = c * c;
        System.out.println("c = c * c; = " + c);

    } // fim main
} // fim classe
