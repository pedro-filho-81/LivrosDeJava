public class VetorParaVetorB {
    /**
     * Desenvolver um programa que leia dez elementos numéricos reais de
     * uma matriz A do tipo vetor. Construir uma matriz B de mesmo tipo,
     * observando a seguinte lei de formação: se o valor do índice da matriz A for
     * par, o valor deve ser multiplicado por 5; sendo ímpar, deve ser somado com 5.
     * Ao final, mostrar o conteúdo da matriz A e B.8.4
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 302).
     * Editora Saraiva. Edição do Kindle.
     * 20/04/2022
     */
    public static void main(String[] args) {

        // vetor A
        double[] vetorA = { 1.5, 7.9, 8.0, 9.2, 3.5, 6.0, 2.0, 4.0 };
        double[] vetorB = new double[vetorA.length];

        // loop para adicionar valores ao vetor B
        for(int i = 0; i < vetorA.length; i++) {
            // condição
            if(vetorA[i] % 2.0 == 0.0) {
                vetorB[i] = vetorA[i] * 5.5;
            }
            else {
                vetorB[i] = vetorA[i] + 5.5;
            }
        } // fim for

        System.out.println("VetorA:");
        mostrar(vetorA);
        System.out.println();

        System.out.println("VetorB:");
        mostrar(vetorB);
        System.out.println();

    } // fim main

    public static void mostrar(double[] vetor) {
        System.out.print("{");
        for(int i = 0; i < vetor.length; i++ ) {
            System.out.printf("%7.1f", vetor[i]);
        } // fim for
        System.out.println("  };");
    } // fim mostrar

} // fim classe