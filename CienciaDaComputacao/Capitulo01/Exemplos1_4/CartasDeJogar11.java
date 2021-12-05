package Exemplos1_4;

public class CartasDeJogar11 {
    public static void main(String[] args) {

        // declara e inicializa um vetor
        String[] NAIPE = { "Paus", "Ouro", "Copas", "Espada" };
        String[] CARTAS = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Valete", "Dama", "Rei", "As" };

        // imprime uma carta
        System.out.println("\nMOSTRA A CARTA ESCOLHIDA");

        int tamanho = NAIPE.length * CARTAS.length;

        // cria o vetor baralho
        String[] baralho = new String[ tamanho ];

        // loop para mostrar o baralho
        for (int i = 0; i < CARTAS.length; i++)
            for (int j = 0; j < NAIPE.length; j++)
                // baralho recebe as cartas
                baralho[NAIPE.length * i + j] = "\t" + CARTAS[i] + " de " + NAIPE[j];

        for (int i = 0; i < tamanho; i ++) 
        { 
            int r = i + (int) (Math.random() * (tamanho - i)); 
            String temp = baralho [r];
            baralho[r] = baralho[i];
            baralho[i] = temp;

        } // fim for  

        // print shuffled deck
        for (int i = 0; i < tamanho; i++) {
            System.out.println(baralho[i]);
        } // fim for
               
    } // fim main
} // fim da classe
