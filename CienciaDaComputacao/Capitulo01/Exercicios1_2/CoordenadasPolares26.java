package Exercicios1_2;

/*
 * 1.2.26 Coordenadas polares. Escreva um programa que converta de 
 * coordenadas cartesianas para polares. Seu programa deve aceitar dois 
 * argumentos de linha de comando duplos x e y e imprimir as coordenadas 
 * polares r e θ. Use o método Math.atan2(y, x) para calcular o valor do 
 * arco tangente de y/x que está no intervalo de -π a π.
 * Sedgewick, Robert; Wayne, Kevin. Computer Science: 
 * An Interdisciplinary Approach (p. 47). Pearson Education. 
 * Edição do Kindle.
 */
import java.util.Scanner;

public class CoordenadasPolares26 {
    public static void main(String[] args) {
        
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite o valor de x: ");
        double x = input.nextDouble();
        System.out.print("Digite o valor de Y: ");
        double y = input.nextDouble();

        // calcular
        double raio = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);

        // mostra o resultado
        System.out.printf("Raio = %.2f%n", raio);
        System.out.printf("Theta = %f%n", theta);        
    } // fim main    
} // fim classe