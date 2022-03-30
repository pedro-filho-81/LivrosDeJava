import java.util.Scanner;

public class Fatoracao9 {
    /**
     * | parte não fatorada
     * fator | fator potencial
     * Este programa recebe um inteiro positivo n como argumento
     * de linha de comando e imprime a fatoração primária de n.
     * O código é simples, mas é preciso pensar um pouco para se
     * convencer de que está correto (veja o texto).
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 73).
     * Pearson Educação. Edição do Kindle.
     */
    public static void main(String[] args) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entreda de dados
        System.out.print("Digite um inteiro para fatorar: ");
        int numero = input.nextInt();

        // variável
        long fator;

        // loop for para fatoração
        for (fator = 2; fator * fator <= numero; fator++) {

            // enquanto número multiplo de fator faça
            while (numero % fator == 0) {

                // imprima o fator
                System.out.printf("%d ", fator);

                // número dividido pelo fator
                numero /= fator;

            } // fim while

        } // fim for

        // se número maior que 1 então
        if (numero > 1 && fator > 0)

            // imprima o número
            System.out.println(numero);

        // se não
        else

            // pule uma linha
            System.out.println();

    }// fim main
} // fim classe