package Matriz;

public class MultiplicaMatrizes18 {
    /**
     * 1.4.18 Escreva um fragmento de código para multiplicar duas matrizes 
     * retangulares que não são necessariamente quadradas. Nota: Para que 
     * o produto escalar fique bem definido, o número de colunas da primeira 
     * matriz deve ser igual ao número de linhas da segunda matriz. 
     * Imprima uma mensagem de erro se as dimensões não atenderem a essa condição.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 120). 
     * Pearson Educação. Edição do Kindle.
     * Pedro, 19/04/2022
     */
    public static void main(String[] args) {
        
        // constantes
        final int LINHA = 5;
        final int COLUNA = 3;

        // matrizes
        int[][] matrizA = new int[LINHA][COLUNA];
        int[][] matrizB = new int[COLUNA][LINHA];
        int[][] matrizC = new int[LINHA][COLUNA];

        //MATRIZ A
        // adiciona valores a matriz a
        adicionar(matrizA, LINHA, COLUNA);
        // imprime
        System.out.println("Matriz A:");
        // chama mostrar
        mostrar(matrizA, LINHA, COLUNA);
        
        //MATRIZ B
        // adiciona valores a matriz a
        adicionar(matrizB, COLUNA, LINHA);
        // imprime
        System.out.println("Matriz B:");
        // chama mostrar
        mostrar(matrizB, COLUNA, LINHA);

        // MATRIZ C
        // adiciona valores
        adicionaMultiplicar(matrizA, matrizB, matrizC, LINHA, COLUNA);
        // cabeçalho
        System.out.println("Matriz C:");
        // imprime
        mostrar(matrizC, LINHA, COLUNA);

    } // fim main

    // adiciona valores
    public static void adicionar(int[][] matriz, int linha, int coluna) {

        for( int i = 0; i < linha; i++) {
            for(int j =0; j < coluna; j++) {
                matriz[i][j] = 1 + (int) Math.random() * i + j;
            } // fim for j
        } // fim for i

    } // fim adicionar

    // adiciona valores
    public static void adicionaMultiplicar(int[][] matrizA, int[][] matrizB, int[][] matrizC, int linha, int coluna) {

        for( int i = 0; i < linha; i++) {
            for(int j =0; j < coluna; j++) {
                matrizC[i][j] = matrizA[i][j] * matrizB[j][i];
            } // fim for j
        } // fim for i

    } // fim adicionar
        
    // mostrar valores
    public static void mostrar(int[][] matriz, int linha, int coluna) {

        for( int i = 0; i < linha; i++) {
            for(int j =0; j < coluna; j++) {
                System.out.printf("%3d", matriz[i][j]);
            } // fim for j
            System.out.println();
        } // fim for i

    } // fim mostrar

} // fim classe