import java.util.Scanner;

public class NumeroHarmonico5 {
    /**
     * 
     */
    public static void main(String[] args) {
        
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um valor: ");
        int valor = input.nextInt();

        double soma = 0.0;

        // loop for
        for( int i = 1; i <= valor; i++ ) {
            // soma recebe o valor de divisão de 1,0 por i
            soma += 1.0 / i;
        } // for 

        System.out.printf("Número harmônico = %f%n", soma );

    } // fim main
} // fim classe