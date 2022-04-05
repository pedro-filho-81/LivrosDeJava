import java.util.Scanner;

public class NumeroPrimo7 {
    /**
     * n | argumento
     * isPrime[i] | eu sou primo?
     * primos | contador principal
     * Este programa recebe um argumento de linha de comando inteiro n
     * e calcula o número de primos menor ou igual a n. Para fazer isso,
     * ele calcula um array booleano com isPrime[i] definido como true
     * se i for primo e como false caso contrário. Primeiro,
     * ele define como verdadeiros todos os elementos da matriz para indicar
     * que nenhum número é inicialmente conhecido como não primo.
     * Em seguida, ele define como falsos elementos de matriz correspondentes
     * a índices que são conhecidos como não primos (múltiplos de primos
     * conhecidos).
     * Se a[i] ainda for verdadeiro após todos os múltiplos de primos menores terem
     * sido definidos como falsos, então sabemos que i é primo.
     * O teste de terminação no segundo laço for é i <= n/i em vez do ingênuo i <= n
     * porque qualquer número sem fator menor que n/i não tem fator maior que n/i,
     * então não precisamos olhar para tais fatores. Esta melhoria torna possível
     * executar o programa para n grandes.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pp. 104-105).
     * Pearson Educação. Edição do Kindle.
     * 05/04/2022
     */
    public static void main(String[] args) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = input.nextInt();

        // declara e cria um vetor
        boolean[] nummeroPrimo = new boolean[tamanho + 1];

        // loop para inicializar o vetor
        for (int i = 2; i <= tamanho; i++) {
            // inicializa o vetor como verdadeiro
            nummeroPrimo[i] = true;
        } // fim for

        System.out.print("Vetor = ");
        // loop para mostrar vetor
        for (int i = 2; i <= tamanho; i++) {
            // imprima
            System.out.printf("%7b", nummeroPrimo[i]);
        } // fim for
        System.out.println();

        // loop for para a repetição
        for (int i = 2; i <= tamanho / i; i++) {

            // verifica se é primo
            if (nummeroPrimo[i]) {

                // loop for para fatoração
                for (int fator = i; fator <= tamanho / i; fator++) {

                    // número primo recebe falso quando for primo
                    nummeroPrimo[i * fator] = false;
                } // fim for

            } // fim if
        } // fim for

        // conta os valores primos no vetor
        int primos = 0;

        // imprima
        System.out.println("Numeros primos ate " + tamanho);

        // loop para verificar o vetor de números primos
        for (int i = 2; i <= tamanho; i++) {

            // verifica se os números são primos
            if (nummeroPrimo[i]) {

                // imprima
                System.out.printf("%3d", i);

                // soma um se tiver números primos
                primos++;

                // quando o contador primos for multiplo de 5
                if (primos % 5 == 0)

                    // pule uma linha
                    System.out.println();

            } // fim if

        } // fim for primos

        // mostra a quantidade de números primos
        System.out.printf("%nDos %d numeros %3d são primos.%n", tamanho, primos);

    } // fim main
} // fim classe