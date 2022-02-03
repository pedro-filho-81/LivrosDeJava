// lista de argumentos de comprimento variável

public class ListaDeArgumentosTeste {
   
    // cria uma lista de argumentos e calcula média
    public static double media( double... numeros ) {
        
        // variável
        double total = 0.0;
        
        // calcula o total usando o for aprimorado
        for( double digito : numeros ) {
            total += digito;
        } // fim for
        
        // retorne a média
        return total / numeros.length;
        
    } // fim média
    
    // cria main
    public static void main(String[] args) {
        
        // variáveis
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;
        double d5 = 50.0;
        
        System.out.println("VARIÁVEIS");
        // mostra as variáveis
        System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f%nd5 = %.1f%n",
                                        d1, d2, d3, d4, d5 );
        
        System.out.println("\nMÉDIAS");
        System.out.printf("Média entre d1 e d2 é %.1f%n", media(d1 , d2 ) );
        System.out.printf("Média entre d1, d2 e d3 é %.1f%n", media(d1 , d2, d3 ) );
        System.out.printf("Média entre d1, d2, d3, e d4 é %.1f%n", media(d1 , d2, d3, d4 ) );
        System.out.printf("Média entre d1, d2, d3, d4 e d5 é %.1f%n", media(d1 , d2, d3, d4, d5 ) );
        
    } // fim main
} // fim classe
