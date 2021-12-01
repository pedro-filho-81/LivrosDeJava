package Exercicios1_3;

import java.util.Scanner;

public class IguaisOuDiferentes01 {

    /*
        1.3.1 Escreva um programa que receba três argumentos inteiros de 
        linha de comando e imprima igual se todos os três forem iguais, 
        e diferente de outra forma.
        Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (p. 81). 
        Pearson Education. Edição do Kindle.
        Pedro, 30/11/2021
    */
    public static void main(String[] args) {
        
        // declara o objeto entrada para a classe Scanner e inicializa
        Scanner entrada = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um inteiro: ");
        int n1 = entrada.nextInt();
        
        System.out.print("Digite outro inteiro: ");
        int n2 = entrada.nextInt();
        
        System.out.print("Digite mais um inteiro: ");
        int n3 = entrada.nextInt();

        // condição se forem iguais
        if( n1 == n2 && n1 == n3 )
            // imprima
            System.out.println("São iguais.");
        else // se não 
            // imprima
            System.out.println("São diferentes.");        

    } // fim main    
} // fim classe
