package Exemplos1_3;

import java.util.Scanner;

public class CobraTaxaDeImposto09 {
    public static void main(String[] args) {

        // cria objeto input e inicializa da classe Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um inteiro: ");
        int income = input.nextInt();

        // variável
        double rate = 0.0;

        // condições
        if (income < 0)
            rate = 0.00;
        else if (income < 8925)
            rate = 0.10;
        else if (income < 36250)
            rate = 0.15;
        else if (income < 87850)
            rate = 0.23;
        else if (income < 183250)
            rate = 0.28;
        else if (income < 398350)
            rate = 0.33;
        else if (income < 400000)
            rate = 0.35;
        else
            rate = 0.396;

        // imprime o resultado
        System.out.println("Aliquota cobrada para quem ganha " + 
                            income + " é de " + rate + "%");

    } // fim main
} // fim classe
