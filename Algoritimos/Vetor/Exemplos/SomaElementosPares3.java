import java.util.Scanner;

public class SomaElementosPares3 {
    /**
     * Desenvolver um programa em que o usuário determine a quantidade de
     * valores numéricos inteiros a serem fornecidos para uma matriz A do
     * tipo vetor. No final, apresentar o total da soma de todos os elementos
     * da matriz A que sejam pares.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (pp. 307-308).
     * Editora Saraiva. Edição do Kindle.
     * 21/04/2022
     */
    public static void main(String[] args) {

        // variáveis
        int num, i, conta = 0, soma = 0;

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite o tamanho do vetor: ");
        num = input.nextInt();

        // vetor
        int[] vetor = new int[num];

        // loop para adicionar valor
        for (i = 0; i < num; i++) {
            // vetor recebe os valores de i
            vetor[i] = i;
            // verifica se valores maior que zero e multiplos de 2
            if (vetor[i] > 0 && vetor[i] % 2 == 0) { // se verdade
                // soma os valores
                soma += vetor[i];
                // conta quantos valores existem
                conta++;
            } // fim if
        } // fim for

        // cabeçalho
        System.out.println("\nVetor:");
        // loop para mostrar os valores do vetor
        for (int j = 0; j < vetor.length; j++) {
            // mostra os valores
            System.out.printf("%5d", vetor[j]);
        } // fim mostrar

        // imprime resumo
        System.out.printf("\nForam adicionados %d numeros.\n", num);
        System.out.printf("Sendo %d numeros pares.", conta);
        System.out.printf("\nSoma dos pares = %d%n", soma);
    } // fim main
} // fim classe