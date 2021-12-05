package Exemplos1_4;

public class CartasDeJogar11 {
    public static void main(String[] args) {

        // declara e inicializa um vetor
        String[] NAIPE = { "Paus", "Ouro", "Copas", "Espada" };
        String[] CARTAS = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Valete", "Dama", "Rei", "As" };

        // imprime uma carta
        System.out.println("\nMOSTRA A CARTA ESCOLHIDA");

        // cria o vetor baralho
        String[] baralho = new String[NAIPE.length * CARTAS.length];

        // loop para mostrar o baralho
        for (int i = 0; i < NAIPE.length; i++)
            for (int j = 0; j < CARTAS.length; j++)
                // baralho recebe as cartas
                baralho[NAIPE.length * i + j] = "\t" + CARTAS[j] + " de " + NAIPE[i];
        
        // variáveis
        int i = (int) Math.random() *NAIPE.length;
        int j = (int) Math.random() * CARTAS.length;

        System.out.println("\t" + CARTAS[j] + " de " + NAIPE[i]);

    } // fim main
} // fim da classe
