package Exercicios1_2;

public class OuExclusivoBoolean05 {
    public static void main(String[] args) {
        
        System.out.println("\nTABELA VERDADE OU EXCLUSIVO BOOLEAN");

        // variáveis
        boolean p = true;
        boolean q = true;
        System.out.println("p = " + p + " q = " + q + " p # q = " + (p ^ q) );

        p = true;
        q = false;
        System.out.println("p = " + p + " q = " + q + " p # q = " + (p ^ q) );

        p = false;
        q = true;
        System.out.println("p = " + p + " q = " + q + " p # q = " + (p ^ q) );

        p = false;
        q = false;
        System.out.println("p = " + p + " q = " + q + " p # q = " + (p ^ q) );
    } // FIM MAIN    
} // fim classe
