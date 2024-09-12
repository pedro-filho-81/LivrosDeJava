package Exemplos1_3;

import java.util.Scanner;

public class PotenciaDeDois07 {
    public static void main(String[] args) {

        // cria o objeto input e inicializa da classe Scanner
        Scanner input = new Scanner(System.in);

        int num;

        // entrada de dados
        System.out.print("Potência:\nDigite um inteiro: ");
        // aguarda a entrada o usuário
        num = input.nextInt();

        int i = 0;
        int potenDeDois = 1;

        System.out.print(" " + num + " x " + num);

        // enquanto i menor ou igual a num faça
        while (i <= num) {

            potenDeDois = i * num; // calcula a potência de 2

            i = i + 1; // soma 1

        } // fim while

        // exibe resultado
        System.out.println(" = " + potenDeDois + "\n");

        // fecha o input
        input.close();

    } // fim main
} // fim classe
