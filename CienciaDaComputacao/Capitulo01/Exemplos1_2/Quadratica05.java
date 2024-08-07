package Exemplos1_2;
/*
 * Este programa imprime as raízes do polinômio x2 + bx + c, usando a 
 * fórmula quadrática. Por exemplo, as raízes de x2 – 3x + 2 são 1 e 2, 
 * pois podemos fatorar a equação como (x – 1)(x – 2); as raízes de x2 – 
 * x – 1 são ϕ e 1 – ϕ, onde ϕ é a razão áurea; e as raízes de x2 + x + 1 
 * não são números reais.
 * Sedgewick, Robert; Wayne, Kevin. Computer Science: An 
 * Interdisciplinary Approach (p. 25). Pearson Education. 
 * Edição do Kindle.
 */
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
