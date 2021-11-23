package Exercicios1_2;

/*
    1.2.20 Escreva um programa que imprima a soma de dois inteiros 
    aleatórios entre 1 e 6 (como você pode obter ao rolar os dados).
    Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (p. 46). 
    Pearson Education. Edição do Kindle.
    Pedro Filho, 23/11/2021
*/

public class SomaDeDoisDados20 {

    public static void main(String[] args) {
        
        //Entrada de dados
        int dado1 = 1 + (int) Math.random() * 6;
        int dado2 = 1 + (int) Math.random() * 6;
        
        int soma = dado1 + dado2; // calcula a soma de a e b

        // mostra o resultado
        System.out.println("A soma de " + dado1 + " + " + dado2 + " = " + soma );
    } // fim main
} // fim classe
