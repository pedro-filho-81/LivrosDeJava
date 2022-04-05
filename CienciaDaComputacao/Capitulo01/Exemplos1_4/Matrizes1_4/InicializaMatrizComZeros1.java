import java.util.Scanner;

public class InicializaMatrizComZeros1 {
    public static void main(String[] args) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o tamanho da linha: ");
        int LINHA = input.nextInt();
        System.out.print("Informe o valor da coluna: ");
        int COLUNA = input.nextInt();

        // declara e cria uma matriz
        double[][] matriz = new double[LINHA][COLUNA];

        // ADICIONA VALORES A MATRIZ
        // loop para criar linhas
        for (int i = 0; i < LINHA; i++) {
            // loop para cria a coluna
            for (int j = 0; j < COLUNA; j++) {
                // inicializa a matriz com zeros
                matriz[i][j] = 0.0;
            } // fim for coluna
        } // fim for linha

        // MOSTRA OS ELEMENTOS DA MATRIZ
        // loop para criar linhas
        for (int i = 0; i < LINHA; i++) {
            // loop para cria a coluna
            for (int j = 0; j < COLUNA; j++) {
                // imprime os elementos da matriz
                System.out.printf("%5.2f ", matriz[i][j]);
            } // fim for coluna
              // pula uma linha
            System.out.println();
        } // fim for linha
    } // fim main
} // fim classe