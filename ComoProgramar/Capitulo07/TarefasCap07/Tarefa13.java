public class Tarefa13 {
    /**
     * 7.13 Rotule os elementos do array bidimensional três por cinco sales 
     * para indicar a ordem em que eles são configurados como zero pelo 
     * seguinte segmento de programa:
     * for (int row = 0; row < sales.length; row++) 
     * {
     *  for (int col = 0; col < sales[row].length; col++) 
     *  { 
     *  sales[row][col] = 0; 
     *  } 
     * }
     * Pedro,23/05/2022
     */
    public static void main(String[] args) {
        
        // constantes
        int LINHA = 3;
        int COLUNA = 5;

        //declara e cria matriz
        int[][] sales = new int[LINHA][COLUNA];

        // LOOP para linha
        for(int i = 0; i < sales.length; i++) {
            for(int j = 0; j < sales[i].length; j++) {
                sales[i][j] = 0;
            }
        }

        for(int i = 0; i < sales.length; i++) {
            for(int j = 0; j < sales[i].length; j++) {
                System.out.printf("%3d", sales[i][j]);
            }
            System.out.println();
        }

    }    
}