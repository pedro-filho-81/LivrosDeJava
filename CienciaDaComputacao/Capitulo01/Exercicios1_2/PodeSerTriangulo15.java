
// biblioteca
import java.util.Scanner;

public class PodeSerTriangulo15 {
    /*
     * 1.2.15 Escreva um programa que recebe três inteiros positivos como
     * argumentos de linha de comando e imprime falso se qualquer um deles
     * for maior ou igual à soma dos outros dois e verdadeiro caso contrário.
     * (Nota: Este cálculo testa se os três números podem ser os comprimentos
     * dos lados de algum triângulo.)
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pp. 45-46).
     * Pearson Education. Edição do Kindle.
     * 
     * Nota: Para construir um triângulo é necessário que a medida de qualquer
     * um dos lados seja menor que a soma das medidas dos outros dois e maior
     * que o valor absoluto da diferença entre essas medidas.
     * Pedro, 28/11/2021
     */

    public static void main(String[] args) {

        // cria o objeto input da classe Scanner e inicializa
        Scanner input = new Scanner(System.in);

        System.out.println("\nPODE SER UM TRIÂNGULO?");

        // entrada de dados
        System.out.print("Digite um inteiro: ");
        int numero1 = input.nextInt();
        System.out.print("Digite outro inteiro: ");
        int numero2 = input.nextInt();
        System.out.print("Digite mais inteiro: ");
        int numero3 = input.nextInt();

        /*
         * Condição de existência de um triângulo
         * | b - c | < a < b + c
         * | a - c | < b < a + c
         * | a - b | < c < a + b
         */

        // Condição de existência de um triângulo
        boolean condicao = (numero2 - numero3) < numero1 && numero1 < (numero2 + numero3)
                && (numero1 - numero3) < numero2 && numero2 < (numero1 + numero3)
                && (numero1 - numero2) < numero3 && numero3 < (numero1 + numero2);

        // imprime resultado
        System.out.println(numero1 + ", " + numero2 + " e " + numero3 +
                " Pode ser um triângulo? " + condicao + "\n");

    } // fim main
} // fim classe
