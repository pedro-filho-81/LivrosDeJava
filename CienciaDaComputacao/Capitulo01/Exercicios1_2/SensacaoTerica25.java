package Exercicios1_2;
/*
 * Sensação térmica. Dada a temperatura T (em graus Fahrenheit) e a velocidade do vento v (em 
 * milhas por hora), o National Weather Service define a temperatura efetiva (a sensação 
 * térmica) da seguinte forma: w = 35,74 + 0,6215 T + (0,4275 T – 35,75)v0,16 Escreva um 
 * programa que receba dois argumentos de linha de comando duplos temperatura e velocidade e 
 * imprima a sensação térmica. Use Math.pow(a, b) para calcular ab. Observação: a fórmula não é 
 * válida se T for maior que 50 em valor absoluto ou se v for maior que 120 ou menor que 3 
 * (você pode assumir que os valores obtidos estão nesse intervalo).
 * Sedgewick, Robert; Wayne, Kevin. Computer Science: An Interdisciplinary Approach (p. 47). 
 * Pearson Education. Edição do Kindle.
 */
import java.util.Scanner;

public class SensacaoTerica25 {
    public static void main(String[] args) {
        // objeto Scanner
        Scanner input = new Scanner(System.in);
        
        // entrada de dados
        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperatura = input.nextDouble();

        System.out.print("Digite a velocidade dos ventos em Km/h: ");
        double velociVentos = input.nextDouble();

        // calcula a sensação termica
        double sensacao = 33 + (10 * Math.sqrt(velociVentos) + 
                        10.45 - velociVentos) * (temperatura - 33 ) / 22;
        
        // mostra resultado
        System.out.println("\nSENSAÇÃO TÉRMICA");
        System.out.printf("Com uma temperatura de %.1fºC %n", temperatura);
        System.out.printf("Velocidade dos ventos em %.1fKm/h%n", velociVentos );
        System.out.printf("Temos a sensação térmica de %.1fºC%n", sensacao);
    }
}