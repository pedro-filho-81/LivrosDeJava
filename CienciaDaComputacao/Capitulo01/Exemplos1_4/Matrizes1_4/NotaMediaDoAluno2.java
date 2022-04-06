public class NotaMediaDoAluno2 {
    public static void main(String[] args) {

        // declara, cria e inicializa um vetor
        double[][] notasDasProvas = {
                { 99.0, 85.0, 98.0, 0.0 },
                { 98.0, 57.0, 79.0, 0.0 },
                { 92.0, 77.0, 74.0, 0.0 },
                { 94.0, 62.0, 81.0, 0.0 },
                { 99.0, 94.0, 92.0, 0.0 },
                { 80.0, 76.5, 67.0, 0.0 },
                { 76.0, 58.5, 90.5, 0.0 },
                { 92.0, 66.0, 91.0, 0.0 },
                { 97.0, 70.5, 66.5, 0.0 },
                { 89.0, 89.5, 81.0, 0.0 },
                { 0.0, 0.0, 0.0, 0.0 }
        }; // fim vetor

        // variáveis
        int m = 10; // número de linhas
        int n = 3; // número das colunas

        // CALCULA A MÉDIA DAS NOTAS NAS LINHAS
        // loop para linhas
        for (int linha = 0; linha < m; linha++) {
            // variável soma
            double soma = 0.0;
            // loop para coluna
            for (int coluna = 0; coluna < n; coluna++) {
                // soma os valores da linha
                soma += notasDasProvas[linha][coluna];
            } // fim for coluna
              // matriz na coluna 4 recebe a média das notas da linha
            notasDasProvas[linha][n] = soma / n;
        } // fim for linha

        // CALCULA A MÉDIA DAS NOTAS NA COLUNA
        // loop para linhas
        for (int coluna = 0; coluna < n; coluna++) {
            // variável
            double soma = 0.0;
            // loop para coluna
            for (int linha = 0; linha < m; linha++) {
                // soma os valores das colunas
                soma += notasDasProvas[linha][coluna];
            } // fim for linha
              // matriz recebe a média da coluna
            notasDasProvas[m][coluna] = soma / m;
        } // fim for coluna

        // MOSTRA OS VALORES DA MATRIZ
        // loop for para linha
        for (int linha = 0; linha < m + 1; linha++) {
            // loop for para coluna
            for (int coluna = 0; coluna < n + 1; coluna++) {
                // imprima
                System.out.printf("%8.1f", notasDasProvas[linha][coluna]);
            } // fim for coluna
              // pula linha
            System.out.println();
        } // fim for linha

    } // fim main
} // fim classe