package Vetor;
public class MostraTamanhoDoVetor2 {
    /**
     * 1.4.2 Descreva e explique o que acontece quando você tenta 
     * compilar um programa com a seguinte declaração:
     * int n = 1000;
     * int[] a = new int[n*n*n*n];
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 118). 
     * Pearson Educação. Edição do Kindle.
     * Pedro, 08/04/2022
     */
    public static void main(String[] args) {
        
        // variável
        int tamanho = 100;

        // declara e cria um vetor
        int[] vetor = new int[tamanho * tamanho * tamanho * tamanho];

        // mostra o tamanho do vetor usando vetor.length
        System.out.printf("O tamanho do vetor = %2d%n", vetor.length);
    } // fim main
} // fim classejavac