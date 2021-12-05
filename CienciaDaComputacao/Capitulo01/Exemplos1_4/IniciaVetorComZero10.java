package Exemplos1_4;

public class IniciaVetorComZero10 {
    public static void main(String[] args) {
        
        // declara uma variável
         int tamanho = 10;

        // declara um vetor
        double vetor[];
        // cria o vetor
        vetor = new double[tamanho];

        // loop para inicializa o vetor
        for( int i = 0; i < tamanho; i++ ) // indexação dos valores do vetor
            vetor[i] = 0.0; // atribui valores ao vetor

        System.out.println( "\tIndice\t  Valor" );

        // mostra os valores do vetor
        for( int i = 0; i < tamanho; i++ )
            System.out.println( "\t  " + i + "\t   " + vetor[i] );

    } // fim main
} // fim classe
