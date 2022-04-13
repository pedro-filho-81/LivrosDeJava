package Vetor;

import java.util.Scanner;

public class JogoDeCartas10 {
    /**
     * 1.4.10 Escreva um programa Deal que receba um argumento
     * de linha de comando inteiro n e imprima n mãos de pôquer
     * (cinco cartas cada) de um baralho embaralhado, separadas
     * por linhas em branco.
     */
    public static void main(String[] args) {

        // objeto scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Informe o número de jogadores: ");
        int jogadores = input.nextInt();

        // distribuição de cartas por jogadores
        final int CARTAS_POR_JOGADOR = 5;

        // vetor naipe
        String[] naipes = {
                "Paus", "Espadas", "Copas", "Ouros",
        };

        String[] cartas = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Valete", "Dama", "Rei", "As",
        };

        // quantidade de cartas no baralho 52
        int baralho = naipes.length * cartas.length;

        // se as cartas por jogador multiplocado pela quantidade de jogadores
        // for maior que 52
        if (CARTAS_POR_JOGADOR * jogadores > baralho)
            // imprima muitos jogadores
            throw new RuntimeException("Muitos jogadores");

        // declara e cria o vetor baralho de cartas
        String[] baralhoDeCartas = new String[cartas.length * naipes.length];

        // loop para inicializar cartas
        for (int i = 0; i < cartas.length; i++) {
            // loop para naipes
            for (int j = 0; j < naipes.length; j++) {
                // baralho de cartas recebe as cartas com seus naipes
                baralhoDeCartas[naipes.length * i + j] = cartas[i] + " de " + naipes[j];
            } // fim for interno
        } // fim for externo

        // embaralhando as cartas
        // loop para as cartas
        for (int i = 0; i < cartas.length; i++) {

            // variável resp recebe um valor aleatório entre o baralho (52)
            int resp = 1 + (int) (Math.random() * (baralho - 1));

            // cria variável temporária que recebe o baralho de cartas
            String temp = baralhoDeCartas[resp];

            // baralho de cartas[resp] recebe balalho de cartas[i]
            baralhoDeCartas[resp] = baralhoDeCartas[i];

            // baralho de cartas[i] recebe o valor do temporário
            baralhoDeCartas[i] = temp;

        } // fim for embaralhar

        // mostra as cartas do baralho embaralhadas
        for (int i = 0; i < jogadores * CARTAS_POR_JOGADOR; i++) {
            // imprime a carta do baralho
            System.out.println(baralhoDeCartas[i]);

            // verifica se
            if (i % CARTAS_POR_JOGADOR == CARTAS_POR_JOGADOR - 1)
                // pula uma linha
                System.out.println();
        } // fim for mostra cartas

    } // fim main
} // fim classe