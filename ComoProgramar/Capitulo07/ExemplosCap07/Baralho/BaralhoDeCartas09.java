package Baralho;

import java.security.SecureRandom;

public class BaralhoDeCartas09 {

    private ClasseCartas08[] baralho; // baralho de cartas
    private int proximaCarta;
    private static final int NUMERO_DE_CARTAS = 52;
    // objeto
    private static final SecureRandom aleatorio = new SecureRandom();

    public BaralhoDeCartas09() {

        String[] naipe = {
                "Espada", "Paus", "Ouro", "Copas"
        };

        String[] cartas = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Valete", "Dama", "Rei", "As"
        };

        // objeto ClasseCartas08
        baralho = new ClasseCartas08[NUMERO_DE_CARTAS];

        proximaCarta = 0;

        // loop para prencher o baralho
        for (int contar = 0; contar < baralho.length; contar++) {
            baralho[contar] = new ClasseCartas08(cartas[contar % 13], naipe[contar / 13]);
        } // fim for contar
    } // fim construtor

    // shuffle = embaralhar
    public void embaralhar() {
        
        proximaCarta = 0;

        for (int first = 0; first < baralho.length; first++) {

            // variável
            int segundo = aleatorio.nextInt(NUMERO_DE_CARTAS);

            // objeto da classe cartas
            ClasseCartas08 temp = baralho[first];
            baralho[first] = baralho[segundo];
            baralho[segundo] = temp;
        } // fim for

    } // fim ebaralhar

    // distribui uma carta
    public ClasseCartas08 distribuiCartas() {
        if (proximaCarta < baralho.length) {
            return baralho[proximaCarta++];
        } // fim if
        else
            return null;

    } // fim distribui cartas

} // fim classe 