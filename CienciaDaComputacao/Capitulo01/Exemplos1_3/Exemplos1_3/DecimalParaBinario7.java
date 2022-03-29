import java.util.Scanner;

public class DecimalParaBinario7 {
    /**
     * Este programa recebe um inteiro positivo n como argumento 
     * de linha de comando e imprime a representação binária de n, 
     * eliminando potências de 2 em ordem decrescente (consulte o texto).
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 69). 
     * Pearson Educação. Edição do Kindle.
     * 29/03/2022
     */
    public static void main(String[] args) {
        
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um número decimal: ");
        int decimal = input.nextInt();

        // variável
        int potencia = 1;
        // enquanto potência menor ou igual a metade do decimal faça
        while(potencia <= decimal / 2 ) {
            // multiplicar o valor da potência por dois
            potencia *= 2;
        } // fim while

        // enquanto a potência maior do que zero faça
        while( potencia > 0 ){

            // se o decimal for menor que potência
            if( decimal < potencia ) {
                // imprima zero
                System.out.print(0);
            } // fim if

            else { // se não
                // imprima 1
                System.out.print(1);
                // diminua potencia do decimal
                decimal -= potencia;
            } // fim else         
            
            // divida o valor da pontência por dois
            potencia /= 2;
        } // fim while
    } // fim main
} // fim classe