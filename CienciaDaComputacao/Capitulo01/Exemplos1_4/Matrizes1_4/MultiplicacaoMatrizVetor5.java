public class MultiplicacaoMatrizVetor5 {
    public static void main(String[] args) {
        // matriz
        int[][] matriz = {
            {99, 85, 98},
            {98, 57, 78},
            {92, 77, 76},
            {94, 32, 11},
            {99, 34, 22},
            {90, 46, 54},
            {76, 59, 88},
            {92, 66, 89},
            {97, 71, 24},
            {89, 26, 38}
        };

        // vetor
        double[] vetor = {0.33, 0.33, 0.33};

        // constantes
        final int LINHA = 10;
        final int COLUNA = 3;

        // vetor para receber a multiplicação da matriz pelo vetor
        double[] segundoVetor = new double[LINHA];

        // LOOP para a linha
        for( int i = 0; i < LINHA; i++) {
            // loop para coluna
            for( int j = 0; j < COLUNA; j++) {
                segundoVetor[i] = matriz[i][j] * vetor[j];
            } // fim for coluna
        } // fim for linha
        

        // loop para mostrar o segundo vetor
        for( int i = 0; i < LINHA; i++) {
           
            System.out.printf("%10.2f", segundoVetor[i]);
            
        } // fim for linha
        
    } // fim main
} // fim classe