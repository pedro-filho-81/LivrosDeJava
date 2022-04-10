package Vetor;

public class DistanciaEuclidiana3 {
    /**
     * 1.4.3 Dados dois vetores de comprimento n que são representados 
     * com arrays unidimensionais, escreva um fragmento de código que 
     * calcule a distância euclidiana entre eles (a raiz quadrada das 
     * somas dos quadrados das diferenças entre os elementos correspondentes).
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 118). 
     * Pearson Educação. Edição do Kindle.
     * Pedro, 08/04/2022
     */
    public static void main(String[] args) {
        
        // cabeçalho
        System.out.println("\nVetor x1:");
        // vetores
        double[] x1 = {1.5, 2.4, 3.3, 4.2, 5.1};
        // mostra os valores
        mostrar(x1, x1.length);

        // cabeçalho
        System.out.println("\nVetor x2:");
        // vetor
        double[] x2 = {3.1, 4.2, 5.3, 6.4, 7.5};
        // imprime
        mostrar(x2, x2.length);

        // vetor
        double[] soma = new double[x1.length];

        // loop for para calcular a distância
        for( int i = 0; i < x1.length; i++) {
            // calcula a distância de x1 e x2
            double distancia = Math.sqrt(Math.pow(x2[i], 2) - Math.pow(x1[i], 2));
            // vetor soma recebe o valor da distância
            soma[i] = distancia;
        } // fim for

        System.out.println("\nsoma:");
        mostrar(soma, soma.length);

    } // fim main

    // método mostrar valor
    public static void mostrar( double[] vetor, int tamanho ) {
        // loop para mostrar os valores do vetor
        for(int i = 0; i < tamanho; i++) {
            System.out.printf("%f   ", vetor[i]);
        } // fim for
    } // fim mostrar

} // fim classe