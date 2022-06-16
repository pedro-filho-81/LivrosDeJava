import java.util.Scanner;
import java.util.concurrent.ConcurrentMap;

public class PasseioDoCavalo22_2 {
    /**
     * Escreva um aplicativo para mover o cavalo pelo tabuleiro. 
     * Mantenha um contador que varia de 1 a 64. Registre a última contagem 
     * em cada quadrado para o qual o cavalo se move. Teste cada movimento 
     * potencial para ver se o cavalo já visitou esse quadrado. 
     * Teste cada movimento potencial para assegurar que o cavalo não saia 
     * fora do tabuleiro. Execute o aplicativo. Quantos movimentos o cavalo fez?
     * Pedro, 14/06/2022
     */
    public static void main(String[] args) {

        // constantes
        final int TAMANHO = 8;

        // matriz
        int[][] tabuleiro = new int[TAMANHO][TAMANHO];
  
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // chama os métodos
        moveCavalo(tabuleiro, TAMANHO);
        mostrar(tabuleiro, TAMANHO);

    } // fim main

    // inicializar
    public static void inicializar(int[][] tabuleiro, int tamanho)
    {
        // loop da linha
        for(int i = 0; i < tamanho; i++) {
            // loop da coluna
            for(int j = 0; j < tamanho; j++) {
                // tabuleiro recebe zeros
                tabuleiro[i][j] = 0;
            } // fim coluna
        } // fim linna
    } // fim função

    // move o cavalo após a posição inicial
    public static void moveCavalo(int[][] tabuleiro, int tamanho)
    {
        // DECLARA E INICIALIZA OS VETORES
        // horizontao = linha, vertical = coluna
        int[] coluna = {4, 6, 7, 5, 4, 6, 7, 5, 3, 1, 0, 
                        2, 3, 1, 0, 2, 1, 0, 2, 3, 2, 0, 
                        1, 3, 5, 7, 6, 4, 5, 7, 6, 4, 2, 
                        3, 1, 0, 1, 0, 2, 3, 5, 4, 6, 7, 
                        6, 7, 5, 6, 7, 5, 4, 5, 7, 6, 4, 
                        2, 0, 1, 3, 2, 0, 1, 3, 4};
                        
        int[] linha = {0, 1, 3, 2, 4, 5, 7, 6, 7, 6, 4, 5, 
                        3, 2, 0, 1, 3, 1, 0, 2, 4, 5, 7, 6, 
                        7, 6, 4, 5, 3, 2, 0, 1, 2, 0, 1, 3, 
                        5, 7, 6, 4, 5, 7, 6, 4, 2, 0, 1, 3, 
                        1, 0, 2, 4, 5, 7, 6, 7, 6, 4, 5, 3, 
                        2, 0, 1, 3};

        // variável contador para os valores 
        // ao redor do número inicial
        int contar = 1;

        for(int i = 0; i < linha.length; i++) { 
        
            tabuleiro[linha[i]][coluna[i]] = contar++;

        } // fim for

    } // fim move cavalo

    // método mostrar matriz
    public static void mostrar(int[][] tabuleiro, int tamanho) 
    {
        // cabeçalho do tabuleiro
        System.out.printf("\n%25s\n", "T A B U L E I R O");
        System.out.print("    "); // espaços em branco antes do cabeçalho das colunas

        // cabeçalho das colunas
        for (int i = 0; i < tamanho; i++)
            // imprime
            System.out.printf("%3d", i);

        // espaços em branco antes do cabeçalho das colunas
        System.out.print("\n    ");
        // cabeçalho da coluna
        for (int j = 0; j < tamanho; j++)
            // imprime
            System.out.printf("%3s", "*");

        System.out.println(); // pula linha

        // loop para a linha
        for (int linha = 0; linha < tamanho; linha++) {
            // cabeçalho da linha
            System.out.printf("%-2d->", linha);
            // loop para a coluna
            for (int coluna = 0; coluna < tamanho; coluna++) {
                // immprime os elementos da matriz
                System.out.printf("%3s", tabuleiro[linha][coluna]);
            } // fimm for coluna
              // pula linha
            System.out.println();
        } // fimm linha

        System.out.println(); // pula linha

    } // fim mostrar

} // fim classe 