package Exercicios1_2;

public class QueImprime01 {
    /*
        1.2.1 Suponha que a e b são variáveis inteiras. O que a seguinte 
        sequência de afirmações faz? int t = a; b = t; a = b;
        Sedgewick, Robert; Wayne, Kevin. Ciência da computação (p. 44). 
        Pearson Education. Edição do Kindle.
        Pedro, 27/11/2021
    */

    public static void main(String[] args) { 

        // variáveis
        int a = 1; // a recebe 1
        int b = 2; // b recebe 2
        int t = a; // t recebe o valor de a = 1
            b = t; // b recebe o valor de t = 1
            a = b; // a recebe o valor de b = 1

            // a, b e t estão com o valor 1
        
        // Todos imprimem o número 1
        System.out.println("a = " + a + " b = " + b + "t = " + t);
    }// fim main
} // fim classe
