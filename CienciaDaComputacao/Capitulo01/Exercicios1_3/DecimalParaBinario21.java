import java.util.Scanner;

public class DecimalParaBinario21 {
    /**
     * 1.3.21 Modifique Binary para obter um programa Kary que recebe 
     * dois argumentos inteiros de linha de comando iek e converte i 
     * para a base k. Suponha que i seja um inteiro no tipo de dados 
     * long de Java e que k seja um inteiro entre 2 e 16. Para bases 
     * maiores que 10, use as letras A a F para representar o 11º ao 
     * 16º dígito, respectivamente.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 83). 
     * Pearson Educação. Edição do Kindle.
     * @autor Pedro, 22/03/2022
     */
    public static void main(String[] args) {
        
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // variáveis
        int a = 11, b = 12, c = 13, d = 14, e = 15, f = 16;
        
        // entrada de dados
        System.out.print("Digite um número decimal: ");
        int decimal = input.nextInt(); // dados do usuário

        // calculando potência de 2
        int potencia = 1; // variável
        // enquanto potencia menor que a metade do valor decimal faça
        while( potencia <= decimal / 2 ) {
            potencia *= 2; // multiplique o valor da potência po 2
        } // fim potencia

        // enquanto a potencia maior que zero faça
        while( potencia > 0 ) {

            // se decimal menor que potência faça
            if( decimal < potencia ) {
                // imprima zero
                System.out.print(0);
            } // fim if
            else { // se não
                // imprima um
                System.out.print(1);
                // diminua do decimal o valor da potência
                decimal -= potencia;
            } // fim else

            // divida o valor da potencia por 2
            potencia /= 2;

        } // fim while
    } // fim main
} // fim classe
