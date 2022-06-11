import java.util.Scanner;
import java.util.ArrayList;

public class GraficoDeTartaruga21 {
    /**
     * 7.21 (Gráficos de tartaruga) A linguagem Logo tornou famoso
     * o conceito de gráficos de tartaruga. Imagine uma tartaruga mecânica que
     * caminha no lugar sob o controle de um aplicativo Java. A tartaruga segura
     * uma caneta em uma de duas posições, para cima ou para baixo.
     * Enquanto a caneta estiver para baixo, a tartaruga desenha formas à medida
     * que se move, e enquanto estiver para cima, a tartaruga move-se quase
     * livremente
     * sem escrever nada. Neste problema, você simulará a operação da tartaruga
     * e criará um bloco de rascunho computadorizado.
     * Utilize um array de 20 por 20 floor que é inicializado como zeros.
     * Leia comandos a partir de um array que contenha esses comandos.
     * Monitore a posição atual da tartaruga todas as vezes e se a caneta está
     * atualmente
     * para cima ou para baixo. Suponha que a tartaruga sempre inicie na posição (0,
     * 0)
     * do chão com sua caneta para cima. O conjunto de comandos de tartaruga que seu
     * aplicativo
     * deve processar é mostrado na Figura 7.29.
     * Suponha que a tartaruga esteja em algum lugar próximo ao centro do chão.
     * O programa seguinte desenharia e exibiria um quadrado de 12 por 12 deixando
     * a caneta na posição levantada: 2 5,12 3 5,12 3 5,12 3 5,12 1 6 9
     * À medida que a tartaruga se move com a caneta por baixo, configure os
     * elementos
     * apropriados do array floor como 1s. Quando o comando 6 (exibir o array) for
     * dado,
     * onde quer que haja um 1 no array, exiba um asterisco ou o caractere que você
     * escolher.
     * Onde quer que haja um 0, exiba um espaço em branco.
     * Escreva um aplicativo para implementar as capacidades dos gráficos de
     * tartaruga discutidas aqui.
     * Escreva vários programas de gráfico de tartaruga para desenhar formas
     * interessantes.
     * Adicione outros comandos para aumentar as capacidades de sua linguagem de
     * gráfico de tartaruga.
     * Pedro, 04/06/2022
     */
    public static void main(String[] args) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // objeto array list
        ArrayList<Double> comandos = new ArrayList<Double>();

        // constante
        final int TAMANHO = 20;

        // matriz
        String[][] tabuleiro = new String[TAMANHO][TAMANHO];

        // chama o menu
        menu();
        inicializar(tabuleiro, TAMANHO);
        adicionar(comandos, tabuleiro);
        mostrarComandos(comandos);
        mostrar(tabuleiro, TAMANHO);

    } // fim main

    // método mmenu
    public static void menu()
    {        
        // imprima o menu
        System.out.println("         M E N U");
        System.out.println("********************************");
        System.out.println("* 1 -> cursor para cima.       *");
        System.out.println("* 2 -> cursor para baixo.      *");
        System.out.println("* 3 -> vira para a direita.    *");
        System.out.println("* 4 -> vira para a esquerda.   *");
        System.out.println("* 5.x -> imprime X asteriscos. *");
        System.out.println("* 6 -> mostra tabuleiro.       *");
        System.out.println("* 9 -> sair do programma..     *");
        System.out.println("********************************");

    } // fim menu

    // método adicionar
    public static void adicionar(ArrayList<Double> comandos, String[][] tabuleiro) 
    {
        Scanner input = new Scanner(System.in);

        double opcao1 = 0;
        double opcao2 = 0;
        
        double divide = 1;
        
        int linhaInicial;
        int colunaInicial;

        // cabeçalho
        System.out.println("\nINICIA TABULEIRO:");
        // posição inicial no tabuleiro
        System.out.print("Informe a linha: ");
        linhaInicial = input.nextInt();
        System.out.print("Informe a coluna: ");
        colunaInicial = input.nextInt();
        
        // enquanto 
        while(true)
        {    
            // entrada das opções
            System.out.println("Informe uma opcao e tecle \"Enter\":");
            opcao1 = input.nextDouble(); // entrada do usuário

            // comando recebe as opções
            comandos.add(opcao1);
            
            // se opção igual a nove
            if(opcao1 == 9)
                // saia do while
                break;

            System.out.println("Informe uma opcao e tecle \"Enter\":");
            opcao2 = input.nextDouble(); // entrada do usuário

            // comando recebe as opções
            comandos.add(opcao2);
        
            // se opção igual a nove
            if(opcao2 == 9)
                // saia do while
                break;

                // 1 = para cima
            if(opcao1 == 1 && (opcao2 > 4.99 && opcao2 < 6) ) { 
                                
                divide = divisao(opcao2);

                for(int i = 0; i < divide; i++) { 
                    // vira para cima
                    tabuleiro[linhaInicial - i][colunaInicial] = "*";
                } // fim for
                linhaInicial -= (divide - 1);

            } // fimm if

            else if(opcao1 == 2 && (opcao2 > 4.99 && opcao2 < 6) ) { 
                
                divide = divisao(opcao2);

                for(int i = 0; i < divide; i++) { 
                    // vira para cima
                    tabuleiro[linhaInicial + i][colunaInicial] = "*";
                } // fomm for
                linhaInicial += (divide);
            } // fimm if
            
            // vira para a direita
            else if( opcao1 == 3 && (opcao2 > 4.99 && opcao2 < 6.0) ) { 
            
                divide = divisao(opcao2);

                for(int i = 0; i < divide - 1; i++) {
                    tabuleiro[linhaInicial][colunaInicial + i] = "*";
                } // fim for
                colunaInicial += (divide - 1);
            } // fim if
            
            // vira para a direita
            else if( opcao1 == 4 && (opcao2 > 4.99 && opcao2 < 6.0) ) { 
            
                divide = divisao(opcao2);

                for(int i = 0; i < divide; i++) {
                    tabuleiro[linhaInicial][colunaInicial - i] = "*";
                } // fim for
                colunaInicial -= (divide - 1);
            } // fim if

        } // fim while

    } // fim adicionar

    public static double divisao(double opcao2)
    {
        double divide = 0.0;

        if(opcao2 > 4.99 && opcao2 <= 5.15) { 
            divide = (opcao2 % 5 * 100);
            System.out.println("\nDivide = " + divide);
            return (int) divide;
        } // fim if

        divide = (opcao2 % 5) * 10;
        return divide;

    } // fim sivisao

    // adicionar
    public static void inicializar(String[][] matriz, int tamanho) {
        // loop para a linha
        for (int linha = 0; linha < tamanho; linha++) {
            // loop para a coluna
            for (int coluna = 0; coluna < tamanho; coluna++) {
                matriz[linha][coluna] = "0";
            } // fimm for coluna
        } // fim for linha
    } // fimm adicionar

    // método mostrar matriz
    public static void mostrar(String[][] tabuleiro, int tamanho) {

        // cabeçalho do tabuleiro
        System.out.printf("\n%40s\n", "T A B U L E I R O");
        // loop para a linha
        for (int linha = 0; linha < tamanho; linha++) {
            // loop para a coluna
            for (int coluna = 0; coluna < tamanho; coluna++) {
                // immprime os elementos da matriz
                System.out.printf("%3s", tabuleiro[linha][coluna]);
            } // fimm for coluna
              // pula linha
            System.out.println();
        } // fimm linha

    } // fim mostrar

    // método mostrar matriz
    public static void mostrarComandos(ArrayList<Double> comandos) {
        
        System.out.println("\nComandos:");
        // loop para a coluna
        for (int coluna = 0; coluna < comandos.size(); coluna++) {
            // immprime os elementos da matriz
            System.out.printf("%5.2f", comandos.get(coluna));
        } // fimm for coluna

    } // fim mostrar

} // fim classe
