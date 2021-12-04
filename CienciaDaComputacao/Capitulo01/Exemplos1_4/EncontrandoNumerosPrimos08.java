package Exemplos1_4;

import java.util.Scanner;

public class EncontrandoNumerosPrimos08 {
    public static void main(String[] args) { 

        // declara a variável para Scanner
        Scanner entrada = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite o tamanho do vetor: ");
        int n = entrada.nextInt(); // aguarda entrada do usuário

        // declara e inicializa o vetor boleano é primo
        boolean[] isPrime = new boolean[n+1];

        // loop para verificar se é primo ou não
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true; // assume verdadeiro para números primo
        } // fim for

        // mark non-primes <= n using Sieve of Eratosthenes
        for (int factor = 2; factor*factor <= n; factor++) {

            // if factor is prime, then mark multiples of factor as nonprime
            // suffices to consider mutiples factor, factor+1, ...,  n/factor
            if (isPrime[factor]) {
                for (int j = factor; factor*j <= n; j++) {
                    isPrime[factor*j] = false;
                } // fim for
            } // fim if
        } // fim for externo

        // count primes
        int primes = 0;

        // loop para contar os valores primos
        for (int i = 2; i <= n; i++) {
            // se for primo soma 1
            if (isPrime[i]) primes++; 
        } // fim for
        
        // imprima o número primo
        System.out.println("Foram encontrados " + primes + " números primos <= " + n);

    } // fim main    
} // fim classe
