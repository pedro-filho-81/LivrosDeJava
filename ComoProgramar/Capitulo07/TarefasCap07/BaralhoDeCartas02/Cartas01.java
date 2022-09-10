
public class Cartas01 {

    private final String cartas;
    private final String naipe;

    // construtor
    public Cartas01(String cartas, String naipe)
    {
        this.cartas = cartas;
        this.naipe = naipe;
    } // final construtor
    
    public String toString()
    {
        return cartas + " de " + naipe;
    } // final toString

} // fi classe cartas01