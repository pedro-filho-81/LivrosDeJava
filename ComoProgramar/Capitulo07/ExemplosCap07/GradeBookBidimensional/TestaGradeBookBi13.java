import java.security.SecureRandom;

public class TestaGradeBookBi13 {
    public static void main(String[] args) {
        
        // constantes
        final int LINHA = 10;
        final int COLUNA = 3;

        // matriz
        int[][] matrizNotas = new int[LINHA][COLUNA];

        //cnama adicionar
        adicionar(matrizNotas, LINHA, COLUNA);

        // cria objeto grade book
        GradeBook12 meuGardeBook = new GradeBook12("Como Programa Java8", matrizNotas);

        System.out.printf("\nBem vindo ao curso: %s%n", meuGardeBook.getNomeDoCurso());
        
        meuGardeBook.processaNotas();

    } // fim main

    public static void adicionar(int[][] matriz, int linha, int coluna) {
        // objeto secure random
        SecureRandom aleatorio = new SecureRandom();

        for( int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                matriz[i][j] = 1 + aleatorio.nextInt(100);
            } // fimm for j
        } // fim for i
    } // fimm adicionar    

} // fim classe
