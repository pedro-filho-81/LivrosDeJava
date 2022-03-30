import java.util.Scanner;

public class NumeroPrimo10 {
    public static void main(String[] args) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um inteiro para ver se é primo:");
        int numero = input.nextInt();

        // variável
        int fator;

        // loop for para fatoração
        for (fator = 2; fator * fator <= numero; fator++) {

            // se o número for multiplo do fator então
            if (numero % fator == 0) {
                // imprima
                System.out.printf("%d Não é número primo.%n", numero);
                break; // sai do loop for
            } // fim if

        } // fim for

        // se fator maior que a divisão do número pelo fator
        if(fator > numero / fator)
            // imprima
            System.out.printf("%d É número primo.%n", numero);

    } // fim main
}// fim classe
