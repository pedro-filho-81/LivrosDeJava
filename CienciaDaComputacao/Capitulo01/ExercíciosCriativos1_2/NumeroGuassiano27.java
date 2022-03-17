import java.util.Scanner;

public class NumeroGuassiano27 {
    /**
     * 1.2.27 Números aleatórios gaussianos. Escreva um programa RandomGaussian 
     * que imprima um número aleatório r extraído da distribuição gaussiana. 
     * Uma maneira de fazer isso é usar a fórmula de Box-Muller 
     * r = sin(2 π v) (–2 ln u)1/2 
     * onde u e v são números reais entre 0 e 1 gerados pelo método Math.random().
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 47). 
     * Pearson Educação. Edição do Kindle.
     * @autor Pedro, 16/03/2022
     */
    public static void main(String[] args) {
        
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // variáveis
        double u = Math.random();
        double v = Math.random();

        double raio = Math.sin(2 * Math.PI * v) * Math.pow((-2 * u), b)
    } // fim main
} // fim class