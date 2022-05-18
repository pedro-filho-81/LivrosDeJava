import java.util.Scanner;

public class Tarefa09 {
    /**
     * 7.9 Considere um array de inteiros dois por três t.
     * a) Escreva uma instrução que declara e cria t.
     * b) Quantas linhas tem t?
     * c) Quantas colunas tem t?
     * d) Quantos elementos tem t?
     * e) Escreva expressões de acesso para todos os elementos na linha 1 de t.
     * f) Escreva expressões de acesso para todos os elementos na coluna 2 de t.
     * g) Escreva uma única instrução que configura o elemento de t na linha 0 e na coluna 1 como zero.
     * h) Escreva instruções individuais para inicializar cada elemento de t para zero.
     * i) Escreva uma instrução for aninhada que inicializa cada elemento de t como zero.
     * j) Escreva uma instrução for aninhada que insere os valores para os elementos de t a partir do usuário.
     * k) Escreva uma série de instruções que determina e exibe o valor menor em t.
     * l) Escreva uma única instrução printf que exibe os elementos da primeira linha de t.
     * m) Escreva uma instrução que soma os elementos da terceira coluna de t. Não utilize repetição.
     * n) Escreva uma série de instruções que exibe o conteúdo de t no formato tabular. Liste os índices de coluna como títulos na parte superior 
     * e liste os índices de linha à esquerda de cada linha
     */
    public static void main(String[] args) {
        
        // 7.9 Considere um array de inteiros dois por três t.
        System.out.println("\n7.9 Considere um array de inteiros dois por três t.");

        // a) Escreva uma instrução que declara e cria t.
        System.out.println("a) Escreva uma instrução que declara e cria t.");
        
        int[][] t = new int[2][3];
        System.out.println("int[][] t = new int[2][3];");

        // b) Quantas linhas tem t? duas linhas
        System.out.println("b) Quantas linhas tem t?\nduas linhas");

        // c) Quantas colunas tem t? três colunas
        System.out.println("c) Quantas colunas tem t?\ntrês colunas");

        // d) Quantos elementos tem t?  seis elementos;
        System.out.println("d) Quantos elementos tem t?\nseis elementos;");
        
        // e) Escreva expressões de acesso para todos os elementos na linha 1 de t.
        System.out.println("e) Escreva expressões de acesso para todos os elementos na linha 1 de t.");
        System.out.print("for(int i = 0; i < 3; i++) t[1][i] = ");
        for(int i = 0; i < 3; i++)
            System.out.printf("%3d", t[1][i]);

        // f) Escreva expressões de acesso para todos os elementos na coluna 2 de t.
        System.out.println("\nf) Escreva expressões de acesso para todos os elementos na coluna 2 de t.");
        System.out.print("for(int i = 0; i < 2; i++) t[i][2] = ");
        for(int i = 0; i < 2; i++)
            System.out.printf("%3d", t[i][2]);

        // g) Escreva uma única instrução que configura o elemento de t na linha 0 e na coluna 1 como zero;
        System.out.println("\ng) Escreva uma única instrução que configura o elemento de t na" +
                                "\nlinha 0 e na coluna 1 como zero.");
        System.out.println("t[0][1] = 0;");

        //h) Escreva instruções individuais para inicializar cada elemento de t para zero.
        System.out.println("h) Escreva instruções individuais para inicializar cada elemento de t para zero.");
        System.out.println("t[0][0] = 0;");
        System.out.println("t[0][1] = 0;");
        System.out.println("t[0][2] = 0;");
        System.out.println("t[1][0] = 0;");
        System.out.println("t[1][1] = 0;");
        System.out.println("t[1][2] = 0;");

        //i) Escreva uma instrução for aninhada que inicializa cada elemento de t como zero.
        System.out.println("\ni) Escreva uma instrução for aninhada que inicializa cada elemento de t como zero.");
        System.out.println("for(int linha = 0; linha < 2; linha++)0");
        System.out.println("    for( int coluna = 0; coluna < 3; coluna++)");
        System.out.println("        t[linha][coluna] = 0");
        for(int linha = 0; linha < 2; linha++)
            for( int coluna = 0; coluna < 3; coluna++)
                t[linha][coluna] = 0;

        //j) Escreva uma instrução for aninhada que insere os valores para os elementos de t a partir do usuário.
        System.out.println("\nj) Escreva uma instrução for aninhada que insere os valores para \nos elementos de t a partir do usuário.");
        // objeto Scanner
        Scanner input = new Scanner(System.in);
        // loop para linha
        for(int linha = 0; linha < 2; linha++) { 
            // loop para coluna
            for( int coluna = 0; coluna < 3; coluna++) { 
                System.out.print("Digite um valor: ");
                int valor = input.nextInt();
                t[linha][coluna] = valor;
            } // fim for coluna
        } // fim for linha

        // MOSTRA OS VALORES DA ATRIZ
        System.out.printf("\nt[linha][coluna]\n");
        // loop para linha
        for(int linha = 0; linha < 2; linha++) { 
            // loop para coluna
            for( int coluna = 0; coluna < 3; coluna++) { 
                System.out.printf("%3d", t[linha][coluna]);
            } // fim for coluna
            System.out.println();
        } // fim for linha

        //k) Escreva uma série de instruções que determina e exibe o valor menor em t.
        System.out.println("\nk) Escreva uma série de instruções que determina e exibe o valor menor em t.");
        // variável recebe o menor valor da matriz t
        int menorValor = t[0][0];
        // loop para linha
        for(int linha = 0; linha < 2; linha++)
        // loop para a coluna
        for( int coluna = 0; coluna < 3; coluna++)
            // verificar se a matriz tem valor menor que o menor valor
            if(t[linha][coluna] < menorValor) // se verdade
                // menor valor recebe o valor da matriz
                menorValor = t[linha][coluna];
        // imprime o menor valor
        System.out.printf("Menor valor = %d\n", menorValor);
        
        //l) Escreva uma única instrução printf que exibe os elementos da primeira linha de t.
        System.out.println("\nl) Escreva uma única instrução printf que exibe os elementos da primeira linha de t.");
        System.out.printf("%3d%3d%3d\n",t[0][0], t[0][1], t[0][2]);

        //m) Escreva uma instrução que soma os elementos da terceira coluna de t. Não utilize repetição.
        System.out.println("m) Escreva uma instrução que soma os elementos da terceira coluna de t.\nNão utilize repetição.");
        System.out.printf("%d + %d = %d", t[0][2], t[1][2], t[0][2] + t[1][2]);
        
        System.out.println();

        //n) Escreva uma série de instruções que exibe o conteúdo de t no formato tabular. Liste os índices de coluna como títulos na parte superior 
        //e liste os índices de linha à esquerda de cada linha
        System.out.println("\nn) Escreva uma série de instruções que exibe o conteúdo de t\n" +
                            "no formato tabular. Liste os índices de coluna como títulos\n" +
                            "na parte superior e liste os índices de linha à esquerda de cada linha");

        // mostra tabela da matriz
        System.out.println("Matriz: ");
        System.out.print("           ");
        // loop para mostrar os números das colunas
        for(int coluna = 0; coluna < 3; coluna++)
        {
            // imprime os números
            System.out.printf("%3d", coluna + 1);
        }
        // pula linha
        System.out.println();

        System.out.print("           ");
        for(int coluna = 0; coluna < 3; coluna++)
        {
            System.out.printf("%3s", "*");
        }
        // pula linha
        System.out.println();

        // loop para linha
        for(int linha = 0; linha < 2; linha++){
            System.out.printf("Linha %d -> ", linha + 1);
            //loop para a coluna
            for( int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("%3d", t[linha][coluna]);
            } // fim for coluna
            // pula linha
            System.out.println();
        } // fim for linha

    } // fim main

} // fim classe
