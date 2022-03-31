import java.util.Scanner;

public class SimulacaoDeJogo8 {
    /**
     * simulação de jogador ruim
     * aposta | aposta inicial
     * objetivo | meta de fuga
     * ensaios | número de tentativas
     * apostas | contagem de apostas
     * vitórias | contagem de vitórias
     * dinheiro | dinheiro na mão
     * Este programa leva três inteiros argumentos de linha de comando stake, 
     * goal e trial. O loop while interno neste programa simula um jogador 
     * com $stake que faz uma série de apostas de $1, continuando até quebrar 
     * ou atingir $goal. O tempo de execução deste programa é proporcional às 
     * tentativas vezes o número médio de apostas. Por exemplo, o terceiro 
     * comando abaixo faz com que quase 100 milhões de números aleatórios 
     * sejam gerados.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 71). 
     * Pearson Educação. Edição do Kindle.
     */
    public static void main(String[] args) {
        
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite o valor da aposta inicial R$ ");
        int valorInicial = input.nextInt();

        System.out.print("Informe quanto quer ganhar R$ ");
        int queroGanhar = input.nextInt();
        
        System.out.print("Informe o número de tentativas: ");
        int tentativas = input.nextInt();

        // variáveis
        int apostas = 0;
        int vitorias = 0;
        int dinheiro = 0;

        for( int t = 0; t < tentativas; t++ ) {
            dinheiro = valorInicial;
            while( dinheiro > 0 && dinheiro < queroGanhar ) {
                apostas++;
                if(Math.random() < 0.5)
                    dinheiro++;
                else
                    dinheiro--;
            } // fim while

            if( dinheiro == queroGanhar )
                vitorias++;
        } // fim for

        // imprime o resultado
        System.out.printf("%s%d%s%d%s%n", "Em ",tentativas, " tentativas, você venceu ", vitorias, " vezes");
        System.out.printf("Porcentagem de jogos ganhos = %d%%%n", 100 * vitorias / tentativas);
        System.out.printf("Média de apostas = %.2f%n", (double) 1.0 * apostas / tentativas );

    } // fim main
} // fim classe
