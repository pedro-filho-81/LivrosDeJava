package Exemplos1_4;

// biblioteca
import java.util.Scanner;

public class ExemplosDeVetor03 {

    public static void main(String[] args) {

        // cria o objeto input para a classe Scanner e inicializa
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Determine o tamanho do vetor: ");
        int n = input.nextInt(); // aguarda a entrada do tamanho do vetor

        // declara a variável soma e inicializa com o valor zero
        double soma = 0.0;

        // cria o vetor a double e inicializa para receber n elemantos
        double[] a = new double[n];

        // loop para atribuir valores ao vetor a
        for (int i = 0; i < n; i++) {
            // atribuindo valores aleatórios 
            // maiores que 0 zero menores que um 1
            a[i] = Math.random();
        } // fim for

        // cabeçalho
        System.out.println("a[" + n + "]");
        System.out.println("-------------------");

        // loop para mostrar os valores do vetor a
        for (int i = 0; i < n; i++) {
            // imprima
            System.out.println(a[i]);
            soma += a[ i ]; // soma os valores do vetor
        } // fim for

        System.out.println();
        System.out.println("soma de a = " + soma); 

        // declava a variável max para encontrar o maior valor do vetor
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < n; i++) {
            // se o valor do vetor for maior que max
            if (a[i] > max) 
                // max recebo esse valor
                max = a[i];
        } // fim for

        // imprime o maior valor do vetor
        System.out.println("max = " + max);

        // declara a variável soma e atribui zero
        double sum = 0.0;

        // loop para somar os valores do vetor
        for (int i = 0; i < n; i++) {
            sum += a[i]; // soma os valores do vetor
        } // fim for

        // imprime a média dos valores do vetor
        System.out.println("average = " + sum / n);

        // cria o vetor b com n tamanho
        double[] b = new double[n];

        // loop para copiar os valores do vetor a para o vetor b
        for (int i = 0; i < n; i++) {
            // vetor b recebe os valores do vetor a
            b[i] = a[i];
        } // fim min

        // invertendo os valores do vetor b
        for (int i = 0; i < n/2; i++) {
            // cria a variável double temp
            double temp = b[i];

            b[i] = b[n-i-1];
            b[n-i-1] = temp;
        } // fim for inverte valor

        // pula uma linha
        System.out.println();
        
        // imprime cabeçalho
        System.out.println("b[" + n + "]");
        System.out.println("-------------------");

        // loop paara mostra os valores do vetor b
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
