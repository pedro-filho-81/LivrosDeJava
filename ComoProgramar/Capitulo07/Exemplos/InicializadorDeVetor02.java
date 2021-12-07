package Exemplos;

public class InicializadorDeVetor02 {
    public static void main(String[] args) {
        
        // inicializando os elementos do vetor com o inicializador de array
        int[] vetor = { 10, 25, 35, 47, 89, 44, 98, 32, 123, 51 };

        // título da coluna
        System.out.printf("%s%8s%n", "Indice", "Valor" );

        // loop para mostra os valores
        for( int i = 0; i < vetor.length; i++ ){
            // imprime
            System.out.printf("%5d%8d%n", i, vetor[ i ] );
        } // fim for
    } // fim main
} // fim classe
