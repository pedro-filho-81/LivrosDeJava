public class TestaBaralhoDeCartas10 {
    public static void main(String[] args) {

        // cria objeto da classe baralho de cartas
        BaralhoDeCartas09 meuBDeCartas09 = new BaralhoDeCartas09();

        // chama método embaralhar
        meuBDeCartas09.embaralhar();

        // loop para método distribuir cartas
        for (int i = 1; i <= 52; i++) {
            // mostra o embaralhamento das cartas
            System.out.printf("%-19s", meuBDeCartas09.distribuiCartas());
            // se i multiplo de 4
            if (i % 4 == 0)
                // pula umma linha
                System.out.println();
        } // fim for

    } // fim main

} // fim classe