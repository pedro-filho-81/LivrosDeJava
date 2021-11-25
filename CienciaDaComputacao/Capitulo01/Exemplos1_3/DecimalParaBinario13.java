package Exemplos1_3;

import java.util.Scanner;

public class DecimalParaBinario13 {

    public static void main(String[] args) {

        // cria o objeto input da classe Scanner e inicializa
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um inteiro: ");
        // read in the command-line argument
        int n = input.nextInt();

        // defina a potência para a maior potência de 2 que é <= n
        int power = 1;
        while (power <= n / 2) {
            power *= 2;
        } // fim while

        // verifica a presença de potências de 2 em n, da maior para a menor
        while (power > 0) {

            // potência não está presente em n
            if (n < power) {
                System.out.print(0);
            } // fim if

            // a potência está presente em n, então subtraia a potência de n
            else {
                System.out.print(1);
                n -= power;
            } // fim else

            // próxima menor potência de 2
            power /= 2;

        } // fim while

        System.out.println(); // pula linha

    } // fim main
} // fim classe
