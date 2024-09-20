package Exercicios1_3;

import java.util.Scanner;

public class SimulacaoDeJogo23 {
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
     * 
     * 1.3.23 Escreva uma versão do Gambler que use dois laços while aninhados
     * ou dois laços for aninhados em vez de um laço while dentro de um laço for.
     * 
     * 1.3.24 Escreva um programa GamblerPlot que rastreie a simulação da ruína de
     * um jogador imprimindo uma linha após cada aposta na qual um asterisco
     * corresponde a cada dólar retido pelo jogador.
     * 
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 84).
     * Pearson Educação. Edição do Kindle.
     * 31/03/2022
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
        System.out.println();

        // variáveis
        int apostas = 0;
        int vitorias = 0;
        int dinheiro = 0;

        // variável para while
        int contar = 0;

        // enquanto contar menor que tentativas faça
        while (contar < tentativas) {

            // dinheiro recebe valor inicial
            dinheiro = valorInicial;

            // enquanto dinheiro maior que zero e menor que quero ganhar
            while (dinheiro > 0 && dinheiro < queroGanhar) {
                apostas++;
                if (Math.random() < 0.5) {
                    dinheiro++;
                } // fim if

                else
                    dinheiro--;
            } // fim while

            if (dinheiro == queroGanhar) {
                vitorias++;
                System.out.printf("\tVocê venceu na aposta numero %d%n", contar + 1);
            } // fim if vitorias
            else
                System.out.printf("Você perdeu na aposta número %d%n", contar + 1);

            contar++;

        } // fim while

        // calcular
        int ganhou = queroGanhar * vitorias;
        int perdeu = valorInicial * (tentativas - vitorias);
        int jogosGanhos = 100 * vitorias / tentativas;

        // imprime o resultado
        System.out.printf("\nEm %d tentativas você venceu %d vezes%n", tentativas, vitorias);
        System.out.printf("Ganhou R$ %d%n", ganhou);
        System.out.printf("Perdeu R$ %d%n", perdeu);
        System.out.printf("Ficou com R$ %d%n", ganhou - perdeu);

        if (perdeu < ganhou)
            System.out.printf("Abatendo a aposta de R$ %d Lucrou R$ %d%n", perdeu,
                                (ganhou - perdeu) - perdeu);
        else
            System.out.printf("Teve um prejuizo de R$ %d%n", ganhou - perdeu);

        if (perdeu > (ganhou - perdeu))
            System.out.println("Você perdeu mais do que ganhou.");

        System.out.printf("Porcentagem de jogos ganhos = %d%%%n", jogosGanhos);
        System.out.printf("Média de apostas = %.2f%n", (double) 1.0 * apostas / tentativas);

    } // fim main
} // fim classe
