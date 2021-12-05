package Exemplos1_4;

public class Harmonicos12 {
    public static void main(String[] args) {
        
        // variável 
        int TAMANHO = 10;

        // vetor
        double[] harmonico = new double[ TAMANHO ];

        // loop para adicionar valores ao vetor
        for( int i = 1; i < TAMANHO; i++ ){
            // cálculo do número harmônico
            harmonico[ i ] = harmonico[ i ] + 1.0 * i;
        } // fim for

        // loop para mostrar os número harmônicoa
        for( int i = 0; i < TAMANHO; i++ ){
            // imprime
            System.out.println(harmonico[ i ] + " " );
        } // fim for

    } // fim main    
} // fim classe
