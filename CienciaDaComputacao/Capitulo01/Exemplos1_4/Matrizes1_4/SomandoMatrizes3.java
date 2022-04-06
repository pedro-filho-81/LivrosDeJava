public class SomandoMatrizes3 {
    /**
     * Aritimética com matriz (+, -, *, /, %)
     * Pode ser usado qualquer dos sinais
     * 06/04/2022
     */
    public static void main(String[] args) {
        
        // variáveis
        final int LINHA = 3;
        final int COLUNA = 3;

        // matrizes
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriz A:");
        // loop para mostrar os valores da matriz
        // loop para as linhas
        for(int i = 0; i < LINHA; i++) {
            // loop para a coluna
            for( int j = 0; j < COLUNA; j++) {
                // imprime os valores da matriz
                System.out.printf("%5d", a[i][j]);
            } // fim for coluna
            // pula linha
            System.out.println();
        } // fim for linha
        
        int[][] b = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        System.out.println("Matriz B:");
        // loop para mostrar os valores da matriz
        // loop para as linhas
        for(int i = 0; i < LINHA; i++) {
            // loop para a coluna
            for( int j = 0; j < COLUNA; j++) {
                // imprime os valores da matriz
                System.out.printf("%5d", b[i][j]);
            } // fim for coluna
            // pula linha
            System.out.println();
        } // fim for linha

        // declara e cria a matriz c
        int[][] c = new int[LINHA][COLUNA];
        System.out.println("Matriz C:");
        // loop para somar as matrizes
        // loop para as linhas
        for(int i = 0; i < LINHA; i++) {
            // loop para a coluna
            for( int j = 0; j < COLUNA; j++) {
                // matriz c recebe os valores da soma
                // da matriz a e b
                c[i][j] = a[i][j] + b[i][j];
            } // fim for coluna
        } // fim for linha

        // loop para mostrar os valores da matriz
        // loop para as linhas
        for(int i = 0; i < LINHA; i++) {
            // loop para a coluna
            for( int j = 0; j < COLUNA; j++) {
                // imprime os valores da matriz
                System.out.printf("%5d", c[i][j]);
            } // fim for coluna
            // pula linha
            System.out.println();
        } // fim for linha
    } // fim main    
} // fim classe