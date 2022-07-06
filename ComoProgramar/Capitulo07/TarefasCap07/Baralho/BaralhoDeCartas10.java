import java.security.SecureRandom;
import java.util.Arrays;
import java.util.ArrayList;

public class BaralhoDeCartas10 {

    private ClasseCartas09[] baralho; // declara baralho de carta
    private ClasseCartas09[] vlDaCarta; // declara valor da carta
    private int proximaCarta;
    private static final int NUMERO_DE_CARTAS = 52; // valor constante
    // objeto
    private static final SecureRandom aleatorio = new SecureRandom();

    // construtor da classe
    public BaralhoDeCartas10() {

        String[] naipe = {
                "Espada", "Paus", "Ouro", "Copas"
        };

        String[] cartas = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Valete", "Dama", "Rei", "As"
        };

        // objeto ClasseCartas09
        baralho = new ClasseCartas09[NUMERO_DE_CARTAS];
        
        // cria objeto da ClasseCartas09 vlDaCarta
        vlDaCarta = new ClasseCartas09[NUMERO_DE_CARTAS];
        
        proximaCarta = 0; // contador para o baralho

        // loop para atribuir as cartas ao baralho
        for (int contar = 0; contar < baralho.length; contar++) {
            baralho[contar] = new ClasseCartas09(cartas[contar % 13], naipe[contar / 13]);
        } // fim for contar

    } // fim construtor

    // shuffle = embaralhar
    public void embaralhar() {

        for (int first = 0; first < baralho.length; first++) {

            // variável
            int segundo = aleatorio.nextInt(NUMERO_DE_CARTAS);

            // objeto da classe cartas
            ClasseCartas09 temp = baralho[first];
            baralho[first] = baralho[segundo];
            baralho[segundo] = temp;

        } // fim for

    } // fim ebaralhar

    // distribui uma carta
    public ClasseCartas09 distribuiCartas() {

        if (proximaCarta < baralho.length) {
            return baralho[proximaCarta++];
        } // fim if
        else
            return null;

    } // fim distribui cartas
    
    public void umPar() {
        for(int i = 0; i < 5; i++) { 
            //vlDaCarta[i] = baralho[i];
            System.out.printf("%-19s", vlDaCarta[i]);
        } // final for
    } // final umPar

} // fim classe