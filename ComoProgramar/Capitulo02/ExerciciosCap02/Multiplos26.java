import java.util.Scanner;

public class Multiplos26 {
    /*
     * 2.26 (Múltiplos) Escreva um aplicativo que leia dois inteiros,
     * além de determinar se o primeiro é um múltiplo do segundo e
     * imprimir o resultado. [Dica: utilize o operador de resto.]
     * Pedro, 12/12/2021
     */
    public static void main(String[] args) {

        // variável para Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um inteiro: ");
        int n1 = input.nextInt();
        System.out.print("Digite outro inteiro: ");
        int n2 = input.nextInt();

        // se n1 % n2 == 0 é multiplo
        if (n1 % n2 == 0)
            System.out.printf("%d%s%d%n", n1," è multiplo de ", n2 );
        if (n1 % n2 != 0)
            System.out.printf("%d%s%d%n", n1, " não è multiplo de ", n2 );
    } // fim man
} // fim classe
