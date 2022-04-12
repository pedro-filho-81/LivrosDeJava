package Matriz;

public class VerdadeiroFalse6 {
    /**
     * 1.4.6 Escreva um fragmento de código que imprima o conteúdo
     * de um array booleano bidimensional, usando * para representar
     * true e um espaço para representar false. Inclua índices de linha
     * e coluna.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 118).
     * Pearson Educação. Edição do Kindle.
     * Pedro, 11/04/2022
     */
    public static void main(String[] args) {

        // declara, cria e inicializar uma matriz
        boolean[][] matriz = {
                { false, true, false },
                { true, false, true },
                { false, true, false },
                { false, true, false },
                { true, false, true },
                { false, true, false },
                { false, true, false },
                { true, false, true },
                { false, true, false },
                { false, true, false },
                { true, false, true },
                { false, true, false }
        }; // false mostra #, true mostra *
        
        // cabeçalho
        System.out.println("Matriz original:");
        // espaços em branco para a coluna
        System.out.print("                ");
        // cabeçalho da primeira coluna
        System.out.printf("%s", "1");
        // loop para as outras colunas
        for (int i = 1; i < 3; i++) {
            // imprime o número da coluna
            System.out.printf("%7d", i + 1);
        } // fim for
          // pula linha
        System.out.println();

        // loop for mpara mostra a matriz
        for (int linha = 0; linha < 12; linha++) {

            // imprima cabeçalho
            System.out.printf("linha - %2d", linha + 1);

            // loop para coluna
            for (int coluna = 0; coluna < 3; coluna++) {

                if (matriz[linha][coluna] == true)
                    System.out.printf("%7s", "*");
                else
                    System.out.printf("%7s", "#");

            } // fim for coluna

            System.out.println();
        } // fim for linha

    } // fim main
} // fim classe