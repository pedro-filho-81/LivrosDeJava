package Exercicios1_2;

/*
    1.2.22 Escreva um programa que receba três argumentos duplos de
    linha de comando x0, v0 e t e imprima o valor de x0 + v0t - g t2 / 2, 
    onde g é a constante 9,80665. (Observação: este valor é o deslocamento 
    em metros após t segundos, quando um objeto é lançado diretamente da 
    posição inicial x0 a uma velocidade de v0 metros por segundo.)
    Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (p. 46). 
    Pearson Education. Edição do Kindle.
    Pedro Filho, 23/11/2021
*/

// biblioteca
import java.util.Scanner;

public class Deslocamento22 {

    public static void main(String[] args) {

        // cria o objeto input da classe Scanner
        Scanner input = new Scanner(System.in);

        // cria uma constante
        double g = 9.80665;

        // entrada de dados
        System.out.print("Informe o ponto inicial: ");
        double inicio = input.nextDouble();
        System.out.print("Informe a velocidade: ");
        double velocidade = input.nextDouble();
        System.out.print("Informe o tempo: ");
        double tempo = input.nextDouble();

        // calcular o deslocamento
        double deslocamento = (inicio + velocidade) * tempo - g;

        // mostra o resultado
        System.out.println("Deslocamento = " + deslocamento);
    } // fim main
} // fim classe
