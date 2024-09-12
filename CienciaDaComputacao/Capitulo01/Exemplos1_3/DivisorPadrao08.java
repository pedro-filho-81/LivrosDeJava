package Exemplos1_3;

import java.util.Scanner;

public class DivisorPadrao08 {
    public static void main(String[] args) {

        // cria o objeto input e inicializa
        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite um inteiro: ");
        int num = input.nextInt();

        // loop
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                // se divisão i por j igual a zero
                // ou divisão j po i igual a zero
                if (i % j == 0 || j % i == 0) { // se verdade
                    // exibe asterisco
                    System.out.print("* ");
                } // fim if
                else { // se falso
                    // exibe 2 espaços
                    System.out.print("  ");
                } // fim else
                
            } // fim for interno

            // no final de cada linha 
            // imprime o valor de i
            System.out.println(i);

        } // fim for externo
        input.close();
    } // fim main
} // fim classe
