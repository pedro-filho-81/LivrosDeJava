public class MatrizIrregular6 {
    public static void main(String[] args) {

        // matriz
        int[][] matriz = { 
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12},
            {13, 14, 15, 16, 17, 18}
        };

        for( int i = 0; i < matriz.length; i++) {
            for( int j = 0; j < matriz[i].length; j++)
                System.out.printf("%3d", matriz[i][j]);
            
            System.out.println();
        } // fim for
    } // fim main
} // fim classe