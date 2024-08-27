import java.security.SecureRandom;
import java.util.Scanner;

public class PesquisaLinear02 {
    /**
     * Elaborar um programa que leia dez nomes e 
     * apresente pelo método de pesquisa sequencial 
     * os nomes que porventura estejam armazenados na 
     * matriz e que coincidam com o nome de entrada 
     * de pesquisa. Além de apresentar o nome, o 
     * programa deve indicar em que posição da matriz 
     * ele está armazenado. Caso o nome pesquisado 
     * não seja encontrado, deve informar que o nome 
     * pesquisado não foi localizado.
     * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
     * OLIVEIRA. Algoritmos (Portuguese Edition) 
     * (p. 339). Editora Saraiva. Edição do Kindle. 
     */
    public static void main(String[] args) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor a pesquisar:");
        // variável
        int chave = input.nextInt();
        int elemento;

        // vetor
        int[] vetor = new int[10];

        System.out.println("\nVetor original:");
        adicionar(vetor);
        mostrar(vetor);

        System.out.println("\nVetor em ordem:");
        ordenar(vetor);
        mostrar(vetor);

        elemento = pesquisar(vetor, chave);

        if(elemento == -1)
            System.out.printf("%n%3d não encontrado%n", chave);
        else
            System.out.printf("%n%3d encontrado na posicao %d%n", chave, elemento);

    } // fim main

    public static void adicionar(int[] vetor) {
        SecureRandom aleatorio = new SecureRandom();
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = 1 + aleatorio.nextInt(20);
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

    public static int pesquisar(int[] vetor, int chave) {
        for(int i = 0; i < vetor.length; i++) {
            
            if(vetor[i] == chave) {
                return i + 1;
            } // fim if
        } // fim for
            
        return -1;
    } // fim pesqiosar

} // fim classe