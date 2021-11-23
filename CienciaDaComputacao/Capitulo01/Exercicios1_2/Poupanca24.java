package Exercicios1_2;

/*
    1.2.24 Juros compostos continuamente. Escreva um programa que 
    calcule e imprima a quantidade de dinheiro que você teria após 
    t anos se investisse capital a uma taxa de juros anual taxa 
    (compostos continuamente). O valor desejado é dado pela fórmula montante.
    Sedgewick, Robert; Wayne, Kevin. Ciência da computação (p. 47). 
    Pearson Education. Edição do Kindle.
    Pedro Filho, 23/11/2021
*/

// biblioteca
import java.util.Scanner;

public class Poupanca24 {
    public static void main(String[] args) {

        // cria o objeto input
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite o valor do investimento R$ ");
        double capital = input.nextDouble();

        System.out.print("Informwe a taxa de juros: ");
        double taxa = input.nextDouble();

        System.out.print("Informe o tempo em mêses: ");
        int tempo = input.nextInt();

        // calcular
        double indice = taxa / 100;
        double montante = capital * Math.pow(1 + indice, tempo);
        double juros = montante - capital;

        System.out.println("\nRENDIMENTO DE INVESTIMENTO");
        // mostra o resultado
        System.out.println("Você investiu R$ " + capital);
        System.out.println("Taxa de juros " + indice + "%");
        System.out.println("Por " + tempo + " meses.");
        System.out.println("Recebeu de Juros R$ " + juros);
        System.out.println("Valor final R$ " + montante);
        System.out.println("\n");
    } // fim main
} // fim classe
