package Exemplos1_3;

import java.util.Scanner;

public class NomeDoDia17 {

    public static void main(String[] args) {

        // cria o objeto input da classe Scanner e inicializa
        Scanner entrada = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um número entre 0 e 6 inclusive: ");
        int dia = entrada.nextInt(); // entre com um dia da semana

        // seleciona um dia da semana
        switch (dia) {
            case 0:
                System.out.println("0 = Sunday");
                break;
            case 1:
                System.out.println("1 = Monday");
                break;
            case 2:
                System.out.println("2 = Tuesday");
                break;
            case 3:
                System.out.println("3 = Wednesday");
                break;
            case 4:
                System.out.println("4 = Thursday");
                break;
            case 5:
                System.out.println("5 = Friday");
                break;
            case 6:
                System.out.println("6 = Saturday");
                break;
            default:
                System.out.println("invalid day");
                break;
        } // fim switch
    } // fim main
} // fim classe
