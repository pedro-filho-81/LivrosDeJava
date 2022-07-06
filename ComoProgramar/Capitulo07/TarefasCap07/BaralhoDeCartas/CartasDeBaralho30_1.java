package BaralhoDeCartas;

import java.security.SecureRandom;

public class CartasDeBaralho30_1 {
    /**
     * Prag. para exibir ua carta aleatória de u baralho de 52 cartas
     * Pedro, 06/07/2022
     */
    public static void main(String[] args) {

        // define, cria e inicializa os vetores naipe e cartas
        String[] naipe = {
            "Espada", "Paus", "Ouro", "Copas"
            };

        String[] cartas = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Valete", "Dama", "Rei", "As"
            };

        // cria objeto SecureRandom
        SecureRandom aleatorio = new SecureRandom();

        // variáveis para exibir carta do baralho
        // variável i recebe o valor aleatório de taanho 4
        int i = aleatorio.nextInt(naipe.length);
        // variável j recebe o valor aleatório de taanho 13
        int j = aleatorio.nextInt(cartas.length);

        // exibe o valor da carta e do naipe
        System.out.printf("%s de %s", cartas[j], naipe[i]);
        // exibe o valor da carta
        System.out.printf("\nCarta %s", cartas[j]);

    } // final principal
    
} // final classe