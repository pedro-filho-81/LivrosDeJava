public class ClasseCartas09 {
    private String carta;
    private final String naipe;

    // construtor
    public ClasseCartas09(String carta, String naipe) {
        this.carta = carta;
        this.naipe = naipe;
    } // fim construtor

    public String valorDaCarta() {
        return carta;
    } // final valorDaCarta

    public String toString() {
        return carta + " de " + naipe;
    } // fim toString

} // fim classe