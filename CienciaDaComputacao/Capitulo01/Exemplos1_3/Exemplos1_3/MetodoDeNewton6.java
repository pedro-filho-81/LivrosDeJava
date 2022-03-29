import java.util.Scanner;

public class MetodoDeNewton6 {
    /**
     * Este programa recebe um número de ponto flutuante positivo c como 
     * argumento de linha de comando e calcula a raiz quadrada de c com 15 
     * casas decimais de precisão, usando o método de Newton (consulte o texto).
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 66). 
     * Pearson Educação. Edição do Kindle.
     */
    public static void main(String[] args) {
        
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um valor para ver a raiz quadrada: ");
        double valor = input.nextDouble();

        double  epsilon = 1.0 * Math.E - 15;
        double t = valor;

        while( Math.abs(t - valor/t) > epsilon * t) {
            t = ( valor/t + t) / 2.0;
            break;
        } // fim while

        System.out.printf("Sqrt de %.2f = %.5f%n", valor, t );
    }  // fim main  
} // fim classe