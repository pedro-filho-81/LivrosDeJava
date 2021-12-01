package Exercicios1_3;

import java.util.Scanner;

public class SensacaoTermica06 {
    /*
     * 1.2.25 Sensação térmica. Dada a temperatura T (em graus Fahrenheit) e a
     * velocidade do vento v (em milhas por hora), o Serviço Meteorológico Nacional
     * define a temperatura efetiva (sensação térmica) da seguinte forma:
     * w = 35,74 + 0,6215 T + (0,4275 T - 35,75) v0,16
     * Escreva um programa que receba dois argumentos de linha de comando duplos,
     * temperatura e velocidade, e imprima a sensação térmica. Use Math.pow (a, b)
     * para calcular ab. Observação: a fórmula não é válida se T for maior que 50 em
     * valor absoluto ou se v for maior que 120 ou menor que 3 (você pode assumir
     * que os valores obtidos estão nessa faixa).
     * Sedgewick, Robert; Wayne, Kevin. Ciência da computação (p. 47).
     * Pearson Education. Edição do Kindle.
     * 
     * 1.3.6 Melhore a sua solução para o EXERCISE 1.2.25 adicionando código
     * para verificar se os valores dos argumentos da linha de comando estão
     * dentro dos intervalos de validade da fórmula e também adicionando código
     * para imprimir uma mensagem de erro se não estiver O caso.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (p. 81).
     * Pearson Education. Edição do Kindle.
     * Pedro Filho, 01/12/2021 
     */

    public static void main(String[] args) {

        // declara o objeto entrada para a classe Scanner e inicializa
        Scanner entrada = new Scanner(System.in);

        // entrada de dados
        System.out.print("Informe a temperatura em Fahrenheit: ");
        double tFahren = entrada.nextDouble(); // temperatura em Fahrenheit

        System.out.print("Informe a temperatura em Celsius: ");
        double tCelcius = entrada.nextDouble(); // temperatura em Celsius

        System.out.print("Informe a velocidade do vento: ");
        double v = entrada.nextDouble(); // velocidade do vento

        // cálculo sensação térmica Fahrenheit
        double w = 35.74 + 0.6215 * tFahren + (0.4275 * tFahren - 35.75) * Math.pow(v, 0.16);

        // cálculo sensação térmica Celsius
        double celcius = 33 + (10 * Math.sqrt(v) + 10.45 - v ) * (tCelcius - 33) / 22;
        
        // mostra o resultado
        System.out.println("\nSENSAÇÃO TÉRMICA FAHRENHEIT / CELSIUS");
        System.out.println("Temperatura em Fahrenheit = " + tFahren);
        System.out.println("Temperatura em Celsius = " + tCelcius);
        System.out.println("Velocidade do vento  = " + v);
        System.out.println("\nSensação térmica em Fahrenheit = " + w + "ºF\n");
        System.out.println("Sensação térmica em Celsius = " + celcius + "ºC\n");
    } // fim main
} // fim classe
