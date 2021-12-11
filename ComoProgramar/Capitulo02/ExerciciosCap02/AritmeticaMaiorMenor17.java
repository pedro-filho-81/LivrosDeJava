import java.util.Scanner;

public class AritmeticaMaiorMenor17 {
    /*
     * 2.17 (Aritmética, menor e maior) Escreva um aplicativo que insira três
     * inteiros digitados pelo usuário e exiba a soma, média, produto e os
     * números menores e maiores. Utilize as técnicas mostradas na Figura 2.15.
     * [Observação: o cálculo da média neste exercício deve resultar
     * em uma representação de inteiro. Assim, se a soma dos valores for 7,
     * a média deverá ser 2, não 2,3333...]
     * Pedro, 11/12/2021
     */
    public static void main(String[] args) {

        try (// variável input para Scanner
        Scanner input = new Scanner(System.in)) {
            // entrada de dados
            System.out.print("Digite o primeiro inteiro: ");
            int x = input.nextInt();
            System.out.print("Segundo inteiro: ");
            int y = input.nextInt();
            System.out.print("Terceiro inteiro: ");
            int z = input.nextInt();

            // variáveis
            int maior = x;
            int menor = x;

            // condição
            if( y > maior )
                maior = y;

            if( z > maior )
                maior = z;
            
            if( y < menor )
                menor = y;

            if( z < menor )
                menor = z;

            // mostra resultado
            System.out.println("\nCOMPARANDO NÚMEROS");
            System.out.printf("%s\t\t%d%n", "Soma = ", x + y + z);
            System.out.printf("%s\t%d%n", "Média = ", (x + y + z) / 3 );
            System.out.printf("%s\t%d%n", "Produto = ", x * y * z);
            System.out.printf("%s\t%d%n", "Maior = ", maior );
            System.out.printf("%s\t%d%n", "Menor = ", menor );
        }
    } // fim main
} // fom classe
