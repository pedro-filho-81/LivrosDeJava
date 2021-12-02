package Exercicios1_3;

// biblioteca
import java.util.Scanner;

public class LoopFor07 {
    /*
     * 1.3.7 Suponha que i e j sejam ambos do tipo int.
     * Qual é o valor de j depois que cada uma das
     * seguintes instruções é executada?
     * para (i = 0, j = 0; i <10; i ++) j + = i;
     * para (i = 0, j = 1; i <10; i ++) j + = j;
     * para (j = 0; j <10; j ++) j + = j;
     * para (i = 0, j = 0; i <10; i ++) j + = j ++;
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (p. 81).
     * Pearson Education. Edição do Kindle.
     * Pedro Filho, 02/12/2021
     */

    public static void main(String[] args) {

        // variáveis
        int i;
        int j;

        System.out.println("\nMOSTRA VALORES USANDO FOR");

        // A)
        System.out.print("a) j += i = "); // valores de j
        // o que ele faz? para (i = 0, j = 0; i <10; i ++) j += i;
        for (i = 0, j = 0; i < 10; i++) {
            j += i;
            System.out.print(j + " ");
        }
        // a) j += i = 0 1 3 6 10 15 21 28 36 45

        // B)
        System.out.print("\nb) j += j = "); // valores de j
        // o que ele faz? para (i = 0, j = 1; i <10; i ++) j += j;
        for (i = 0, j = 1; i < 10; i++) {
            j += j;
            System.out.print(j + " ");
        }
        // b) j += j = 2 4 8 16 32 64 128 256 512 1024

        // C)
        System.out.print("\nc) j += j = "); // valores de j
        // o que ele faz? para (j = 0; j <10; j ++) j += j;
        for (j = 0; j < 10; j++) {
            j += j;
            System.out.print(j + " ");
        }
        // c) j += j = 0 2 6 14

        // D)
        System.out.print("\nd) j += j++ = "); // valores de j
        // o que ele faz? para (i = 0, j = 0; i <10; i ++) j + = j ++;
        for (i = 0, j = 0; i < 10; i++) {
            j += j++;
            System.out.print(j + " ");
        }
        // d) j += j++ = 0 0 0 0 0 0 0 0 0 0

    } // fim main
} // fim classe
