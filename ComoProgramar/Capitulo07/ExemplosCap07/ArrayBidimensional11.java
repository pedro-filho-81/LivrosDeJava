public class ArrayBidimensional11 {
    public static void main(String[] args) {
        
        // array bidimensional
        int [][] matrizA = {{1, 2, 3}, {4, 5, 6}};
        int [][] matrizB = {{1, 2}, {3}, {4, 5}};

        System.out.println("Mostra os valores da matrizA:");
        mostraMtz(matrizA);

        System.out.println("\nMostra os valores da matrizB:");
        mostraMtz(matrizB);

    } // fim main

    // método mostra mmatriz
    public static void mostraMtz(int[][] matriz) {
        // loop para linha
        for( int linha = 0; linha < matriz.length; linha++) {
            // loop para a coluna
            for( int coluna = 0; coluna < matriz[linha].length; coluna++) {
                // mostra o valor da matriz
                System.out.printf("%3d", matriz[linha][coluna]);
            } // fim for coluna
            System.out.println(); // pula uma linha
        } // fi for linha
    } // fim mostra matriz
    
} // fim classe