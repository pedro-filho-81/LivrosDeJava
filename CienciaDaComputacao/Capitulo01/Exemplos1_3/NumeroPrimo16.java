package Exemplos1_3;

import java.util.Scanner;

public class NumeroPrimo16 {

    public static void main(String[] args) {

        // cria o objeto input da Classe Scanner e inicializa
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Informe um valor para saber se é primo: ");
        long n = input.nextLong();
        System.out.println("n = " + n);
        // variáveis
        boolean isPrime = true;

        // se número menor que 2
        if (n < 2)
            // número não é primo
            isPrime = false;

        // tente todos os fatores possíveis de n
        // se n tem um fator, então tem um menor ou igual a sqrt (n),
        // então, para eficiência, só precisamos verificar se o fator <= sqrt (n) ou
        // fator equivalente * fator <= n
        for (long factor = 2; factor * factor <= n; factor++) {
            
            System.out.println("factor no for = " + factor);
            System.out.println(n + " % " + factor + " == " + n % factor);
            
    
            // se o número após divisão pelo fator 
            // tiver o resto igual a zero não é primo
            if (n % factor == 0) {
                // valor não é primo
                 isPrime = false;
                System.out.println("if(" + n + " % " + factor + " == " + 0 + ")");
                System.out.println("isPrime = " + isPrime);
                break; // saia do programa
            } // fim if
        } // fim for

        // se o número for primo
        if (isPrime)
            // imprima número é primo
            System.out.println(n + " é primo.");
        else // se não
             // imprima não é primo
            System.out.println(n + " não é primo");
        
        input.close();

    } // fim main
} // fim classe
