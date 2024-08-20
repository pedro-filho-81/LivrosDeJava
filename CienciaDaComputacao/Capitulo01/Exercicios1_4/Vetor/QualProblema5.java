package Vetor;

public class QualProblema5 {
    /**
     * 1.4.5 O que há de errado com o seguinte fragmento de código?
     * int[] a;
     * for (int i = 0; i < 10; i++)
     * a[i] = i*i;
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 118).
     * Pearson Educação. Edição do Kindle.
     * Pedro, 11/04/2022
     */
    public static void main(String[] args) {

        // declara o vetor
        int[] vetor;
        // cria o vetor
        vetor = new int[10];
        System.out.println("Um vetor (int[] vetor;) ele foi declarado, \nmas não foi criado, falta informar \no tamanho (vetor = new int[10]) \n10 é o tamanho do vetor, \ndepois pode ser inicializado.");
        // loop para inicializar o vetor
        for (int i = 0; i < 10; i++) {
            // inicializa o vetor
            vetor[i] = i * i;
        } // fim if
        
        System.out.print("Vetor = {");
        // loop para mostrar o vetor
        for (int i = 0; i < 10; i++) {
            // mostra
            System.out.printf("%3d", vetor[i]);
        } // fim if
        System.out.print(" }");

    } // fim main
} // fim classe