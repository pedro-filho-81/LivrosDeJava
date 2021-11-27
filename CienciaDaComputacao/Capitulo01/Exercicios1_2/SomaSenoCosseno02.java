import java.net.SocketPermission;
import java.util.Scanner;

public class SomaSenoCosseno02 {
    /*
     * 1.2.2 Escreva um programa que use Math.sin () e Math.cos ()
     * para verificar se o valor de cos2 θ + sin2 θ é aproximadamente 1
     * para qualquer θ inserido como um argumento de linha de comando.
     * Basta imprimir o valor. Por que os valores nem sempre são exatamente 1?
     * Sedgewick, Robert; Wayne, Kevin. Ciência da computação (p. 44).
     * Pearson Education. Edição do Kindle.
     * Pedro, 27/11/2021
     */

    public static void main(String[] args) {

        // cria o objeto input para classe Scanner e inicializa
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um número: ");
        double num1 = input.nextDouble();
        System.out.print("Digite outro número: ");
        double num2 = input.nextDouble();

        // calculo
        double soma = Math.sin(num1) + Math.cos(num2);

        // imprime
        System.out.println("A soma entre: \nMath.sin( " + num1 + " ) + " +
                            " Math.cos( " + num2 + " )" + " = " + soma);
    } // fim main
} // fim classe
