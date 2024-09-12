import java.util.Scanner;

public class Exercicio2_3 {
    /*
     * 2.3 Escreva instruções para realizar cada uma das tarefas a seguir:
     * a) Declare que as variáveis c, thisIsAVariable, q76354 e number
     * serão do tipo int.
     * b) Solicite que o usuário insira um inteiro.
     * c) Insira um inteiro e atribua o resultado à variável int value.
     * Suponha que a variável Scanner input possa ser utilizada para ler
     * um valor digitado pelo usuário.
     * d) Imprima “This is a Java program" em uma linha na janela de comando.
     * Use o método System.out.println.
     * e) Imprima “This is a Java program" em duas linhas na janela de comando.
     * A primeira deve terminar com Java. Utilize o método
     * System.out.printf e dois especificadores de formato %s.
     * f) Se a variável number não for igual a 7, exiba “The variable number
     * is not equal to 7".
     */
    public static void main(String[] args) {

        // a) Declare que as variáveis c, thisIsAVariable, q76354 e number
        // serão do tipo int.
        int c;
        int thisIsAVariable;
        int q76354;
        int number;

        // b) Solicite que o usuário insira um inteiro.
        System.out.println("Digite um inteiro: ");

        // c) Insira um inteiro e atribua o resultado à variável int value.
        // Suponha que a variável Scanner input possa ser utilizada para ler
        // um valor digitado pelo usuário.
        Scanner input = new Scanner(System.in);
        System.out.print("\nDigite um inteiro: ");
        // d) Imprima “This is a Java program" em uma linha na janela de comando.
        // Use o método System.out.println.
        System.out.println("\nEste é um programa Java.");
        
        // e) Imprima “This is a Java program" em duas linhas na janela de comando.
        // A primeira deve terminar com Java. Utilize o método
        // System.out.printf e dois especificadores de formato %s.
        System.out.printf("%n%s%n%s", "This is a Java ", "program." );

         /* f) Se a variável number não for igual a 7, exiba “The variable number
            is not equal to 7". */
        int num = 3;
        if( num != 7 )
            System.out.println("\nThe variavle num is not equal to 7." );

    } // fim man
} // fim classe