package Exemplos1_3;

import java.util.Scanner;

public class LoopDoWhile18 {

    /*
        Imprime um ponto escolhido uniformemente ao acaso dentro do círculo centrado
        em (0, 0) e de raio 1.
        30/11/2021
    */

    public static void main(String[] args) { 
        
        // declara o objeto entrada para a classe Scanner e inicializa
        Scanner entrada = new Scanner(System.in);

        // variáveis
        double x, y;

        do {

           // Escala x e y para ser aleatório em (-1, 1).
            x = 2.0 * Math.random() - 1.0;
            y = 2.0 * Math.random() - 1.0;

        } while (x*x + y*y > 1.0);

        // print (x, y)
        System.out.println("(" + x + "," + y + ")");

    } // fim main    
} // fim classe