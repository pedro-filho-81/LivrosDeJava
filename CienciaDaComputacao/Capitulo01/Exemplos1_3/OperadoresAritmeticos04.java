package Exemplos1_3;
// operação aritmética com o tipo double

import java.util.Scanner;

public class OperadoresAritmeticos04 {
    public static void main(String[] args) {

        // cria e inicializa o objeto input da classe Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um número: ");
        double a = input.nextDouble();
        System.out.print("Digite outro número: ");
        double b = input.nextDouble();

        // cálculos
        double soma = a + b;
        double subtracao = a - b;
        double produto = a * b;
        double divisao = a / b;
        double resto = a % b;

        System.out.println("\nARITMÉTICA com DOUBLE"); // cabeçalho

        // MOSTRA RESULTADO
        System.out.println("Soma => " + a + " + " + b + " = " + soma);
        System.out.println("Subtração => " + a + " - " + b + " = " + subtracao);
        System.out.println("Produto => " + a + " * " + b + " = " + produto);
        System.out.println("Divis]ap => " + a + " / " + b + " = " + divisao);
        System.out.println("Resto => " + a + " % " + b + " = " + resto);

        System.out.println(); // pula uma linha
        System.out.println("sin(pi/2) = " + Math.sin(Math.PI / 2));
        System.out.println("log(e)    = " + Math.log(Math.E));

        input.close();
        
    } // fim main
} // fim classe
