/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_35;

/**
 *4.35 (Lados de um triângulo) Escreva um aplicativo que lê três valores diferentes de zero inseridos pelo usuário, 
 * determina e imprime se eles poderiam representar os lados de um triângulo.
 * @author Pedro, 11/01/2022
 */

import java.util.Scanner;

public class Exercicio4_35 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto Scanner
        Scanner entrada = new Scanner(System.in);
        
        // variáveis
        int ladoA, ladoB, ladoC;
        
        // entrada de dados
        System.out.print("Digite o valor do lado A: ");
        ladoA = entrada.nextInt();
        
        System.out.print("Digite o valor do lado B: ");
        ladoB = entrada.nextInt();
        
        System.out.print("Digite o valor do lado C: ");
        ladoC = entrada.nextInt();
        /*
        | b - c | < a < b + c
        | a - c | < b < a + c
        | a - b | < c < a + b
        */
        if( (ladoB - ladoC) < ladoA ) {
            if( ladoA < (ladoB + ladoC)) {
                if( (ladoA - ladoC) < ladoB ) {
                    if(ladoB < (ladoA + ladoC)) {
                        if( (ladoA - ladoB) < ladoC ) {
                            if( ladoC < (ladoA + ladoB)) {
                                System.out.printf("LadoA = %d,  LadoB = %d e LadoC = %d Pode ser um triângulo.%n", ladoA, ladoB, ladoC);
                            } // fim if  
                            else
                                System.out.printf("LadoA = %d,  LadoB = %d e LadoC = %d NÃO Pode ser um triângulo.%n", ladoA, ladoB, ladoC);
                        } // fim if
                        else
                            System.out.printf("LadoA = %d,  LadoB = %d e LadoC = %d NÃO Pode ser um triângulo.%n", ladoA, ladoB, ladoC);
                    } // fim if
                    else
                         System.out.printf("LadoA = %d,  LadoB = %d e LadoC = %d NÃO Pode ser um triângulo.%n", ladoA, ladoB, ladoC);
                } // fim if
                else
                    System.out.printf("LadoA = %d,  LadoB = %d e LadoC = %d NÃO Pode ser um triângulo.%n", ladoA, ladoB, ladoC);
            } // fim if 
            else
                System.out.printf("LadoA = %d,  LadoB = %d e LadoC = %d NÃO Pode ser um triângulo.%n", ladoA, ladoB, ladoC);
        } // fim if
        else
            System.out.printf("LadoA = %d,  LadoB = %d e LadoC = %d NÃO Pode ser um triângulo.%n", ladoA, ladoB, ladoC);
    } // fim main    
} // fim classe
    