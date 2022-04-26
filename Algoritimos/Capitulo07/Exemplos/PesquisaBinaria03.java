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
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = 1 + aleatorio.nextInt(10);
        } // fim for
    } // fim adicionar

    public static void mostrar(int[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("%3d", vetor[i]);
        } // fim for
    } // fim mostrar

    public static void ordenar(int[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            for(int j = 0; j < vetor.length; j++) {
                if(vetor[i] < vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                } // fim if
            } // fim for j
        } // fim for i
    } // fim método

    public static int pesquisaBinaria(int[] vetor, int chave, int baixo, int alto) {

        int meio;

        while (baixo <= alto) {
            meio = (baixo + alto) / 2;

            if (chave == vetor[meio]) {
                return meio;
            } // fim meio
            else if (chave < vetor[meio]) {
                alto = meio - 1;
            } // fim alto
            else {
                baixo = meio + 1;
            } // fim baixo

        } // fim while

        return -1;
    } // fim pesquisa binária
} // fim classe