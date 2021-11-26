package Exemplos1_4;

import java.util.Scanner;

public class ExemplosDeVetor03 {

    public static void main(String[] args) {

        // cria o objeto input da classe Scanner e inicializa
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um inteiro: ");
        int n = input.nextInt(); // entrada do usuário

        // variáveis
        double soma = 0.0;

        // cria o vetor a double e inicializa com valores aleatórios
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            // atribuindo valores aleatórios
            a[i] = Math.random();

        } // fim for

        // loop para mostrar os valores do vetor a
        System.out.println("a[]");
        System.out.println("-------------------");
        for (int i = 0; i < n; i++) {
            // imprima
            System.out.println(a[i]);
            soma += a[ i ]; // soma de vetor
        } // fim for

        System.out.println();
        System.out.println("soma de a = " + soma); 

        // find the maximum 
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) max = a[i];
        }
        System.out.println("max = " + max);

        // average
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println("average = " + sum / n);

        // copy to another array
        double[] b = new double[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }

        // reverse the order
        for (int i = 0; i < n/2; i++) {
            double temp = b[i];
            b[i] = b[n-i-1];
            b[n-i-1] = temp;
        }

        // print array values, one per line
        System.out.println();
        System.out.println("b[]");
        System.out.println("-------------------");
        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }
        System.out.println();


        // dot product of a[] and b[]
        double dotProduct = 0.0;
        for (int i = 0; i < n; i++) {
            // soma o produto de a[] e b[]
            dotProduct += a[i] * b[i];
        } // fim for
        
        System.out.println("soma do produto de a[] e b[] = " + dotProduct);
    } // fim main
} // fim classe
