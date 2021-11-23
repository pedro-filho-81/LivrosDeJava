package Exercicios1_2;
/*
    1.2.21 Escreva um programa que receba um argumento duplo de 
    linha de comando t e imprima o valor de sin (2t) + sin (3t).
    Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (p. 46). 
    Pearson Education. Edição do Kindle.
    Pedro Filho, 23/11/2021
*/

// biblioteca
import java.util.Scanner;

public class SomaDeSenos21 {
    public static void main(String[] args) {

        // cria o objeto input da classe Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.println("Informe os graus: ");
        double graus = input.nextDouble();

        // calcular o radianos
        double radianos = Math.toRadians(graus);
        double soma = Math.sin(2 * radianos) + Math.sin(3 * radianos);

        // mostra resultado
        System.out.println("Soma dos senos = " + soma);

    } // fim main
} // fim class
