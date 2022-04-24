public class SomaElementosVetor2 {
    /**
     * Desenvolver um programa que leia cinco elementos numéricos inteiros 
     * de uma matriz A do tipo vetor. No final, apresentar o total da soma 
     * de todos os elementos da matriz A que sejam ímpares.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 303). 
     * Editora Saraiva. Edição do Kindle.
     * 21/04/2022 
     */
    public static void main(String[] args) {
        
        // vetor
        int[] vetor = {1, 2, 5, 4, 3, 6, 8, 7, 10, 9};

        // variável
        int soma = 0;

        // loop para somar valores
        for(int i = 0; i < vetor.length; i++) {
            // se vetor diferente de zero
            if( vetor[i] % 2 != 0) { 
                // soma os valores
                soma += vetor[i];
                System.out.println(vetor[i]);
            }
        } // fim for

        // loop para mostrar os valores
        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("%5d", vetor[i]);
        } // fim for mostrar

        // imprime soma
        System.out.printf("\nSoma = %3d%n", soma);

    } // fim main
} // fim classe