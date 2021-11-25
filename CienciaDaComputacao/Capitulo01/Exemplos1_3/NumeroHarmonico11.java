package Exemplos1_3;

import java.util.Scanner;

public class NumeroHarmonico11 {

    public static void main(String[] args) {

        // cria o objeto input e inicializa
        Scanner input = new Scanner(System.in);

        // entrada de dado
        System.out.print("Digite um inteiro: ");
        int n = input.nextInt();

        // calcula 1/1 + 1/2 + 1/3 + ... + 1/n
        double sum = 0.0;

        // loop para calcular
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i; // calcula a divisão de 1.0 pelo valor de i
        } // fim for

        // imprime a soma
        System.out.println("Soma = " + sum);

    } // fim main
} // fim classe
