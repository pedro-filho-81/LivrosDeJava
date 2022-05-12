package Baralho;

public class ClasseCartas08 {
    private final String carta;
    private final String naipe;

    // construtor
    public ClasseCartas08(String carta, String naipe) {
        this.carta = carta;
        this.naipe = naipe;
    } // fim construtor

    public String toString() {
        return carta + " de " + naipe;
    } // fim toString

} // fim classe