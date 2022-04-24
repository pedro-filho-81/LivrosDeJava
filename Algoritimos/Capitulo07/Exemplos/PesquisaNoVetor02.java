import java.security.SecureRandom;
import java.util.Scanner;

public class PesquisaNoVetor02 {
    /**
     * 
     */
    public static void main(String[] args) {
        
        // variável
        int chave;

        // vetor
        int[] vetor = new int[10];

        System.out.println("\nVetor original:");
        adicionar(vetor);
        mostrar(vetor);

        System.out.println("\nVetor em ordem:");
        ordenar(vetor);
        mostrar(vetor);

        pesquisar(vetor, 25);

    } // fim main

    public static void adicionar(int[] vetor) {
        SecureRandom aleatorio = new SecureRandom();
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = 1 + aleatorio.nextInt(50);
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

    public static void pesquisar(int[] vetor, int chave) {
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] == chave) {
                System.out.printf("\n%3d encontrado na posição %3d\n", chave, i + 1);
                break;
            } // fim if
            else { 
                System.out.printf("\n%3d não encontrado no vetor\n", chave);
                break;
            } // fim else

        } // fim for
    } // fim pesqiosar

} // fim classe