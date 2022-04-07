import java.util.Scanner;

public class PasseioNaCidade7 {
    /**
     * becos-sem-saída
     * tamanho | tamanho da rede
     * tentativas | # ensaios
     * becos sem saída | # tentativas resultando em um beco sem saída
     * matriz[][] | cruzamentos visitados
     * x, y | posição atual
     * numeroAleatorio | número aleatório em (0, 1)
     * 
     * Este programa recebe argumentos de linha de comando n e tentativas
     * e calcula passeios auto-evitantes de tentativas em uma rede n por n.
     * Para cada passeio, ele cria uma matriz booleana, inicia o passeio no
     * centro e continua até que um beco sem saída ou um limite seja alcançado.
     * O resultado do cálculo é a porcentagem de becos sem saída.
     * Aumentar o número de experimentos aumenta a precisão.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pp. 113-114).
     * Pearson Educação. Edição do Kindle.
     * 07/04/2022
     */
    public static void main(String[] args) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite o tamanho da metriz: ");
        int tamanho = input.nextInt();

        System.out.print("Tentativas: ");
        int tentativas = input.nextInt();

        // variável
        int becoSemSaida = 0;

        // loop para as tentativas
        for( int i = 0; i < tentativas; i++ ){
            boolean[][] matriz = new boolean[tamanho][tamanho];
            int posicaoX = tamanho / 2; 
            int posicaoY = tamanho / 2;

            // enquanto dá um passo aleatório, 
            // a menos que você já tenha escapado
            while(posicaoX > 0 && posicaoX < tamanho - 1 && posicaoY > 0 && posicaoY < tamanho - 1) {
                
                // se beco sem saida, saia do loop
                if(matriz[posicaoX - 1][posicaoY] && matriz[posicaoX + 1][posicaoY] && 
                    matriz[posicaoX][posicaoY - 1] && matriz[posicaoX][posicaoY + 1]) {
                    becoSemSaida++;
                    break;
                } // fim if

                // marca posições x e y como verdadeiro
                matriz[posicaoX][posicaoY] = true;

                // dá um passo aleatório para o vizinho não visitado
                double numeroAleatorio = Math.random();

                if( numeroAleatorio < 0.25 ){
                    if(!matriz[posicaoX + 1][posicaoY])
                        posicaoX++;
                } // fim if 0,25
                
                else if(numeroAleatorio < 0.50) {
                    if(!matriz[posicaoX - 1][posicaoY])
                        posicaoX--;
                } // fim else if 0.50
                
                else if(numeroAleatorio < 0.75) {
                    if(!matriz[posicaoX][posicaoY + 1])
                        posicaoY++;
                } // fim else if 0.75
                
                else if(numeroAleatorio < 1.00) {
                    if(!matriz[posicaoX][posicaoY - 1])
                        posicaoY--;
                } // fim else if 1.00
            } // fim while
        } // fim for
        // imprima
        System.out.println("\nTotal de Tentativas = " + tentativas);
        System.out.println(100 * becoSemSaida/tentativas + "% becos sem saídas"); 
    } // fim main
} // fim classe