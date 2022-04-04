import java.util.Scanner;

public class NumeroHarmonico4 {
    /**
     * Este programa recebe um argumento de linha de comando inteiro n e calcula
     * o valor do enésimo número harmônico. O valor é conhecido da análise
     * matemática como sendo cerca de ln(n) + 0,57721 para n grande.
     * Observe que ln(1.000.000) + 0,57721 ≈ 14,39272.
     */
    public static void main(String[] args) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = input.nextInt();

        // declara e cria um vetor
        double[] harmonico = new double[tamanho];

        // loop para aadicionar valor no vetor
        for (int i = 1; i < tamanho; i++) {
            // inicializa adicionando valores ao vetor
            harmonico[i] = harmonico[i - 1] + 1.0 / i;
        } // fim for

        // loop para mostrar os elementos do vetor
        for (int i = 1; i < tamanho; i++) {
            // mostra os valores do vetor
            System.out.printf("%10f", harmonico[i]);
        } // fim for mostrar
    } // fim main
} // fim classe
