public class DeclaraCriaInicializa1 {
    /**
     * 1.4.1 Escreva um programa que declare, crie e inicialize um array a[] 
     * de comprimento 1000 e acesse a[1000]. Seu programa compila? 
     * O que acontece quando você o executa?
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 118). 
     * Pearson Educação. Edição do Kindle.
     * Pedro, 08/04/2022
     */
    public static void main(String[] args) {
        
        // declara e cria um vetor
        double[] vetor = new double[1000];

        // loop for para inicializar o vetor com 1000 elementos
        for( int i = 0; i < 1000; i++ ) {

            // inicializa o vetor com mil elementos
            vetor[i] = Math.random() * 2;
        } // fim for inicializa

        // mostra o valor do elemento 1000 do vetor
        System.out.printf("O valor do vetor[1000] = %5.2f%n", vetor[1000 - 1]);
    } // fim main
} // fim classe