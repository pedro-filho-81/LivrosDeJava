public class TestaBaralhoDeCartas11 {
    /**
     * 7.30 (Embaralhamento e distribuição) 
     * Modifique o aplicativo da Figura 7.11 para distribuir uma mão de cinco cartas de pôquer. 
     * Então, modifique a classe DeckOfCards da Figura 7.10 para incluir métodos que determinam 
     * se uma mão contém
     * a) um par
     * b) dois pares
     * c) trinca (por exemplo, três valetes)
     * d) quadra (por exemplo, quatro ases)
     * e) flush (isto é, cinco cartas do mesmo naipe)
     * f) straight (isto é, cinco cartas de valores consecutivos)
     * g) full house (isto é, duas cartas de um valor e três cartas de outro valor)
     * [Dica: adicione os métodos getFace e getSuit à classe Card da Figura 7.9.
     * Pedro, 03/07/2022
     */
    public static void main(String[] args) {

        // cria objeto da classe baralho de cartas
        BaralhoDeCartas10 meuBDeCartas09 = new BaralhoDeCartas10();

        // chama método embaralhar
        meuBDeCartas09.embaralhar();

        System.out.println(); // pula linha

        // loop para método distribuir cartas
        for (int i = 1; i <= 5; i++) {
        
            // mostra o embaralhamento das cartas
            System.out.printf("%-19s", meuBDeCartas09.distribuiCartas());
            
            // se i multiplo de 5
            if (i % 5 == 0)
                // pula umma linha
                System.out.println();
        } // fim for

        System.out.println(); // pula linha

        meuBDeCartas09.umPar();
        
    } // fim main

} // fim classe