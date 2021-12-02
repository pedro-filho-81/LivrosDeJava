package Exercicios1_2;


// biblioteca
import java.util.Scanner;

public class QuemDivideQuem14 {
    /*
     * 1.2.14 Escreva um programa que recebe dois inteiros positivos
     * como argumentos de linha de comando e imprime verdadeiro se um
     * deles divide o outro igualmente.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da computação (p. 45).
     * Pearson Education. Edição do Kindle.
     * Pedro, 28/11/2021
     */

    public static void main(String[] args) {

        // cria o objeto input da classe Scanner e inicializa
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um inteiro: ");
        int numero1 = input.nextInt();
        System.out.print("Digite outro inteiro: ");
        int numero2 = input.nextInt();

        // cálculo
        boolean divisivel = (numero1 % numero2 == 0)
                || (numero2 % numero1 == 0);

        // imprime resultado
        System.out.println(numero1 + " e " + numero2 +
                " Um deles divide o outro igualmente? " + divisivel);

    } // fim main
} // fim classe
