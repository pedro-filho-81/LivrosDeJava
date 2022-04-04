import java.util.Scanner;

public class Amostragem3 {
    /**
     * Este programa recebe dois argumentos de linha de comando m e n 
     * e produz uma amostra de m dos inteiros de 0 a n-1. 
     * Este processo é útil não apenas em loterias estaduais e locais, 
     * mas em aplicações científicas de todos os tipos. 
     * Se o primeiro argumento for igual ao segundo, o resultado será 
     * uma permutação aleatória dos inteiros de 0 a n-1. 
     * Se o primeiro argumento for maior que o segundo, o programa 
     * terminará com um ArrayOutOfBoundsException.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pp. 98-99). 
     * Pearson Educação. Edição do Kindle.
     */
    public static void main(String[] args) {
        
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite a quantidade de elementos: ");
        int quantidade = input.nextInt();
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = input.nextInt();
        
        // Declara e cria um vetor
        int[] permuta = new int[tamanho];

        // loop para inicializar permuta
        for( int i = 0; i < tamanho; i++ ) {
            // inicializa vetor com os valores de i
            permuta[i] = i;
        } // fim for

        // loop for para mudança
        for( int i = 0; i < quantidade; i++ ) {
            // aleatório
            int random = i + (int) (Math.random() * (tamanho - 1));
            int temp = permuta[random];
            permuta[random] = permuta[i];
            permuta[i] = temp;
        }  // fim for

        // loop para mostrar os valores do vetor
        for( int i = 0; i < quantidade; i++ ) {
            System.out.printf("%5d", permuta[i]);
        } // fim for

    } // fim main
} // fim classe
