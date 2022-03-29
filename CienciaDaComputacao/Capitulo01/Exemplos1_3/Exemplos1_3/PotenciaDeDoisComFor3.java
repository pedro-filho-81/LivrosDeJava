import java.util.Scanner;

public class PotenciaDeDoisComFor3 {
    /**
     * Potência de dois (2) usando o loop for
     */

    public static void main(String[] args) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um valor: ");
        int valor = input.nextInt();

        // variável
        int potencia = 2;

        // loop for
        for (int i = 0; i < valor; i++) {
            // imprime
            System.out.format("%3d   %d%n", i + 1, potencia);
            // cálculo
            potencia = 2 * potencia;
        } // fim for

    } // fim main
} // fim classe