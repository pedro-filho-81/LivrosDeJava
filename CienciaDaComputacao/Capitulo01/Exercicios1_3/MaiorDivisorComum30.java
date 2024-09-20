package Exercicios1_3;

import java.util.Scanner;

public class MaiorDivisorComum30 {
    /**
     * Maior Divisor Comum
     * 1.3.30 Escreva um programa GreatestCommonDivisor que encontre
     * o máximo divisor comum (mcd) de dois inteiros usando o algoritmo
     * de Euclides, que é um cálculo iterativo baseado na seguinte observação:
     * se x é maior que y, então se y divide x, o mdc de xey é y;
     * caso contrário, o mdc de x e y é o mesmo que o mdc de x % y e y.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 85).
     * Pearson Educação. Edição do Kindle.
     * 
     * @author Pedro, 01/04/2022
     */
    public static void main(String[] args) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite o valor de x: ");
        int x = input.nextInt();

        System.out.print("Digite o valor de y: ");
        int y = input.nextInt();

        int resto;

        // enquanto y diferente de zero faça
        while (y != 0) { 
            // resto recebe o valor de x módulo y
            resto = x % y;
            // x recebe y
            x = y;
            // y recebe resto
            y = resto;
        } // fim while
        // mostra o valor de x que é o MDC
        System.out.printf("MDC = %d%n", x);
    } // fim main
} // fim classe