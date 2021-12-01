package Exercicios1_3;

public class Probabilidade05 {

    /*
     * 1.3.5 Escreva um programa RollLoadedDie que imprima o resultado
     * do lançamento de um dado carregado de forma que a probabilidade
     * de obter 1, 2, 3, 4 ou 5 seja 1/8 e a probabilidade de obter 6 seja 3/8.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (p. 81).
     * Pearson Education. Edição do Kindle.
     * 01/12/2021
     */

    public static void main(String[] args) {

        // integer in the range 1 to 6 with desired probabilities
        int conta1 = 0, conta2 = 0, conta3 = 0, conta4 = 0, conta5 = 0, conta6 = 0;
        int i; // para o loop for

        // loop for
        for( i = 0; i < 10000; i++ ) 
        {
            // double in the range [1, 6)
            double r = 1 + Math.random() * 6;

            if ((int) r == 1 ) {
                conta1++;
            }
            else if ( (int) r == 2 ) {
                conta2++;
            }
            else if ((int) r == 3 ) {
                conta3++;
            }
            else if ( (int) r == 4 ) {
                conta4++;
            }
            else if ( (int) r == 5 ) {
                conta5++;
            }
            else {
                conta6++;
            } // fim else
        } // fim for

        // imprime o resultado
        System.out.println("\nO dado foi jogado " + i + " vezes.");
        System.out.println( "O número 1 apareceu " + conta1 + " vezes.");
        System.out.println( "O número 2 apareceu " + conta2 + " vezes.");
        System.out.println( "O número 3 apareceu " + conta3 + " vezes.");
        System.out.println( "O número 4 apareceu " + conta4 + " vezes.");
        System.out.println( "O número 5 apareceu " + conta5 + " vezes.");
        System.out.println( "O número 6 apareceu " + conta6 + " vezes.");

    } // fim main
} // fim classe
