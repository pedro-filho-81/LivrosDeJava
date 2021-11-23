package Exercicios1_2;

/*
    1.2.23 Escreva um programa que receba dois argumentos inteiros 
    de linha de comando mês e dia e imprima verdadeiro se o dia do mês 
    estiver entre 22/9 e 21/12, caso contrário, falso.
    Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (p. 46). 
    Pearson Education. Edição do Kindle.
    Pedro Filho, 23/11/2021
*/

// biblioteca
import java.util.Scanner;

public class Primavera23 {
    public static void main(String[] args) {

        // cria o objeto input da classe Scanner
        // para entrada de dados do usuário
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite o mês: ");
        int mes = input.nextInt();
        System.out.print("Informe o dia: ");
        int dia = input.nextInt();

        // condições para seu um dia da estação primavera no Brasil
        boolean estacaoPrimavera = (mes == 9 && dia >= 22 && dia <= 30)
                                || (mes == 10 && dia >= 1 && dia <= 31)
                                || (mes == 11 && dia >= 1 && dia <= 30) 
                                || (mes == 12 && dia >= 1 && dia <= 21);

        System.out.println("Dia " + dia + " do mês " + mes +
                            " é um dia da primavera? " + estacaoPrimavera + "\n");
    } // fim main
} // fim classe
