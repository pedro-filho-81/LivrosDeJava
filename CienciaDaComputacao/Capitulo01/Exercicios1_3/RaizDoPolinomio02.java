package Exercicios1_3;

import java.util.Scanner;

public class RaizDoPolinomio02 {
    /*
        1.3.2 Escreva uma versão mais geral e mais robusta do Quadrático 
        (PROGRAMA 1.2.3) que imprima as raízes do polinômio ax2 + bx + c, 
        imprima uma mensagem apropriada se o discriminante for negativo e 
        se comporte adequadamente (evitando a divisão por zero ) se a for zero.
        Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (p. 81). 
        Pearson Education. Edição do Kindle.
        Pedro, 01/02/2021
    */

    public static void main(String[] args) {

        // cria o objeto input da classe Scanner e inicializa
        Scanner entrada = new Scanner(System.in);

        // variável
        double discriminante = 0.0;
        double b = 0.0;
        double c = 0.0;

        // enquanto discriminante maior ou igual a zero faça
        while( discriminante <= 0.0 )
        {
            // entrada de dados
            System.out.print("Digite um número: ");
            b = entrada.nextDouble();
            System.out.print("Digite outro número: ");
            c = entrada.nextDouble();

            // cálculo
            discriminante = b*b - 4.0*c;

            // se discriminante menor ou igual a zero então
            if( discriminante <= 0.0 )
                // imprime a mansagem e retorna às questões até que o primeiro valor 
                // seja mainor que o segundo valor e a discriminante sseja maior que zero
                System.out.println("discriminante = " + discriminante +
                        "\nInforme o primeiro número maior que o segundo.");

        } // while

        // cálculos
        double sqroot =  Math.sqrt(discriminante);
        double root1 = (-b + sqroot) / 2.0;
        double root2 = (-b - sqroot) / 2.0;

        // imprime o resultado
        System.out.println("\nRAIZ DA DISCRIMINANTE");
        System.out.println("Discriminante = " + discriminante);
        System.out.println("Raiz1 = " + root1);
        System.out.println("Raiz2 = " + root2);

    } // fim main    
} // fim classe
