public class TestaBaralhoDeCartas10 {
    public static void main(String[] args) {

        BaralhoDeCartas09 meuBDeCartas09 = new BaralhoDeCartas09();

        meuBDeCartas09.embaralhar();

        for (int i = 1; i <= 52; i++) {
            System.out.printf("%-19s", meuBDeCartas09.distribuiCartas());
            if (i % 4 == 0)
                System.out.println();
        } // fim for
    } // fim main
} // fim classe