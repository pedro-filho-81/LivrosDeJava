package Capitulo08.Matriz.Exercicios;
import java.security.SecureRandom;

public class ParImparDaMatriz17 {
    /**
     * p)Elaborar um programa que leia uma matriz A de duas 
     * dimensões com dez linhas e sete colunas. Ao final, 
     * apresentar o total de elementos pares e ímpares existentes 
     * na matriz. Apresentar também o percentual de elementos 
     * pares e ímpares em relação ao total de elementos da matriz. 
     * Supondo a existência de 20 elementos pares e 50 elementos 
     * ímpares, haveria 28,6% de elementos pares e 71,4% de elementos 
     * ímpares. 
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 405). 
     * Editora Saraiva. Edição do Kindle.
     * Pedro, 07/05/2022 
     */ 
    public static void main(String[] args) {

        // constante
        final int LINHA = 10;
        final int COLUNA = 7;

        // matriz
        int[][] matrizA = new int[LINHA][COLUNA];

        // adicionar
        adicionar(matrizA, LINHA, COLUNA);
        
        // mostrar matriz
        System.out.println("\nMatrizA:");
        mostrarMtrz(matrizA, LINHA, COLUNA);
        somaParImpar(matrizA, LINHA, COLUNA);
        
    } // fim main

    // adicionar
    public static void adicionar(int[][] matriz, int linha, int coluna) {

        SecureRandom aleatorio = new SecureRandom();

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = 1 + aleatorio.nextInt(50) / 3;
            } // fim for j
        } // fim for i

    } // fim adicionar

    // adicionar matriz a para b
    public static void somaParImpar(int[][] matriz, int linha, int coluna) {

        int somaPar = 0;
        int contaPar = 0;
        int somaImpar = 0;
        int contaImpar = 0;

        System.out.print("\nSoma dos numeros pares e impares: ");
        // loop para sommar as linhas da matriz
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                
                if(matriz[i][j] % 2 == 0) { 
                    somaPar += matriz[i][j];
                    contaPar++;
                } // fim if
                else { 
                    somaImpar += matriz[i][j];
                    contaImpar++;
                } // fim else
            } // fi j
        } // fim for i

        /*
            100 = 70
            x = par
        */

        // calcular
        double percenPar = (double) contaPar * (linha * coluna) / 100;
        double percenImpar = (double) contaImpar * (linha * coluna) / 100;

        System.out.printf("\nA matriz tem %d elementos", linha * coluna);
        System.out.printf("\nSoma dos pares = %d\n", somaPar);
        System.out.printf("Soma dos impares = %d\n", somaImpar);
        System.out.printf("Sendo %d pares e ", contaPar);
        System.out.printf("%d impares\n", contaImpar);
        System.out.printf("Dos %d elementos %.1f%% sao pares e ", linha * coluna, percenPar);
        System.out.printf(" %.1f%% sao impares\n", percenImpar);
    } // fimm adicionar matriz a para b

    // mostrar matriz
    public static void mostrarMtrz(int[][] matriz, int linha, int coluna) {

        // 11 espaços em branco para a coluna
        System.out.print("            ");
        
        // loop para imprimir os núeros das colunar
        for (int a = 0; a < coluna; a++) {
            // mostra os númmeros das colunas
            System.out.printf("%7d", a + 1);
        } // fim loop
        
        // pula uma linha
        System.out.println("");

        System.out.print("            "); // 11 espaços
        for (int a = 0; a < coluna; a++) { // loop
            System.out.printf("%7s", "*"); // imprime asterisco
        } // fim loop
        System.out.println(); // pula linha

        // loop para a linha
        for (int i = 0; i < linha; i++) {
            // mostra a índice da linha
            System.out.printf("linha %2d -> ", i + 1);
            
            // loop para a coluna
            for (int j = 0; j < coluna; j++) {
                // mostra o valor da coluna na matriz
                System.out.printf("%7d", matriz[i][j]);
            } // fim for j
            
            // pula linha
            System.out.println();
        
        } // fimm for i
    } // fim mostrar matriz

} // fim classe