import java.util.Scanner;

public class Fibonacci29 {

    /**
     * 7.29 (Série de Fibonacci) A série de Fibonacci
     * 0, 1, 1, 2, 3, 5, 8, 13, 21,inicia-se com os termos 0 e 1 e tem
     * a propriedade de que cada termo sucessivo é a soma dos dois termos
     * precedentes.
     * a) Escreva um método fibonacci(n) que calcule o enésimo número de Fibonacci.
     * Incorpore esse método a um aplicativo que permita ao usuário inserir o valor
     * de n.
     * b) Determine o maior número de Fibonacci que pode ser exibido em seu sistema.
     * c) Modifique o aplicativo que você escreveu na parte (a) para utilizar double
     * em vez
     * de int para calcular e retornar números de Fibonacci e utilizar esse
     * aplicativo
     * modificado para repetir a parte (b)
     * Pedro, 03/07/2022
     */
    public static void main(String[] args) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite o valor de n: ");
        int valor = input.nextInt();
        fibonacci(valor);

    } // final principal

    // fibonacci
    public static void fibonacci(int valor) {

        // variáveis
        int a = 0;
        int b = 1;
        int c = a + b;

        // loop para calcular fibonacci
        while (a <= valor) {

            // exibir
            System.out.printf("%d\n", a);
            a = b;
            b = c;
            c = a + b;

        } // fi for

    } // final fibonacci

} // final da classe