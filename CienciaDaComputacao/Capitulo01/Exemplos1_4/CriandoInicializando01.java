package Exemplos1_4;

// criando inicializando e imprimindo vetor
public class CriandoInicializando01 {
    public static void main(String[] args) {
        
        // criando e inicializando um vetor
        int[] numero;           //declarando um vetor
        
        numero = new int[ 10 ]; // inicializando um vetor

        // loop for para adicionar valores ao vetor
        for( int i = 0; i < 10; i++ )
            numero[ i ] = i; // adicionando valores ao vetor
            
        // loop para mostra os valores do vetor
        for( int i = 0; i < 10; i++ )
            System.out.print(i + " " ); // imprimindo os valores
    } // fim main
} // fim classe
