package Exemplos1_3;

import java.util.Scanner;

public class PotenciaDeDois07 {
    public static void main(String[] args) {

        // cria o objeto input e inicializa da classe Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um inteiro: ");
        // aguarda a entrada o usuário
        int num = input.nextInt();

        int i = 0;
        int potenDeDois = 1;

        // enquanto i menor ou igual a num faça
        while (i <= num) {
            // imprime
            System.out.println(i + " " + potenDeDois);
            potenDeDois = 2 * potenDeDois; // calcula a potência de 2
            i = i + 1; // soma 1
        } // fim while
    } // fim main
} // fim classe
