package Exemplos1_3;

import java.util.Scanner;

public class ReguaComFor10 {

    public static void main(String[] args) {

        // cria o objeto input e inicializa
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite o tamanho da regua: ");
        int n = input.nextInt();

        // regua comaça com 0
        String ruler = " ";

        // repete n vezes
        for (int i = 1; i <= n; i++) {

            // concatenate a ruler of order 0, the number i, and a ruler of order 0
            ruler = ruler + i + ruler;

            // imprime n vezes
            System.out.println(ruler);
        } // fim for

        input.close();
        
    } // fim main
} // fim classe
