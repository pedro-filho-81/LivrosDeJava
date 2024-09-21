package Exercicios1_3;
 
import java.util.Scanner;

public class TabuleiroDeDamas29 {
    /**
     * Tabuleiro de damas
     * 1.3.29 Escreva um programa Checkerboard que receba um argumento
     * de linha de comando inteiro n e use um loop aninhado dentro de
     * um loop para imprimir um padrão quadridimensional n por n com
     * espaços e asteriscos alternados.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 85).
     * Pearson Educação. Edição do Kindle.
     * 
     * @author Pedro, 31/03/2022
     */
    public static void main(String[] args) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.println("Tabuleiro de damas.");
        System.out.print("Digite o tamanho do tabuleiro: ");
        int valor = input.nextInt();

        for (int i = 0; i < valor; i++) {
            // imprime 2 espaços
            System.out.print(" ");
            // loop for para o asterisco
            for (int j = 0; j < valor; j++) {
                // imprime o asterisco
                System.out.print("* ");
            } // fim for interno
              // pula uma linha
            System.out.println();
        } // fim for externo
    } // fim main
} // fim classe