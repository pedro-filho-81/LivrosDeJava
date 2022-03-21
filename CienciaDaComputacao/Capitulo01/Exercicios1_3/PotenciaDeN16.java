import java.util.Scanner;

public class PotenciaDeN16 {
    /**
     * 1.3.16 Escreva um programa que receba um argumento de linha 
     * de comando inteiro n e imprima todas as potências positivas 
     * de 2 menores ou iguais a n. Certifique-se de que seu programa 
     * funcione corretamente para todos os valores de n.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 83). 
     * Pearson Educação. Edição do Kindle.
     * @autor Pedro, 20/03/2022
     */
    public static void main(String[] args) {
        
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um inteiro: ");
        int num = input.nextInt(); // entrada do usuário

        // variáveis
        int potencia = 1;
        // enquanto potência menor ou igual a metade de num
        while( potencia <= num / 2 ) {
            // potência multiplica por dois
            potencia *= 2;
            // imprime o valor das potências
            System.out.printf("%5d", potencia );
        } // fim while

    } // fim main
} // fim classe