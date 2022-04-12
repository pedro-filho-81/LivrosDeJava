package Vetor;

public class QuartoMisterio9 {
    /**
     * 1.4.9 O que o fragmento de código a seguir imprime?
     * int[] a = { 1, 2, 3 };
     * int[] b = { 1, 2, 3 };
     * System.out.println(a == b);
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 119). 
     * Pearson Educação. Edição do Kindle.
     * Pedro, 12/04/2022
     */
    public static void main(String[] args) {

        // declara, cria e inicializa os vetores
        int[] a = { 1, 2, 3 };
        // mostra vetor a
        mostrar(a);
        System.out.println();

        int[] b = { 1, 2, 3 };
        mostrar(b);
        System.out.println();

        // imprime falso 
        // na comparação dos vetores
        System.out.println(b == a);
    } // fim main
    
    // método mostrar
    public static void mostrar(int[] vetor) {
        // loop pra mostrar valores
        for (int i = 0; i < vetor.length; i++)
            // mostra os valores do vetor
            System.out.printf("%3d", vetor[i]);
    } // fim método mostrar

} // fim classe
