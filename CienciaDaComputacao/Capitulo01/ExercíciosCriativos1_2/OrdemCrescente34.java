import java.util.Scanner;

public class OrdemCrescente34 {
    /**
     * 1.2.34 Três tipos.Escreva um programa que receba três argumentos 
     * de linha de comando inteiros e os imprima em ordem crescente. 
     * use Math.min() e Math.max().
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 49). 
     * Pearson Educação. Edição do Kindle.
     * @autor Pedro,18/03/2022
     */
    public static void main(String[] args) {
        
        // objeto scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um inteiro: ");
        int num1 = input.nextInt();
        System.out.print("Digite outro inteiro: ");
        int num2 = input.nextInt();
        System.out.print("Digite mais um inteiro: ");
        int num3 = input.nextInt();
        
        // calculo
        int menorValor = Math.min(num1, Math.min(num2, num3));
        int maiorValor = Math.max(num1, Math.max(num2, num3));
        int media = num1 + num2 + num3 - menorValor - maiorValor;

        // mostra resultado
        System.out.printf("%3d%3d%3d%n", menorValor, media, maiorValor);
    }
    
}
