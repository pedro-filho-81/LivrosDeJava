package Exemplos1_3;

import java.util.Scanner;

public class DecimalParaBinario13 {

    public static void main(String[] args) {

        // cria o objeto input da classe Scanner e inicializa
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um inteiro: ");
        // lê um argumento da linha de comando
        int n = input.nextInt();

        // defina a potência para a maior potência de 2 que é <= n
        int power = 1; // power começa com 1

        // enquanto qower menor ou igual a metade de n
        while (power <= n / 2) { // faça

            // calcula a potência de de 2 até power ser maior que n
            power *= 2;
            System.out.println("Power1 = " + power);
        } // fim while

        // verifica a presença de potências de 2 em n, da maior para a menor
        // enquanto power maior que zero faça
        while (power > 0) {
           
            // potência não está presente em n
            // se n menor que power
            if (n < power) {
                // imprima zero 0
                System.out.print("  n = " + n + " < power = " + power + "  " + 0);
            } // fim if

            // a potência está presente em n, então subtraia a potência de n
            else { // se n maior que power 
                // imprima 1
                System.out.print("  n = " + n + " > power = " + power + "  " + 1);
                // diminua de n o valor de power
                n -= power;
            } // fim else

            // próxima menor potência de 2
            power /= 2; // divida o valor de power por 2
            System.out.println();

        } // fim while

        input.close();
        
        System.out.println(); // pula linha

    } // fim main
} // fim classe
