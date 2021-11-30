package Exercicios1_2;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class LimiteAleatorio19 {
    /*
        1.2.19 Escreva um programa que receba dois argumentos inteiros 
        de linha de comando aeb e imprima um inteiro aleatório 
        entre a e b, inclusive.
        Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (p. 46). 
        Pearson Education. Edição do Kindle.
        Pedro, 29/11/2021
    */
    
    public static void main(String[] args) {
        
        // cria o objeto entrada da classe Scanner e inicializa
        Scanner entrada = new Scanner(System.in);

        // entrada de dados
        System.out.println("Digite um inteiro: " );
        int inicio = entrada.nextInt();
        System.out.println("Digite outro inteiro: ");
        int fim = entrada.nextInt();

        double alea = inicio + Math.random() * fim;

        // mostra resultado
        System.out.println("O valor aleatório entre " + inicio + " e " +
                             fim + " é " + (int) alea );
    } // fkm main
} // fim classe
