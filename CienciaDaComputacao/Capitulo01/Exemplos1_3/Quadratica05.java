package Exemplos1_3;

// biblioteca
import java.util.Scanner;

public class Quadratica05 {
    public static void main(String[] args) {

        // cria e inicializa o objeto input da classe Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um número: ");
        double b = input.nextDouble();
        System.out.print("Digite outro número: ");
        double c = input.nextDouble();

        // cálculos
        double discriminante = b * b - 4.0 * c;
        double raizQuadrada = Math.sqrt(discriminante);
        double raiz1 = (-b + raizQuadrada) / 2.0;
        double raiz2 = (-b - raizQuadrada) / 2.0;

        // imprime resultado
        System.out.println("Raiz1 = " + raiz1);
        System.out.println("Raiz2 = " + raiz2);

    } // fim main
} // fim classe
