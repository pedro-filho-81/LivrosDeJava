package Capitulo08.Matriz.Exercicios;
import java.security.SecureRandom;

public class CelsiusParaFahrenheit07 {
    /**
     * g)Elaborar um programa que leia uma matriz A de duas dimensões com 
     * quatro linhas e cinco colunas, armazenando nessa matriz os valores 
     * das temperaturas em graus Celsius. Construir a matriz B de mesma 
     * dimensão, em que cada elemento seja o valor da temperatura em graus 
     * Fahrenheit de cada elemento correspondente da matriz A. Apresentar 
     * ao final as matrizes A e B.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 403). 
     * Editora Saraiva. Edição do Kindle. 
     * Pedro, 01/05/2022
     */
    public static void main(String[] args) {

        // constante
        final int LINHA = 4;
        final int COLUNA = 5;

        // matrizes
        double[][] celsius = new double[LINHA][COLUNA];
        double[][] fahrenheit = new double[LINHA][COLUNA];

        // adicionar
        addMatriz(celsius, LINHA, COLUNA);
        addFahrenheit(celsius, fahrenheit, LINHA, COLUNA);
        
        // métodos
        System.out.println("\nCelsius:");
        mostrarMtrz(celsius, LINHA, COLUNA);

        System.out.println("\nCelsius para Fahrenheit:");
        mostrarMtrz(fahrenheit, LINHA, COLUNA);

    } // fim main

    // adicionar valores na matriz
    public static void addMatriz(double[][] matriz, int linha, int coluna ) {

        // objeto SecureRandom
        SecureRandom aleatorio = new SecureRandom();

        // loop para adicionar valores no vetor
        for (int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) { 
            // matriz recebe valores aleatórios
            matriz[i][j] = aleatorio.nextInt(101);
            } // fimm for j
        } // fim for i
    } // fim adicionar

    // adicionar fatorial na matriz
    public static void addFahrenheit(double[][] matrizA, double[][] matrizB, int linha, int coluna) {
        // loop para linha
        for (int i = 0; i < linha; i++) {
            // loop para calcular os valores do vetor
            for (int j = 0; j < coluna; j++) {    
                // matriz recebe o valor do fatorial na segunda coluna
                // F = C x 1,8 + 32.
                matrizB[i][j] = matrizA[i][j] * 1.8 + 32;
            } // fim for j
        } // fim for i
    } // fim addFatorial

    // mostrar matriz
    public static void mostrarMtrz(double[][] matriz, int linha, int coluna) {

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%10.1f", matriz[i][j]);
            } // fim for j
            System.out.println();
        } // fimm for i

    } // fim mostrar

} // fim classe