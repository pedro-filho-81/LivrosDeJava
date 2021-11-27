package Exemplos1_4;

import java.util.Scanner;

public class ColetandoCartas06 {

    public static void main(String[] args) {

        // cria o objeto input da classe Scanner e inicializa
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite as tentativas: ");
        int n = input.nextInt(); // number of card types

        // cria o vetor boleano
        boolean[] isCollected = new boolean[n]; // isCollected[i] = true if card i has been collected

        // variáveis
        int count = 0; // total number of cards collected
        int distinct = 0; // number of distinct cards

        // repeatedly choose a random card and check whether it's a new one
        while (distinct < n) {
            int value = (int) (Math.random() * n); // random card between 0 and n-1
            count++; // we collected one more card
            if (!isCollected[value]) {
                distinct++;
                isCollected[value] = true;
            } // fim if
        } // fim while

        // print the total number of cards collected
        System.out.println("Em " + n + " tentativas foram coletadas " + count + " cartas.");

    } // fim main
} // fim classe
