import java.util.Scanner;

public class ComissaoPorVendas10 {
    private static int i;

    /**
     * 7.10 (Comissões de vendas) Utilize um array unidimensional 
     * para resolver o seguinte problema: uma empresa paga seu pessoal 
     * de vendas por comissão. O pessoal de vendas recebe R$ 200 por 
     * semana mais 9% de suas vendas brutas durante essa semana. 
     * Por exemplo, um vendedor que vende R$ 5.000 brutos em uma semana 
     * recebe R$ 200 mais 9% de R$ 5.000 ou um total de R$ 650. 
     * Escreva um aplicativo (utilizando um array de contadores) que determina 
     * quanto o pessoal de vendas ganhou em cada um dos seguintes intervalos 
     * (suponha que o salário de cada vendedor foi truncado para uma quantia inteira):
     * Pedro, 18/05/2022
     */
    public static void main(String[] args) {
    
        // constantes
        final int TAMANHO = 10;
        final int SIZE_FREQUENCIA = 20;

        // vetores
        int[] vendas = new int[TAMANHO];
        int[] valorComissao = new int[TAMANHO];
        int[] valorSalario = new int[TAMANHO];

        // chama método entrada de dados
        entradaDados(vendas, valorComissao, valorSalario, TAMANHO);

        // mostrar os dados
        mostrarTabela(vendas, valorComissao, valorSalario, TAMANHO);

        // mostra distribuição dos salários nográfico de barras
        graficoDeBarras(valorSalario, SIZE_FREQUENCIA);

    } // fim main
    
    // método entrada de dados
    public static void entradaDados(int[] vendas, int[] comissao, int[] salario, int tamanho)
    {           
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        for(int contar = 0; contar < tamanho; contar++) { 

            System.out.printf("Informe o valor da venda bruta1 do vendedor %d R$ ", contar + 1);
            //int valorVendas = input.nextInt();
            vendas[contar] = input.nextInt();

            // calcular a comissão
            //int valorComissao = valorVendas * 9 / 100; 
            comissao[contar] = vendas[contar] * 9 / 100;

            // calcular salário
             salario[contar] = comissao[contar] + 200;

        } // fim for

    } // fim entrada de dados

    // método mostrar
    public static void mostrarTabela(int[] vendas, int[] comissao, int[] salario, int tamanho)
    {
        // constante
        final int FIXO = 200;

        // cabeçalho
        System.out.print("\n\t\tTabela das comissões das vendas semmanais.\n");
        // espaços em branco para cabeçalho da tabela
        System.out.print("                ");
        
        // cabeçalho dos valores da tabela
        System.out.printf("%10s%11s%7s%12s%n", "Vendas", "Comissao", "Fixo", "Salario");

        // loop para colunas
            for( int coluna = 0; coluna < tamanho; coluna++) {
                // mostra os valores dos vetores em formato tabular
                System.out.printf("Vendedor %3d R$ %9d%9d%9d%11d\n", 
                            coluna + 1, vendas[coluna], comissao[coluna], FIXO, salario[coluna]);
            } // fim for coluna

    } // fim mostrar

    // gráafico de barras
    public static void graficoDeBarras(int[] salario, int size_frequencia)
    {
        // vetor
        int[] frequencia = new int[size_frequencia];

        // loop para adicionar valores ao vetor frequência
        for(int freq = 0; freq < salario.length; freq++)
            // adicionando valores
            ++frequencia[salario[freq] / 100];

        // MOSTRAR VETOR FREQUÊNCIA
        System.out.println("\nVetor frequência:");
        // loop para mostrar os valores do vetor frequência
        for(int i = 0; i < size_frequencia; i++)
            // imprime o valor do elemento frequência
            System.out.printf("%3d", frequencia[i]);
        System.out.println(); // pula linha

        // cabeçalho
        System.out.println("\nDistribuicao das notas:");

        // loop para gerar a saída das notas
        for (int asterisco = 0; asterisco <= salario.length; asterisco++) {
            // se asterisco igial a zero
            if (asterisco == 0) {
                // imprima
                System.out.printf("R$ %3d - %3d: ", 200, 299);
            } // fim if
            // se não, se asterisco igual a 10
            else if(asterisco == 10){
                // imprima
                System.out.printf("vlr >= %5d: ", 1000);
                // loop para pesquisar salario maior que mil
                for(int maiorOuIgual = 0; maiorOuIgual < salario.length; maiorOuIgual++) {
                    // se salario maior ou igual a 1100
                    if(salario[maiorOuIgual] >= 1100)
                        // imprima asterisco
                        System.out.print(" * " );
                } // fim for maior ou igual
            } // fim else if
            else { // se não
                // se asterisco maior ou igual a 3
                if( asterisco >= 3)
                    // imprima
                    System.out.printf("R$ %3d - %3d: ",
                        asterisco * 100, asterisco * 100 + 99);
            } // fim else
            
            // loop para barra de asterisco
            for(int barra = 0; barra < frequencia[asterisco]; barra++) {
                // imprima asterisco
                System.out.print(" * ");
            } // fi for barra

            // se asterisco aior ou igual a 2
            if(asterisco >= 2)
                // pula umma linha
                System.out.println();

        } // fim for asterisco

    } // fim grafico de barras

} // fim classe