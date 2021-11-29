package Exercicios1_2;

/*
    1.2.18 Escreva um programa que receba dois argumentos inteiros 
    de linha de comando xey e imprima a distância euclidiana do 
    ponto (x, y) à origem (0, 0).
    Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (p. 46). 
    Pearson Education. Edição do Kindle.    
    Pedro Filho, 29/11/2021
*/

import java.util.Scanner;

public class DistanciaEuclidiana18 {
    public static void main(String[] args) {
        // crua o objeto entrada para a classe Scanner e inicializa
        Scanner entrada = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite ás coordenadas x1,y1: ");
        int x1 = entrada.nextInt();
        int y1 = entrada.nextInt();
        System.out.print("Digite às coordenadas x2, y2: ");
        int x2 = entrada.nextInt();
        int y2 = entrada.nextInt();

        // Fórmula da distância entre pontos
        // D( x, y ) = sqrt( pow( ( x1 - y1 ), 2) + pow( ( x2 - y2 ), 2) ) )

        // cálculo da distancia
        double distancia = Math.sqrt( Math.pow( ( x1 - y1 ), 2) + Math.pow( ( x2 - y2 ), 2) );
 
        System.out.println("\nDISTÂNCIA EUCLIDIANA");

        // output distance
        System.out.println("double distância = Math.sqrt( Math.pow( ( x1 - y1 ), 2) + Math.pow( ( x2 - y2 ) ) )" );
        System.out.println("A distância entre X = (" + x1 + ", " + y1 + ") e Y = ( " +
                             x2 + ", " + y2 + ") é de " + distancia);

    } // fim main
} // fim classe
