package Exemplos1_3;

import java.util.Scanner;

public class RaizQuadrada12 {

    public static void main(String[] args) {

        // cria o objeto input e inicializa
        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite um número: ");
        double c = input.nextInt();

        // calcula
        double epsilon = 1.0e-15; // relative error tolerance
        double t = c; // estimate of the square root of c

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        } // fim while

        // print out the estimate of the square root of c
        System.out.println(t);

        input.close();
        
    } // fim main
} // fim classe
