import java.security.SecureRandom;
import java.util.Scanner;

public class PesquisaBinaria03 {
    /**
     * 26/04/2022
     */
    public static void main(String[] args) {

        // constante
        final int TAMANHO = 20;
        // vetor
        int[] vetor = new int[TAMANHO];

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor a pesquisar:");
        // variável
        int chave = input.nextInt();
        int elemento;

        System.out.println("\nVetor original:");
        // ADICIONA valor ao vetor
        adicionar(vetor);
        // mostrar valor
        mostrar(vetor);

        System.out.println("\nVetor em ordem:");
        // ADICIONA valor ao vetor
        adicionar(vetor);
        // coloca em ordem
        ordenar(vetor);
        // mostrar valor
        mostrar(vetor);

        System.out.println("\nPesquisa no vetor:");
        // pesquisar no vetor
        elemento = pesquisaBinaria(vetor, chave, 0, TAMANHO);

        if (elemento == -1) {
            System.out.printf("%n%3d nao encontrado.%n", chave);
        } // fim if
        else {
            System.out.printf("%n%3d encontrado na posicao %d%n", chave, elemento);
        } // fi else

        System.out.println(); // pula linha

    } // fim main

    public static void adicionar(int[] vetor) {
        SecureRandom aleatorio = new SecureRandom();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 1 + aleatorio.nextInt(10);
        } // fim for
    } // fim adicionar

    public static void mostrar(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%3d", vetor[i]);
        } // fim for
    } // fim mostrar

    public static void ordenar(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] < vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                } // fim if
            } // fim for j
        } // fim for i
    } // fim método

    // Método para pesquisa binária
    public static int pesquisaBinaria(int[] vetor, int chave, int inicio, int fim) {

        // variável
        int meio;

        // enquanto o inicio menor ou igual ao fim faça
        while (inicio <= fim) {

            //  meio recebe a soma de inicio e fim dividido por 2
            meio = (inicio + fim) / 2;

            // se a chave for igual ao valor do vetor meio
            if (chave == vetor[meio]) {
                // retorne o valor meio
                // retorne a posição onde a chave (valor pesquisado) foi encontrada
                return meio;
            } // fim meio
              // se não, se a chave menor que o valor do vetor meio
            else if (chave < vetor[meio]) {
                // fim recebe o valor meio menos 1
                fim = meio - 1;
            } // fim alto
              // se não
            else {
                // inicio recebe meio mais u
                inicio = meio + 1;
            } // fim baixo

        } // fim while

        // se não encontrar o valor da chave retorne mmenos u
        return -1;

    } // fim pesquisa binária
} // fim classe