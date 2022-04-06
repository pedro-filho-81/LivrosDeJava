public class SomaMatrizComVetor4 {
    public static void main(String[] args) {
        
        // cria uma matriz
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // cria um vetor
        int[] vetor = {10, 20, 30, 40, 50};

        // CONSTANTES TAMANHO DA MATRIZ
        final int LINHA = 3;
        final int COLUNA = 3;

        // declara e cria uma matriz para receber
        // a soma da matriz com o vetor
        int[][] valores = new int[LINHA][COLUNA];

        // variável soma
        int soma = 0;

        // imprime
        System.out.println("Vetor:");
        // mostra vetor
        for( int i = 0; i < vetor.length; i++) {
            System.out.printf("%5d", vetor[i]);
        } // fim for vetor
        
        // declara e cria uma matriz
        // loop para somar 
        for( int i = 0; i < LINHA; i++) {
            // loop para a coluna
            for(int j = 0; j < COLUNA; j++ ) {
                valores[i][j] = vetor[j] * matriz[i][j];
            } // fim for coluna

        } // fim for linha
        System.out.println("\nMatriz:");
        // loop para mostra valores 
        for( int i = 0; i < LINHA; i++) {
            // loop para a coluna
            for(int j = 0; j < COLUNA; j++ ) {
                System.out.printf("%8d", matriz[i][j]);
            } // fim for coluna
            System.out.println();
        } // fim for linha

        System.out.println("\nValores:");
        // loop para mostra valores 
        for( int i = 0; i < LINHA; i++) {
            // loop para a coluna
            for(int j = 0; j < COLUNA; j++ ) {
                System.out.printf("%8d", valores[j][i]);
            } // fim for coluna
            System.out.println();
        } // fim for linha
    }
    
}
