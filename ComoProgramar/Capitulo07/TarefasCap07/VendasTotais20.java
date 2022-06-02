import java.util.Scanner;
import java.util.Locale;

public class VendasTotais20 {
    /**
     * 7.20 (Vendas totais) Utilize um array bidimensional para resolver 
     * o seguinte problema: uma empresa tem quatro equipes de vendas (1 a 4) 
     * que vendem cinco produtos diferentes (1 a 5). Uma vez por dia, 
     * cada vendedor passa uma nota de cada tipo de produto diferente vendido. 
     * Cada nota contém o seguinte:
     * a) O número do vendedor
     * b) O número do produto
     * c) O valor total em reais desse produto vendido nesse dia
     * Portanto, cada vendedor passa entre 0 e 5 notas de vendas por dia. 
     * Suponha que as informações a partir de todas as notas durante o 
     * último mês estejam disponíveis. Escreva um aplicativo que leia todas essas 
     * informações sobre as vendas do último mês e resuma as vendas totais por 
     * vendedor e por produto. Todos os totais devem ser armazenados no array 
     * bidimensional sales. Depois de processar todas as informações do último mês, 
     * exiba os resultados em formato tabular, com cada coluna representando 
     * um vendedor particular e cada linha representando um produto particular. 
     * Some cada linha para obter o total das vendas de cada produto no último mês. 
     * Some cada coluna para obter o total de vendas por vendedor no último mês. 
     * Sua saída tabular deve incluir esses totais cruzados à direita das linhas 
     * totalizadas e na parte inferior das colunas totalizadas.
     * Pedro, 31/05/2022
     */
    public static void main(String[] args) {
        
        // constantes
        final int LINHA = 5;
        final int COLUNA = 4;

        // mmatriz
        double[][] vendas = new double[LINHA][COLUNA];
        double[] totVendedores = new double[LINHA];
        double[] totProdutos = new double[LINHA];

        // entrada de dados
        entradaDeDados(vendas, totVendedores, LINHA, COLUNA);
        somaProdutos(vendas, totProdutos, LINHA, COLUNA);
        mostrar(vendas, totVendedores, totProdutos, LINHA, COLUNA);

    } // fim main

    // entrada de dados
    public static void entradaDeDados(double[][] vendas, double[] vendedor, int linha, int coluna) {
        
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // variáveis
        double totalDaVenda = 0;
        
        // cabeçalho 
        System.out.println("\n\tEntrada de dados:");
        
        // loop para as colunas
        for(int i = 0; i < coluna; i++) {
            // verifica se o total das vendas igual a -1
            if(totalDaVenda == -1) // se verdade
                // sai do programa
                break;
            // loop para as linhas
            for(int j = 0; j < linha; j++) {

                // entrada de dados    
                System.out.printf("Vendedor %d Produto %d valor (-1 = sair) R$ ",i + 1,  j + 1);
                // entrada do usuário
                totalDaVenda = input.nextDouble();
                // verifica se o total de ventes igual a -1
                if(totalDaVenda == -1) // se verdade
                    // sai do prograa
                    break; 
                // se não matriz vendas recebe o total da venda
                vendas[j][i] = totalDaVenda;
                vendedor[i] += totalDaVenda;

            } // fim for j
            // pula linha
            System.out.println();
        } // fim for i

    } // fim entrada de dados

    // método soma produtos
    public static void somaProdutos(double[][] matriz, double[] produtos, int linhas, int colunas) {
        // loop para linha
        for(int i = 0; i < linhas; i++) {
            // loop para a coluna
            for(int j = 0; j < colunas; j++) {
                // produtos recebe a soma das linhas da mmatriz
                produtos[i] += matriz[i][j];
            } // fim for j
        } // fimm for i

    } // fim somma produtos

    // método mostra valores
    public static void mostrar(double[][] vendas, double[] vendedor, double[] produtos, int linhas, int colunas) {

        // variável
        double totalDosProdutos = 0;

        // cabeçalho da tabela
        System.out.printf("%48s%n", "TOTAL DAS VENDAS:");
        System.out.print(" Venderores:");
        
        //loop cabeçalho das colunas
        for(int cab = 0; cab < colunas; cab++) {
            System.out.printf("%11d", cab + 1);
        } // fim for cabeçalho

        // cabeçalho do total dos produtos
        System.out.printf("%13s\n", "Total");

        // loop para linhas
        for(int i = 0; i < linhas; i++) {
            // cabeçalho da linha
            System.out.printf("Produto %d ->  ", i + 1);
            // loop coluna
            for(int j = 0; j < colunas; j++) {
                // immprime os valores da matriz vendas
                System.out.printf("%11.2f", vendas[i][j]);
            } // fim for j

            // imprimme os valores totais dos produtos
            System.out.printf("%11.2f\n", produtos[i]);

            // soma os valores do vetor produtos
            totalDosProdutos += produtos[i];
        } // fimm for i

        // imprimme rodapé
        System.out.println("            **********************************************");
        System.out.print("Total vendas: ");
        
        // loop para mmostrar total do vendedor
        for(int i = 0; i < colunas; i++) {
            // imprime o total das vendas por vendedor
            System.out.printf("%11.2f",vendedor[i]);
        } // fim for vendedor
        
        // mostra o total dos produtos
        System.out.printf("%11.2f\n", totalDosProdutos);

    } // fim mostrar

} // fim classe