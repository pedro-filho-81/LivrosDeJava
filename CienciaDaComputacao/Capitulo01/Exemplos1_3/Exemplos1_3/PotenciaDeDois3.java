import java.util.Scanner;

public class PotenciaDeDois3 {
    /**
     * PowersOfTwo (PROGRAM 1.3.3) usa um loop while para imprimir
     * uma tabela de potências de 2. Além do contador de controle
     * de loop i, ele mantém uma variável power que mantém as potências
     * de 2 à medida que as calcula. O corpo do loop contém três instruções:
     * uma para imprimir a potência atual de 2, uma para calcular a próxima
     * (multiplicar a atual por 2) e uma para incrementar o contador de
     * controle do loop.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 56).
     * Pearson Educação. Edição do Kindle.
     */
    public static void main(String[] args) {
        // cria o objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um inteiro: ");
        int valor = input.nextInt(); // usuário

        // variáveis
        int potencia = 1;
        int contador = 0;

        // loop enquanto contador menor ou igual ao valor faça
        while (contador <= valor) {

            // imprima
            System.out.printf("%3d   %d%n", contador, potencia);

            // calcular
            potencia *= 2; // potência vezes dois

            // cincrementa o contador
            contador++;

        } // fim while
    } // fim main
} // fim classe
