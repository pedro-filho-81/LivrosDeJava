package Vetor;

public class SegundoMisterio7 {
    /**
     * 1.4.7 O que o fragmento de código a seguir imprime?
     * int[] a = new int[10];
     * for (int i = 0; i < 10; i++)
     * a[i] = 9 - i;
     * for (int i = 0; i < 10; i++)
     * a[i] = a[a[i]];
     * for (int i = 0; i < 10; i++)
     * System.out.println(a[i]);
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 118).
     * Pearson Educação. Edição do Kindle.
     * Pedro, 12/04/2022
     */
    public static void main(String[] args) {

        // declara e cria o vetor
        int[] a = new int[10];
        // cabeçalho
        System.out.println("a[i] = 9 - i;");
        // loop para adicionar valor ao vetor
        for (int i = 0; i < 10; i++)
            // vetor recebe 9 - i
            a[i] = 9 - i;
        // chama aa função mostrar
        mostrar(a);
        // pula linha
        System.out.println();

        // caveçalho
        System.out.println("a[i] = a[a[i]];");
        // loop para adicionar valor ao vetor
        for (int i = 0; i < 10; i++)
            // vetor recebe o valor do vetor
            a[i] = a[a[i]];
        // chama o método mostrar valores do vetor
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