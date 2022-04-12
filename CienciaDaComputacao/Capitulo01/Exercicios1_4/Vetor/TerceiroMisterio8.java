package Vetor;

public class TerceiroMisterio8 {
    /**
     * 1.4.8 Quais valores o código a seguir coloca no array
     * uma[]? int n = 10;
     * int[] a = new int[n];
     * a[0] = 1;
     * a[1] = 1;
     * for (int i = 2; i < n; i++)
     * a[i] = a[i-1] + a[i-2];
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pp. 118-119).
     * Pearson Educação. Edição do Kindle.
     * Pedro, 12/04/2022
     */
    public static void main(String[] args) {

        // tamanho do vetor
        int n = 10;
        // declara e cria o vetor
        int[] a = new int[n];
        // atribui 1 a posição zero do vetor
        a[0] = 1;
        // atribui 1 a posição 1 do vetor
        a[1] = 1;
        // loop para atribuir valores ao vetor
        for (int i = 2; i < n; i++)
            // fibonacci
            // atribui os 10 valores de Fibonacci ao vetor
            a[i] = a[i - 1] + a[i - 2];
        
        // chama o método mostrar
        mostrar(a);

    } // fim main
    
    // método mostrar
    public static void mostrar(int[] vetor) {
        // loop pra mostrar valores
        for (int i = 0; i < vetor.length; i++)
            // mostra os valores do vetor
            System.out.printf("%3d", vetor[i]);
    } // fim método mostrar

} // fim classe