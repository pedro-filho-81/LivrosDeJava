package Exemplos1_4;

import java.util.Scanner;

public class Simples05 {

    public static void main(String[] args) {

        // cria o objeto input da classe Scanner e inicializa
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um inteiro: ");
        int m = input.nextInt(); // choose this many elements
        System.out.print("Digite um inteiro para randon: ");
        int n = input.nextInt(); // from 0, 1, ..., n-1

        // cria o vetor permutação 0, 1, ..., n-1
        int[] perm = new int[n];
        // loop para adicionar velor ao vetor permutação
        for (int i = 0; i < n; i++)
            // atribui os valores de i no vetor
            perm[i] = i;

        System.out.println( "\nIndice:      Aleatório: " );

        // loop para atribuir valores a r na perm[0], perm[1], ..., perm[m-1]
        for (int i = 0; i < m; i++) {
            // variável r recebe valores aleatórios de i e n-1
            int r = i + (int) (Math.random() * (n - i));

            // inverte os valores de i e r
            int t = perm[r];
            perm[r] = perm[i];
            perm[i] = t;
            System.out.println("perm[r] = " + perm[r] +
                                "  perm[i] = " + perm[i]);
        } // fim for

        // pula uma linha
        System.out.println();
    } // fim main
} // fim classe
