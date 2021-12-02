package Exercicios1_2;

import java.util.Scanner;

public class RaizQuadrada08 {
    /*
        Explique como usar RaizQuadrada=0.java para encontrar a raiz quadrada de um número
        Solução : para encontrar a raiz quadrada de c, encontre as raízes de x ^ 2 + 0x - c.
    */

    public static void main(String[] args) {

        // cria o objeto input da classe Scanner e inicializa
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um número: ");
        double b = input.nextDouble();
        System.out.print("Digite outro número: ");
        double c = input.nextDouble();

        // cálculos
        double discriminant = b*b - 4.0*c;
        double sqroot =  Math.sqrt(discriminant);
        double root1 = (-b + sqroot) / 2.0;
        double root2 = (-b - sqroot) / 2.0;

        // imprime o resultado
        System.out.println(root1);
        System.out.println(root2);
    } // fim main
} // fim classe
