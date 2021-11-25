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

                if (i % j == 0 || j % i == 0) {
                    System.out.print("* ");
                } // fim if
                else {
                    System.out.print("  ");
                } // fim else
                
            } // fim for interno
              // imprime i
            System.out.println(i);
        } // fim for externo
    } // fim main
} // fim classe
