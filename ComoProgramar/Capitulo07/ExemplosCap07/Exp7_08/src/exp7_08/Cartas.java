//A classe cartas representa as 52 cartas de um baralho
package exp7_08;

public class Cartas {
    
    // cria as variáveis de instância
    private final String faces; // face da carta
    private final String naipe; // naipe da carta
    
    // cria o construror da classe
    public Cartas( String cartasFace, String cartasNaipe ) {
        this.faces = cartasFace;
        this.naipe = cartasNaipe;
    } // fim construtor Cartas
    
    // retorna a string da carta
    public String toString() {
        return faces + " de " + naipe;
    } // fim paraString

} // fim classe cartas
