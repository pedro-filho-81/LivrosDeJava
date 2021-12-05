package Exemplos1_4;

import java.util.Scanner;

public class NumeroPrimo09 {
    public static void main(String[] args) {

        // declara variável entrada para a classe Scanner e iniializa
        Scanner entrada = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite o número para saber se é primo: ");
        double numero = entrada.nextDouble();

        // declara e inicializa a variável como verdadeiro
        boolean isPrime = true;

        // se o número for menor que 2
        if (numero < 2)
            // variável recebe falso
            isPrime = false;

        // entrada de dados
        System.out.println("Se número % factor igual a zero.");

        // tente todos os fatores possíveis de n
        // se n tem um fator, então tem um menor ou igual a sqrt (n),
        // então, para eficiência, só precisamos verificar o fator <= sqrt (n) ou
        // fator equivalente * fator <= n
        for (long factor = 2; factor * factor <= numero; factor++) {

            // mostra o cálculo
            System.out.println( numero + " % " + factor + " = " + numero % factor); // imprima

            // verifica se o número digitado é multiplo do fator
            if (numero % factor == 0) { // se verdade
                // variável recebe valor falso
                isPrime = false;
                // e sai do loop for
                break;
            } // fim if
        } // fim for

        // se isprime for verdade
        if (isPrime)
            // mostra é primo
            System.out.println(numero + " é primo.");
        else // se falso
             // mostra não é primo
            System.out.println(numero + " is not prime");

    }// fim main
} // fim classe
