import java.util.Scanner;

public class ForAninhados4 {
    /**
     * Esse programa recebe um argumento de linha de comando 
     * inteiro n e usa loops for aninhados para imprimir uma tabela 
     * n por n com um asterisco na linha i e na coluna j se i dividir 
     * j ou j dividir i. As variáveis de controle de loop iej controlam 
     * a computação.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 63). 
     * Pearson Educação. Edição do Kindle.
     */
    public static void main(String[] args) {
        
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um valor: ");
        int valor = input.nextInt(); // entrada do usuário

        //variáveis
        int i, j;

        // loop for 
        for( i = 1; i <= valor; i++ ) {
            for( j = 1; j <= valor; j++ ) {

                if( i % j == 0 || j % i == 0 ) {
                    System.out.print("* ");
                } // fim if
                else {
                    System.out.print("  ");
                } // fim else                
            } // fim for interno
            
            // pula linha
            System.out.println(i);

       } // fim for externo
        input.close();
    } // fim main
} // fim classe
