//A classe baralho de cartas representa as 52 cartas de um baralho
package exp7_08;

import java.security.SecureRandom;

public class BaralhoDeCartas {

    // cria o objeto da classe cartas
    private Cartas[] baralho; // declara o array baralho ára a classe cartas
    private int cartaCorrente; // índice da próxima carta a ser distribuída ( 0 - 51 );
    private static final int NUMERO_DE_CARTAS = 52; // número de cartas do baralho
    
    // cria o objeto para SecureRandom
    private static final SecureRandom numeroAleatorio = new SecureRandom();
    
    // cria o construtor da classe
    public BaralhoDeCartas() {
        
        // vetor face
        String[] faces = {
            "Ás", "Dois", "Três", "Quatro",  "Cinco",  
            "Seis",  "Sete", "Oito", "Nove", "Dez", 
            "Valete", "Dama", "Rei",       
            }; // fim face
        
        String[] naipe = {
             "Ouro", "Copas", "Paus", "Esoada"
            }; // dim naipe
        
        // cria o array de objetos Cartas
        baralho = new Cartas[ NUMERO_DE_CARTAS ];        
        cartaCorrente = 0; // primeira carta será a 0
        
        // preenche o baralho com o objeto Cartas
        for( int conte = 0; conte < baralho.length; conte++ ) {
            baralho[ conte ] = new Cartas(faces[conte % 13], naipe[conte / 13]);
        } // fim for
        
    } // fim construror

    // embaralha as cartas com o Algoritimo de passagem
    public void embaralha() {
        // varalho de cartas deve começar com a primeira carta do baralho
        cartaCorrente = 0;
        
        // para cada carta, comece com uma carta aleatória
        for( int primeira = 0; primeira < baralho.length; primeira++ ) {
            
            // seleciona as outras cartas do baralho
            int segundo = numeroAleatorio.nextInt(NUMERO_DE_CARTAS);
            
            Cartas temp = baralho[ primeira ];
            baralho[ primeira ] = baralho[  segundo ];
            baralho[ segundo ] = temp;            
        } // fim for
    } // fim método embaralha
    
    public Cartas cartoesDeOfertas() {
        if( cartaCorrente < baralho.length ) {
            return baralho[ cartaCorrente++ ];
        } // fim if
        else {
            return null;
        } // fim else
    } // fim baralho de cartas
    
} // fim classe                     
