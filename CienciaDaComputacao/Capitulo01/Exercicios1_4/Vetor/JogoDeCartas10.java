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

        //variável
        final int CARTAS_POR_JOGADOR = 5;

        // vetor naipe
        String[] naipes = {
            "Paus", "Espadas", "Copas", "Ouros",
        };

        String[] cartas = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Valete", "Dama", "Rei", "As",
        };

        int baralho = naipes.length * cartas.length;

        if(CARTAS_POR_JOGADOR * jogadores > baralho )
            throw new RuntimeException("Muitos jogadores");

        String[] baralhoDeCartas = new String[cartas.length * naipes.length];

        // inicializando cartas
        for(int i = 0; i < cartas.length; i++) {
            for( int j = 0; j < naipes.length; j++ ) {
                baralhoDeCartas[naipes.length * i + j] = cartas[i] + " de " + naipes[j];
            } // fim for interno
        } // fim for externo
        
        // embaralhando as cartas
        for( int i = 0; i < cartas.length; i++) {
            int resp = 1 + (int) (Math.random() * (baralho - 1));
            String temp = baralhoDeCartas[resp];
            baralhoDeCartas[resp] = baralhoDeCartas[i];
            baralhoDeCartas[i] = temp;

        } // fim for embaralhar

        // mostra as cartas do baralho embaralhadas
        for( int i  = 0; i < jogadores * CARTAS_POR_JOGADOR; i++ ){
            System.out.println(baralhoDeCartas[i]);

            if(i % CARTAS_POR_JOGADOR == CARTAS_POR_JOGADOR - 1)
                System.out.println();
        } // fim for mostra cartas

    }
}
